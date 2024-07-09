package com.nlu.DecentAndCraft.mapper;

import com.nlu.DecentAndCraft.dto.request.OrderAddRequest;
import com.nlu.DecentAndCraft.model.Order;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {
    OrderMapper INSTANCE = Mappers.getMapper(OrderMapper.class);
    Order toOrder(OrderAddRequest request);
}
