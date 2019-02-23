package java_hasta_el_video_160.video153;

/**
 *
 * @author german
 */

import java.io.*;


public class Escribir_Fichero {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Escribiendo accede_escritura = new Escribiendo();
        
        accede_escritura.escribir();
        
    }
    
}


class Escribiendo{
    
    public void escribir() {
        
        String frase = "Esto es una prueba de escritura...2";
        try{
                                                            /* con TRUE, en el caso que exista
                                                             el Fichero existente "agregar" este texto */
            FileWriter escritura = new FileWriter("/home/german/Documentos/text_nuevo", true);    
            
            for (int i = 0; i < frase.length(); i++){
             
          /* aqui ingreso letra a letra en el archivo text_nuevo */
                escritura.write(frase.charAt(i));
                
            }
            
            System.out.println("El archivo fué generado con exito");
            
            escritura.close();
            
        }catch(IOException e){
            
            System.out.println("No se ha podido generar el archivo");
            
        }
        
        
        
        
    }
}
