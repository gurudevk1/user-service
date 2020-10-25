package dev.naman.userservice.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Getter
@Setter
public class UserDto {

    @NotEmpty
    @Size(min = 5)
    private String fullName;

    @NotEmpty
    @Size(min = 1)
    private String email;

    // TODO: Implement Custom Validators
    @NotEmpty
    @Size(min = 6)
    private String password;
}


/// spring will receive network req
// userdto = new UserDto();
// userDto.setFullname(),