package java_hasta_el_video_200.video163;

 
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author german
 */
public class UsoEmpleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       
      
      ArrayList <Empleado> listaEmpleados = new ArrayList<Empleado>();
      
     // listaEmpleados.ensureCapacity(15);
        
      listaEmpleados.add(new Empleado("Ana", 45, 2500));
      
      listaEmpleados.add(new Empleado("Antonio", 55, 2000));
      
      listaEmpleados.add(new Empleado("Maria", 25, 2600));
      
      listaEmpleados.add(new Empleado("Jose", 35, 2200));
      
      listaEmpleados.add(new Empleado("Jose2", 35, 2200));
      
      listaEmpleados.add(new Empleado("Ana", 45, 2500));
      
      listaEmpleados.add(new Empleado("Antonio", 55, 2000));
      
      listaEmpleados.add(new Empleado("Juan", 25, 2600));
      
      listaEmpleados.add(new Empleado("Pedro", 35, 2200));
      
      listaEmpleados.add(new Empleado("Germán", 55, 2000));
      
      listaEmpleados.add(new Empleado("Lucas", 25, 2600));
      
      listaEmpleados.add(new Empleado("Maria Jose", 35, 2200));
      
      listaEmpleados.add(new Empleado("Sebastian", 55, 2000));
      
      listaEmpleados.add(new Empleado("Marcos", 25, 2600));
      
      listaEmpleados.add(new Empleado("Miriam", 35, 2200));
      
      
          
      System.out.println(listaEmpleados.size()); 
      /*
      for(Empleado e: listaEmpleados){
          
          System.out.println(e.dameDatos());
      }*/
      //          COLECCIONES!!!
      Iterator <Empleado> mi_iterador = listaEmpleados.iterator();
      
      while(mi_iterador.hasNext()){
          
          System.out.println(mi_iterador.next().dameDatos());
          
          
          
      }
        
    }
    
}

class Empleado{
    
    public Empleado(String nombre, int edad, double salario){
        
        this.nombre = nombre;
        
        this.edad = edad;
        
        this. salario = salario;
    }
    
    public String dameDatos(){
        
        return "El empleado se llama " + nombre + ". Tiene " + edad + " años" 
                + " Y un salario de " + salario; 
        
    } 
    
    private String nombre;
    
    private int edad;
    
    private double salario;
    
}

