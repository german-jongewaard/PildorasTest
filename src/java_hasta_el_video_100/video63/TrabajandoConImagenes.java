
package java_hasta_el_video_100.video63;
 
import java.awt.*;


import javax.swing.*;

import javax.imageio.*;

import java.io.*;
 

public class TrabajandoConImagenes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoConImagenes mimarco = new MarcoConImagenes();
        
        mimarco.setVisible(true);
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

 class MarcoConImagenes extends JFrame{
    
    public MarcoConImagenes(){
        
        setTitle("Marco con Imagen");
        
       // setSize(400,400); 
        
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
        
        /*Con esto pinto el fondo!!!*/
       // milamina.setBackground(Color.PINK);
        
        /*Como se establece el color que tienen que 
        tener todos los elementos de una LAMINA*/
        
        milamina.setForeground(Color.red);
        
    }    
}

class LaminaConImagen extends JPanel{
    
    public void paintComponent(Graphics g){
        
        super.paintComponent(g); 
        
      //  File miimagen = new File("src/video62_1/coche.png");
        
        
        try{ //Intenta mostrar la imagen...
            /* Otra forma de instanciar el archivo es esta...*/
            imagen = ImageIO.read(new File("src/java_hasta_el_video_100/video63/coche.png"));
            
            //imagen = ImageIO.read(miimagen);
            //Si no puede, muestra la exception!!! 
        }catch(IOException e){
            
            System.out.println("La imagen no se encuentra");
        }
        
        
        g.drawImage(imagen, 5, 5, null);
        
    }
    
    private Image imagen;
}


 