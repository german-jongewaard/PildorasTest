package java_hasta_el_video_100.video46;

import java.util.Date;
import java.util.GregorianCalendar;

 /**
 *
 * @author german
 * 
 */

public class Uso_Persona {
     
    public static void main(String[] args) {
        // TODO code application logic here
        
        Persona[] lasPersonas = new Persona[2];
        
        lasPersonas[0] = new Empleado2("Luis Conde", 50000, 2009, 02, 25) {};
        lasPersonas[1] = new Alumno("Ana Lopez", "Matemáticas") {};
        
        for (Persona p: lasPersonas){
             System.out.println(p.dameNombre()  + " " +  p.dameDescripcion());             
        }
    }    
}

abstract class Persona{    
    
    public Persona(String nom){ nombre = nom; }
    
    public String dameNombre(){//metodo Getter
        
        return nombre;
    }
    
    public abstract String dameDescripcion();
    
    private String nombre;        
}

abstract class Empleado2 extends Persona {
    
    public Empleado2(String nom, double sue, int agno, int mes, int dia){
        
        super(nom);        
         
        sueldo = sue;
        
        //Construyo en OBJETO calendario con la clase GregorianCalendar!!!
        GregorianCalendar calendario = new GregorianCalendar(agno, mes-1, dia);
        
        //Con getTime, almacenamos la fecha!!!
        altaContrato = calendario.getTime();
        
        ++IdSiguiente;
        
        Id=IdSiguiente;
    }
    
    /*aqui estoy sobreescribiendo el metodo "dameDescripcion" 
    de la clase Persona!!!*/
    public String dameDescripcion(){
        return "Este empleado tiene un Id= " + Id  + " con un sueldo = " + sueldo;
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
     
     
    private double sueldo;
    private Date altaContrato;
    
    private static int IdSiguiente;
    private int Id;
    
}

abstract class Alumno extends Persona{
    
    public Alumno(String nom, String car){
        
        super(nom);
        
        carrera = car;
    }
    
    public String dameDescripcion(){//Método GETTER
        return "Este alumno esta estudiando la carrera de: " + carrera;
    }
    
    private String carrera;
}
