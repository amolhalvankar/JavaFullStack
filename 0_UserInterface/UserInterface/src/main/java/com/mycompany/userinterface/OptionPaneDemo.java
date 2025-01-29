package com.mycompany.userinterface;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import javax.swing.*;
/**
 *
 * @author Amol
 */
public class OptionPaneDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        
        //Dialog Box --  Message,Alert,Input
        JOptionPane.showMessageDialog(frame,"We are learning FullStackJava..");
        JOptionPane.showMessageDialog(frame,"Wrong Password" ,"Alert",JOptionPane.WARNING_MESSAGE);
        String password = JOptionPane.showInputDialog(frame,"Enter Password");
        System.out.println(password);
    }
    
}
