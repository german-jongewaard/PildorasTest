package java_hasta_el_video_100.video19;
 
import java.util.*; 

 /**
 *
 * @author Germán
 * 
 */
 
public class Juego_adivina_numero {    
     
    public static void main(String[] args) { 
       
       int aleatorio = (int)(Math.random()*100);
       
       Scanner entrada = new Scanner(System.in);
        
       int numero = 0;
       
       int intentos = 0;
       
       do{
           
           intentos++;
           
           System.out.println("Introduce un número por favor: "); 
           
           numero = entrada.nextInt();
           
           if(aleatorio<numero){
               
               System.out.println("Es más bajo.");
               
           }else if(aleatorio>numero){
               
               System.out.println("Es más alto");
               
           }
           
       }while(numero != aleatorio);
       System.out.println("CORRECTO!!! lo has conseguido en: " + intentos + " intentos.");            
       
       
    }
    
}
