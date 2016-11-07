package com.senacor.model;
import org.springframework.data.annotation.Id;

/**
 * Created by Marynasuprun on 07.11.2016.
 */
public class User {

    private String id;
    private String loginName;
    private String password;
    private String vorname;
    private String nachname;
    private String email;
    private String titel;
    private String position;
    private String clientServiceTeam;
    private String roleId;


    public User(String loginName, String password, String id) {
        this.id = id;
        this.loginName = loginName;
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

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
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

    @Id
    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(String id) {
        this.id = id;
    }
}

