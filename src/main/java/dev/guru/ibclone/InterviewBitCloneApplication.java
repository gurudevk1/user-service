package dev.guru.ibclone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = SecurityAutoConfiguration.class)
public class InterviewBitCloneApplication {

    public static void main(String[] args) {
        SpringApplication.run(InterviewBitCloneApplication.class, args);
    }

}
