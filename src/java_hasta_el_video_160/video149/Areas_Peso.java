package java_hasta_el_video_160.video149;
 
import java.io.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author German
 * 
 */

public class Areas_Peso {
    
    public static void main(String[] args) {
        
         Scanner entrada = new Scanner(System.in);
         
         System.out.println("Elige una opción: \n1: Cuadrado. \n2: Rectángulo. \n3: Trinángulo. \n4: Círculo.");
         
         try{             
                figura = entrada.nextInt();
         
                //entrada.close();
                
         }catch(Exception e){
                       
             System.out.println("Ha ocurrido un error...");
                
         }finally{
/* La clausula finally hace que se ejecute siempre el contenido de su interior, al abrir la consola 
             y nombrarla "entrada" luego tengo que cerrar la consola "entrada" para liberar recursos en el sistema
             de este modo capturo la Excepcion y libero la consola colocandola en finally */             
             entrada.close();
             
         } 
         
         switch(figura){
             
             case 1:
                 
                 int lado = Integer.parseInt(JOptionPane.showInputDialog("Introduce el lado"));
                 
                 System.out.println(Math.pow(lado, 2));
                 
                 break;
                 
             case 2:
                 
                 int base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                 
                 int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
                 
                 System.out.println("El área del rectángulo es: " + base*altura);
                  
                 break;
                  
             case 3:
                 
                 base = Integer.parseInt(JOptionPane.showInputDialog("Introduce la base"));
                 
                 altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce la altura"));
                 
                 System.out.println("El área del triángulo es: " + (base*altura)/2);             
             
                 break;
                 
             case 4:
                 
                 int radio = Integer.parseInt(JOptionPane.showInputDialog("Introduce el radio"));
                 
                 System.out.println("El área del círculo es: ");
                 
                 System.out.println( Math.PI*(Math.pow(radio, 2)));
             
                 break;
                 
             default:
                 
                 System.out.println("La opción no es correcta");                     
         }
                  
//------------------------------------------------------------------------------------------------------

             int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce tu altura en cm"));
             
              System.out.println("Si eres hombre tu peso ideal es : " + (altura-110) + " kg"); 
              
              System.out.println("Si eres mujer tu peso ideal es : " + (altura-120) + " kg"); 
        }
     
          
        static int figura;
    
    
}
