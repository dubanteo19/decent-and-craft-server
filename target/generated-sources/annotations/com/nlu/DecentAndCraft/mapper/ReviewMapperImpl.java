package com.nlu.DecentAndCraft.mapper;

import com.nlu.DecentAndCraft.dto.request.ReviewUpdateRequest;
import com.nlu.DecentAndCraft.model.Review;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-09T09:41:34+0700",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.39.0.v20240620-1855, environment: Java 17.0.11 (Eclipse Adoptium)"
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
