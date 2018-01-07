package java_hasta_el_video_100.video68;
    
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author german
 * 
 */ 

public class EventosVentana {
   
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoVentana mimarco = new MarcoVentana();
        
        mimarco.setVisible(true); 
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
        MarcoVentana mimarco2 = new MarcoVentana();
        
        mimarco2.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        mimarco2.setVisible(true); 
        
        mimarco.setTitle("Ventana 1");
        
        mimarco2.setTitle("Ventana 2");
        
        mimarco.setBounds(100,100,500,350);
        
        mimarco2.setBounds(750,100,500,350);
    }    
}

 class MarcoVentana extends JFrame{
    
    public MarcoVentana(){
        
       // setTitle("Respondiendo");
        
       // setSize(400,400); 
        
       // Toolkit mipantalla = Toolkit.getDefaultToolkit();
        
       /* Dimension tamanioPantalla = mipantalla.getScreenSize();
        
        int alturaPantalla = tamanioPantalla.height;
        
        int anchoPantalla = tamanioPantalla.width;
        
        setSize(anchoPantalla/2, alturaPantalla/2);
        
        setLocation(anchoPantalla/4, alturaPantalla/4);         */
        
        /*--------------------------------------------*/
        
        //Creando la Instancia
        M_Ventana oyente_ventana = new M_Ventana();
        
        addWindowListener(oyente_ventana);
    }    
}
  
class M_Ventana implements WindowListener{
    
    public void windowOpened(WindowEvent e){
    
        System.out.println("Ventana abierta");
    }
    
    public void windowClosing(WindowEvent e){
    
            System.out.println("Cerrando ventana");
    }
    
    public void windowClosed(WindowEvent e){
    
      System.out.println("La ventana ha sido cerrada...");
    }
    
    public void windowIconified(WindowEvent e){
    
        System.out.println("Ventana minimizada");        
    }
    
    public void windowDeiconified(WindowEvent e){
    
      System.out.println("Ventana restaurada");
    }
    
    public void windowActivated(WindowEvent e){
    
           System.out.println("Ventana activada");           
    }
    
    public void windowDeactivated(WindowEvent e){
    
              System.out.println("Ventana Desactivada");
    }    
    
}
     

 