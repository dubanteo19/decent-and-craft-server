package com.nlu.DecentAndCraft.service;

import com.nlu.DecentAndCraft.model.ProductDetail;
import com.nlu.DecentAndCraft.model.Review;
import com.nlu.DecentAndCraft.repository.ProductDetailRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductDetailService {
    private final ProductDetailRepository productDetailRepository;

    public ProductDetailService(ProductDetailRepository productDetailRepository) {
        this.productDetailRepository = productDetailRepository;
    }

    public List<ProductDetail> getAllProductDetails() {
        return productDetailRepository.findAll();
    }

    public List<Review> getAllReviewsByProductId(Long productId) {
        return getProductDetailById(productId).getReviewList();
    }

    public ProductDetail getProductDetailById(Long productId) {
        return productDetailRepository.findByProductId(productId).orElseThrow();
    }

    public ProductDetail save(ProductDetail productDetail) {
        return productDetailRepository.save(productDetail);
    }

    public List<Review> getReviewList(Long productId) {
        var product= productDetailRepository.findByProductId(productId).orElseThrow();
        return product.getReviewList();
    }
}
