/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hgulibrary;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author vldrj
 */
public class ImpleObserver_second implements Observer_second{
    
    @Override
    public void update(boolean flag) {
          if (flag) {
            JFrame jFrame = new JFrame();
            JOptionPane.showMessageDialog(jFrame,  "New book is added!");
        }  
    }
}
