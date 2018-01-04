
package java_hasta_el_video_100.video61;

import java.awt.*;

import java.awt.geom.*;

import javax.swing.*;

public class TrabajandoColores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoConColor mimarco = new MarcoConColor();
        
        mimarco.setVisible(true);
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

 class MarcoConColor extends JFrame{
    
    public MarcoConColor(){
        
        setTitle("prueba con Colores");
        
       // setSize(400,400); 
        
        Toolkit mipantalla = Toolkit.getDefaultToolkit();
        
        Dimension tamanioPantalla = mipantalla.getScreenSize();
        
        int alturaPantalla = tamanioPantalla.height;
        
        int anchoPantalla = tamanioPantalla.width;
        
        setSize(anchoPantalla/2, alturaPantalla/2);
        
        setLocation(anchoPantalla/4, alturaPantalla/4);             
           
        //Instancio la clase LaminaConFiguras para poder verla en el marco con dibujos!
        LaminaConColor milamina = new LaminaConColor();
        //Agrego la instancia !
        add(milamina);
        
        milamina.setBackground(Color.PINK);
    }    
}

class LaminaConColor extends JPanel{
    
    public void paintComponent(Graphics g){
        
        super.paintComponent(g);
        
        /*Aqui hago una refundicion (Casting) a g,aqui convierto mi objeto de tipo 
        Graphics en un objeto de tipo Graphics2D*/
        
        Graphics2D g2 = (Graphics2D) g;
        
                       /* ----  RECTANGULO ---- */
        Rectangle2D rectangulo = new Rectangle2D.Double(225,100,200,150);
        
        g2.setPaint(Color.RED);
        
        g2.fill(rectangulo);
        
                        /* ----  RELIPSE ---- */
        Ellipse2D elipse = new Ellipse2D.Double();
        
        elipse.setFrame(rectangulo);
        
        Color micolor = new Color(125,189,200);
        
        g2.setPaint(micolor);
        
        g2.fill(elipse);
         
    }
}
 