package com.nlu.DecentAndCraft.service;

import com.nlu.DecentAndCraft.dto.request.ProductAddRequest;
import com.nlu.DecentAndCraft.dto.response.ReviewResponse;
import com.nlu.DecentAndCraft.exception.ProductNotFoundException;
import com.nlu.DecentAndCraft.mapper.ReviewMapper;
import com.nlu.DecentAndCraft.model.*;
import com.nlu.DecentAndCraft.model.status.ProductStatus;
import com.nlu.DecentAndCraft.repository.OrderDetailRepository;
import com.nlu.DecentAndCraft.repository.ProductDetailRepository;
import com.nlu.DecentAndCraft.repository.ProductRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ProductDetailService {
    ProductDetailRepository productDetailRepository;
    ProductRepository productRepository;
    CategoryService categoryService;
    OrderDetailRepository orderDetailRepository;
    ReviewMapper reviewMapper = ReviewMapper.INSTANCE;

    public List<ProductDetail> getAllProductDetails() {
        return productDetailRepository.findAll();
    }

    public ProductDetail getProductDetailById(Long productId) {
        return productDetailRepository.findByProductId(productId).orElseThrow();
    }

    public ProductDetail save(ProductDetail productDetail) {
        return productDetailRepository.save(productDetail);
    }

    public ProductDetail save(ProductAddRequest request) {
        var product = Product.builder()
                .name(request.name())
                .price(request.price())
                .origin(request.origin())
                .thumbnail(request.thumbnail())
                .status(ProductStatus.CON_HANG)
                .unitInStock(request.unitInStock())
                .build();
        var savedProduct = productRepository.save(product);
        var productDetail = ProductDetail.builder()
                .product(savedProduct)
                .build();
        var saveProductDetail = productDetailRepository.save(productDetail);
        var categoryList = new ArrayList<>(
                request.categoryIds()
                        .stream()
                        .map(categoryService::getCategoryById)
                        .toList()
        );
        var blog = ProductBlog.builder()
                .content(request.description())
                .build();
        var imageList = new ArrayList<>(
                request.imageUrls()
                        .stream().map(url -> Image.builder()
                                .id(0L)
                                .url(url)
                                .productDetail(saveProductDetail)
                                .build()).toList()
        );
        saveProductDetail.setImageList(imageList);
        saveProductDetail.setCategoryList(categoryList);
        saveProductDetail.setProductBlog(blog);
        return productDetailRepository.save(saveProductDetail);
    }

    public Double getAverageRating(Long productId) {
        var productDetail = productDetailRepository
                .findByProductId(productId)
                .orElseThrow(ProductNotFoundException::new);
        var totalRating = productDetail.getReviewList().stream()
                .map(Review::getRating)
                .reduce(0, Integer::sum);
        return (double) totalRating / productDetail.getReviewList().size();
    }

    public List<ReviewResponse> getReviewList(Long productId) {
        var product = productDetailRepository.findByProductId(productId).orElseThrow();
        return product
                .getReviewList()
                .stream()
                .map(reviewMapper::toReviewResponse).toList();
    }

    public Integer getProductDetailSold(Long productId) {
        return orderDetailRepository.findTotalQuantitySoldByProductId(Math.toIntExact(productId));
    }
}
