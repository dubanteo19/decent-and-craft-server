package com.nlu.DecentAndCraft.repository;

import com.nlu.DecentAndCraft.model.ProductDetail;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.Optional;

public interface ProductDetailRepository extends JpaRepository<ProductDetail, Integer>, JpaSpecificationExecutor<ProductDetail> {
    Optional<ProductDetail> findByProductId(Long productId);
    long count(Specification<ProductDetail> spec);
}
