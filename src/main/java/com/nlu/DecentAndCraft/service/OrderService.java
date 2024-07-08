package com.nlu.DecentAndCraft.service;

import com.nlu.DecentAndCraft.dto.request.OrderAddRequest;
import com.nlu.DecentAndCraft.model.Order;
import com.nlu.DecentAndCraft.repository.OrderRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class OrderService {
    OrderRepository orderRepository;

    public Order createOrder(OrderAddRequest request) {
        return null;
//        return orderRepository.save(order);
    }

    public Order createOrder(Order order) {
        return orderRepository.save(order);
    }
}

