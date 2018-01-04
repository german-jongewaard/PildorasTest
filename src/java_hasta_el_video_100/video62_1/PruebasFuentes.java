 package java_hasta_el_video_100.video62_1;
 
import java.awt.GraphicsEnvironment;
import javax.swing.*;
 
 /**
 *
 * @author german
 * 
 */
 
public class PruebasFuentes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String fuente = JOptionPane.showInputDialog("Introduce fuente: ");
        
        boolean estalafuente=false;
        
/*Aquí lo que hago es: almacenar en el array "nombreDeFuentes" todas las
letras, tipos de fuente que tengo instaladas en mi computadora*/
String [] nombresDeFuentes = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();

/*Aquí lo que hago es volcar todas las fuentes que tengo en el sistema*/
for(String nombreDeLaFuente: nombresDeFuentes){
    
    if(nombreDeLaFuente.equals(fuente) ){
        
        estalafuente=true;
        
        System.out.println("El nombre de la fuente existe y es: " + nombreDeLaFuente);
    }
    
   // System.out.println(nombreDeLaFuente);
}
        if(estalafuente){
            System.out.println( "\nLa fuente esta instalada");
        }else{
            System.out.println("\nLa fuente NO esta instalada");
        }
            
        
    }
    
}
