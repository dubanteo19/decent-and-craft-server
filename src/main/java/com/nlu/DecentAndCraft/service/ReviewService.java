package com.nlu.DecentAndCraft.service;

import com.nlu.DecentAndCraft.dto.request.ReviewAddRequest;
import com.nlu.DecentAndCraft.model.ProductDetail;
import com.nlu.DecentAndCraft.model.Review;
import com.nlu.DecentAndCraft.repository.ReviewRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class ReviewService {
    ReviewRepository reviewRepository;
    UserService userService;
    ProductDetailService productDetailService;

    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    public Review getReviewById(Long reviewId) {
        return reviewRepository.findById(reviewId).orElseThrow();
    }

    public Review saveReview(ReviewAddRequest reviewDto) {

        var productDetail = productDetailService.getProductDetailById(reviewDto.productId());
        var user = userService.findById(reviewDto.userId());
        Review review = Review
                .builder()
                .rating(reviewDto.rating())
                .comments(reviewDto.text())
                .productDetail(productDetail)
                .user(user)
                .build();
        return reviewRepository.save(review);
    }
}
