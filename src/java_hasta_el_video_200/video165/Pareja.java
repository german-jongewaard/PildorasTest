package java_hasta_el_video_200.video165;

/**
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
    
    public T getPrimero() {
        
        return primero;        
    }
    
    private T primero;
    
}
