package java_hasta_el_video_100.video32; 

import javax.swing.*;
/* ESTE EJERCICIO ES DE LA CLASE 30 AHORA INCORPORO LA VENTANA JOptionPane */
/**
 *
 * @author Germán
 * 
 */
public class Uso_coche {
     
    public static void main(String[] args) {
        
        Coche micoche = new Coche(); // INSTANCIAR UNA CLASE. EJEMPLAR DE CLASE.
        
        
        micoche.establece_color(JOptionPane.showInputDialog("Introduce color"));        
        
        
        System.out.println(micoche.dime_datos_generales());
        
                
        System.out.println(micoche.dime_color());
        
        micoche.configura_asientos(JOptionPane.showInputDialog("¿Tiene asientos de cuero?"));
        
        
        System.out.println(micoche.dime_asientos());
        
        micoche.configura_climatizador(JOptionPane.showInputDialog("¿Tiene climatizador?"));
        
        System.out.println(micoche.dime_climatizador());
       
        System.out.println(micoche.dime_peso_coche());        
     
        
        System.out.println("El precio final del coche es: " + micoche.precio_coche());
    }
    
}
