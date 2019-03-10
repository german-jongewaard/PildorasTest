package java_hasta_el_video_200.video167;

/**
 *
 * @author german
 */
public class HerenciaGenericos {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        //manejando la clase empleado y jefe y el principio de sustitucion "es un..."
      /*  Empleado administrativa = new Empleado("Elena", 45, 1500);
        
        Jefe DirectoraComercial = new Jefe("Ana", 27, 3500);
        
        //es un... (principio de sustitucion) "esto no vale para clases GENERICAS!!!
        Empleado nuevoEmpleado = DirectoraComercial;        
        */
      
      Pareja<Empleado> Administrativa = new Pareja<Empleado>();
      
      Pareja<Jefe> DirectoraComercial = new Pareja<Jefe>();
      
      //Pareja<Jefe> nuevoEmpleado = new DirectoraComercial;
      
      Pareja.imprimirTrabajador(Administrativa);
      
      //si sucede esto se utiliza los "TIPOS COMODIN", 
      //no es aplicable un argumento de tipo Jefe 
       Pareja.imprimirTrabajador(DirectoraComercial);
      
      
      
      
        
        
    }
    
}
