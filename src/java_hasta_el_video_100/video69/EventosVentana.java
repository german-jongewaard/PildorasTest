
package java_hasta_el_video_100.video69;
   
  
import java.awt.*;

import java.awt.event.*;

import javax.swing.*;

  

public class EventosVentana {

    /**
     * @param args the command line arguments
     */
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
        
        /* //Creando la Instancia 
        M_Ventana oyente_ventana = new M_Ventana();        
        addWindowListener(oyente_ventana);
        */
        
        
//Esta es otra forma mas minimizada de Instanciar a M_Ventana.
        addWindowListener(new M_Ventana());

          
    }    
}
  
/*
  Extendiendo WindowsAdapter utilizo los metodos que me hagan falta
  y no tengo que colocar los 7 metodos por obligacion.
*/
class M_Ventana extends WindowAdapter{
    
     
    
    public void windowIconified(WindowEvent e){
    
        System.out.println("Ventana minimizada");        
    }
     
    
    public void windowDeactivated(WindowEvent e){
    
              System.out.println("Ventana Desactivada");
    }    
    
}
     

 