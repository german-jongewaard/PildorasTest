package java_hasta_el_video_200.video167;/**
 *
 * @author german
 */
public class Pareja<T> {
    
    //constructor
    public Pareja(){
        
        primero=null;
        
    }
    
    public void setPrimero(T nuevoValor) {
        
        primero = nuevoValor;
        
    }
                                                //TIPOS COMODINES
    public static void imprimirTrabajador(Pareja<? extends Empleado> p){
        
        Empleado primero = p.getPrimero();
        
        System.out.println(primero);
        
        
    }
    
    public T getPrimero() {
        
        return primero;        
    }
    
    private T primero;
    
}
