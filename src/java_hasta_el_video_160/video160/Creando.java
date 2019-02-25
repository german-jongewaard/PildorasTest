package java_hasta_el_video_160.video160;

/**
 *
 * @author german
 */

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Creando {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
      /*    AQUI EN UN DIRECTORIO CREO UNA CARPETA!!!
        File ruta = new File(File.separator + "home" + File.separator + "german" + File.separator +
                "Documentos" + File.separator + "NetBeansProjects" + File.separator + 
                "Pildorasinformaticas" + File.separator + "src" + File.separator + 
                "video160" + File.separator + "nueva_carpeta_2");
         
        ruta.mkdir();
        
        */
      /*    AQUI EN UN DIRECTORIO CREO UN ARCHIVO TXT!!!  */
         File ruta = new File(File.separator + "home" + File.separator + "german" + File.separator +
                "NetBeansProjects" + File.separator + "PildorasTest" + File.separator + "src" + File.separator + 
                "java_hasta_el_video_160" + File.separator + "video160" +  File.separator + "nueva_carpeta_1" + File.separator + "prueba_texto.txt");
         //home/german/NetBeansProjects/PildorasTest/src/java_hasta_el_video_160/video160
         String archivo_destino = ruta.getAbsolutePath();
         
        try {
            ruta.createNewFile();
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        Escribiendo accede_es = new Escribiendo();
        
        accede_es.escribir(archivo_destino);
    }
    
}

class Escribiendo{
    
    
    public void escribir(String ruta_archivo){
        
     String frase = "Esto es un ejemplo. Espero que salga";
     
     try{
         
         FileWriter escritura = new FileWriter(ruta_archivo );
         
         for(int i=0; i<frase.length(); i++){
             
             escritura.write(frase.charAt(i));
         }
         
         escritura.close();
         
     }catch(IOException e){
         
         e.printStackTrace();
         
     }
        
        
    }
    
}
