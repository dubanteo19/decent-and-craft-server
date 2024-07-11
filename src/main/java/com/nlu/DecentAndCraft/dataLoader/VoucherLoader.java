package com.nlu.DecentAndCraft.dataLoader;

import com.nlu.DecentAndCraft.dto.request.VoucherAddRequest;
import com.nlu.DecentAndCraft.service.VoucherService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
@Order(7)
public class VoucherLoader implements CommandLineRunner {
    private final VoucherService voucherService;

    @Value("${include-data-loader}")
    boolean includeDataLoader;

    public VoucherLoader(VoucherService voucherService) {
        this.voucherService = voucherService;
    }

    @Override
    public void run(String... args) throws Exception {
        if (!includeDataLoader) {
            return;
        }
        var v1 = new VoucherAddRequest(
                "DBT19",
                "Giảm ngay 20.000vnd với đơn hàng trên 100.000vnd",
                100,
                20000,
                100000,
                LocalDate.of(2024, 10, 1));
        var v2 = new VoucherAddRequest(
                "NNCN51",
                "Giảm ngay 40.000vnd với đơn hàng trên 200.000vnd",
                200,
                40000,
                200000,
                LocalDate.of(2024, 10, 1));
        var v3 = new VoucherAddRequest(
                "LTDQ",
                "Giảm ngay 90.000vnd với đơn hàng trên 1.000.000vnd",
                200,
                90000,
                1000000,
                LocalDate.of(2024, 10, 1));
        voucherService.createVoucher(v1);
        voucherService.createVoucher(v2);
        voucherService.createVoucher(v3);
    }
}
