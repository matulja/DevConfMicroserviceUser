package com.senacor.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * Created by Marynasuprun on 07.11.2016.
 */
@Document(collection = "user")
public class User {

    @Id
    private String userId;
    private String username;
    private String password;
    private String naturalPersonID;
    private String role;

    public User() {

    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }


    public String getUsername() {
        return username;
    }


    public String getUserId() {
        return userId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getNaturalPersonID() {
        return naturalPersonID;
    }

    public void setNaturalPersonID(String naturalPersonID) {
        this.naturalPersonID = naturalPersonID;
    }

    public void setAdminRole() {
        this.role = Role.ADMIN;
    }


}

