package dev.naman.userservice.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

@Getter
@Setter
@Entity
public class VerificationToken {

    private static final int VALIDITY_TIME = 4 * 60; // in  minutes

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String token; // 12u63868237931093808310

    @OneToOne(targetEntity = User.class)
    private User user;

    private Date expiryTime;


    public VerificationToken() {
        super();
    }

    public VerificationToken(User user) {

        String token = generateRandomUniqueToken();

        this.token = token;
        this.user = user;

        this.expiryTime = calculateExpiryTime();
    }

    public void updateToken() {
        this.token = generateRandomUniqueToken();
        this.expiryTime = calculateExpiryTime();
    }

    private String generateRandomUniqueToken() {
        return UUID.randomUUID().toString();
    }

    private Date calculateExpiryTime() {

        Calendar calendar = Calendar.getInstance();

        Date currentTimeAndDate = new Date();

        calendar.setTimeInMillis(currentTimeAndDate.getTime());
        calendar.add(Calendar.MINUTE, VALIDITY_TIME);

        return calendar.getTime();
    }

    // universally unique id

}


/// scaler.com
// create account
// you get email click link
// scaler.com/verify/12u63868237931093808310 12u63868237931093808310
// click on the link -> which user had this email verification toke
// token , userid, expiryTime