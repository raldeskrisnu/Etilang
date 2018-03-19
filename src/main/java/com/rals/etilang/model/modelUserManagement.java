package com.rals.etilang.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user_management")
public class modelUserManagement {

    @Id
    @Column(name = "idUser", nullable = true, columnDefinition = "Varchar(5)")
    private String idUser;

    @Column(name = "username")
    private String username;

    @Column(name = "privilage", columnDefinition = "Varchar(50)")
    private String privilage;

    public modelUserManagement(){

    }

    public modelUserManagement(String idUser, String username, String privilage){
        this.idUser = idUser;
        this.username = username;
        this.privilage = privilage;
    }

    public void setIdUser(String idUser){
        this.idUser = idUser;
    }

    public String getIdUser(){
        return idUser;
    }

    public void setUsername(String username){
        this.username = username;
    }

    public String getUsername(){
        return username;
    }

    public void setPrivilage(String privilage){
        this.privilage = privilage;
    }

    public String getPrivilage(){
        return privilage;
    }
}
