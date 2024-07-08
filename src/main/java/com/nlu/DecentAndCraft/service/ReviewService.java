package com.nlu.DecentAndCraft.service;

import com.nlu.DecentAndCraft.dto.request.ReviewAddRequest;
import com.nlu.DecentAndCraft.dto.request.ReviewUpdateRequest;
import com.nlu.DecentAndCraft.dto.response.ReviewResponse;
import com.nlu.DecentAndCraft.exception.ReviewNotFoundException;
import com.nlu.DecentAndCraft.mapper.ReviewMapper;
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
    ReviewMapper reviewMapper = ReviewMapper.INSTANCE;

    public List<Review> getAllReviews() {
        return reviewRepository.findAll();
    }

    public Review getReviewById(Long reviewId) {
        return reviewRepository.findById(reviewId).orElseThrow();
    }

    public Review saveReview(ReviewAddRequest reviewDto) {
        if (reviewRepository.existsByUserIdAndProductDetailId(reviewDto.userId(), reviewDto.productId()))
            throw new RuntimeException("User can not review this product twice");
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

    public Review update(Long reviewId, ReviewUpdateRequest request) {
        var existingReview = reviewRepository
                .findById(reviewId)
                .orElseThrow(ReviewNotFoundException::new);
        existingReview = reviewMapper.toReview(request);
        return reviewRepository.save(existingReview);
    }

    public List<ReviewResponse> filter(Long productId, int rating) {
        var reviews = productDetailService
                .getProductDetailById(productId)
                .getReviewList()
                .stream()
                .filter(r -> r.getRating() == rating)
                .map(reviewMapper::toReviewResponse)
                .toList();
        if (reviews.isEmpty()) throw new ReviewNotFoundException();
        return reviews;
    }
}
