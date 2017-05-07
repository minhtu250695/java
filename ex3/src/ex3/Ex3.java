/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex3;

/**
 *
 * @author minhtu
 */
import java.awt.*;

 

public class Ex3 {


   
    public static void main(String[] args) {
         Frame f = new Frame();
         f.setTitle("examle1");
         f.setSize (300,400);
         f.setLayout(new FlowLayout());
         
         Label lbl = new Label("X-click");  
         f. add(lbl);    
         TextField txt = new TextField ("252",30);
         f.add(txt);
         Label lbb = new Label("Y-click");  
         f. add(lbb);    
         TextField tbx = new TextField ("105",30);
         f.add(tbx);
         
         Label lll = new Label("X-position");  
         f. add(lll);    
         TextField ttt = new TextField ("233",30);
         f.add(ttt);
         Label bbb = new Label("Y-position");  
         f. add(bbb);    
         TextField tbt = new TextField ("40",30);
         f.add(tbt);
         
         f.setVisible(true);
         
    }
    
}
