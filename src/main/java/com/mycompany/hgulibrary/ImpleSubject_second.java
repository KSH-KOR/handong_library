/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hgulibrary;

import java.util.List;

/**
 *
 * @author vldrj
 */
public class ImpleSubject_second implements Subject_second{
        
    private final List<Observer_second>observers = null;

    @Override
    public void notifyObserver() {
        System.out.println();
        for(Observer_second observer : observers){
            observer.update(true);
        }
    }
}
