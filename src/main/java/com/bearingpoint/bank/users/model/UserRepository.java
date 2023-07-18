package com.bearingpoint.bank.users.model;

import jakarta.transaction.Transactional;

import java.util.List;

public interface UserRepository {

    @Transactional(Transactional.TxType.MANDATORY)
    List<User> findAllUsers();

}
