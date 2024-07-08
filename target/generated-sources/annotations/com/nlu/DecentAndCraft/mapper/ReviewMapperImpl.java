package com.nlu.DecentAndCraft.mapper;

import com.nlu.DecentAndCraft.dto.request.ReviewUpdateRequest;
import com.nlu.DecentAndCraft.dto.response.ReviewResponse;
import com.nlu.DecentAndCraft.model.Review;
import com.nlu.DecentAndCraft.model.User;
import java.time.LocalDateTime;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-09T00:30:40+0700",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.3 (Ubuntu)"
)
public class ReviewMapperImpl implements ReviewMapper {

    @Override
    public Review toReview(ReviewUpdateRequest request) {
        if ( request == null ) {
            return null;
        }

        Review.ReviewBuilder review = Review.builder();

        review.comments( request.text() );
        if ( request.rating() != null ) {
            review.rating( request.rating() );
        }

        return review.build();
    }

    @Override
    public ReviewResponse toReviewResponse(Review review) {
        if ( review == null ) {
            return null;
        }

        int userId = 0;
        String userFullName = null;
        int id = 0;
        String comments = null;
        int rating = 0;
        LocalDateTime createdDate = null;
        LocalDateTime modifiedDate = null;

        Long id1 = reviewUserId( review );
        if ( id1 != null ) {
            userId = id1.intValue();
        }
        userFullName = reviewUserFullName( review );
        if ( review.getId() != null ) {
            id = review.getId().intValue();
        }
        comments = review.getComments();
        rating = review.getRating();
        createdDate = review.getCreatedDate();
        modifiedDate = review.getModifiedDate();

        ReviewResponse reviewResponse = new ReviewResponse( id, comments, rating, userId, userFullName, createdDate, modifiedDate );

        return reviewResponse;
    }

    private Long reviewUserId(Review review) {
        if ( review == null ) {
            return null;
        }
        User user = review.getUser();
        if ( user == null ) {
            return null;
        }
        Long id = user.getId();
        if ( id == null ) {
            return null;
        }
        return id;
    }

    private String reviewUserFullName(Review review) {
        if ( review == null ) {
            return null;
        }
        User user = review.getUser();
        if ( user == null ) {
            return null;
        }
        String fullName = user.getFullName();
        if ( fullName == null ) {
            return null;
        }
        return fullName;
    }
}
