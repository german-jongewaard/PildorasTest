package java_hasta_el_video_100.video66;
  
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.imageio.*;
import java.io.*;

/**
 *
 * @author german
 * 
 */  

public class TrabajandoConImagenes {
    
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoBotones mimarco = new MarcoBotones();
        
        mimarco.setVisible(true);
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

 class MarcoBotones extends JFrame{
    
    public MarcoBotones(){
        
        setTitle("Botones y Eventos");
        
       // setSize(400,400); 
        
        Toolkit mipantalla = Toolkit.getDefaultToolkit();
        
        Dimension tamanioPantalla = mipantalla.getScreenSize();
        
        int alturaPantalla = tamanioPantalla.height;
        
        int anchoPantalla = tamanioPantalla.width;
        
        setSize(anchoPantalla/2, alturaPantalla/2);
        
        setLocation(anchoPantalla/4, alturaPantalla/4);             
           
        //Instancio la clase LaminaConFiguras para poder verla en el marco con dibujos!
        LaminaBotones milamina = new LaminaBotones();
        //Agrego la instancia !
        add(milamina);         
    }    
}

class LaminaBotones extends JPanel implements ActionListener{
    
   JButton botonAzul = new JButton("Azul");
   
   JButton botonAmarillo = new JButton("Amarillo");
   
   JButton botonRojo = new JButton("Rojo");
   
   public LaminaBotones(){
       
       add(botonAzul);
       add(botonAmarillo);
       add(botonRojo);
       
       
//objeto fuente (botonAzul)    Al hacer clic(Action)    El oyente el objeto que recibe el evento el this!
       //con el this hacemos referencia que llamamos a la propia clase en la que estamos.
       botonAzul.addActionListener(this);
       botonAmarillo.addActionListener(this);
       botonRojo.addActionListener(this);
       
   }
   
   public void actionPerformed(ActionEvent e){
       
       Object botonPulsado = e.getSource();
       
       if(botonPulsado == botonAzul){
            setBackground(Color.blue);
       }else if(botonPulsado== botonAmarillo){
           setBackground(Color.yellow);
       }else {
           setBackground(Color.red);
       }          
   }
}
     

 