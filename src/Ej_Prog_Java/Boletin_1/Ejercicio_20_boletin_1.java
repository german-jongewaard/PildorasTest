/*
 * 20. Pedir una hora de la forma hora, minutos y segundos, y mostrar 
 *     la hora en el segundo siguiente.
 *
 */
package Ej_Prog_Java.Boletin_1;

import java.util.Scanner;

/**
 *
 * @author german
 */
public class Ejercicio_20_boletin_1 {
   
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner numero = new Scanner(System.in);
        
        int hora,minuto,segundo;
        
        
        
        System.out.println ("Mostrar la hora en el segundo siguiente");
        System.out.print("Introduzca la hora: ");
        hora = numero.nextInt();
        System.out.print("Introduzca el minuto: ");
        minuto = numero.nextInt();
        System.out.print("Introduzca el segundo: ");
        segundo = numero.nextInt();
        
        segundo++;
        
        
        if(segundo >= 60){
            segundo=0;
            minuto++;            
            if(minuto >= 60){        
                minuto=0;
                hora++;
                if(hora >= 24){    
                    hora=0;
                }                         
            }
            System.out.println("La hora es: " + hora + ":" + minuto + ":" + segundo);
            
        }
    
        if (segundo >= 60){
                segundo = 0;
                minuto ++;
                // si los minutos superan 59, los reiniciamos a 0 e incrementamos la hora
            if (minuto >= 60){
                    minuto = 0;
                    hora ++;
                // si la hora supera 23, la reiniciamos a 0
                if (hora>=24)
                    hora=0;
                }
            }
            
            System.out.println ("Fecha: "+ hora + ":"+ minuto + ":" + segundo);
            
        
        
    }
    
}
