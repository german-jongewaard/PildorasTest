package java_hasta_el_video_100.video57;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author german
 * 
 */

public class CreandoMarcoCentrado {

    public static void main(String[] args) {
        
        MarcoCentrado marco1 = new MarcoCentrado();
        
        //marco1.setLocationRelativeTo(null);                                
        
        marco1.setVisible(true);
        
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}

class MarcoCentrado extends JFrame {
    
    public MarcoCentrado(){
        
        Toolkit mipantalla = Toolkit.getDefaultToolkit();
        
        Dimension tamanioPantalla = mipantalla.getScreenSize();
        
        int alturaPantalla = tamanioPantalla.height;
        
        int anchoPantalla = tamanioPantalla.width;
        
        setSize(anchoPantalla/2, alturaPantalla/2);
        
        setLocation(anchoPantalla/4, alturaPantalla/4);
        
        setTitle("marcoCentrado");
        
        Image miIcono = mipantalla.getImage("src/java_hasta_el_video_100/video57/20.gif");
        
        setIconImage(miIcono);
    }
    
}
