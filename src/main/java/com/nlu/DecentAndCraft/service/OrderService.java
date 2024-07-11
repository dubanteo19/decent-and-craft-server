package com.nlu.DecentAndCraft.service;

import com.nlu.DecentAndCraft.dto.request.OrderAddRequest;
import com.nlu.DecentAndCraft.dto.request.OrderDetailRequest;
import com.nlu.DecentAndCraft.exception.ProductNotFoundException;
import com.nlu.DecentAndCraft.exception.UserNotFoundException;
import com.nlu.DecentAndCraft.mapper.OrderMapper;
import com.nlu.DecentAndCraft.model.Order;
import com.nlu.DecentAndCraft.model.OrderDetail;
import com.nlu.DecentAndCraft.model.status.OrderStatus;
import com.nlu.DecentAndCraft.repository.*;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

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

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }

    public Order createOrder(OrderAddRequest request) {
        var order = orderMapper.toOrder(request);
        var voucher = voucherRepository.findById((long) request.voucherId()).orElse(null);
        var address = addressRepository.findById((long) request.addressId()).orElse(null);
        var user = userRepository.findById((long) request.userId()).orElseThrow(UserNotFoundException::new);
        var orderDetails = request.orderDetails()
                .stream()
                .map(this::toOrderDetail)
                .toList();
        order.setVoucher(voucher);
        order.setAddress(address);
        order.setUser(user);
        order.setOrderDetails(orderDetails);
        order.setStatus(OrderStatus.CHO_VAN_CHUYEN);
        order.setTotalPrice(calculateTotalPrice(order));
        return orderRepository.save(order);
    }

    private double calculateTotalPrice(Order order) {
        var totalOrderDetailsPrice = order.getOrderDetails()
                .stream()
                .map(orderDetail -> orderDetail.getPrice() * orderDetail.getQuantity())
                .reduce(0.0, Double::sum);
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

