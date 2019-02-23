package java_hasta_el_video_160.video153;
 
import java.io.*;
import java.util.logging.*;

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
     
            int c = 0;
            
            while(c != -1){
            
                c = entrada.read();
                
             /* aqui hago un Casting y transformo los numeros de c en letras */
                char letra = (char)c;
                
                System.out.print(letra);
            
            }
            /* aquí cierro la apertura del archivo! */
            entrada.close();            
            
        } catch (IOException e) {
            
            System.out.println("No se ha encontrado el archivo");
            
        }               
    }    
}