package java_hasta_el_video_100.video98;   

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.*; 
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
 
/**
 *
 * @author german
 *  
 */
 
public class MarcoSpinner {
   
    public static void main(String[] args) {
        // TODO code application logic here
        Frame_Spinner mimarco = new Frame_Spinner(); 
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);          
        
        mimarco.setVisible(true); 
    }    
}

 class Frame_Spinner extends JFrame{
    
    public Frame_Spinner(){
        
       setTitle("Probando Spinner");
        
       setBounds(550, 400, 550, 350);  
       
       Lamina_Spinner milamina = new Lamina_Spinner();
       
       add(milamina);
       
       setVisible(true);       
    }    
} 

class Lamina_Spinner extends JPanel{
    
    public Lamina_Spinner(){
        
       // String lista[]={"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
        //Con esto llamo a todas las fuentes / tipo de letras en "lista"
         String lista[]=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
                 
        //JSpinner control = new JSpinner(new SpinnerDateModel());
        
        //JSpinner control = new JSpinner(new SpinnerListModel(lista));
        
        JSpinner control = new JSpinner(new SpinnerNumberModel(1, 0, 50, 2));
        
        Dimension d = new Dimension(200, 25);
        
        control.setPreferredSize(d);
        
        add(control);        
    }  
} 
