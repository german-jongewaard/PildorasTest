package Ej_Prog_Java.Boletin_1;

import java.util.Scanner;

/**
 *
 * @author german
 * 
 * Pedir el radio de una circunferencia y calcular su longitud.
 * 
 */

public class Radio_long_3 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        double l,r; // longitud y radio
        
        System.out.print("Introduce el radio de una circunferencia: ");
        
        r = entrada.nextInt();
        
        l = 2 * Math.PI * r;
        
        System.out.println("La longitud de una circunferencia de radio " + r + " es: " + l);
        
        
    }
    
}
