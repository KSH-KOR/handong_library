/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hgulibrary;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;
import com.mycompany.hgulibrary.LoginInfo;


/**
 *
 * @author shinhookim
 */
public class BookInfo{
    private String bookName;
    private String ISBN;
    private String description;
    private Collection<Book> bookList;
    
    BookInfo(String title, String ISBN, String des){
        bookList = new ArrayList<Book>();
        bookName = title;
        this.ISBN = ISBN;
        description = des;
    }
    
    public void addBook(Book newBook){
        bookList.add(newBook);
    }
    
    public String getBookName(){
           return bookName;
       }
       public String getISBN(){
           return ISBN;
       }
       public String getDescription(){
           return description;
       }
     public Collection<Book> getBookList(){
         return bookList;
     }
     public Stream<Book> getAvaiableBookList(){
        return bookList.stream().filter(p -> p.getBookState() == BookState.available);
     }
     public Stream<Book> getBorrowedBookList(){
        return bookList.stream().filter(p -> p.getBookState() == BookState.borrowed);
     }
     public Boolean isAvailable(){
         return getAvaiableBookList().count() > 0;
     }
     public Boolean requestBorrow(){
         List<Book> availableBooks = getAvaiableBookList().toList();
         if(availableBooks.size() < 1){
             return false; //no available book
         }
         Book bookToBeBorrowed = availableBooks.get(0);
         HistoryService.getInstance().addNewHistory(LoginInfo.getUserId(), bookToBeBorrowed, null, 7);
         bookToBeBorrowed.updateBookState(BookState.borrowed);
         return true;
     }
}
