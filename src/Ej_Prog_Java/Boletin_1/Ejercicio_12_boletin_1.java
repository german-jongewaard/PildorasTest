/*
 * 12. Pedir un número entre 0 y 9.999 y mostrarlo con las cifras al revés.
 *
 */
package Ej_Prog_Java.Boletin_1;

import java.util.Scanner;

/**
 *
 * @author german
 */
public class Ejercicio_12_boletin_1 {
  
    public static void main(String[] args) {
        // TODO code application logic here
        
       Scanner numero = new Scanner(System.in);
        
        int n1, digitos, darVuelta;
              
        
        int num;
        int dm, um, c, d, u;
        // 9 9 . 9 9 9 a cada guarismo lo llamaremos:
        //dm um c d u: dm (decenas de millar), um:(unidades de millar)
        //c: (centenas), d: (decenas), u: (unidades)
        
        
        num = numero.nextInt();
        
        // unidad
        u = num % 10;
        num = num / 10;
        // decenas
        d = num % 10;
        num = num / 10;
        // centenas
        c = num % 10;
        num = num / 10;
        // unidades de millar
        um = num % 10;
        num = num / 10;
        // decenas de millar
        dm = num;
        // lo imprimimos al revés:
        System.out.println (u + " " + d + " " + c + " " + um + " " + dm);
        // otra forma de hacerlo es
        num = 10000*u + 1000*d + 100*c + 10*um + dm;
        System.out.println (num);
        
    }
    
}
