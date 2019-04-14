/*
 * 7. Pedir números hasta que se introduzca uno negativo, y calcular la media.
 */
package Ej_Prog_Java.Boletin_2;

import java.util.Scanner;

/**
 *
 * @author german
 */
public class Ejercicio_7_boletin_2 {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);        
        int num, contador = 0;        
        float media= 0;
        int sum= 0;
        
        // num guardará el número que leamos
        // y cuadrado guardará el cuadrado de num
        System.out.println("Introduzca número");
        num=entrada.nextInt();          
         
        while(num >= 0){
         
            sum += num;
            contador++;            
            
            System.out.println("Introduzca otro número");
            num=entrada.nextInt(); 
        
                     
         }
        
        if(contador == 0){ //Da error porque dividiría por cero
            System.out.println("Imposible hacer la media");
        }else{
           
            media = (float)sum/contador;
            System.out.println("La media de los números es: " + media);      
            
             System.out.println("La suma es de: " + sum);      
        }
        
          
    }
    
}
