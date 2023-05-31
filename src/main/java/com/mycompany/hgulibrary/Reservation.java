/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hgulibrary;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author shinhookim
 */
public class Reservation {
    private Date reservateDate;
    private String userId;
    private String ISBN;
    
    Reservation(String userId, String ISBN){
        this.userId = userId;
        this.reservateDate = new Date();
        this.ISBN = ISBN;
    }
    
    public boolean checkIfUserHasReserved(String userId, String ISBN){
        return isUserIdEqual(userId) && isISBNEqual(ISBN);
    }
    
    public boolean isUserIdEqual(String userId){
        return this.userId.equals(userId);
    }
    public boolean isISBNEqual(String ISBN){
        return this.ISBN.equals(ISBN);
    }
    
    private String formattedDate(Date date){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
        return dateFormat.format(date); 
    }
    
    public Object[] getTableItem(){
        Object[] result = new Object[3];
        result[0] = formattedDate(this.reservateDate);
        result[1] = this.ISBN;
        result[2] = this.userId;
        return result;
    }
}
