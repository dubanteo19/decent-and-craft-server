package com.nlu.DecentAndCraft.dto.request;

public record ChangePasswordRequest(
        String currentPassword,
        String newPassword
) {
}
