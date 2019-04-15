/*
 * 3. Leer números hasta que se introduzca un 0. Para cada 
 *    uno indicar si es par o impar.
 */
package Ej_Prog_Java.Boletin_2;

import java.util.Scanner;

/**
 *
 * @author german
 */
public class Ejercicio_3_boletin_2 {

    public static void main(String[] args) {
        // TODO code application logic here        
        Scanner entrada = new Scanner(System.in);        
        int num;        
        
        // num guardará el número que leamos
        // y cuadrado guardará el cuadrado de num
        System.out.println("Introduzca número: ");
        num=entrada.nextInt(); 
        
        while(num!=0){ 
            
            if(num %2 == 0){
                System.out.println("Es par");
            }else{
                System.out.println("Es impar");
            }
            
            System.out.println("Introduzca otro número: ");
            num=entrada.nextInt(); // volvemos a leer num

        } 
        
    }
    
}
