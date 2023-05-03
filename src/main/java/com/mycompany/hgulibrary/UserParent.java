/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.hgulibrary;

import java.util.UUID;

/**
 *
 * @author soundligt
 */
public class UserParent {
    public UUID uuid;

    public String username;
    public String email;
    public String userid;
    public String password;

    
    public UserParent(String email, String username, String userid, String password){
        this.uuid = UUID.randomUUID();
        this.email = email;
        this.username = username;
        this.userid = userid;
        this.password = password;

    }


    public UUID getUuid() {
        return uuid;
    }
    
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
