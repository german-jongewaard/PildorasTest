package java_hasta_el_video_160.video123_practica_pilas_por_el_131;

import javax.swing.*;

/**
 *
 * @author german
 * 
 */

public class Lamina_Botones extends JPanel{
    
    public Lamina_Botones(String titulo, String [] opciones){
        
        setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), titulo));
        //aqui le digo que los componentes se colocan de forma vertical de arriba hacia abajo
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        
        grupo = new ButtonGroup();
        
        for(int i=0; i<opciones.length;i++){
            //aqui creo los radio Buttons!
            JRadioButton bot = new JRadioButton(opciones[i]);
            
            bot.setActionCommand(opciones[i]);
            
            add(bot);
            
            grupo.add(bot);
            
            bot.setSelected(i==0);
        }         
    }
    
    //creo un metodo para que me devuelva un String (para manejarlos radiobuttons
    public String dameSeleccion(){
        //con getSelection() almaceno en "miboton" el radio button seleccionado
       // ButtonModel miboton = grupo.getSelection();
        
        /*El metodo getActionComand() me devuelve el String 
          o sea nos devuelve el nombre del boton seleccionado
        "Mensaje", "Confirmar", "Opción", "Entrada */
        //String s = miboton.getActionCommand();
        
        //return s;
        
        /* Otra forma de hacerlo y abreviando todo este codigo seria:     */
        return grupo.getSelection().getActionCommand();
        
    }
    
    private ButtonGroup grupo;
    
    
}
