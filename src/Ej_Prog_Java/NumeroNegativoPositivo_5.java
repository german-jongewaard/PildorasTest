/*
 * 5. Pedir un número e indicar si es positivo o negativo.
 *
 */
package Ej_Prog_Java;

import java.util.Scanner;

/**
 *
 * @author german
 */
public class NumeroNegativoPositivo_5 {
 
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num;
        
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese un numero: ");
        num = entrada.nextInt();
        
        if(num>=0){
            
            System.out.println("Positivo");
        }else{
            System.out.println("Negativo");
        }
        
    }
    
}
