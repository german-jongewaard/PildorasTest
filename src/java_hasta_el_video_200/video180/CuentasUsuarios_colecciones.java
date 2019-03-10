package java_hasta_el_video_200.video180;

import java.util.*;

/**
 *
 * @author german
 */
public class CuentasUsuarios_colecciones {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Cliente_colecciones cl1 = new Cliente_colecciones("Antonio Banderas", "00001", 200000);
        
        Cliente_colecciones cl2 = new Cliente_colecciones("Rafael Nadal", "00002", 250000);
        
        Cliente_colecciones cl3 = new Cliente_colecciones("Penelope Cruz", "00003", 300000);
        
        Cliente_colecciones cl4 = new Cliente_colecciones("Julio Iglesias", "00004", 500000);
        
        Set <Cliente_colecciones> clientesBanco = new HashSet<Cliente_colecciones>();
        
        clientesBanco.add(cl1);
        clientesBanco.add(cl2);
        clientesBanco.add(cl3);
        clientesBanco.add(cl4);
        
        for(Cliente_colecciones myClient: clientesBanco){
            
            System.out.println(myClient.getNombre() + " " 
                             + myClient.getN_cuenta() + " " 
                             + myClient.getSaldo());
            
        }        
    }    
}

 
