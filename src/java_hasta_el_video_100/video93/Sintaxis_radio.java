 package java_hasta_el_video_100.video93;  

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.*; 
import javax.swing.*;
 
  /**
 *
 * @author german
 * 
 */
 
public class Sintaxis_radio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Marco_radio_sintaxis mimarco = new Marco_radio_sintaxis(); 
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);          
        
        mimarco.setVisible(true); 
    }    
}

 class Marco_radio_sintaxis extends JFrame{
    
    public Marco_radio_sintaxis(){
        
       setVisible(true);
       
       setTitle("Probando Radio Button");
        
       setBounds(550, 300, 500, 300); 
       
       
       
       Lamina_radio_sintaxis milamina = new Lamina_radio_sintaxis();
       
       add(milamina);
       
    }    
} 


class Lamina_radio_sintaxis extends JPanel{
    public Lamina_radio_sintaxis(){
         
        //primero creo un grupo y luego los botones que van dentro de el
         ButtonGroup migrupo1 = new ButtonGroup();
         
         ButtonGroup migrupo2 = new ButtonGroup();
         
         JRadioButton boton1 = new JRadioButton("Azul", false);
         
         JRadioButton boton2 = new JRadioButton("Rojo", true); //al ser true el boton aparece activado
         
         JRadioButton boton3 = new JRadioButton("Verde", false);
         
         
         JRadioButton boton4 = new JRadioButton("Masculino", false);
         
         JRadioButton boton5 = new JRadioButton("Femenino", false); 
         
         //aqui le digo que los 3 botones estan dentro del grupo ButtonGroup
         migrupo1.add(boton1);
         
         migrupo1.add(boton2);
         
         migrupo1.add(boton3);
         
         migrupo2.add(boton4);
         
         migrupo2.add(boton5);
         
         /*
         aqui agrego los botones uno a una a la lamina, el grupo jamas puede agregarse.
         */
         add(boton1);
         
         add(boton2);
         
         add(boton3);
         
         add(boton4);
         
         add(boton5);
        
    }
}
     