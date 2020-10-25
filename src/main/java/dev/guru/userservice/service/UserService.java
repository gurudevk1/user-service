package dev.naman.userservice.service;

import dev.naman.userservice.dto.UserDto;
import dev.naman.userservice.dto.UserResponseDto;
import dev.naman.userservice.model.User;

public interface UserService {

    User registerUser(UserDto userDto);

    User validateUser(String token);
}
