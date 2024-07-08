package com.nlu.DecentAndCraft.dto.response;

import org.springframework.data.annotation.LastModifiedDate;

import java.time.LocalDateTime;

public record ReviewResponse(
        int id,
        String comments,
        int rating,
        int userId,
        String userFullName,
        LocalDateTime createdDate,
        LocalDateTime modifiedDate

) {
}
