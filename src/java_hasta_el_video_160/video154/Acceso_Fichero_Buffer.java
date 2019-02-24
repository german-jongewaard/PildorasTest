package java_hasta_el_video_160.video154;

/**
 *
 * @author german
 */

import java.io.*;


public class Acceso_Fichero_Buffer {

   
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
            
           entrada = new FileReader("/home/german/Documentos/text_nuevo");
           /* Aqui almaceno en un Buffer (memoria interna) este fichero de texto
              el BufferedReader tiene que llevar un elemento FileReader que en 
              este caso seria "entrada" */
           BufferedReader mibuffer = new BufferedReader(entrada);      
     
            String linea = "";
            
            while(linea != null){
                             
             /* antes leia caracter a caracter (char) ahora voy a leer linea a linea, en la api de Java
                readLine(), lee linea a linea y pasa a la siguiente linea cuando detecta un "\n" 
                salto de lineao o un "\r" retorno de carro */
                 
                linea = mibuffer.readLine();
                
                if (linea != null)
                System.out.println(linea);
            
            }            
            
        } catch (IOException e) {
            
            System.out.println("No se ha encontrado el archivo");
            
        }finally{
            
            try{
                
            /* aquí cierro la apertura del archivo! */
            entrada.close();
                
                
            }catch(IOException e){
                
                e.printStackTrace();
                
            }            
        }       
    } 
    
    FileReader entrada;
}