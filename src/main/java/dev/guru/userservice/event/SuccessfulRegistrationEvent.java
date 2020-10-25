package dev.guru.userservice.event;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

import dev.guru.userservice.model.User;

@Getter
@Setter
public class SuccessfulRegistrationEvent extends ApplicationEvent {

    private final User registeredUser;

    public SuccessfulRegistrationEvent(User registeredUser) {
        super(registeredUser);
        this.registeredUser = registeredUser;
    }
}
