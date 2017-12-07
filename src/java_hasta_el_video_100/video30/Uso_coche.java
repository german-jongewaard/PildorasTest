package java_hasta_el_video_100.video30;
/* ESTE EJERCICIO ES DE LA CLASE 30 a mitad de video!!! */
 /**
 *
 * @author Germán
 * 
 */
public class Uso_coche {
     
    public static void main(String[] args) {
        
        Coche micoche = new Coche(); // INSTANCIAR UNA CLASE. EJEMPLAR DE CLASE.
        
        
        micoche.establece_color("marrón");        
        
        
        System.out.println(micoche.dime_datos_generales());
        
                
        System.out.println(micoche.dime_color());
        
        micoche.configura_asientos("no");
        
        
        System.out.println(micoche.dime_asientos());
        
        micoche.configura_climatizador("si");
        
        System.out.println(micoche.dime_climatizador());
       
        System.out.println(micoche.dime_peso_coche());        
     
        
        System.out.println("El precio final del coche es: " + micoche.precio_coche());
    }    
}
