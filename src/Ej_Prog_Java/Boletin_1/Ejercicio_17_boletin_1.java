/*
 * 17. Pedir el día, mes y año de una fecha correcta y mostrar la fecha del día siguiente. suponer que todos
 *     los meses tienen 30 días.
 */
package Ej_Prog_Java.Boletin_1;

import java.util.Scanner;

/**
 *
 * @author german
 */
public class Ejercicio_17_boletin_1 {
  
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
                
        
        if(anio == 0){
            System.out.println("fecha Incorrecta");
        }else{
             if(mes == 2 &&( dia >=1 && dia <=28)){
                 dia++;
                 if(dia >=29){
                     mes++;
                     System.out.println(dia + "/" + mes + "/" + anio +  ": La fecha es CORRECTA");                 
                 }else if(dia > 28 && mes == 12){
                     anio++;
                     System.out.println(dia + "/" + mes + "/" + anio +  ": La fecha es CORRECTA");   
                 }
                 System.out.println(dia + "/" + mes + "/" + anio +  ": La fecha es CORRECTA");                 
             }else if(mes >= 1 &&  mes <=12)  {   
                    dia++;
                    System.out.println(dia + "/" + mes + "/" + anio +  ": La fecha es CORRECTA"); 
                    
                        if(dia >30){
                             
                            mes++;
                            System.out.println(dia + "/" + mes + "/" + anio +  ": La fecha es CORRECTA");                 
                        }else if(dia >30 && mes == 12){
                            anio++;
                            System.out.println(dia + "/" + mes + "/" + anio +  ": La fecha es CORRECTA");   
                        }
                    }
            }  
        
        // incrementamos el día
            dia ++;
            // si el día supera 30, lo reiniciamos a 1 e incrementamos el mes
            if (dia >= 30)
            {
                dia = 1;
                mes ++;
            // si el mes supera 12, lo reiniciamos a 1 e incrementamos el año
            if (mes >= 12)
            {
                mes = 1;
                anio ++;
            }
            }
            // habría que tener en cuenta que el año pasa del -1 al +1
            // en este código pasaríamos del año -1 al 0 (que nunca existió)
            // para corregirlo:
            if (anio == 0)
                anio = 1;
            System.out.println (dia + "/"+ mes + "/" + anio);
        
    }
    
}
