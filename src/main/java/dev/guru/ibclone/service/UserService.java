package dev.guru.ibclone.service;

import dev.guru.ibclone.dto.UserDto;
import dev.guru.ibclone.dto.UserResponseDto;
import dev.guru.ibclone.model.User;

public interface UserService {

    User registerUser(UserDto userDto);

    User validateUser(String token);
}
