package com.nlu.DecentAndCraft.service;

import com.nlu.DecentAndCraft.exception.ProductNotFoundException;
import com.nlu.DecentAndCraft.model.Product;
import com.nlu.DecentAndCraft.model.ProductDetail;
import com.nlu.DecentAndCraft.model.Review;
import com.nlu.DecentAndCraft.repository.ProductDetailRepository;
import com.nlu.DecentAndCraft.repository.ProductRepository;
import com.nlu.DecentAndCraft.specification.ProductSpecification;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
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
                .limit(10).toList();
    }

    public Product findById(Long id) {
        return productRepository
                .findById(id)
                .orElseThrow(ProductNotFoundException::new);
    }

    public List<Product> findByName(String name) {
        return productRepository.findAllByNameContains(name);
    }

    public List<Product> findByCategoryId(Long categoryId) {
        return null;
    }


    public Page<Product> getProductsByFilters(Double minPrice, Double maxPrice, Long categoryId, String name, Integer minRating, Pageable pageable) {
        Specification<ProductDetail> spec = new ProductSpecification(minPrice, maxPrice, categoryId, name, minRating);
        Page<ProductDetail> productDetails = productDetailRepository.findAll(spec, pageable);
        List<Product> products = productDetails.stream()
                .map(ProductDetail::getProduct)
                .distinct()
                .toList();
        long totalRow = productDetailRepository.count(spec);
        return new PageImpl<>(products, pageable, totalRow);
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
                .orElseThrow(ProductNotFoundException::new);
        existingProduct.setName(product.getName());
        return productRepository.save(existingProduct);
    }

    public boolean viewProduct(Long productId) {
        var product = findById(productId);
        product.setViews(product.getViews() + 1);
        productRepository.save(product);
        return true;
    }
}
