package java_hasta_el_video_100.video14;
/**
 *
 * @author German
 * 
 */
import java.util.*; 
 
public class Entrada_ejemplo1 {
    
    public static void main(String[] args) {
        
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce tu nombre por favor: ");
        
        String nombre_usuario = entrada.nextLine();
        
        System.out.println("Introduce tu edad por favor: ");
        
        int edad = entrada.nextInt();
        
        System.out.println("Hola " + nombre_usuario +  ". El año que viene tendras " +
                (edad+1) + " años");
    }
    
}
