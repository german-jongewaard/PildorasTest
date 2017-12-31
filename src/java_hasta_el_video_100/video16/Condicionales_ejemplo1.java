package java_hasta_el_video_100.video16;

/**
 *
 * @author German
 * 
 */

import java.util.*;
 
public class Condicionales_ejemplo1 {
    
    public static void main(String[] args) {
      
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduce tu edad por favor: ");
        
        int edad = entrada.nextInt();
        
        if ( edad >= 18) {
            
            System.out.println("Eres mayor de edad!!!");
            
          } else {
            
            System.out.println("Ohhh eres un jovenzuelo!");
            
        }
    }    
}
