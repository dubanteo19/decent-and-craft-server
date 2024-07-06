package com.nlu.DecentAndCraft.mapper;

import com.nlu.DecentAndCraft.dto.request.ReviewUpdateRequest;
import com.nlu.DecentAndCraft.model.Review;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-06T07:28:44+0700",
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
}
