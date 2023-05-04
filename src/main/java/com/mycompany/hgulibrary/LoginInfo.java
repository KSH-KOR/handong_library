package com.mycompany.hgulibrary;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vldrj
 */
class LoginInfo {
    private static boolean isLogin = false;
    private static String username = "";
    private static String userId = null;
    
    static public String getUserId(){
        return userId;
    }
    
    public void setisLogin(boolean info){
        isLogin = info;
    }
    
    public boolean getisLogin(){
        return isLogin;
    }
    
    public void setUsername(String name){
        username = name;
    }
    
    public String getUsername(){
        return username;
    }
}
