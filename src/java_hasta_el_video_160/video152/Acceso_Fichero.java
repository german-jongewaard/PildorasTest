package java_hasta_el_video_160.video152;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author german
 */
public class Acceso_Fichero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Leer_Fichero accediendo = new Leer_Fichero();
        
        accediendo.lee();
        
    }
    
}

class Leer_Fichero{
    
    public void lee(){
                           
        try {
            
            FileReader entrada = new FileReader("/home/german/Documentos/ejemplo");
            
     /* aqui almaceno el codigo del primer caracter que lee */
            int c = entrada.read();
            
            while(c != -1){
            
                c = entrada.read();
                
             /* aqui hago un Casting y transformo los numeros de c en letras */
                char letra = (char)c;
                
                System.out.print(letra);
            
        }
            
        } catch (IOException e) {
            
            System.out.println("No se ha encontrado el archivo");
            
        }
        
        
        
    } 
    
    
    
}