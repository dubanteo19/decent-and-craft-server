package com.nlu.DecentAndCraft.service;

import com.nlu.DecentAndCraft.dto.request.ProductAddRequest;
import com.nlu.DecentAndCraft.model.*;
import com.nlu.DecentAndCraft.model.status.ProductStatus;
import com.nlu.DecentAndCraft.repository.ProductDetailRepository;
import com.nlu.DecentAndCraft.repository.ProductRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ProductDetailService {
    ProductDetailRepository productDetailRepository;
    ProductRepository productRepository;
    CategoryService categoryService;

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
        var categoryList = request.categoryIds()
                .stream()
                .map(categoryService::getCategoryById)
                .toList();
        var imageList = request.imageUrls()
                .stream().map(url -> Image.builder()
                        .id(0L)
                        .url(url)
                        .build()).toList();
        var blog = ProductBlog.builder()
                .content(request.description())
                .build();
        var productDetail = ProductDetail.builder()
                .product(savedProduct)
                .productBlog(blog)
                .categoryList(categoryList)
                .imageList(imageList)
                .views(0)
                .build();
        return productDetailRepository.save(productDetail);
    }

    public List<Review> getReviewList(Long productId) {
        var product = productDetailRepository.findByProductId(productId).orElseThrow();
        return product.getReviewList();
    }
}
