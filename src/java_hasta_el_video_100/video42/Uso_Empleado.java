package java_hasta_el_video_100.video42;

import java.util.*;

 /**
 *
 * @author german
 * 
 */
 
public class Uso_Empleado {
 
    public static void main(String[] args) {
       
        Jefatura jefe_RRHH = new Jefatura("Juan", 55000, 2006, 9, 25);
        
        jefe_RRHH.estableceIncentivo(2570);
        
        Empleado[] misEmpleados = new Empleado[5];
        
        misEmpleados[0] = new Empleado("Ana", 30000, 2000, 07, 07);
        misEmpleados[1] = new Empleado("Carlos", 50000, 1995, 06, 15);
        misEmpleados[2] = new Empleado("Paco", 25000, 2005, 9, 25);
        misEmpleados[3] = new Empleado("Antonio", 47500, 2009, 11, 9);
        misEmpleados[4] = jefe_RRHH; /*Polimorfismo en acción, 
                                       principio de sustitución*/
         
        //EJEMPLO CON EL FOR EACH (FOR MEJORADO) :-)
        for(Empleado e: misEmpleados){
            /*Aumento el sueldo de los empleados un 5% */
            e.subeSueldo(5);
        }
        for(Empleado e: misEmpleados){
            System.out.println("Nombre: " + e.dameNombre() + 
                " Sueldo: " + e.dameSueldo() + " Fecha de alta: " +
                e.dameFechaContrato()); 
        }        
    }    
}

class Empleado{
    
    public Empleado(String nom, double sue, int agno, int mes, int dia){
        
        nombre = nom;
        sueldo = sue;
        
        //Construyo en OBJETO calendario con la clase GregorianCalendar!!!
        GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
        
        //Con getTime, almacenamos la fecha!!!
        altaContrato = calendario.getTime();
    }
    
    public Empleado(String nom){ this(nom, 30000, 2000, 01, 01); }
    
    public String dameNombre(){//Método GETTER
        return nombre;       
    }
    
    public double dameSueldo(){//Método GETTER        
        return sueldo;        
    }
    
    public Date dameFechaContrato(){//Método GETTER        
        return altaContrato;        
    }
    
    public void subeSueldo(double porcentaje){        
        
        double aumento = sueldo*porcentaje/100;
        
        sueldo += aumento;        
    }
    
    private String nombre;
    private double sueldo;
    private Date altaContrato;    
}


class Jefatura extends Empleado{
    
    public Jefatura(String nom, double sue, int agno, int mes, int dia){
        
        super(nom, sue, agno, mes, dia);
    }
    
    public void estableceIncentivo(double b){
        
        incentivo = b;
        
    }
    
    public double dameSueldo(){//Método GETTER  
        
        double sueldoJefe = super.dameSueldo();/*Con super llamo al metodo 
                                                "damesueldo" de la clase PADRE*/
        
        return sueldoJefe + incentivo;
    }
    
    private double incentivo;
}