package com.nlu.DecentAndCraft.repository;

import com.nlu.DecentAndCraft.model.ProductDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface ProductDetailRepository extends JpaRepository<ProductDetail, Integer> {
    Optional<ProductDetail> findByProductId(Long productId);
}
