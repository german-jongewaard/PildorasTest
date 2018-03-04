package java_hasta_el_video_160.video148;
 
import java.io.*;
import javax.swing.*;

/**
 *
 * @author German
 * 
 */

public class Varias_excepciones {
    
    public static void main(String[] args) {
        
        try{
         
        division();
        
        }catch(ArithmeticException e){
            
            System.out.println("Estás diviendiendo por cero");
            
        }catch(NumberFormatException e){
            
            System.out.println("No has introducido un número entero");
            
            //System.out.println(e.getMessage());
            
            System.out.println("se ha generado un error de este tipo " + 
                    e.getClass().getName());
            /* aqui soy mas especifico y me muestra el nombre de la clase del error*/            
        
        }         
    }
                                        
    static void division()  {
        
        int num1 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el dividendo"));
        
        int num2 = Integer.parseInt(JOptionPane.showInputDialog("Introduce el divisor"));
        
        System.out.println("El resultado es: " + num1/num2);
              
        }
        
       
        
    
    
}
