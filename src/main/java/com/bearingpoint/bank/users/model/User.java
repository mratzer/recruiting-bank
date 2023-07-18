package com.bearingpoint.bank.users.model;

import java.util.UUID;

public record User(
        UUID id,
        String name
) {
}
