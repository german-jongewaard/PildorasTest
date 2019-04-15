package Ej_Prog_Java.Boletin_1;

import java.util.Scanner;

/**
 *
 * @author german
 * 
 * 1. Pedir los coeficientes de una ecuación se 2o grado, y muestre sus 
 * soluciones reales. Si no existen, debe indicarlo.
 * 
 * 
*/
public class Coeficiente_ecuacion_1 {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada = new Scanner(System.in);
        
        double a,b,c; // coeficientes ax^2+bx+c=0   
        
        double x1,x2,d; // soluciones y determinante  
        
        System.out.println("Introduzca primer coeficiente (a):");   
        a = entrada.nextInt(); 
        System.out.println("Introduzca segundo coeficiente: (b):");   
        b = entrada.nextInt(); 
        System.out.println("Introduzca tercer coeficiente: (c):");   
        c = entrada.nextInt();       // calculamos el determinante  
        
        d=((b*b)-4*a*c);     
        
        if(d<0)    
            System.out.println("No existen soluciones reales");   
        else{ 
            // queda confirmar que a sea distinto de 0
            // si a=0 nos encontramos una división por cero.   
            x1=(-b+Math.sqrt(d))/(2*a);     
            x2=(-b-Math.sqrt(d))/(2*a);     
            System.out.println("Solución: " + x1);  
            System.out.println("Solución: " + x2);

        }
        
    }
    
}
