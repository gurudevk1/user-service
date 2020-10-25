package dev.guru.ibclone.event;

import lombok.Getter;
import lombok.Setter;
import org.springframework.context.ApplicationEvent;

import dev.guru.ibclone.model.User;

@Getter
@Setter
public class SuccessfulRegistrationEvent extends ApplicationEvent {

    private final User registeredUser;

    public SuccessfulRegistrationEvent(User registeredUser) {
        super(registeredUser);
        this.registeredUser = registeredUser;
    }
}
