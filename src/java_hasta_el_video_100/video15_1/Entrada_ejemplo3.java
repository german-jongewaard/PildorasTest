package java_hasta_el_video_100.video15_1;
/**
 *
 * @author German
 * 
 */
import javax.swing.*;
 
public class Entrada_ejemplo3 {
    
    public static void main(String[] args) {
       
        String num1 = JOptionPane.showInputDialog("Introduce un número");
        
        double num2 = Double.parseDouble(num1);
        
        System.out.print("La raíz de " + num2 + " es ");
        
        System.out.printf("%1.4f", Math.sqrt(num2));
        
    }
    
}
