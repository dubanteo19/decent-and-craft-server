package com.nlu.DecentAndCraft.dto.request;

public record OrderDetailRequest(
        int productId,
        int quantity,
        double price
) {

}
