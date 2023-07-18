package com.bearingpoint.bank.users.rest;

import com.bearingpoint.bank.shared.rest.ListDto;
import com.bearingpoint.bank.users.model.UserService;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping(
            produces = MediaType.APPLICATION_JSON_VALUE
    )
    public ResponseEntity<ListDto<UserDto>> getUsers() {
        List<UserDto> allUsers = userService.findAllUsers()
                .stream()
                .map(e -> new UserDto(e.id(), e.name()))
                .toList();

        return ResponseEntity.ok()
                .body(new ListDto<>(allUsers));
    }

}
