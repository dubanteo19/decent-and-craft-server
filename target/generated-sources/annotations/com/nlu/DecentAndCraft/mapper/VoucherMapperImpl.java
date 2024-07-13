package com.nlu.DecentAndCraft.mapper;

import com.nlu.DecentAndCraft.dto.request.VoucherAddRequest;
import com.nlu.DecentAndCraft.dto.request.VoucherUpdateRequest;
import com.nlu.DecentAndCraft.model.Voucher;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-11T21:57:16+0700",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.3 (Ubuntu)"
)
public class VoucherMapperImpl implements VoucherMapper {

    @Override
    public Voucher toVoucher(VoucherAddRequest voucherAddRequest) {
        if ( voucherAddRequest == null ) {
            return null;
        }

        Voucher voucher = new Voucher();

        voucher.setVoucherCode( voucherAddRequest.voucherCode() );
        voucher.setDescription( voucherAddRequest.description() );
        voucher.setQuantity( voucherAddRequest.quantity() );
        voucher.setAmount( voucherAddRequest.amount() );
        voucher.setConditions( voucherAddRequest.conditions() );
        voucher.setExpirationDate( voucherAddRequest.expirationDate() );

        return voucher;
    }

    @Override
    public void updateVoucher(Voucher voucher, VoucherUpdateRequest voucherUpdateRequest) {
        if ( voucherUpdateRequest == null ) {
            return;
        }

        voucher.setVoucherCode( voucherUpdateRequest.voucherCode() );
        voucher.setDescription( voucherUpdateRequest.description() );
        voucher.setQuantity( voucherUpdateRequest.quantity() );
        voucher.setAmount( voucherUpdateRequest.amount() );
        voucher.setConditions( voucherUpdateRequest.conditions() );
        voucher.setExpirationDate( voucherUpdateRequest.expirationDate() );
    }
}
