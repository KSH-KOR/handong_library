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
public class ImpleSubject implements Subject_first {
    
    private final List<Observer_first>observers = new ArrayList<Observer_first>();

    public ImpleSubject(Observer_first observer){
        this.observers.add(observer);
    }
    
    @Override
    public void notifyObserver() {
        System.out.println();
        for(Observer_first observer : this.observers){
            observer.update(true);
        }
    }
    
}
