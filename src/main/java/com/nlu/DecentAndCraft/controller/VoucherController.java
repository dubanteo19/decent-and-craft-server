package com.nlu.DecentAndCraft.controller;

import com.nlu.DecentAndCraft.dto.request.VoucherAddRequest;
import com.nlu.DecentAndCraft.dto.request.VoucherUpdateRequest;
import com.nlu.DecentAndCraft.model.Voucher;
import com.nlu.DecentAndCraft.service.VoucherService;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/v1/vouchers")
@RestController
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class VoucherController {
    VoucherService voucherService;

    @GetMapping
    public ResponseEntity<List<Voucher>> getAllVouchers() {
        return ResponseEntity.ok(voucherService.getAllVouchers());
    }

    @GetMapping("/{voucherId}")
    public ResponseEntity<Voucher> getVoucherById(@PathVariable Long voucherId) {
        return ResponseEntity.ok(voucherService.getVoucherById(voucherId));
    }

    @PutMapping("/{voucherId}")
    public ResponseEntity<Voucher> updateVoucher(@PathVariable Long voucherId, @RequestBody VoucherUpdateRequest request) {
        return ResponseEntity.ok(voucherService.updateVoucher(voucherId, request));
    }

    @PostMapping
    public ResponseEntity<Voucher> addVoucher(@RequestBody VoucherAddRequest request) {
        return ResponseEntity.ok(voucherService.createVoucher(request));
    }
}
