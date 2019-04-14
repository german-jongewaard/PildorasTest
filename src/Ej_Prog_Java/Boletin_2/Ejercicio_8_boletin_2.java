/*
 * 8. Pedir un número N, y mostrar todos los números del 1 al N.
 */
package Ej_Prog_Java.Boletin_2;

import java.util.Scanner;

/**
 *
 * @author german
 */
public class Ejercicio_8_boletin_2 {
 
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);        
        int num, contador = 1;        
        float media= 0;
        int sum= 0;
        
        // num guardará el número que leamos
        // y cuadrado guardará el cuadrado de num
        System.out.println("Introduzca número");
        num=entrada.nextInt();          
         
        System.out.println("Los numeros hasta " + num + " son: ");
        
        while(contador <= num){
            
              
             System.out.println(contador + ".");
             
             contador++; 
         }
        
        System.out.println("");
    }
    
}
