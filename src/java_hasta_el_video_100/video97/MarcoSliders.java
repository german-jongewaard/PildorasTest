 package java_hasta_el_video_100.video97; 

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.*; 
import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
 
 /**
 *
 * @author german
 */
 
public class MarcoSliders {
    
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
        
        setLayout(new BorderLayout());
        
        rotulo = new JLabel("En un lugar de la mancha de cuyo nombre...");
        
        add(rotulo, BorderLayout.CENTER);
         
        control = new JSlider(8, 50, 12);
        
        control.setMajorTickSpacing(20);
        
        control.setMinorTickSpacing(5);
        
        control.setPaintTicks(true);
        
        control.setPaintLabels(true);
        //cambio la fuente de los numeros
        control.setFont(new Font("Serif", Font.ITALIC, 10));
        //funciona como un Iman y se coloca en la LINEA!
      //  control.setSnapToTicks(true);
        
        control.addChangeListener(new EventoSlider());
         
        JPanel laminaSlider = new JPanel();
        
        laminaSlider.add(control);
        
        add(laminaSlider, BorderLayout.NORTH);
       // add(control);
    }    
    
    private class EventoSlider implements ChangeListener{
        
        public void stateChanged(ChangeEvent e) { 
             
           // System.out.println("estas manipulando el deslizante" + control.getValue());
            
            rotulo.setFont(new Font("Serif", Font.PLAIN, control.getValue()));            
        }        
    }
        
    private JLabel rotulo;    
    private JSlider control;     
} 
     