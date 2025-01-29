/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.userinterface;
import javax.swing.*;

/**
 *
 * @author Amol
 */
public class ButtonAndLable {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Main Frame");
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        JLabel l1 =new JLabel("Hello,Label");
        JButton b1 = new JButton("Click me");
        b1.setBounds(190,250,100,30);
        l1.setBounds(210,280,100,50);
        frame.add(b1);
        frame.add(l1);
        
       
        
    }
    
}
