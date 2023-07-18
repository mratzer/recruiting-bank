package com.bearingpoint.bank.users;

import java.util.UUID;

public record UserDto(
        UUID id,
        String name
) {
}
