package java_hasta_el_video_160.video159;

/**
 *
 * @author german
 */

import java.io.*;


public class Acceso_a_fiechero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
                
        File ruta = new File(File.separator + "home" + File.separator + "german" + File.separator +
                "Documentos" + File.separator + "NetBeansProjects" + File.separator + 
                "Pildorasinformaticas" + File.separator + "src" + File.separator + 
                "java_hasta_el_video_160" + File.separator + "video159");
        
        System.out.println(ruta.getAbsolutePath());
        
        String[] nombres_archivos = ruta.list();
        
        for(int i = 0; i < nombres_archivos.length; i++){
            
            //System.out.println(nombres_archivos[i]);
            
            
            File f = new File(ruta.getAbsolutePath(), nombres_archivos[i]);
            
            if(f.isDirectory()){
            
                String[] archivos_subcarpeta = f.list();
                
                for(int j = 0; j < archivos_subcarpeta.length; j++){
                    
                    System.out.println(archivos_subcarpeta[j]);
                    
                }
            
            
            }
             
        }
        
        
        
    }
    
}
