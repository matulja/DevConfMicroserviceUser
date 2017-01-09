package com.senacor.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


/**
 * Created by Marynasuprun on 30.11.2016.
 */
@Document(collection = "naturalPerson")
public class NaturalPerson {

    @Id
    private String naturalPersonId;
    private String firstname;
    private String lastname;
    private String email;
    private String titel;
    private String position;
    private String userId;

    public String getNaturalPersonId() {
        return naturalPersonId;
    }

    public void setNaturalPersonId(String naturalPersonId) {
        this.naturalPersonId = naturalPersonId;
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

    public void setClientServiceTeam(String clientServiceTeam) {
        this.clientServiceTeam = clientServiceTeam;
    }

    public String getClientServiceTeam() {

        return clientServiceTeam;
    }

    private String clientServiceTeam;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}
