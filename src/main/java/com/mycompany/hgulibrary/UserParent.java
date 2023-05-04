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

    public String username;
    public String email;
    public String userId;
    public String password;
    
    public UserParent(String[] userInfo){
        this.email = userInfo[0];
        this.username = userInfo[1];
        this.userId = userInfo[2];
        this.password = userInfo[3];
    }
    
    public UserParent(String email, String username, String userid, String password){
        this.email = email;
        this.username = username;
        this.userId = userid;
        this.password = password;
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
        return userId;
    }

    public void setUserid(String userid) {
        this.userId = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
}
