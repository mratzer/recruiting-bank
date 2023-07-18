package com.bearingpoint.bank.users.persistence;

import com.bearingpoint.bank.users.model.User;
import com.bearingpoint.bank.users.model.UserRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserEntityRepository implements UserRepository {

    private final UserEntityJpaRepository userRepository;

    public UserEntityRepository(UserEntityJpaRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> findAllUsers() {
        return userRepository.findAll()
                .stream()
                .map(e -> new User(
                        e.getId(),
                        e.getName()))
                .toList();
    }

}
