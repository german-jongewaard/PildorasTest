/*
 * 4. Pedir números hasta que se teclee uno negativo, y mostrar 
 *    cuántos números se han introducido.
 */
package Ej_Prog_Java.Boletin_2;

import java.util.Scanner;

/**
 *
 * @author german
 */
public class Ejercicio_4_boletin_2 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);        
        int num;        
        int contador = 0;
        
        // num guardará el número que leamos
        // y cuadrado guardará el cuadrado de num
        System.out.println("Introduzca número: ");
        
        num=entrada.nextInt(); 
        
        while(num > 0){ 
            
            contador++;
            
            System.out.println("Introduzca otro número: ");
            num=entrada.nextInt(); // volvemos a leer num
        } 
        
        System.out.println("La cantidad de números ingresados es de --> " + contador);
    }
    
}
