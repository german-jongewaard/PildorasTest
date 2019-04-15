/*
 *
 * 11. Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene.
 *
 *
 */
package Ej_Prog_Java.Boletin_1;

import java.util.Scanner;

/*
 * 11. Pedir un número entre 0 y 9.999 y decir cuantas cifras tiene.
 *
 */

/**
 *
 * @author german
 */
public class Ejercicio_11_boletin_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner numero = new Scanner(System.in);
        
        int n1, digitos;
        
        System.out.println("Ingrese un numero");
        n1 = numero.nextInt();
        
        
        
        if(n1>=0 && n1<=9999){            
            if(n1<10){
                digitos = 1;
                System.out.println("el numero tiene " + digitos + " cifras.");
            }else if(n1<100){
                digitos = 2;
                System.out.println("el numero tiene " + digitos + " cifras.");
            }else if(n1<1000){
                digitos = 3;
                System.out.println("el numero tiene " + digitos + " cifras.");
            }else if(n1<10000){
                digitos = 4;
                System.out.println("el numero tiene " + digitos + " cifras.");
            }
        }else if(n1>9999){
        System.out.println("el numero tiene mas cifras de lo pedido");
        }else if(n1<0){
        System.out.println("el numero es negativo.");
        }
    }
    
}
