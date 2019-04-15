/*
 * 2. Leer un número e indicar si es positivo o negativo. 
 *    El proceso se repetirá hasta que se introduzca un 0.
 */
package Ej_Prog_Java.Boletin_2;

import java.util.Scanner;

/**
 *
 * @author german
 */
public class Ejercicio_2_boletin_2 {
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);        
        int num;
        
        
        // num guardará el número que leamos
        // y cuadrado guardará el cuadrado de num
        System.out.println("Introduzca número: ");
        num=entrada.nextInt(); 
        
        while(num!=0){ 
            
            if(num > 0){
                System.out.println("Es positivo");
            }else{
                System.out.println("Es negativo");
            }
            
            System.out.println("Introduzca otro número: ");
            num=entrada.nextInt(); // volvemos a leer num

        } 
        
    }
    
}
