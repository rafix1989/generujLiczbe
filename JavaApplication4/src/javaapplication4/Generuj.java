/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication4;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;



/**
 *
 * @author BonGo
 */
public class Generuj extends javax.swing.JFrame{
    int losowaliczba,zgadnij,proba;
    private JButton ok;
    private JButton generowanie_liczby;
    private JButton koniec;
    private JTextField poletekstowe;
    private JLabel wynik;
    private JLabel tekst;
    private JLabel ileprob;
    
    
    public Generuj() {
        setLayout(new FlowLayout());
        
        tekst = new JLabel("Podaj Liczbę z przedziału 1-100");
        add(tekst);
        
        ileprob = new JLabel("Próba: 1");
        add(ileprob);
       
        poletekstowe = new JTextField(30);
        add(poletekstowe);
        
        wynik = new JLabel("Podaj Liczbę");
        add(wynik);
        
        ok = new JButton("OK");
        add(ok);
        
        koniec = new JButton("Wyjdź z programu");
        add(koniec);
        
        generowanie_liczby = new JButton("Generuj liczbę");
        add(generowanie_liczby);
                
        Generuj.dodaj e = new Generuj.dodaj();
        ok.addActionListener(e);
        Generuj.generowanie_liczby ev = new Generuj.generowanie_liczby();
        generowanie_liczby.addActionListener(ev);
        Generuj.exit eve = new Generuj.exit();
        koniec.addActionListener(eve);
      
    }
    public class dodaj implements ActionListener{
        public void actionPerformed(ActionEvent e){
            
            try{
                    proba++;
                    ileprob.setText("Próba: "+ proba);
                    zgadnij =(int)(Double.parseDouble(poletekstowe.getText()));
                      if(zgadnij == losowaliczba){
                             wynik.setText("WYGRAŁES!!!!");
                       }else if(zgadnij < losowaliczba){
                             wynik.setText("Za Mało !");
                       }else if(zgadnij > losowaliczba){
                             wynik.setText("Za Dużo");
                       }else if (zgadnij >= 100){
                           wynik.setText("Zła liczba");
                       }
       }catch (Exception ex){
           wynik.setText("Liczba, którą miałeś zgadnąć to: " + losowaliczba);
       }
        }
    }
    public class generowanie_liczby implements ActionListener{
        public void actionPerformed(ActionEvent ev){
            proba = 1;
            ileprob.setText("Próba: "+ proba);
            losowaliczba = (int) (Math.random() * 99 + 1);
        }
    }
    public class exit implements ActionListener{
        public void actionPerformed(ActionEvent eve){
            System.exit(1);
        }
    }
    public static void main (String args[]){
        Generuj gui = new Generuj();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.setSize(450,150);
        gui.setTitle("Losowa liczba");
    }
}