package com.senacor.model;

import org.springframework.data.annotation.Id;

import java.security.SecureRandom;

/**
 * Created by Marynasuprun on 30.11.2016.
 */
public class Token {

    // TODO UUID



    private String tokenId;
    private String userId;
    private String role;

    public Token() {

    }

    public Token(User user) {
        this.userId=user.getUserId();
        this.role=user.getRole();
        this.tokenId= generateTokenId();
    }


    public String getTokenId() {
        return tokenId;
    }

    public void setTokenId(String tokenId) {
        this.tokenId = tokenId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getRole() {
        return role;
    }

    public void setRoles(String role) {
        this.role = role;
    }

    private String generateTokenId ()
    {
        SecureRandom random= new SecureRandom();
        byte bytes [] = new byte [20];
        random.nextBytes(bytes);
        return bytes.toString();
    }
}


