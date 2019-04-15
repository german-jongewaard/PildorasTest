/*
 * 16. Pedir el día, mes y año de una fecha e indicar si la fecha es 
 *      correcta. Con meses de 28, 30 y 31 días.
 *      Sin años bisiestos.
 */
package Ej_Prog_Java.Boletin_1;

import java.util.Scanner;

/**
 *
 * @author german
 */
public class Ejercicio_16_boletin_1 {
    
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
                 System.out.println(dia + "/" + mes + "/" + anio +  ": La fecha es CORRECTA");                 
             }else if((mes == 4 || mes == 6 || mes == 9 || mes == 11) && ( dia >=1 && dia <=30))  {
                        
                      System.out.println(dia + "/" + mes + "/" + anio +  ": La fecha es CORRECTA");    
             }else if((mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12 ) && ( dia >=1 && dia <=31))  {
                        
                      System.out.println(dia + "/" + mes + "/" + anio +  ": La fecha es CORRECTA");    
             }else{
                      System.out.println(dia + "/" + mes + "/" + anio +  ": La fecha es INCORRECTA !!");    
             }
        }
        
        //******************************************************************
        
        int dias_del_mes;
        boolean fecha_correcta=true;
                
        dias_del_mes = 0; // si se utiliza un mes fuera del rango 1..12
        // supondremos que los días del mes son 0.
        if(anio==0) // el único año que no existe es el 0
            fecha_correcta = false;
        if (dia<1 || dia >31) // un día fuera del rango 1..31 no tiene sentido
            fecha_correcta = false;
        if (mes<1 || mes >12) // un mes fuera del rango 1..12 no tiene sentido
            fecha_correcta = false;
        if(mes==2 )
            dias_del_mes = 28;
        if(mes==4 || mes==6 || mes==9 || mes==11)
            dias_del_mes = 30;
        if(mes==1 || mes==3 || mes==5 || mes==7 || mes==8 || mes==10 || mes==12)
            dias_del_mes = 31;
        if (dia > dias_del_mes)
            fecha_correcta = false;
        
        if (fecha_correcta)
            System.out.println(dia + "/" + mes + "/" + anio+": Fecha correcta");
        else
            System.out.println("Fecha incorrecta");
        
    }
    
}
