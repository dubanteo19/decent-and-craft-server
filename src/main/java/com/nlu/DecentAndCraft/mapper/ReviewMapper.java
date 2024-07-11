package com.nlu.DecentAndCraft.mapper;

import com.nlu.DecentAndCraft.dto.request.ReviewUpdateRequest;
import com.nlu.DecentAndCraft.dto.response.ReviewResponse;
import com.nlu.DecentAndCraft.model.Review;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ReviewMapper {
    ReviewMapper INSTANCE = Mappers.getMapper(ReviewMapper.class);

    @Mapping(source = "text", target = "comments")
    Review toReview(ReviewUpdateRequest request);

    @Mapping(source = "user.id", target = "userId")
    @Mapping(source = "user.fullName", target = "userFullName")
    ReviewResponse toReviewResponse(Review review);

    @Mapping(source = "text", target = "comments")
    void updateReview(ReviewUpdateRequest request, @MappingTarget Review review);
}
