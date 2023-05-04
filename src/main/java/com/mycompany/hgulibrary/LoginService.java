/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hgulibrary;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 *
 * @author shinhookim
 */
public class LoginService {
    
    private static LoginService single_instance = null;

    LoginService() {
        userDB = new ArrayList<HashMap<String, String>>();
    }

    public static synchronized LoginService getInstance() {
        if (single_instance == null) {
            single_instance = new LoginService();
        }

        return single_instance;
    }
    
    final private String idFieldName = "id";
    final private String pwFieldName = "pw";
    
    List<HashMap<String, String>> userDB;
    
    private String userId = null;
    
    public Boolean doesUserExist(String id, String pw){
        return userDB.stream().filter(map -> map.get(idFieldName).equals(id) && map.get(pwFieldName).equals(pw)).count() > 0;
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
