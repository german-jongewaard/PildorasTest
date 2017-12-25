 package java_hasta_el_video_100.video50;

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
        
        Empleado[] misEmpleados = new Empleado[6];
        
        misEmpleados[0] = new Empleado("Ana", 30000, 2000, 07, 07);
        misEmpleados[1] = new Empleado("Carlos", 50000, 1995, 06, 15);
        misEmpleados[2] = new Empleado("Paco", 25000, 2005, 9, 25);
        misEmpleados[3] = new Empleado("Antonio", 47500, 2009, 11, 9);
        misEmpleados[4] = jefe_RRHH; /*Polimorfismo en acción, 
                                       principio de sustitución*/
        
        misEmpleados[5] = new Jefatura("María", 95000, 1999, 5, 26);
        
        Jefatura jefa_Finanzas=(Jefatura) misEmpleados[5];
        /* Aquí estoy "Casteando" a misEmpleados[5] */
        jefa_Finanzas.estableceIncentivo(55000);
        
   /*   Si quisiera hacer esto:
        Jefatura jefa_Compras=(Jefatura) misEmpleados[1];
        No podria porque no se puede Castear en sentido inverso, 
        un Empleado no siempre es un Jefe. Y aqui estoy diciendo 
        que Jefatura es Empleado */
        
        
        /*Aquí utilizo el principio de sustitución con dos clases*/
         Empleado director_comercial=new Jefatura("Sandra",85000, 2012,05,05);
        
        Comparable ejemplo=new Empleado("Elisabeth",95000, 2011, 06, 07);
        
        
        /* Uso de instanceof */
        if(director_comercial instanceof Empleado){
            System.out.println("Es de tipo Jefatura");
        }
        
        if(ejemplo instanceof Comparable){
            System.out.println("Implementa la Interfaz COMPARABLE");
        }
        
        Arrays.sort(misEmpleados);
        
         
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

class Empleado implements Comparable{
    
    public Empleado(String nom, double sue, int agno, int mes, int dia){
        
        nombre = nom;
        sueldo = sue;
        
        //Construyo en OBJETO calendario con la clase GregorianCalendar!!!
        GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
        
        //Con getTime, almacenamos la fecha!!!
        altaContrato = calendario.getTime();
    }
    
    public Empleado(String nom){
        
        this(nom, 30000, 2000, 01, 01);
        
    }
    
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
    
    public int compareTo(Object miObjeto){
    
        /*Hago un casting, refundicion*/
        
        Empleado otroEmpleado = (Empleado) miObjeto;
        
        if(this.Id<otroEmpleado.Id){
            return -1; 
        }
        if(this.Id>otroEmpleado.Id){
            return 1;
        }
         return 0;
}
    
    /*Campos de clase*/
    private String nombre;
    private double sueldo;
    private Date altaContrato;
    private static int idSiguiente;
    private int Id;
    
    
}

/*Con el "final" estoy deteniendo la cadena de la Herencia de la clase Jefatura*/
final class Jefatura extends Empleado{
    
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
/* Esta clase se ve interrumpida porque la clase que esta sobre ella, de la que Hereda
el constructor tiene la palabra reservada "final".
class Director extends Jefatura{
    
    public Director(String nom, double sue, int agno, int mes, int dia){
    
        super(nom, sue, agno, mes, dia);
        
    }
    
}
*/