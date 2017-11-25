package java_hasta_el_video_100.video15;

import javax.swing.*;
/**
 *
 * @author German
 */
public class Entrada_ejemplo2 {
     
    public static void main(String[] args) {
        
        String nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre por favor");
        
        String edad_usuario = JOptionPane.showInputDialog("Introduce tu edad por favor");
        
         //Estoy pasando la edad String a entero para poder sumarla
        int edad_parseada = Integer.parseInt(edad_usuario);
        
        System.out.println("Hola " + nombre_usuario + ". El año que viene tendrás " + (edad_parseada+1) + " años");
        
    }
    
}
