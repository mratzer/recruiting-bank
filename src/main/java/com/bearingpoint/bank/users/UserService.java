package com.bearingpoint.bank.users;

import jakarta.transaction.Transactional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private static final Logger logger = LoggerFactory.getLogger(UserService.class);

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Transactional
    public List<UserDto> findAllUsers() {
        logger.info("Find all users");

        return userRepository.findAll()
                .stream()
                .map(e -> {
                    return new UserDto(
                            e.getId(),
                            e.getName()
                    );
                })
                .toList();
    }

}
