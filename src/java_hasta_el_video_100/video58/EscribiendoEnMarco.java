package java_hasta_el_video_100.video58;

import javax.swing.*;

import java.awt.*;
        
   
public class EscribiendoEnMarco {

    
    public static void main(String[] args) {
        // TODO code application logic here
        

        //Creando la instancia de la clase
        
        MarcoConTexto miMarco = new MarcoConTexto();
        
        miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
         
    }
    
}

class MarcoConTexto extends JFrame{
    
    public MarcoConTexto(){
        
        setVisible(true);
        
        
     // El ancho de la ventana es de 600 
     // y el alto de la ventana es de 450.
        setSize(600,450);
        
     // La distancia desde la izquierda hasta el Marco es de 400 
     // la distancia desde la parte superior hasta la ventana sera de 200    
        setLocation(400,200);
        
        setTitle("primer Texto");
        
        Lamina miLamina = new Lamina();
        
        add(miLamina);
        
    }
}

class Lamina extends JPanel{
    
    public void paintComponent(Graphics g){
        
        //Invocando a paintComponent de la clase Component!!!
        super.paintComponent(g);
        
        g.drawString("Estamos aprendiendo Swing", 100, 100);
        
    }
}
