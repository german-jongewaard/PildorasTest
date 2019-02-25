package java_hasta_el_video_160.video155;

import java.io.*;

public class leyendo_escribiendo_bytes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int contador = 0;
                    /* la cantidad de bytes de la imagen 1773027*/
        int datos_entrada[] = new int[1773027];
        
        try{
            
            FileInputStream archivo_lectura = new FileInputStream("/home/german/Documentos/imagen.jpg");
            
            boolean final_ar = false;
            
            // !final_ar es como decir final_ar == false
            while(!final_ar){
                
                int byte_entrada = archivo_lectura.read();
                
                if(byte_entrada != -1){
                    
                    datos_entrada[contador] = byte_entrada;
                    
                }else{                    
                    
                    final_ar = true;
                    
                }
                
                System.out.println(datos_entrada[contador]);
                
                contador++;
                
            }
            
            archivo_lectura.close();
            
        }catch(IOException e){
            
             System.out.println("No se ha encontrado el archivo");
             
        }
        
        System.out.println(contador);
        
    }
    
}
