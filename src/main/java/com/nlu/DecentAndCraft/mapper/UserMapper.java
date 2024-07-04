package com.nlu.DecentAndCraft.mapper;

import com.nlu.DecentAndCraft.dto.request.UserRegisterRequest;
import com.nlu.DecentAndCraft.model.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);
    User toUser(UserRegisterRequest userRegisterRequest);
}
