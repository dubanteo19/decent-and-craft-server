package com.nlu.DecentAndCraft.mapper;

import com.nlu.DecentAndCraft.dto.request.UserRegisterRequest;
import com.nlu.DecentAndCraft.model.User;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-05T03:26:26+0700",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 21.0.3 (Ubuntu)"
)
public class UserMapperImpl implements UserMapper {

    @Override
    public User toUser(UserRegisterRequest userRegisterRequest) {
        if ( userRegisterRequest == null ) {
            return null;
        }

        User user = new User();

        user.setFullName( userRegisterRequest.fullName() );
        user.setEmail( userRegisterRequest.email() );
        user.setPassword( userRegisterRequest.password() );

        return user;
    }
}
