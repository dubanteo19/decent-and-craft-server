package com.nlu.DecentAndCraft.controller;

import com.nlu.DecentAndCraft.dto.request.ReviewAddRequest;
import com.nlu.DecentAndCraft.dto.request.ReviewUpdateRequest;
import com.nlu.DecentAndCraft.model.ProductDetail;
import com.nlu.DecentAndCraft.model.Review;
import com.nlu.DecentAndCraft.service.ProductDetailService;
import com.nlu.DecentAndCraft.service.ReviewService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/product-detail")
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ProductDetailController {
    ProductDetailService productDetailService;
    ReviewService reviewService;

    @GetMapping("/{productId}")
    public ResponseEntity<ProductDetail> getProductDetail(@PathVariable Long productId) {
        return ResponseEntity.ok(productDetailService.getProductDetailById(productId));
    }

    @GetMapping
    public ResponseEntity<List<ProductDetail>> getAllProductDetailPathVariable() {
        return ResponseEntity.ok(productDetailService.getAllProductDetails());
    }

    @PostMapping("/{productId}/reviews")
    public ResponseEntity<Review> addReview(@PathVariable Long productId, @RequestBody ReviewAddRequest request) {
        if (!request.productId().equals(productId)) {
            throw new RuntimeException("product not found");
        }
        return ResponseEntity.ok(reviewService.saveReview(request));
    }

    @PutMapping("/{productId}/reviews/{reviewId}")
    public ResponseEntity<Review> updateReview(@PathVariable Long reviewId, @RequestBody ReviewUpdateRequest request) {
        return ResponseEntity.ok(reviewService.update(reviewId, request));
    }

    @GetMapping("/{productId}/reviews/filter")
    public ResponseEntity<List<Review>> filterReview(@PathVariable Long productId, @RequestParam int rating) {
        return ResponseEntity.ok(reviewService.filter(productId, rating));
    }
}
