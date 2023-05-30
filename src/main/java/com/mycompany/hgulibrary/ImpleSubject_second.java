/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hgulibrary;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vldrj
 */
public class ImpleSubject_second implements Subject_second{
        
    private final List<Observer_second>observers = new ArrayList<Observer_second>();
    
    public ImpleSubject_second(Observer_second observer){
        this.observers.add(observer);
    }

    @Override
    public void notifyObserver() {
        System.out.println();
        for(Observer_second observer : observers){
            observer.update(true);
        }
    }
}
