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
    private String firstname;
    private String lastname;
    private String email;
    private String titel;
    private String position;
    private String clientServiceTeam;
    private String roleId;

    public User() {

    }
    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    /*public User(String id, String loginName, String password, String vorname, String nachname,
                String email, String titel, String position, String clientServiceTeam, String roleId) {
        this.id = id;
        this.loginName = loginName;
        this.password = password;
        this.vorname = vorname;
        this.nachname = nachname;
        this.email = email;
        this.titel = titel;
        this.position = position;
        this.clientServiceTeam = clientServiceTeam;
        this.roleId=roleId;


    }*/

    public String getUsername() {
        return username;
    }

    public void setLoginName(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getClientServiceTeam() {
        return clientServiceTeam;
    }

    public void setClientServiceTeam(String clientServiceTeam) {
        this.clientServiceTeam = clientServiceTeam;
    }

    public String getRoleId() {
        return roleId;
    }

    public void setRoleId(String roleId) {
        this.roleId = roleId;
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

}

