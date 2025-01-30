/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.userinterface;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

/**
 *
 * @author Amol
 */
public class JavaTreeDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Mian Frame");
        frame.setSize(400,400);
        frame.setVisible(true);
        
        DefaultMutableTreeNode game = new DefaultMutableTreeNode("Game");
        DefaultMutableTreeNode  team= new DefaultMutableTreeNode("Team");
        DefaultMutableTreeNode  solo= new DefaultMutableTreeNode("Solo");
        
        game.add(team);
        game.add(solo);
        
        
        DefaultMutableTreeNode  cricket= new DefaultMutableTreeNode("Cricket");
        DefaultMutableTreeNode  kabbadi= new DefaultMutableTreeNode("Kabbadi");
        DefaultMutableTreeNode  khokho= new DefaultMutableTreeNode("Kho-Kho");
        DefaultMutableTreeNode  football= new DefaultMutableTreeNode("Football");
        DefaultMutableTreeNode   baseball= new DefaultMutableTreeNode("Baseball");
        DefaultMutableTreeNode  hockey= new DefaultMutableTreeNode("Hockey");
        
        DefaultMutableTreeNode  hopscotch= new DefaultMutableTreeNode("Hopscotch");
        DefaultMutableTreeNode  stonesky= new DefaultMutableTreeNode("Stone Skipping");
        DefaultMutableTreeNode  skippingrope= new DefaultMutableTreeNode("Skipping Rope");
        
        
        team.add(cricket);
        team.add(kabbadi);
        team.add(khokho);
        team.add(football);
        team.add(baseball);
        team.add(hockey);
        
        solo.add(hopscotch);
        solo.add(stonesky);
        solo.add(skippingrope);
        
        
        
        JTree jt = new JTree(game);
        frame.add(jt);
          
    }
    
    
}
