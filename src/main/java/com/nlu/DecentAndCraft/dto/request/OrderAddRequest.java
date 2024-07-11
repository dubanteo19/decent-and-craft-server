package com.nlu.DecentAndCraft.dto.request;

import java.util.List;

public record OrderAddRequest(
        int addressId,
        int voucherId,
        int userId,
        String shipment,
        String notice,
        double shippingFee,
        List<OrderDetailRequest> orderDetails
) {
}
