/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.userinterface;
import javax.swing.*;
import javax.swing.filechooser.*;
import java.awt.*;

/**
 *
 * @author Amol
 */
public class FileChooserandiconDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Main Frame");
        frame.setSize(800,800);
        frame.setVisible(true);
        
        JFileChooser jfc = new JFileChooser("D:\\JavaFullStack");
        jfc.showSaveDialog(null);
        
        
        Image icon = Toolkit.getDefaultToolkit().getImage("D:\\JavaFullStack\\icon.png");
        frame.setIconImage(icon);
        
        
        
    }
    
}
