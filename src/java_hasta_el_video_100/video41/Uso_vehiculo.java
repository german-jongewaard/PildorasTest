package java_hasta_el_video_100.video41;  

 /**
 *
 * @author german
 * 
 */

import javax.swing.*;

/* ESTE EJERCICIO ES DE LA CLASE 30 AHORA INCORPORO LA VENTANA JOptionPane */
 
public class Uso_vehiculo {

     
    public static void main(String[] args) {
        
       Coche micoche1 = new Coche();
       
       micoche1.establece_color("Rojo");
       
       Furgoneta mifurgoneta1 = new Furgoneta(7, 580);
       
       mifurgoneta1.establece_color("Azul");
       
       mifurgoneta1.configura_asientos("Si");
       
       mifurgoneta1.configura_climatizador("Si");
       
       System.out.println(micoche1.dime_datos_generales() + "\n" + micoche1.dime_color());
       
       System.out.println(mifurgoneta1.dime_datos_generales() +
               "\n" + mifurgoneta1.dimeDatosFurgoneta());
       
    }
    
}
