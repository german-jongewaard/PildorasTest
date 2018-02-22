package java_hasta_el_video_160.video146;

import java.io.EOFException;
import javax.swing.JOptionPane;

/**
 *
 * @author German
 * 
 */

public class Comprueba_mail {
    
    public static void main(String[] args) {
        
        String el_mail =JOptionPane.showInputDialog("Introduce el mail");
        try{
            
            examina_mail(el_mail);
            
        }catch(EOFException e){
            
            System.out.println("La dirección de Email no es correcta");            
        }
    }
    
    static void examina_mail(String mail) throws EOFException {        
        
        int arroba = 0;
        
         boolean punto = false;
         
         if(mail.length()<=3){
             /*
             //ya tengo instanciada mi excepcion
             ArrayIndexOutOfBoundsException mi_excepcion = new ArrayIndexOutOfBoundsException();
             
             throw mi_excepcion;
             */
          //esta es la forma de instanciar la excepcion, una buena práctica!
             throw new EOFException();
             
         }else{
             
             
         
        
         
        for (int i=0;i<mail.length();i++ ){
            
            if(mail.charAt(i)=='@'){
                
                arroba++;
                
            }
            if(mail.charAt(i)=='.'){
                
                punto=true;
            
            }            
        }
        
        if(arroba==1&&punto==true){
            System.out.println("El mail es correcto");                    
        }else{
            System.out.println("No es correcto");
        } 
    }
  }
}
