package com.nlu.DecentAndCraft.mapper;

import com.nlu.DecentAndCraft.dto.request.AddressAddRequest;
import com.nlu.DecentAndCraft.model.Address;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-09T09:41:34+0700",
    comments = "version: 1.5.5.Final, compiler: Eclipse JDT (IDE) 3.39.0.v20240620-1855, environment: Java 17.0.11 (Eclipse Adoptium)"
)
public class AddressMapperImpl implements AddressMapper {

    @Override
    public Address toAddress(AddressAddRequest address) {
        if ( address == null ) {
            return null;
        }

        Address address1 = new Address();

        address1.setDescription( address.description() );
        address1.setDistrict( address.district() );
        address1.setFullName( address.fullName() );
        address1.setPhoneNumber( address.phoneNumber() );
        address1.setProvince( address.province() );
        address1.setWard( address.ward() );

        return address1;
    }
}
