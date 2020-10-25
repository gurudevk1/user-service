package dev.guru.userservice.service;

import dev.guru.userservice.dto.UserDto;
import dev.guru.userservice.dto.UserResponseDto;
import dev.guru.userservice.model.User;

public interface UserService {

    User registerUser(UserDto userDto);

    User validateUser(String token);
}
