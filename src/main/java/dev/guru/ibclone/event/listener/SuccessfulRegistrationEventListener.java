package dev.guru.ibclone.event.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import dev.guru.ibclone.event.SuccessfulRegistrationEvent;
import dev.guru.ibclone.model.User;
import dev.guru.ibclone.model.VerificationToken;
import dev.guru.ibclone.repository.VerificationTokenRepository;

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
