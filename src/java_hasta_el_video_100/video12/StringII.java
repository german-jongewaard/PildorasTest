package java_hasta_el_video_100.video12;

/**
 *
 * @author German
 * 
 */
public class StringII {

    public static void main(String[] args) {
      
        String frase = "Hoy es un estupendo día para aprender a programar en Java";
        
        String frase_resumen = frase.substring(0, 29) + "irnos a la playa y olvidarnos de todo..." +
                " y " + frase.substring(29, 57);
        
        
          System.out.println(frase_resumen);
        
    }
    
}
