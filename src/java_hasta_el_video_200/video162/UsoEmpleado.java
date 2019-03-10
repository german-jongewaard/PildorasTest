package java_hasta_el_video_200.video162;


import java.util.ArrayList;

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
        
      /*  
        Empleado listaEmpleados[] = new Empleado[3];
        
        listaEmpleados[0] = new Empleado("Ana", 45, 2500);
        
        listaEmpleados[1] = new Empleado("Antonio", 55, 2000);
        
        listaEmpleados[2] = new Empleado("Maria", 25, 2600);
      */
      
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
      
      //trimToSize "corta" el ecceso de memoria
     // listaEmpleados.trimToSize();
     
     
     //listaEmpleados.set(1, new Empleado("Olga", 22, 2200));
      
          
      System.out.println(listaEmpleados.size());
      
      /*
        for(Empleado e: listaEmpleados){
            
            System.out.println(e.dameDatos());
        }*/

    /* for(int i=0;i<listaEmpleados.size();i++){
         
         Empleado e = listaEmpleados.get(i);   
         
         System.out.println(e.dameDatos());
         
         
     } */
     
     //System.out.println(listaEmpleados.get(4).dameDatos());
     
     Empleado arrayEmpleados[] = new Empleado[listaEmpleados.size()];
     
     listaEmpleados.toArray(arrayEmpleados);
     
     for(int i=0; i<arrayEmpleados.length;i++){
         
         System.out.println(arrayEmpleados[i].dameDatos());
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

