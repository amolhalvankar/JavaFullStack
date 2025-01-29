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
public class CollegeSystem_MenuBar {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Main Frame");
        frame.setLayout(null);
        frame.setSize(800, 800);
        frame.setVisible(true);

        JMenuBar mb1 = new JMenuBar();

        JMenu department = new JMenu("DEPARTMENT");
        JMenu classes = new JMenu("Year");

        JMenuItem d1, d2, d3, d4, c1, c2, c3;
        d1 = new JMenuItem("IT");
        d2 = new JMenuItem("CS");
        d3 = new JMenuItem("AI");
        d4 = new JMenuItem("DS");
        c1 = new JMenuItem("First Year");
        c2 = new JMenuItem("Second Year");
        c3 = new JMenuItem("Third Year");

        department.add(d1);
        department.add(d2);
        department.add(d3);
        department.add(d4);
        classes.add(c1);
        classes.add(c2);
        classes.add(c3);

        department.add(classes);
        mb1.add(department);
        frame.setJMenuBar(mb1);

    }

}
