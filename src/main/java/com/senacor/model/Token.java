package com.senacor.model;

import org.springframework.data.annotation.Id;

import java.security.SecureRandom;

/**
 * Created by Marynasuprun on 30.11.2016.
 */
public class Token {

    // TODO UUID
    @Id
    private String tokenId;

    private String userId;
    private String [] roles;


    public Token(User user)

    {

        this.userId=user.getUserId();
        this.roles=user.getRoles();
        tokenId= generateTokenId();


    }

    private String generateTokenId ()
    {
        SecureRandom random= new SecureRandom();
        byte bytes [] = new byte [20];
        random.nextBytes(bytes);
        return bytes.toString();
    }
}


