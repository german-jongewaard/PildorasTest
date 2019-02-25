package java_hasta_el_video_160.video159;

 
import java.io.*;


public class Pruebas_rutas {

    public static void main(String[] args) {
        // TODO code application logic here
        
        File archivo = new File("test");
        
        System.out.println(archivo.getAbsolutePath());
        
        System.out.println(archivo.exists());
        
    }
    
}
