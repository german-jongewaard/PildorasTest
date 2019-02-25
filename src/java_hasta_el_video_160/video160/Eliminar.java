 
package java_hasta_el_video_160.video160;

import java.io.File;

/**
 *
 * @author german
 */
public class Eliminar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        File ruta = new File(File.separator + "home" + File.separator + "german" + File.separator +
                "NetBeansProjects" + File.separator + "PildorasTest" + File.separator + "src" + File.separator + 
                "java_hasta_el_video_160" + File.separator + "video160" +  File.separator + "nueva_carpeta_1" + File.separator + "prueba_texto.txt");
        
        ruta.delete();
        
        if(!ruta.exists()){
            System.out.println("El documento no existe!");
        }else{
            System.out.println("El documento si existe!");
        }
    }
    
}
