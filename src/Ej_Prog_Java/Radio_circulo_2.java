package Ej_Prog_Java;

import java.util.Scanner;


/**
 *
 * @author german
 * 
 * Pedir el radio de un círculo y calcular su área. A=PI*r^2.
 * 
 */

public class Radio_circulo_2 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        double a, r;
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Introduzca el radio del círculo: ");  
        
        r = entrada.nextInt();
        
        a = Math.PI*(r*r);
                
        System.out.println("El área de una circunferencia de radio " + r + " es: " + a );  
        
        
        
    }
    
}
