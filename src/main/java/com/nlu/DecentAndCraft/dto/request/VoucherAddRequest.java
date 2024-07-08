package com.nlu.DecentAndCraft.dto.request;

import java.time.LocalDate;

public record VoucherAddRequest(
        String voucherCode,
        String description,
        int quantity,
        double amount,
        double conditions,
        LocalDate expirationDate
) {
}
