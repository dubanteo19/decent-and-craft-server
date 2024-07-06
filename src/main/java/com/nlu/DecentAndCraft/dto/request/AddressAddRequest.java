package com.nlu.DecentAndCraft.dto.request;

public record AddressAddRequest(
        String province,
        String district,
        String ward,
        String description,
        String fullName,
        String phoneNumber

) {
}
