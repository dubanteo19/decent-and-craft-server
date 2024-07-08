package com.nlu.DecentAndCraft.service;

import com.nlu.DecentAndCraft.dto.request.VoucherAddRequest;
import com.nlu.DecentAndCraft.dto.request.VoucherUpdateRequest;
import com.nlu.DecentAndCraft.mapper.VoucherMapper;
import com.nlu.DecentAndCraft.model.Voucher;
import com.nlu.DecentAndCraft.repository.VoucherRepository;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class VoucherService {
    VoucherRepository voucherRepository;
    VoucherMapper voucherMapper = VoucherMapper.INSTANCE;

    public List<Voucher> getAllVouchers() {
        return voucherRepository.findAll();
    }

    public Voucher getVoucherById(Long id) {
        return voucherRepository.findById(id).orElseThrow(() -> new RuntimeException("Voucher not found"));
    }

    public Voucher updateVoucher(Long voucherId, VoucherUpdateRequest request) {
        var existingVoucher = voucherRepository.findById(voucherId).orElseThrow(() -> new RuntimeException("Voucher not found"));
        voucherMapper.updateVoucher(existingVoucher, request);
        return voucherRepository.save(existingVoucher);
    }

    public Voucher createVoucher(VoucherAddRequest request) {
        var voucher = voucherMapper.toVoucher(request);
        voucher.setOrders(new ArrayList<>());
        return voucherRepository.save(voucher);
    }
}
