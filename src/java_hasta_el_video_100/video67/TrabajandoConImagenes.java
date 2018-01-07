package java_hasta_el_video_100.video67;
   
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

    /**
     * @param args the command line arguments
     */
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

/*Aqui el programa hace lo mismo, pero cambio la Lamina para que no sea OYENTE, 
    sin ser ActionListener
*/
   

class LaminaBotones extends JPanel {
    
   JButton botonAzul = new JButton("Azul");
   
   JButton botonAmarillo = new JButton("Amarillo");
   
   JButton botonRojo = new JButton("Rojo");
   
   public LaminaBotones(){
       
       add(botonAzul);
       add(botonAmarillo);
       add(botonRojo);
       
       
       /*Instancio Azul con el Objeto Oyente ColorFondo 
       que contiene la instancia ActionListener*/
       ColorFondo Azul = new ColorFondo(Color.BLUE);
       ColorFondo Amarillo = new ColorFondo(Color.YELLOW);
       ColorFondo Rojo = new ColorFondo(Color.RED);
       
       
//objeto fuente (botonAzul)    Al hacer clic(Action)    El oyente el objeto que recibe el evento el this!
       //con el this hacemos referencia que llamamos a la propia clase en la que estamos.
       botonAzul.addActionListener(Azul);
       botonAmarillo.addActionListener(Amarillo);
       botonRojo.addActionListener(Rojo);
       
   }
   
/* ColorFondo Es una clase INTERNA  
Una de las caracteristicas de las clases 
   internas es que pueden acceder a los metodos 
   de la clase en la que se encuentran
   
   Esta clase es OYENTE de nuestros eventos   
   */
private class ColorFondo implements ActionListener{

    //Constructor
    public ColorFondo(Color c){
    
        colorDeFondo=c;
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
         private Color colorDeFondo;

}
  
}

 
     

 