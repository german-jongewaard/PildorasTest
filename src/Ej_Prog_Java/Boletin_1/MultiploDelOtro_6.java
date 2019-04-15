/*
 * 6. Pedir dos números y decir si uno es múltiplo del otro.
 *
 */

package Ej_Prog_Java.Boletin_1;

import java.util.Scanner;

/**
 *
 * @author german
 */
public class MultiploDelOtro_6 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada1 = new Scanner(System.in);
        
        Scanner entrada2 = new Scanner(System.in);
        
        int n1, n2;
        
        System.out.println("Ingrese el primer número: ");
        n1 = entrada1.nextInt();
        
        System.out.println("Ingrese el segundo número: ");
        n2 = entrada2.nextInt();
        
        if(n1%n2 == 0){            
            System.out.println("Son multiplos");
        }else {
            System.out.println("No son multiplos");
        }
        
        
        
        
    }
    
}
