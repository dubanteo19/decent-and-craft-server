package com.nlu.DecentAndCraft.dto.request;

public record AddressAddRequest(
        boolean isDefault,
        String province,
        String district,
        String ward,
        String description,
        String fullName,
        String phoneNumber

) {
}
