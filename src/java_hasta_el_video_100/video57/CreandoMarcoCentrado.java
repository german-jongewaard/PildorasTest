/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_hasta_el_video_100.video57;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.JFrame;

/**
 *
 * @author German
 */
public class CreandoMarcoCentrado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
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
