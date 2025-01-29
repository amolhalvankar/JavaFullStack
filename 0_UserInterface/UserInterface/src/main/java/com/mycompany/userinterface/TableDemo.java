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
public class TableDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Main Frame");
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        String[] columns = {"ID", "Name", "City"};
        String[][] data = {{"001", "Amol", "KOP"}, {"002", "Sudesh", "KOP"}, {"003", "Pruthvi", "KOP"}};

        JTable tb = new JTable(data, columns);

 
        JScrollPane scrollPane = new JScrollPane(tb);
        scrollPane.setBounds(40, 40, 400, 200);
        frame.add(scrollPane);

        frame.setVisible(true);
        
        
    }
    
}
