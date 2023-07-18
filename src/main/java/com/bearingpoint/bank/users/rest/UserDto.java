package com.bearingpoint.bank.users.rest;

import java.util.UUID;

public record UserDto(
        UUID id,
        String name
) {
}
