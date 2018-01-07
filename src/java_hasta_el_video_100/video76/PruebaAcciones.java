
package java_hasta_el_video_100.video76;
 
import java.awt.*;

import java.awt.event.*;

import javax.swing.*;
 
public class PruebaAcciones {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoAccion mimarco = new MarcoAccion();
        
        mimarco.setVisible(true);
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

 class MarcoAccion extends JFrame{
    
    public MarcoAccion(){
        
        setTitle("Prueba Aacciones");
        
       // setSize(400,400); 
        
        Toolkit mipantalla = Toolkit.getDefaultToolkit();
        
        Dimension tamanioPantalla = mipantalla.getScreenSize();
        
        int alturaPantalla = tamanioPantalla.height;
        
        int anchoPantalla = tamanioPantalla.width;
        
        setSize(anchoPantalla/2, alturaPantalla/2);
        
        setLocation(anchoPantalla/4, alturaPantalla/4);             
           
        //Instancio la clase LaminaConFiguras para poder verla en el marco con dibujos!
        PanelAccion milamina = new PanelAccion();
        //Agrego la instancia !
        add(milamina);
        
         
        
    }    
}

class PanelAccion extends JPanel  {

  public PanelAccion(){
      
      
    AccionColor accionAmarillo=new AccionColor("Amarillo", new ImageIcon("src/java_hasta_el_video_100/video76/imagenes/amarilla.gif"), 
            Color.YELLOW);
      
    AccionColor accionAzul=new AccionColor("Azul", new ImageIcon("src/java_hasta_el_video_100/video76/imagenes/azul.gif"), 
            Color.BLUE);
    
    AccionColor accionRojo=new AccionColor("Rojo", new ImageIcon("src/java_hasta_el_video_100/video76/imagenes/roja.gif"), 
            Color.RED);
      
    add(new JButton (accionAmarillo));
    add(new JButton (accionAzul));
    add(new JButton (accionRojo));
     
  } 
    
  private class AccionColor extends AbstractAction{

    /*Creo un constructor que resibe parametros...*/
    public AccionColor(String nombre, Icon icono, Color color_boton){
        
        putValue(Action.NAME, nombre);
        
        putValue(Action.SMALL_ICON, icono);
        
        putValue(Action.SHORT_DESCRIPTION, "La lámina es de color " + nombre);
        
        putValue("color_de_fondo", color_boton);
    }
    
    public void actionPerformed(ActionEvent e) {
                  //aqui hago un Casting. Un Casteo!
        Color c = (Color)getValue("color_de_fondo"); 
         
        setBackground(c);
        
        System.out.println("Nombre: " + getValue(Action.NAME) + "  -  " + "Descripción: " +  getValue(Action.SHORT_DESCRIPTION));
    }

       
    }
  
  
}


     

 