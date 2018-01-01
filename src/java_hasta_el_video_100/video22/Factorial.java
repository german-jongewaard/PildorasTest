package java_hasta_el_video_100.video22;
 
import javax.swing.*;
/**
 *
 * @author Germán
 * 
 */

public class Factorial {

     
    public static void main(String[] args) {
        
        int resultado= 1;
        
        int numero = Integer.parseInt(JOptionPane.showInputDialog("Introduce un número"));
        
        for (int i=numero;i>0;i--){
            
            resultado = resultado*i;            
        }        
        System.out.println("El factorial de " + numero + " es: " + resultado);        
    }    
}
