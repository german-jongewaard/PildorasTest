package java_hasta_el_video_100.video70;   
 
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
        MarcoEstado mimarco = new MarcoEstado();
         
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        mimarco.setTitle("Marco Estado"); 
        
        mimarco.setBounds(300,300,500,350);         
    }
}

 class MarcoEstado extends JFrame{
    
    public MarcoEstado(){
        
        setVisible(true); 
        
        setTitle("Marco Estado"); 
         
        setBounds(300,300,500,350);   
        
        CambiaEstado nuevo_estado =new CambiaEstado();
        
        addWindowStateListener(nuevo_estado);
    }    
}

class CambiaEstado implements WindowStateListener{
    
    public void windowStateChanged(WindowEvent e){
        
        System.out.println("La ventana ha cambiado de estado"); 
         
        if(e.getNewState()==Frame.MAXIMIZED_BOTH){
            System.out.println("La ventana está a pantalla completa");
        }else if(e.getNewState()==Frame.ICONIFIED){
            System.out.println("La ventana está minimizada");
        }else if(e.getNewState()==Frame.MAXIMIZED_HORIZ){
            System.out.println("La ventana está maximizada horizontal");
        }else if(e.getNewState()==Frame.MAXIMIZED_VERT){
            System.out.println("La ventana está maximizada vertical");
        }else if(e.getNewState()==Frame.NORMAL){
            System.out.println("La ventana está normal");
        }
                 
        switch (e.getNewState()) {
            case 0:  System.out.println("La ventana está normal");
                     break;
            case 1:  System.out.println("La ventana está minimizada");
                     break;
            case 2:  System.out.println("La ventana está maximizada horizontal");
                     break; 
            case 4:  System.out.println("La ventana está maximizada vertical");
                     break;            
            case 6:  System.out.println("La ventana está a pantalla completa");
                     break; 
            
            default: System.out.println("default");
                     break;
        } 
    }
}
        
        
  
 
    
 
     

 