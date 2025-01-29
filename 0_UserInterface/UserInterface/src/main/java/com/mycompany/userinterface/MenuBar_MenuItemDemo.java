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
public class MenuBar_MenuItemDemo {
    
    public static void main(String[] args) {
        JFrame frame = new JFrame("MainFrame");
        frame.setSize(400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Creating MenuBar
        JMenuBar mb = new JMenuBar();

        //Creating Menu And SubMenu
        JMenu menu = new JMenu("Menu");
        JMenu submenu = new JMenu("SubMenu");

        //Another Method 
        // Menu menu, submenu;
        // menu = new JMenu("Menu");
        // submenu = new JMenu("SubMenu");

        JMenuItem i1, i2, i3, i4, i5;
        
        i1 = new JMenuItem("Mango");
        i2 = new JMenuItem("Banana");
        i3 = new JMenuItem("Potato");
        i4 = new JMenuItem("Orange");
        i5 = new JMenuItem("Apple");
        
        menu.add(i1);
        menu.add(i2);
        menu.add(i3);
        submenu.add(i4);
        submenu.add(i5);
        
        menu.add(submenu);
        mb.add(menu);
        
        frame.setJMenuBar(mb);
    }
    
}
