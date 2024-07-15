package com.nlu.DecentAndCraft.service;

import com.nlu.DecentAndCraft.dto.request.OrderAddRequest;
import com.nlu.DecentAndCraft.dto.request.OrderDetailRequest;
import com.nlu.DecentAndCraft.exception.ProductNotFoundException;
import com.nlu.DecentAndCraft.exception.UserNotFoundException;
import com.nlu.DecentAndCraft.mapper.OrderMapper;
import com.nlu.DecentAndCraft.model.Order;
import com.nlu.DecentAndCraft.model.OrderDetail;
import com.nlu.DecentAndCraft.model.Product;
import com.nlu.DecentAndCraft.model.Voucher;
import com.nlu.DecentAndCraft.model.status.OrderStatus;
import com.nlu.DecentAndCraft.repository.*;
import jakarta.mail.MessagingException;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.UnsupportedEncodingException;
import java.time.LocalDate;
import java.util.List;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class OrderService {
    OrderRepository orderRepository;
    OrderMapper orderMapper = OrderMapper.INSTANCE;
    ProductRepository productRepository;
    VoucherRepository voucherRepository;
    AddressRepository addressRepository;
    UserRepository userRepository;
    EmailService emailService;

    public OrderDetail toOrderDetail(OrderDetailRequest request) {
        var product = productRepository
                .findById((long) request.productId())
                .orElseThrow(ProductNotFoundException::new);
        var orderDetail = new OrderDetail();
        orderDetail.setId(null);
        orderDetail.setProduct(product);
        orderDetail.setQuantity(request.quantity());
        orderDetail.setPrice(request.price());
        return orderDetail;
    }

    public void createOrder(Order order) {
        orderRepository.save(order);
    }

    @Transactional
    public Order createOrder(OrderAddRequest request) {
        var order = orderMapper.toOrder(request);
        var voucher = voucherRepository.findById((long) request.voucherId()).orElse(null);
        var address = addressRepository.findById((long) request.addressId()).orElse(null);
        var user = userRepository.findById((long) request.userId()).orElseThrow(UserNotFoundException::new);
        var orderDetails = request.orderDetails()
                .stream()
                .map(this::toOrderDetail)
                .toList();
        validateVoucher(order, voucher);
        order.setAddress(address);
        order.setUser(user);
        order.setOrderDetails(orderDetails);
        order.setStatus(OrderStatus.CHO_VAN_CHUYEN);
        order.setTotalPrice(calculateTotalPrice(order));
        var savedOrder = orderRepository.save(order);
        updateVoucher(savedOrder);
        sell(savedOrder);
        return savedOrder;

    }

    @Transactional
    public void validateVoucher(Order order, Voucher voucher) {
        if (voucher == null) return;
        if (voucher.getQuantity() <= 0)
            throw new IllegalArgumentException("Voucher quantity must be greater than zero");
        if (voucher.getConditions() > order.totalOrderDetailsPrice())
            throw new IllegalArgumentException("Voucher conditions must not be greater than the total order details price.");
        if (voucher.getExpirationDate().isBefore(LocalDate.now()))
            throw new IllegalArgumentException("Voucher is expired");
        order.setVoucher(voucher);
    }

    @Transactional
    public void updateVoucher(Order savedOrder) {
        var voucher = savedOrder.getVoucher();
        if (savedOrder.getVoucher() == null) return;
        var newQuantity = savedOrder.getVoucher().getQuantity() - 1;
        if (newQuantity < 0) throw new IllegalArgumentException("Voucher quantity can not be negative");
        voucher.setQuantity(newQuantity);
        voucherRepository.save(voucher);
    }

    public void sell(Order savedOrder) {
        List<Product> products = savedOrder.getOrderDetails()
                .stream()
                .peek(OrderDetail::sell)
                .map(OrderDetail::getProduct)
                .toList();
        productRepository.saveAll(products);
        try {
            emailService.sendOrderDetailsEmail(savedOrder.getUser().getEmail(), savedOrder);
        } catch (MessagingException | UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public double calculateTotalPrice(Order order) {
        var totalOrderDetailsPrice = order.totalOrderDetailsPrice();
        double voucherPrice = 0;
        if (order.getVoucher() != null) {
            voucherPrice = order.getVoucher().getAmount();
        }
        return totalOrderDetailsPrice - voucherPrice + order.getShippingFee();
    }

    public Order getOrderById(Long orderId) {
        return orderRepository.findById(orderId).orElseThrow(() -> new RuntimeException("Order not found"));
    }

    public List<Order> getAllOrders() {
        return orderRepository.findAll();
    }
}

