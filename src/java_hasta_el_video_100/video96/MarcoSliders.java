 
package java_hasta_el_video_100.video96;   
 
import java.awt.BorderLayout;

import java.awt.Font;

import java.awt.event.*; 

import javax.swing.*;
 

 
public class MarcoSliders {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Frame_sliders mimarco = new Frame_sliders(); 
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);          
        
        mimarco.setVisible(true); 
    }    
}

 class Frame_sliders extends JFrame{
    
    public Frame_sliders(){
        
       setTitle("Probando Sliders");
        
       setBounds(550, 400, 550, 350);  
       
       Lamina_Sliders milamina = new Lamina_Sliders();
       
       add(milamina);
       
       setVisible(true);
       
    }    
} 

class Lamina_Sliders extends JPanel{
    public Lamina_Sliders(){
          
        /* Asi quedaria en vertical! 
         JSlider control = new JSlider(SwingConstants.VERTICAL, 0, 100, 50);
        
        */
        JSlider control = new JSlider(0, 100, 50);
        
        control.setMajorTickSpacing(25);
        
        control.setMinorTickSpacing(5);
        
        control.setPaintTicks(true);
        
        control.setPaintLabels(true);
        //cambio la fuente de los numeros
        control.setFont(new Font("Serif", Font.ITALIC, 12));
        //funciona como un Iman y se coloca en la LINEA!
        control.setSnapToTicks(true);
         
        
        add(control);
        }    
    } 
     