package com.nlu.DecentAndCraft.dto.request;

import java.util.List;

public record ProductAddRequest(
        String name,
        String thumbnail,
        double price,
        double origin,
        String description,
        int unitInStock,
        List<Long> categoryIds,
        List<String> imageUrls
) {
}
