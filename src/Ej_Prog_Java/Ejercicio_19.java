/*
 * 19. Pedir dos fechas y mostrar el número de días que hay de diferencia. 
 *     Suponiendo todos los meses de 30 días.
 */
package Ej_Prog_Java;

import java.util.Scanner;

/**
 *
 * @author german
 */
public class Ejercicio_19 {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner numero = new Scanner(System.in);
        
        int dia1,mes1,año1;
        int dia2,mes2,año2;
        int total_dias;
        System.out.println ("Fecha 1:");
        System.out.print("Introduzca día: ");
        dia1=numero.nextInt();
        System.out.print("Introduzca mes: ");
        mes1=numero.nextInt();
        System.out.print("Introduzca año: ");
        año1=numero.nextInt();
        
        System.out.println ("Fecha 2:");
        System.out.print("Introduzca día: ");
        dia2=numero.nextInt();
        System.out.print("Introduzca mes: ");
        mes2=numero.nextInt();
        System.out.print("Introduzca año: ");
        año2=numero.nextInt();
        
        // suponemos que las fecha introducidas son correctas
        // convertimos las dos fechas a días y calculamos la diferencia
        total_dias = dia2-dia1 + 30*(mes2-mes1)+365*(año2-año1);
         
        System.out.println ("Días de diferencia: " + total_dias);
    
    }    
}
