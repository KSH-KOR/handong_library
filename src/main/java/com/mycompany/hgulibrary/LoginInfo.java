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
    
    static public void setisLogin(boolean info){
        isLogin = info;
    }
    
    static public boolean getisLogin(){
        return isLogin;
    }
    
    static public void setUsername(String name){
        username = name;
    }
    
    static public String getUsername(){
        return username;
    }
}
