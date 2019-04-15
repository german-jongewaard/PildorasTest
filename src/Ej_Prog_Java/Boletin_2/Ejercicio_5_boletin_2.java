/*
 * 5. Realizar un juego para adivinar un número. Para ello pedir un 
 *    número N, y luego ir pidiendo números indicando “mayor” 
 *    o “menor” según sea mayor o menor con respecto a N. El proceso termina
 *    cuando el usuario acierta.
 */
package Ej_Prog_Java.Boletin_2;

import java.util.Scanner;

/**
 *
 * @author german
 */
public class Ejercicio_5_boletin_2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);        
        int num, nuevoNum;        
        
        // num guardará el número que leamos
        // y cuadrado guardará el cuadrado de num
        System.out.println("Introduzca número a adivinar: ");
        num=entrada.nextInt(); 
        

        System.out.println("Introduzca otro número: ");
        nuevoNum=entrada.nextInt(); // volvemos a leer num
        
         
        
        while(num != nuevoNum){ 
            
            if(num < nuevoNum){
                System.out.println("Mayor");
            }else{
                System.out.println("Menor");
            }
            
            System.out.println("Introduzca otro número: ");
            nuevoNum=entrada.nextInt(); // volvemos a leer num

        } 
        
        System.out.println("--- GENIAL HAS GANADO !!! ---");
        
    }
    
}
