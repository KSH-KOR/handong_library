/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.hgulibrary;

import java.awt.Component;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author vldrj
 */
public class ImpleObserver_first implements Observer_first{

    @Override
    public void update(boolean flag) {
          if (flag) {
            JFrame jFrame = new JFrame();
            JOptionPane.showMessageDialog(jFrame,  "The Book is returned!");
            System.out.println("Return!!");
        }  
    }
}
