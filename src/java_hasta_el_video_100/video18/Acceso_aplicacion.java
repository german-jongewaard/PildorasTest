package java_hasta_el_video_100.video18;
/**
 *
 * @author Germán
 * 
 */
import java.util.*;
import javax.swing.JOptionPane; 
 
public class Acceso_aplicacion {

    
    public static void main(String[] args) {        
                 
        String clave = "German";
        
        String pass = "";
        
        while(clave.equals(pass) == false){
            
            pass = JOptionPane.showInputDialog("Introduce la contraseña");
            
            if (clave.equals(pass)==false){
                
                System.out.println("Contraseña incorrecta...");
                
            }
        
        }         
        
        System.out.println("Contraseña ACEPTADA!!!");
        
    }
    
    
}
