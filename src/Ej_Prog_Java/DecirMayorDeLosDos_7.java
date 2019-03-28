/*
 * 7. Pedir dos números y decir cual es el mayor.
 *
 */
package Ej_Prog_Java;

import java.util.Scanner;

/**
 *
 * @author german
 */
public class DecirMayorDeLosDos_7 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada1 = new Scanner(System.in);
        
        Scanner entrada2 = new Scanner(System.in);
        
        
        int n1, n2;
        
        System.out.println("Ingrese un número: ");
        n1 = entrada1.nextInt();
        
        System.out.println("Ingrese otro número: ");
        n2 = entrada1.nextInt();
        
        if(n1>n2){
            System.out.println(n1 + " es mayor que " + n2);
        }else{
            System.out.println(n2 + " es mayor que " + n1);
        }
              
        
        
    }
    
}
