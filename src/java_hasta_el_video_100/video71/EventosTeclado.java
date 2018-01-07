package java_hasta_el_video_100.video71;  

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author german
 * 
 */

public class EventosTeclado {
    
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoConTeclas mimarco = new MarcoConTeclas();
         
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
        mimarco.setTitle("Marco Estado"); 
        
        mimarco.setBounds(300,300,500,350);         
    }
}

 class MarcoConTeclas extends JFrame{
    
    public MarcoConTeclas(){
        
        setVisible(true); 
        
        setTitle("Marco Estado"); 
         
        setBounds(700,300,600,350);   
        
        EventoDeTeclado tecladoescucha=new EventoDeTeclado();
        
        addKeyListener(tecladoescucha);        
    }    
}

class EventoDeTeclado implements KeyListener{

    @Override
    public void keyTyped(KeyEvent e) {
         
        char letra=e.getKeyChar();
        
        System.out.println(letra + " ");
    }

    @Override
    public void keyPressed(KeyEvent e) {
       /* int codigo = e.getKeyCode();
       
       System.out.println(codigo); */
    }

    @Override
    public void keyReleased(KeyEvent e) {
      
    }   
}
 
        
  
 
    
 
     

 