package java_hasta_el_video_100.video73;
  
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author german
 * 
 */  

public class EventosMouse {
   
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
        
        EventoDeMouse mouse_escucha=new EventoDeMouse();
        
      //  addMouseListener(mouse_escucha);
        
        addMouseMotionListener(mouse_escucha);        
    }    
}

 /*
class EventoDeMouse extends MouseAdapter{
   // Ejemplo
    @Override
    public void mouseClicked(MouseEvent e) {
        
        System.out.println("Coordenada de X " + e.getX() + " Coordenada de Y " + e.getY()); 
    }
  

   //Ejemplo 2
    
    public void mousePressed(MouseEvent e){
    
        
        if(e.getModifiersEx()==MouseEvent.BUTTON1_DOWN_MASK){
            System.out.println("has pulsado el boton izquierdo");
        }else  if(e.getModifiersEx()==MouseEvent.BUTTON2_DOWN_MASK){
            System.out.println("has pulsado la rueda del raton");
        }else  if(e.getModifiersEx()==MouseEvent.BUTTON3_DOWN_MASK){
            System.out.println("has pulsado el boton derecho");
        }
    }   
         
        //Ejemplo 1
       // System.out.println(e.getModifiersEx());
        
}  */
  
 class EventoDeMouse implements MouseMotionListener{

    @Override
    public void mouseDragged(MouseEvent e) {
       System.out.println("Estás arrastrando...");
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Estás moviendo...");
    }     
 }