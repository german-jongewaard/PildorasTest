package java_hasta_el_video_100.video11;

/**
 *
 * @author German
 * 
 */
public class Strings {
     
    public static void main(String[] args) {
        
        String nombre = "German Jongewaard";
         
         System.out.println("Mi Nombre es: " + nombre);
         
         System.out.println("Mi nombre tiene " + nombre.length() + " letras");
         
         System.out.println("La primera letra de " +  nombre + " es " + nombre.charAt(0));
         
         
         int ultima_letra;
         
         ultima_letra = nombre.length();       
                 
         System.out.println("La ultima letra es la " + nombre.charAt(ultima_letra-1));
    }
    
}
