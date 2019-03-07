package Ej_Prog_Java;

import java.util.Scanner;

/**
 *
 * @author german
 * 
 * Pedir dos números y decir si son iguales o no.
 * 
 */

public class Numeros_iguales_4 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        int num1,num2; 
        
        System.out.println("Introduce un número: ");
        num1 = entrada.nextInt();
        
        System.out.println("Introduce otro número: ");        
        num2 = entrada.nextInt();
        
        
        if(num1 == num2){
            
            System.out.println("El número " + num1 + " es igual a el número " + num2);        
        }else{
            System.out.println("El número " + num1 + " no es igual a el número " + num2 + "\n");        
        }
        
    }
    
}
