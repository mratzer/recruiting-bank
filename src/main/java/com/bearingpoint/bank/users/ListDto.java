package com.bearingpoint.bank.users;

import java.util.List;

public record ListDto<T>(
        List<T> items
) {
}
