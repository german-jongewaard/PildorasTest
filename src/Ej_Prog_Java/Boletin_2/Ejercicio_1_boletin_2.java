/*
 * 1. Leer un número y mostrar su cuadrado, repetir el proceso hasta que 
 *    se introduzca un número negativo.
 */
package Ej_Prog_Java.Boletin_2;

import java.util.Scanner;

/**
 *
 * @author german
 */
public class Ejercicio_1_boletin_2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);        
        int num;
        int cuadrado;
        
        // num guardará el número que leamos
        // y cuadrado guardará el cuadrado de num
        System.out.print("Introduzca número: ");
        num=entrada.nextInt();
         
        
        
        while(num > 0){ 
            
           cuadrado=num*num;
            System.out.println(num + " 2 es igual a "+ cuadrado);
            System.out.print("Introduzca otro número: ");
            num=entrada.nextInt(); // volvemos a leer num

        } 
    } 
}
