package com.nlu.DecentAndCraft.repository;

import com.nlu.DecentAndCraft.model.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
