package com.nlu.DecentAndCraft.dto.request;

public record ReviewUpdateRequest(
        Long reviewId,
        Long userId,
        Long productId,
        String text,
        Integer rating
) {
}
