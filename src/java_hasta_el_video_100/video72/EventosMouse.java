package java_hasta_el_video_100.video72;
 
import java.awt.event.MouseEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseListener;
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
        
        addMouseListener(mouse_escucha);        
    }    
}

/*
class EventoDeMouse implements MouseListener{

    @Override
    public void mouseClicked(MouseEvent e) {
        
        System.out.println("Has hecho click... ");
    }

    @Override
    public void mousePressed(MouseEvent e) {
         System.out.println("Acabas de presionar... ");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
         System.out.println("Acabas de levantar");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
         System.out.println("Acabas de entrar... ");
    }

    @Override
    public void mouseExited(MouseEvent e) {
         System.out.println("Acabas de salir... ");
    }
}
*/

/*
    Si quiero utilizar solo un metodo y no por obligacion los cinco metodos anteriores, 
tengo que utilizar MouseAdapter, extendiendolo asi utilizo solo un metodo. o el
que me haga falta...

*/
class EventoDeMouse extends MouseAdapter{
    
    public void mouseClicked(MouseEvent e) {
        
        System.out.println("Has hecho click...  " + e.getClickCount());
    }  
}
 
        
  
 
    
 
     

 