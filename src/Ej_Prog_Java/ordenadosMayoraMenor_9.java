/*
 *
 * 9. Pedir dos números y mostrarlos ordenados de mayor a menor.
 *
 *
 */
package Ej_Prog_Java;


import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author german
 */
public class ordenadosMayoraMenor_9 {

    /**
     * @param args the command line arguments
     */
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
                System.out.println(n1 + " y " + n2);
            }else{
                System.out.println(n2 + " y " + n1);
            }
         
    }
    
}
