package com.nlu.DecentAndCraft.dto.request;

public record UserRegisterRequest(
        String email,
        String password,
        String fullName
) {

}
