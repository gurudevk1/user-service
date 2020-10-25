package dev.naman.userservice.event.listener;

import dev.naman.userservice.event.SuccessfulRegistrationEvent;
import dev.naman.userservice.model.User;
import dev.naman.userservice.model.VerificationToken;
import dev.naman.userservice.repository.VerificationTokenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class SuccessfulRegistrationEventListener implements ApplicationListener<SuccessfulRegistrationEvent> {

    @Autowired
    VerificationTokenRepository verificationTokenRepository;

    @Override
    public void onApplicationEvent(SuccessfulRegistrationEvent successfulRegistrationEvent) {

        User registeredUser = successfulRegistrationEvent.getRegisteredUser();

        VerificationToken token = new VerificationToken(registeredUser);

        verificationTokenRepository.save(token);

        // TODO: Send email to the user

        // TODO: Allocate resources for the user

    }
}
