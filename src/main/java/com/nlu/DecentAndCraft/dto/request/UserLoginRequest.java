package com.nlu.DecentAndCraft.dto.request;

public record UserLoginRequest(
        String email,
        String password
) {
}
