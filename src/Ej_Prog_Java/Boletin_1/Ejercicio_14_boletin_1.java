/*
 * 14. Pedir una nota de 0 a 10 y mostrarla de la forma: Insuficiente, Suficiente, Bien...
 *
 */
package Ej_Prog_Java.Boletin_1;

import java.util.Scanner;

/**
 *
 * @author german
 */
public class Ejercicio_14_boletin_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner numero = new Scanner(System.in);
        
        int nota;        
        
        System.out.println("Introduzca una nota: ");
        nota = numero.nextInt();
        
        if(nota >= 0 && nota <5)
            System.out.println("INSUFICIENTE");
        if(nota == 5)
            System.out.println("SUFICIENTE");
        if(nota == 6)
            System.out.println("BIEN");
        if(nota == 7 || nota == 8)
            System.out.println("NOTABLE");
        if(nota ==9 && nota == 10)
            System.out.println("SOBRESALIENTE");
        
        
        
        switch(nota){
            
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            System.out.println("INSUFICIENTE");
            break;
           
            case 5:
            System.out.println("SUFICIENTE");
            break;
            
            case 6:
            System.out.println("BIEN");
            break;
           
            case 7:
            case 8:
            System.out.println("NOTABLE");
            break;
           
            case 9:
            case 10:
            System.out.println("SOBRESALIENTE");
            break;
            
            default:
            System.out.println("ERROR");
            break;
            }

        
        
        
        
        
        
    }
    
}
