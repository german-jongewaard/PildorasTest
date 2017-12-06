package java_hasta_el_video_100.video28;
/**
 *
 * @author Germán
 * 
 */ 

public class Coche {
    
    private int ruedas;    
    private int largo;    
    private int ancho;
    private int motor;
    private int peso;
    
    /*El metodo constructor se llama igual que la Clase */
    
    public Coche(){
        /*Aqui contruyo el estado inicial del OBJETO! */
        
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso = 500;        
    }
    
    public String dime_largo(){      
        
        return "El largo del coche es: " + largo;
    }
}
