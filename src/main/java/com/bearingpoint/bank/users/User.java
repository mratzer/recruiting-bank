package com.bearingpoint.bank.users;

import java.util.UUID;

public record User(
        UUID id,
        String name
) {
}
