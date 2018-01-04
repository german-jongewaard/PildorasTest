package java_hasta_el_video_100.video59;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author german
 * 
 */

public class PruebaDibujo {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        MarcoConDibujos mimarco = new MarcoConDibujos();
        
        mimarco.setVisible(true);
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

 class MarcoConDibujos extends JFrame{
    
    public MarcoConDibujos(){
        
        setTitle("prueba de Dibujo");
        
        setSize(400,400);   
        //Instancio la clase LaminaConFiguras para poder verla en el marco con dibujos!
        LaminaConFiguras milamina = new LaminaConFiguras();
        //Agrego la instancia !
        add(milamina);
    }    
}

class LaminaConFiguras extends JPanel{
    
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        //Este dibuja un cuadrado
        //g.drawRect(50, 50, 200, 200);
        //este dibuja una linea
        //g.drawLine(100, 100, 300, 200);
        //dibuja un arco
        g.drawArc(50, 100, 100, 200, 120, 150);
    }
}
