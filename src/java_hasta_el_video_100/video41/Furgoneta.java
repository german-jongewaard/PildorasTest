package java_hasta_el_video_100.video41;

 /**
 *
 * @author german
 * 
 */

public class Furgoneta extends Coche{
    
   private int capacidad_carga;
   
   private int plazas_extra;
    
    public Furgoneta(int plazas_extra, int capacidad_carga){
        
        super();//Aquí llamo al constructor de la clase PADRE
        
        this.capacidad_carga = capacidad_carga;
        
        this.plazas_extra = plazas_extra;
    }
    
    public String dimeDatosFurgoneta(){ //Método GETTER
        
        return "La capacidad de carga es: " + capacidad_carga + " y las plazas son: " +
                plazas_extra;
    }
}
