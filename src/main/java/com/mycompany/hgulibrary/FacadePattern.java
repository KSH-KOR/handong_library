/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hgulibrary;

import java.util.List;
import java.util.stream.Stream;
import javax.swing.JOptionPane;
import javax.swing.JRootPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author shinhookim
 */
public class FacadePattern {
    
    final static private LoginService loginService = LoginService.getInstance();
    final static private HistoryService historyService = HistoryService.getInstance();
    final static private Res res = Res.getInstance();
    
    public static int setHistoryList(JRootPane rootPane, DefaultTableModel model){
        String userId = loginService.getUserId();
        if (userId == null) {
            JOptionPane.showMessageDialog(rootPane, "Cannot find login info");
            return 1;
        }
        
        Stream<History> histories = historyService.getBooksNeedToBeReturnedByUserId(userId);
        for(int i=0; i<model.getRowCount(); i++){
            model.removeRow(i);
        }
        histories.forEach(history -> model.addRow(history.getTableItem()));
        return 0;
    }
    public static int setReservationList(JRootPane rootPane, DefaultTableModel model){
        String userId = loginService.getUserId();
        if (userId == null) {
            JOptionPane.showMessageDialog(rootPane, "Cannot find login info");
            return 1;
        }
        
        List<Reservation> reservationList = res.getuserReservationList(userId);
        for(int i=0; i<model.getRowCount(); i++){
            model.removeRow(i);
        }
        reservationList.forEach(reservation -> model.addRow(reservation.getTableItem()));
        return 0;
    }
    
    public static int borrowBook(JRootPane rootPane, String selectedBookTitle){
        if(!loginService.isLogin()){
            JOptionPane.showMessageDialog(rootPane, "Login required to borrow a book");
            return 1;
        }
        
        if(res.hasBookInfo(selectedBookTitle)){
            BookInfo book = res.searchBookByTitle(selectedBookTitle).toList().get(0);
            if(book.requestBorrow()){
               JOptionPane.showMessageDialog(rootPane, selectedBookTitle + " book is borrowed");
            } else{
                int option = JOptionPane.showConfirmDialog(rootPane, "Do you want to reserve this book?", "No available books", JOptionPane.YES_NO_OPTION, 3);
                if(option == 0){
                    if(res.checkIfUserHasReserved(loginService.getUserId(), book.getISBN())){
                        JOptionPane.showMessageDialog(rootPane, selectedBookTitle + " has been already reserved", "Failed to reserve", JOptionPane.ERROR_MESSAGE);
                    } else{
                        res.addNewReservation(loginService.getUserId(), book.getISBN());
                        JOptionPane.showMessageDialog(rootPane, selectedBookTitle + " is reserved");
                    }
                    
                }
            }
        } else{
            JOptionPane.showMessageDialog(rootPane, selectedBookTitle + " book is not available", "Failed to borrow", JOptionPane.ERROR_MESSAGE);

        }
        
        return 0;
    }
    
    
}
