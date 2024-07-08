package com.nlu.DecentAndCraft.mapper;

import com.nlu.DecentAndCraft.dto.request.VoucherAddRequest;
import com.nlu.DecentAndCraft.dto.request.VoucherUpdateRequest;
import com.nlu.DecentAndCraft.model.Voucher;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;
import org.mapstruct.factory.Mappers;

@Mapper
public interface VoucherMapper {
    VoucherMapper INSTANCE = Mappers.getMapper(VoucherMapper.class);

    Voucher toVoucher(VoucherAddRequest voucherAddRequest);

    void updateVoucher(@MappingTarget Voucher voucher, VoucherUpdateRequest voucherUpdateRequest);
}
