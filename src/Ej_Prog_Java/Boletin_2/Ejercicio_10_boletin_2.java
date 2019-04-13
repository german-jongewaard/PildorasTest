/*
 * 10. Pedir 15 números y escribir la suma total.
 */
package Ej_Prog_Java.Boletin_2;

import java.util.Scanner;

/**
 *
 * @author german
 */
public class Ejercicio_10_boletin_2 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);        
        int num, contador = 1;        
         
        int sum= 0;        
                        
        for (int i = 1; i <= 15; i++) {
        
            System.out.println("Introduzca número");
            num=entrada.nextInt();           
       
            sum += num;
         }
        
        System.out.println("La suma total es de: " + sum);
    
    }
    
}
