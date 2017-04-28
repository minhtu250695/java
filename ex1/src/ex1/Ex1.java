
package ex1;

import java.awt.*; 
 
public class Ex1 {

    
    public static void main(String[] args) {
       Frame f = new Frame();
         f.setTitle("examle1");
         f.setSize (200,300);
         f.setLayout(new FlowLayout());
         
         Label lbl = new Label("Counter");  
         f. add(lbl);    
         TextField txt = new TextField ("0",30);
         f.add(txt);
         Button btn = new Button ("Count");
         f.add(btn);
        
         f.setVisible(true);
    }
 
}
