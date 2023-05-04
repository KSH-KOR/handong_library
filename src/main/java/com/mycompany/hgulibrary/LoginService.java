/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hgulibrary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map; 

/**
 *
 * @author shinhookim
 */
public class LoginService {
    
    final private String [][] userInfoDB = {{"admin", "admin@gmail.com", "admin", "admin"}, {"shinhoo kim", "ksh@gmail.com", "shinhoo", "1234"}};
    
    private static LoginService single_instance = null;
    
    
    LoginService() {
        userDB = new ArrayList<UserParent>();
        for(String[] userInfo : userInfoDB){
            userDB.add(new UserParent(userInfo));
        }
    }

    public static synchronized LoginService getInstance() {
        if (single_instance == null) {
            single_instance = new LoginService();
        }

        return single_instance;
    }
    
    final private List<UserParent> userDB;
    
    private String userId = null;
    
    public Boolean doesUserExist(String id, String pw){
        return userDB.stream().filter(map -> map.getUserid().equals(id) && map.getPassword().equals(pw)).count() > 0;
    }
    
    public Boolean login(String id, String pw){
        if(doesUserExist(id, pw)){
            userId = id;
            return true;
        }
        return false;
    }
    
    public Boolean isLogin(){
        return userId != null;
    }
    
    public String getUserId(){
        return userId;
    }
   
}
