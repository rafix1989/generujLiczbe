/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication4;

import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.JFrame;


public class Glowne_okno extends javax.swing.JFrame {
     private JButton Zacznij;
     private JButton Opcje;
     private JButton Koniec;

     
     public  Glowne_okno(){
         setLayout(new FlowLayout());
         
         Zacznij = new JButton("Zacznij Grę");
         add(Zacznij);
         
         Opcje = new JButton("Opcje");
         add(Opcje);
         
         Koniec = new JButton("Zakończ Grę");
         add(Koniec);
         
         Glowne_okno.startgry a = new Glowne_okno.startgry();
         Zacznij.addActionListener(a);
         Glowne_okno.opcjegry b = new Glowne_okno.opcjegry();
         Opcje.addActionListener(b);
         Glowne_okno.koniecgry c = new Glowne_okno.koniecgry();
         Koniec.addActionListener(c);    
     }
     public class startgry implements ActionListener{
        public void actionPerformed(ActionEvent a){

        }
     }
        
     public class opcjegry implements ActionListener{
        public void actionPerformed(ActionEvent b){
            
        }
     }
        
     public class koniecgry implements ActionListener{
        public void actionPerformed(ActionEvent c){
            System.exit(1);
        }
     }
                
                
                
     public static void main (String args[]){
        Glowne_okno gui = new Glowne_okno();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.setSize(450,150);
        gui.setTitle("Losowa liczba");
    }
}
   
  


     
