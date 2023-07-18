package com.bearingpoint.bank.users.persistence;

import com.bearingpoint.bank.users.persistence.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface UserEntityJpaRepository extends JpaRepository<UserEntity, UUID> {
}
