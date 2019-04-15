/*
 *
 * 10. Pedir tres números y mostrarlos ordenados de mayor a menor.
 *
 *
 */
package Ej_Prog_Java.Boletin_1;

import java.util.Scanner;

/**
 *
 * @author german
 */
public class MayorMenorTresNumeros_10 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        int n1, n2, n3;
        
        System.out.println("Ingrese el primer número: ");
        n1 = entrada.nextInt();
        
        System.out.println("Ingrese el segundo número: ");
        n2 = entrada.nextInt();
        
        System.out.println("Ingrese el tercero número: ");
        n3 = entrada.nextInt();
          
            
            if(n1>n2 && n2>n3)
                System.out.println( n1+", "+n2+", "+n3);
            else{
                if(n1>n3 && n3>n2)
                
                    System.out.println(n1+", "+n3+", "+n2);
                else{
                    if(n2>n1 && n1>n3)
                        System.out.println(n2+", "+n1+", "+n3);
                    else{                        
                        if(n2>n3 && n3>n1)
                            System.out.println(n2+", "+n3+", "+n1);
                        else{
                            if(n3>n1 && n1>n2)
                                System.out.println(n3+", "+n1+", "+n2);
                            else{
                                if(n3>n2 && n2>n1)
                                    System.out.println(n3+", "+n2+", "+n1);
                            }
                        }
                    }
                }
            }
        }
}
 