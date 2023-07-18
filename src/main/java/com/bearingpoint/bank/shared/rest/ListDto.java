package com.bearingpoint.bank.shared.rest;

import java.util.List;

public record ListDto<T>(
        List<T> items
) {
}
