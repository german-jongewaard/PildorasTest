/*
 *
 * 11. Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene.
 *
 *
 */
package Ej_Prog_Java;

import java.util.Scanner;

/*
 * 11. Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene.
 *
 */

/**
 *
 * @author german
 */
public class Ejercicio_11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner numero = new Scanner(System.in);
        
        int n1, digitos;
        
        System.out.println("Ingrese un numero");
        n1 = numero.nextInt();
        
        digitos = Integer.toString(n1).length();
        
        if(n1>0 && n1<9999){
            System.out.println("el numero tiene " + digitos + " cifras.");
        }
    }
    
}
