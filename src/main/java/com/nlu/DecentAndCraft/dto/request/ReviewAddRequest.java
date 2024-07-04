package com.nlu.DecentAndCraft.dto.request;

public record ReviewAddRequest(
        Long userId,
        Long productId,
        String text,
        int rating
) {
}
