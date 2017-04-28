/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex2;

import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

/**
 *
 * @author minhtu
 */
import java.awt.*;
public class Ex2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Frame f = new Frame();
         f.setTitle("examle1");
         f.setSize (300,400);
         f.setLayout(new FlowLayout());
         
         Label lbl = new Label("Enter an integer");  
         f. add(lbl);    
         TextField txt = new TextField ("8",30);
         f.add(txt);
         Label lbb = new Label("Accumulated sum is");  
         f. add(lbb);    
         TextField tbx = new TextField ("123",30);
         f.add(tbx);
         
         f.setVisible(true);
    }
    
}
