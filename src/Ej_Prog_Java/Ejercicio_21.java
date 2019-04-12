/*
 * 21. Pedir una nota numérica entera entre 0 y 10, y mostrar dicha 
 *     nota de la forma: cero, uno, dos, tres...
 */
package Ej_Prog_Java;

import java.util.Scanner;

/**
 *
 * @author german
 */
public class Ejercicio_21 {
   
    public static void main(String[] args) {
        // TODO code application logic here
        
         Scanner numero = new Scanner(System.in);
        
        int nota;
        
        System.out.println ("Mostrar dicha  nota de la forma: cero, uno, dos, tres...");
        
        System.out.print("Introduzca la nota: ");
        nota = numero.nextInt();
        
        switch(nota){
            
            case 0:
                System.out.println("cero");
                break;            
            case 1:
                System.out.println("uno");
                break;
            case 2:
                System.out.println("dos");
                break;
            case 3:
                System.out.println("tres");
                break;
            case 4:
                System.out.println("cuatro");
                break;
            case 5:
                System.out.println("cinco");
                break;
            case 6:
                System.out.println("seis");
                break;
            case 7:
                System.out.println("siete");
                break;
            case 8:
                System.out.println("ocho");
                break;
            case 9:
                System.out.println("nueve");
                break;
            case 10:
                System.out.println("diez");
                break;
            default:
                System.out.println("El numero introducido no esta en el rango de 0 a 10...");
                
        } 
        
    }
    
}
