package com.bearingpoint.bank.users.persistence;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import java.util.UUID;

@Entity
@Table(name = "user")
public class UserEntity {

    @Id
    @Column(name = "id", nullable = false)
    private UUID id;

    @Column(name = "name", length = 128)
    private String name;

    protected UserEntity() {
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

}
