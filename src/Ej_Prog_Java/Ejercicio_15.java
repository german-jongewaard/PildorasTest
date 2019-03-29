/*
 * 15. Pedir el día, mes y año de una fecha e indicar si la fecha es 
 * correcta. Suponiendo todos los meses de
 * 30 días.
 */
package Ej_Prog_Java;

import java.util.Scanner;

/**
 *
 * @author german
 */
public class Ejercicio_15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner numero = new Scanner(System.in);
        
        int dia, mes, anio;  
        
        System.out.println("Ingrese el día:");
        dia = numero.nextInt();
        
        
        System.out.println("Ingrese el mes:");
        mes = numero.nextInt();
        
        System.out.println("Ingrese el año:");
        anio = numero.nextInt();
                
        
        if(dia >=1 && dia <=30)
            if(mes >= 1 &&  mes <=12)
                if(anio != 0)
                    System.out.println(dia + "/" + mes + "/" + anio +  ": La fecha es CORRECTA");                 
                else    
                    System.out.println(dia + "/" + mes + "/" + anio +  ": El año es INCORRECTO");                 
            else
                System.out.println(dia + "/" + mes + "/" + anio +  ": El mes es INCORRECTO");                 
        else
            System.out.println(dia + "/" + mes + "/" + anio +  ": El día es INCORRECTO");                 
        
      
        
        
        
        
    }
    
}
