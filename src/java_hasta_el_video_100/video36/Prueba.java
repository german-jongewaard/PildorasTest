package java_hasta_el_video_100.video36;

/**
 *
 * @author german
 * 
 */
public class Prueba {

    public static void main(String[] args) {
        
        Empleados trabajador1 = new Empleados("Paco");
        Empleados trabajador2 = new Empleados("Ana");
        Empleados trabajador3 = new Empleados("Luis");
        Empleados trabajador4 = new Empleados("Paco1");
        Empleados trabajador5 = new Empleados("Ana2");
        Empleados trabajador6 = new Empleados("Luis3");
        
        trabajador1.cambiaSeccion("RRHH");
        
        trabajador3.cambiaSeccion("GERENCIA");        
        
        
        System.out.println(trabajador1.devuelveDatos());
        System.out.println(trabajador2.devuelveDatos());
        System.out.println(trabajador3.devuelveDatos());
        System.out.println(trabajador4.devuelveDatos());
        System.out.println(trabajador5.devuelveDatos());
        System.out.println(trabajador6.devuelveDatos());
        
         System.out.println(Empleados.dameIdSiguiente());
    }    
}

class Empleados{
    
     /*Al colocar final a la variable nombre, 
    luego no te deja modificar el valor almacenado*/
    private final String nombre;
    private String seccion;    
    private int Id;    
    private static int IdSiguiente = 1;
    
    
    public Empleados(String nom){
        
        nombre = nom;
        
        seccion = "Administración";
        
        Id = IdSiguiente;
        
        IdSiguiente++;       
         
    }
    
    public void cambiaSeccion(String seccion){//SETTER
        this.seccion = seccion;
    }
     
    public String devuelveDatos(){
        return "El nombre es: " + nombre + " y la sección es: " +
                seccion + " y el Id: " + Id; 
    }
    
    public static String dameIdSiguiente(){
        
        return "el Id siguiente es: " + IdSiguiente;
    }
   
    
}
