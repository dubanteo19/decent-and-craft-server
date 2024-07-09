package com.nlu.DecentAndCraft.repository;

import com.nlu.DecentAndCraft.model.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface OrderDetailRepository extends JpaRepository<OrderDetail, Long> {
    @Query("SELECT sum(od.quantity) FROM OrderDetail od WHERE od.product.id = :productId")
    Integer findTotalQuantitySoldByProductId(@Param("productId") Integer productId);
}
