package java_hasta_el_video_100.video60;

import java.awt.*;
import java.awt.geom.*;
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
        
        setTitle("Graphic panel");
        
        setSize(400,400); 
        
        Toolkit mipantalla = Toolkit.getDefaultToolkit();
        
        Dimension tamanioPantalla = mipantalla.getScreenSize();
        
        int alturaPantalla = tamanioPantalla.height;
        
        int anchoPantalla = tamanioPantalla.width;
        
        setSize(anchoPantalla/2, alturaPantalla/2);
        
        setLocation(anchoPantalla/4, alturaPantalla/4);             
           
        //Instancio la clase LaminaConFiguras para poder verla en el marco con dibujos!
        LaminaConFiguras milamina = new LaminaConFiguras();
        //Agrego la instancia !
        add(milamina);
    }    
}

class LaminaConFiguras extends JPanel{
    
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        
        /*Aqui hago una refundicion (Casting) a g,aqui convierto mi objeto de tipo 
        Graphics en un objeto de tipo Graphics2D*/
        
        Graphics2D g2 = (Graphics2D) g;
        
                       /* ----  RECTANGULO ---- */
        Rectangle2D rectangulo = new Rectangle2D.Double(100,100,200,150);
        
        g2.draw(rectangulo);
        
                        /* ----  RELIPSE ---- */
        Ellipse2D elipse = new Ellipse2D.Double();
        
        elipse.setFrame(rectangulo);
        
        g2.draw(elipse);
                        /* ----  LINEA ---- */
        g2.draw(new Line2D.Double(100,100,300,250));
        
        double CentroEnX = rectangulo.getCenterX();
        
        double CentroEnY = rectangulo.getCenterY();
        
        double radio = 125;
                        /* ----  CIRCULO ---- */
        Ellipse2D circulo = new Ellipse2D.Double();
        
        circulo.setFrameFromCenter(CentroEnX, CentroEnY, CentroEnX + radio, CentroEnY + radio);
        
        g2.draw(circulo); 
    }
}
 