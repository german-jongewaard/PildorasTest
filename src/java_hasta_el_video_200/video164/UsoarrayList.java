package java_hasta_el_video_200.video164;

/**
 *
 * @author german
 */

import java.io.*;


public class UsoarrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList archivos = new ArrayList(4);
        
         archivos.add("Germán");
        
        archivos.add("Miriam");
        
        archivos.add("Juan");
        
        archivos.add("Ana");
        
        archivos.add(new File("gestion_Pedidos.accdb"));
                
        String nombrePersona = (String)archivos.get(2);  
        
        //archivos.add(new File("gestion_Pedidos.accdb"));
       
       // File nombrePersona = (File)archivos.get(0);
        
        System.out.println(nombrePersona);
        
        
    }
    
}
