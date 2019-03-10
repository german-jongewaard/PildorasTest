package java_hasta_el_video_200.video166;

/**
 *
 * @author german
 */
public class MetodosGenericos {

    public static void main(String[] args) {
        // TODO code application logic here
        
        
        String nombres[] = {"Jose", "Maria", "Pepe"};
        
        
        String elementos = MisMatrices.getElementos(nombres);  
        
        System.out.println(elementos);
        
        Empleado listaEmpleados[]= {new Empleado("Ana1", 45, 2500),
                                    new Empleado("Ana2", 45, 2500),
                                    new Empleado("Ana3", 45, 2500),
                                    new Empleado("Ana4", 45, 2500),
                                    new Empleado("Ana5", 45, 2500)
                                };
        
        System.out.println(MisMatrices.getElementos(listaEmpleados));
        } 
    
}

class MisMatrices {
    
    public static <T> String getElementos(T[]a){
        
        return "El array tiene " + a.length + " elementos";
        
    }
    
}
