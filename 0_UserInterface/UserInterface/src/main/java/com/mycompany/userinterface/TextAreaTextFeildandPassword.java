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
public class TextAreaTextFeildandPassword {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Main Frame");
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        JTextField t1 = new JTextField("user_name");
        t1.setBounds(100, 100, 150, 30);

        JPasswordField p1 = new JPasswordField("password");
        p1.setBounds(100, 150, 150, 30); // 

        JTextArea t2 = new JTextArea("Tell me about yourself.");
        t2.setBounds(100, 200, 150, 60);
        
        
        frame.add(t1);
        frame.add(p1);
        frame.add(t2);
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        
    }
    
}
