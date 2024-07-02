package com.nlu.DecentAndCraft.repository;

import com.nlu.DecentAndCraft.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
