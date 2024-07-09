package com.nlu.DecentAndCraft.service;

import com.nlu.DecentAndCraft.dto.request.OrderAddRequest;
import com.nlu.DecentAndCraft.dto.request.OrderDetailRequest;
import com.nlu.DecentAndCraft.exception.ProductNotFoundException;
import com.nlu.DecentAndCraft.mapper.OrderMapper;
import com.nlu.DecentAndCraft.model.Order;
import com.nlu.DecentAndCraft.model.OrderDetail;
import com.nlu.DecentAndCraft.repository.OrderRepository;
import com.nlu.DecentAndCraft.repository.ProductRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class OrderService {
    OrderRepository orderRepository;
    OrderMapper orderMapper = OrderMapper.INSTANCE;
    ProductRepository productRepository;

    public OrderDetail toOrderDetail(OrderDetailRequest request) {
        var product = productRepository
                .findById((long) request.productId())
                .orElseThrow(ProductNotFoundException::new);
        var orderDetail = new OrderDetail();
        orderDetail.setProduct(product);
        orderDetail.setQuantity(request.quantity());
        orderDetail.setPrice(request.price());
        return orderDetail;
    }

    public Order createOrder(OrderAddRequest request) {
        var order = orderMapper.toOrder(request);
        var orderDetails = request.orderDetails()
                .stream()
                .map(this::toOrderDetail)
                .toList();
        order.setOrderDetails(orderDetails);
        return orderRepository.save(order);
    }

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }
}

