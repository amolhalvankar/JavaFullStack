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
public class Radiobutton_CheckboxAndCombobox {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("Main Frame");
        frame.setSize(500,500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     
        //Label
        JLabel lb = new JLabel("Select your language!!");
        lb.setBounds(60,10,200,30);
        frame.add(lb);
        
        //CheckBox
        JCheckBox chb1 = new JCheckBox("Java");
        chb1.setBounds(60,30,60,30);
        frame.add(chb1);
        
        JCheckBox chb2 = new JCheckBox("Python");
        chb2.setBounds(60,60,80,30);
        frame.add(chb2);
        
        //Radio Button
        JRadioButton rb = new JRadioButton("C++");
        rb.setBounds(60,90,60,30);
        frame.add(rb);
        
        JRadioButton rb1 = new JRadioButton("JavaScript");
        rb1.setBounds(60,120,100,30);
        frame.add(rb1);
        
        
        //ComboBox 
        String data[]={"Java","C++","Python","JavaScript"};
        JComboBox cb = new JComboBox(data);
        cb.setBounds(60,150,100,30);
        frame.add(cb);
        
        
        
        
        
        
    }
    
}
