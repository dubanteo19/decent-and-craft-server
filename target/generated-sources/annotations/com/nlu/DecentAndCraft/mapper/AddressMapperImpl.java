package com.nlu.DecentAndCraft.mapper;

import com.nlu.DecentAndCraft.dto.request.AddressAddRequest;
import com.nlu.DecentAndCraft.model.Address;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-08T20:45:48+0700",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.3 (Ubuntu)"
)
public class AddressMapperImpl implements AddressMapper {

    @Override
    public Address toAddress(AddressAddRequest address) {
        if ( address == null ) {
            return null;
        }

        Address address1 = new Address();

        address1.setProvince( address.province() );
        address1.setDistrict( address.district() );
        address1.setWard( address.ward() );
        address1.setDescription( address.description() );
        address1.setFullName( address.fullName() );
        address1.setPhoneNumber( address.phoneNumber() );

        return address1;
    }

    @Override
    public void updateAddress(Address address, AddressAddRequest addressAddRequest) {
        if ( addressAddRequest == null ) {
            return;
        }

        address.setProvince( addressAddRequest.province() );
        address.setDistrict( addressAddRequest.district() );
        address.setWard( addressAddRequest.ward() );
        address.setDescription( addressAddRequest.description() );
        address.setFullName( addressAddRequest.fullName() );
        address.setPhoneNumber( addressAddRequest.phoneNumber() );
    }
}
