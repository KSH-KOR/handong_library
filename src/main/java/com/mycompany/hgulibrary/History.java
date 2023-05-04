/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hgulibrary;

import java.util.Date;

/**
 *
 * @author shinhookim
 */
public class History {

    private String historyId;
    private Book book;
    private Date borrowedDate;
    private Date returnDate;
    private String userId;
    private Date returnedDate;
    
    public Book getBook(){
        return book;
    }
    public String getHistoryId() {
        return historyId;
    }
    public String getUserId() {
        return userId;
    }
}
