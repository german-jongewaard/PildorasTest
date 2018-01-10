package java_hasta_el_video_100.video79;
 
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author german
 * 
 */
 
public class PruebaAcciones {
    
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
      
    AccionColor accionAmarillo=new AccionColor("Amarillo", new ImageIcon("src/video76/imagenes/amarilla.gif"), 
            Color.YELLOW);
      
    AccionColor accionAzul=new AccionColor("Azul", new ImageIcon("src/video76/imagenes/azul.gif"), 
            Color.BLUE);
    
    AccionColor accionRojo=new AccionColor("Rojo", new ImageIcon("src/video76/imagenes/roja.gif"), 
            Color.RED);
      
    add(new JButton (accionAmarillo));
    add(new JButton (accionAzul));
    add(new JButton (accionRojo));
    
    /*
    1. Creando Mapa de entrada...
    */
    InputMap mapaEntrada = getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
    /*
    2. Creando combinación de tecla...
    */
   // KeyStroke teclaAmarillo = KeyStroke.getKeyStroke("ctrl A");
    /*
    3. Asignando combinación de tecla...
    */
    // mapaEntrada.put(teclaAmarillo, "fondo_amarillo");
    
    //Simplificando el punto dos y agregandolo al punto tres
     mapaEntrada.put(KeyStroke.getKeyStroke("ctrl A"), "fondo_amarillo");
     
     mapaEntrada.put(KeyStroke.getKeyStroke("ctrl B"), "fondo_azul");
      
     mapaEntrada.put(KeyStroke.getKeyStroke("ctrl R"), "fondo_rojo");
    /*
    4. Asignando el objeto a la acción...
    */
    ActionMap mapaAccion = getActionMap();
    
    mapaAccion.put("fondo_amarillo", accionAmarillo);
    
    mapaAccion.put("fondo_azul", accionAzul);
    
    mapaAccion.put("fondo_rojo", accionRojo);
  } 
    
  private class AccionColor extends AbstractAction{

    /*Creo un constructos que resive parametros...*/
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


     

 