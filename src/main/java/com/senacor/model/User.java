package com.senacor.model;

import org.springframework.data.annotation.Id;

/**
 * Created by Marynasuprun on 07.11.2016.
 */
public class User {

    @Id
    private String userId;
    private String username;
    private String password;
    private NaturalUser naturalUser;
    private String [] roles;

    public User() {

    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }



    public void setUserId(String userId) {
        this.userId = userId;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String[] getRoles() {
        return roles;
    }

    public void setRoles(String[] roles) {
        this.roles = roles;
    }


    public String getUsername() {
        return username;
    }

    public void setLoginName(String username) {
        this.username = username;
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

    public NaturalUser getNaturalUser() {
        return naturalUser;
    }

    public void setNaturalUser(NaturalUser naturalUser) {
        this.naturalUser = naturalUser;
    }


}

