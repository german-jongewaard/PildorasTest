/*
 * 13. Pedir un número entre 0 y 9.999, decir si es capicúa.
 *
 */
package Ej_Prog_Java.Boletin_1;

import java.util.Scanner;

/**
 *
 * @author german
 */
public class Ejercicio_13_boletin_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    int num;
    int dm, um, c, d, u;
    // 9 9 . 9 9 9 a cada guarismo lo llamaremos:
    //dm um c d u: dm (decenas de millar), um:(unidades de millar)
    //    c: (centenas), d: (decenas), u: (unidades)
    Scanner numero = new Scanner(System.in);
  
    System.out.print("Introduzca un número entre 0 y 99.999: ");
        num= numero.nextInt();
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
        // el número será capicúa si las cifras son iguales dos a dos por los extremos
        // las centenas no las tenemos en cuenta
    
    if (dm == u && um == d)
        System.out.println ("el número es capicúa");
    else
        System.out.println ("el número NO es capicúa");
    
    // hay que tener en cuenta que en este ejercicio el número 121 es similar al 00121 y
    // resulta que 121 es capicúa, pero nuestro código lo identifica como NO capicúa. Ya
    // que trabajamos con el 00121. No tendremos en cuenta este pequeño error.
    
    //*****************************************************************************
    
    boolean capicua = false; // suponemos que el número no es capicúa;
    
    //si el número tiene 5 cifras (dm, um, c, d, u)
        if (dm == u && um == d)
        capicua = true;
        //si el número tiene 4 cifras (0, um, c, d, u)
        if (dm == 0 && um == u && c == d)
        capicua = true;
        //si el número tiene 3 cifras (0, 0, c, d, u)
        if (dm == 0 && um==0 && c == u)
        capicua = true;
        //si el número tiene 2 cifras (0, 0, 0, d, u)
        if (dm == 0 && um == 0 && c == 0 && d == u)
        capicua = true;
        // se entiende que un número de una cifra no es capicúa
        if (capicua)
        System.out.println ("el número es capicúa");
        else
        System.out.println ("el número NO es capicúa");
        

    }
    
}
