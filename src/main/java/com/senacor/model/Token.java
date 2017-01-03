package com.senacor.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.security.SecureRandom;
import java.time.LocalDate;

/**
 * Created by Marynasuprun on 30.11.2016.
 */
@Document(collection = "token")
public class Token {

    // TODO UUID


    @Id
    private String tokenId;
    private String userId;
    private String role;

    private LocalDate expiryDate;

    public Token() {

    }

    public Token(User user) {
        this.userId=user.getUserId();
        this.role=user.getRole();
        this.tokenId= generateTokenId();
        this.expiryDate = LocalDate.now().plusDays(7);
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

    public void setRole(String role) {
        this.role = role;
    }

    public LocalDate getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(LocalDate expiryDate) {
        this.expiryDate = expiryDate;
    }
}


