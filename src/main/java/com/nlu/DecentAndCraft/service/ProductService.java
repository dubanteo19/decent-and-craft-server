package com.nlu.DecentAndCraft.service;

import com.nlu.DecentAndCraft.model.Product;
import com.nlu.DecentAndCraft.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {
    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public void save(Product p1) {
        productRepository.save(p1);
    }
}
