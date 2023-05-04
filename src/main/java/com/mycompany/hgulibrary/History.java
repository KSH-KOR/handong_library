/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hgulibrary;

import java.util.Calendar;
import java.util.Date;
import java.util.UUID;

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
    
    private Date getDateNDaysAfter(Date currDate, int offsetDays){
        Calendar cal = Calendar.getInstance();
        cal.setTime(currDate);
        cal.add(Calendar.DAY_OF_MONTH, offsetDays);
        return cal.getTime();
    }
    
    History(String historyId, String userId, Book book, Date borrowedDate, int returnDateOffset){
        this.historyId = historyId != null ? historyId : UUID.randomUUID().toString();
        this.userId = userId;
        this.book = book;
        this.borrowedDate = borrowedDate != null ? borrowedDate : new Date();
        this.returnDate = getDateNDaysAfter(this.borrowedDate, returnDateOffset);
        this.returnedDate = null;
    }
    
    private void setHistory(int returnDateOffset, Date returnedDate){
        this.returnDate = getDateNDaysAfter(this.returnDate, returnDateOffset);
        this.returnedDate = returnedDate != null ? returnedDate : null;
    }
    
    public void requestProlong(int returnDateOffset){
        setHistory(returnDateOffset, null);
    }
    
    // If returnedDate is null, set it as current date.
    public void setBookReturned(Date returnedDate){
        setHistory(0, returnedDate != null ? returnedDate : new Date());
    }
    
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
