/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author vldrj
 */
class LoginInfo {
    public static boolean isLogin = false;
    public static String username = "";
    
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
