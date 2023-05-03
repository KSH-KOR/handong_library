/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hgulibrary;

/**
 *
 * @author shinhookim
 */
enum BookState{
    available, borrowed, notAvailable
}
public class Book{
       private String bookLocation;
       private BookState bookState;
       Book(String bookLocation){
           this.bookLocation = bookLocation;
           this.bookState = BookState.available;
       }
       public String getBookLocation(){
           return bookLocation;
       }
       public BookState getBookState(){
           return bookState;
       }
       public void updateBookState(BookState newBookState){
           bookState = newBookState;
       }
}
