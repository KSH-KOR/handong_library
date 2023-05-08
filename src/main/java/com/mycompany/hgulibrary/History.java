/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hgulibrary;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
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
    
    private String formattedDate(Date date){
        DateFormat dateFormat = new SimpleDateFormat("yyyy-mm-dd");  
        return dateFormat.format(date); 
    }
    
    public Object[] getTableItem(){
        Object[] result = new Object[6];
        BookInfo bookInfo = this.book.getBookInfo();
        result[0] = bookInfo.getBookName();
        result[1] = bookInfo.getISBN();
        result[2] = formattedDate(this.borrowedDate);
        result[3] = formattedDate(this.returnDate);
        result[4] = this.returnedDate == null ? "not returned yet" : formattedDate(this.returnedDate);
        result[5] = this.historyId;
        return result;
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
    public Date getReturnedDate(){
        return this.returnedDate;
    }
}
