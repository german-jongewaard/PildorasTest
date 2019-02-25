package java_hasta_el_video_160.video156;

import java.io.*;

public class escribiendo_leyendo_bytes {

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
        
        crea_fichero(datos_entrada);
        
    }
    
    static void crea_fichero(int datos_nuevo_fichero[]){
        
        try{
            
            FileOutputStream fichero_nuevo = new FileOutputStream("/home/german/Documentos/imagen_copia.jpg");
            
            for(int i=0; i<datos_nuevo_fichero.length; i++){
                
                fichero_nuevo.write(datos_nuevo_fichero[i]);
                
            }
            
            fichero_nuevo.close();
            
        }catch(IOException e){
            
            System.out.println("Error al crear el archivo");
            
        }
    }
    
}
