package java_hasta_el_video_100.video17;
/**
 *
 * @author German
 * 
 */
import java.util.*;
import javax.swing.JOptionPane;
 
public class Entrada_ejemplo4 {

     
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Elige una opción: \n1: Cuadrado \n2: Rectángulo \n3: Triángulo \n4: Círculo");
        
        int figura = entrada.nextInt();
        
        switch(figura){
            
            case 1:
                
                int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado:"));
                
                System.out.println("El área del Cuadrado es: " + Math.pow(lado, 2));
                
                break;
            
            case 2:
                
                int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base:"));
                
                int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura:"));
                
                System.out.println("El área del Rectángulo es: " + base * altura);
                
                break;
                
            case 3:
                
                base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base:"));
                
                altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura:"));
                
                System.out.println("El área del Triángulo es: " + (base*altura)/2);
                
                break;
                
             case 4:
                
                int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio:"));
                
                System.out.print("El área del Círculo es: ");
                
                System.out.printf("%1.2f", Math.PI*(Math.pow(radio, 2)));
                
                break;
             default:
                 
                 System.out.printf("La opción no es correcta");               
        }        
    }    
}
