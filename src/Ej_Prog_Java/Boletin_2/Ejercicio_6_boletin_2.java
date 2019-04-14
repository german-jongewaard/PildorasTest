/*
 * 6. Pedir números hasta que se teclee un 0, mostrar la suma de 
 *    todos los números introducidos.
 */
package Ej_Prog_Java.Boletin_2;

import java.util.Scanner;

/**
 *
 * @author german
 */
public class Ejercicio_6_boletin_2 {
 
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);        
        int num;        
        int sum= 0;
        
        // num guardará el número que leamos
        // y cuadrado guardará el cuadrado de num
        
         
         do{
             
            System.out.println("Introduzca número a sumar");
            num=entrada.nextInt(); 
             
            sum += num;
                     
         }while(num != 0);
        
        System.out.println("El total de numeros sumados es: " + sum);        
    
    }
    
}
