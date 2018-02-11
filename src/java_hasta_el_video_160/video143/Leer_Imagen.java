package java_hasta_el_video_160.video143;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author german
 * 
 */

public class Leer_Imagen { 

    public static void main(String[] args) {
        // TODO code application logic here
        MarcoImagenes mimarco = new MarcoImagenes();        
        mimarco.setVisible(true);        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}

 class MarcoImagenes extends JFrame{
    
    public MarcoImagenes(){
        
        setTitle("Marco con Imagen");        
        
        Toolkit mipantalla = Toolkit.getDefaultToolkit();        
        
        Dimension tamanioPantalla = mipantalla.getScreenSize();   
        
        int alturaPantalla = tamanioPantalla.height;        
        
        int anchoPantalla = tamanioPantalla.width;       
        
        setSize(anchoPantalla/2, alturaPantalla/2);
        
        setLocation(anchoPantalla/4, alturaPantalla/4);             
           
        //Instancio la clase LaminaConFiguras para poder verla en el marco con dibujos!
        LaminaConImagen milamina = new LaminaConImagen();
        //Agrego la instancia !
        add(milamina);         
    }    
}

class LaminaConImagen extends JPanel{
    
    public LaminaConImagen(){
        
        try{
            imagen = ImageIO.read(new File("src/java_hasta_el_video_160/video143/imagenes/roja.gif"));
        }catch(IOException e){
            System.out.println("La imagen no se encuentra");
        }
    }
    
        public void paintComponent(Graphics g){

            super.paintComponent(g);             
            
            if(imagen == null){
                
                g.drawString("No podemos cargar la imagen", 10 , 10);
                
            }else{               
            

            int anchuraImagen = imagen.getWidth(this);
            
            int alturaImagen = imagen.getHeight(this);
            
            g.drawImage(imagen, 0, 0, null);
            
            for( int i = 0; i<300; i++){
                for( int j = 0; j<200; j++){
                    
                    if( i + j > 0 ){
                        
                        g.copyArea(0, 0, anchuraImagen, alturaImagen, anchuraImagen+i, alturaImagen+i);
                        
                    }
                }                  
            }
               
        }
        }
        private Image imagen;
}
 