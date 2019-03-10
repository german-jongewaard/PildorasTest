package java_hasta_el_video_200.video165;

/**
 *
 * @author german
 */

public class UsoPareja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Pareja<String> una = new Pareja<String>();
        
        una.setPrimero("Germán");
        
        System.out.println(una.getPrimero());
        
        Persona pers1 = new Persona("Ana");
        
        Pareja<Persona> otra= new Pareja<Persona>();
        
        otra.setPrimero(pers1);
        
        System.out.println(otra.getPrimero());
    }
    
}

class Persona{
    
    public Persona(String nombre){
        
        this.nombre=nombre;
    }
    
    public String toString(){
        
        return nombre;
    }
    
    private String nombre;
}
