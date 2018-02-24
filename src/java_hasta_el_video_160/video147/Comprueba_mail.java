package java_hasta_el_video_160.video147;

import java.io.*;
import javax.swing.*;

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
            
        }catch(Exception e){
            
            System.out.println("La dirección de Email no es correcta");
            
            /* aqui obtengo una "pista" de que clase pudo haber 
            generado la Excepcion */
            e.printStackTrace();            
        }   
    }
                                           //aqui aplico mi Exception creada por mi
    static void examina_mail(String mail) throws Longitud_mail_erronea {        
        
        int arroba = 0;
        
         boolean punto = false;
         
         if(mail.length()<=3){
             /*
             //ya tengo instanciada mi excepcion
             ArrayIndexOutOfBoundsException mi_excepcion = new ArrayIndexOutOfBoundsException();
             
             throw mi_excepcion;
             */
          
            //esta es la forma de instanciar la excepcion, una buena práctica!
            // throw new EOFException();
            
          /*aqui llamo al constructor (pero esta clase tiene dos constructores) 
          o bien utilizo el constructor por defecto o bien si quiero 
            personalizar el mensaje de error tengo que utilizar el otro 
            constructor pasandole por parametro el mensaje de error */
            throw new Longitud_mail_erronea("El mail no puede tener menos de tres caracteres");
             
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

class Longitud_mail_erronea extends Exception{
    /* En principio cuando creo una clase de eception propia 
        debo tener dos contructores, sin parametro y con mensaje como en el caso de abajo */ 
    public Longitud_mail_erronea(){}
    
    public Longitud_mail_erronea(String msj_error){
        
        /* aqui llamo al constructor de la clase Padre que exttiende de Exception y le 
        paso por parametro el mensaje de error */
        super(msj_error);
        
    }
    
}
