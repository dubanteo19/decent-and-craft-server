package com.nlu.DecentAndCraft.service;

import com.nlu.DecentAndCraft.exception.ProductNotFoundException;
import com.nlu.DecentAndCraft.model.Product;
import com.nlu.DecentAndCraft.repository.ProductDetailRepository;
import com.nlu.DecentAndCraft.repository.ProductRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ProductService {
    ProductRepository productRepository;
    ProductDetailRepository productDetailRepository;

    public List<Product> findAll() {
        return productRepository.findAll();
    }

    public List<Product> findAllHotProducts() {
        return productRepository
                .findAll(Sort.by(Sort.Direction.ASC, "views"))
                .stream()
                .limit(8).toList();
    }

    public Product findById(Long id) {
        return productRepository
                .findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Product not found"));
    }

    public List<Product> findByName(String name) {
        return productRepository.findAllByNameContains(name);
    }

    public List<Product> findByCategoryId(Long categoryId) {
//        productDetailRepository.find
        return null;
    }

    public Product save(Product product) {
        return productRepository.save(product);
    }

    public void saveAll(List<Product> productList) {
        productRepository.saveAll(productList);
    }

    public Product update(Long id, Product product) {
        Product existingProduct = productRepository
                .findById(id)
                .orElseThrow(() -> new ProductNotFoundException("Product not found with this id"));
        existingProduct.setName(product.getName());
        return productRepository.save(existingProduct);
    }
}
