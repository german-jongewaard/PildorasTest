package java_hasta_el_video_100.video54;
 
import java.awt.Toolkit;
import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;

/**
 *
 * @author german
 * 
 */  

public class PruebaTemporizadorDos {

    public static void main(String[] args) {
        
        Reloj miReloj = new Reloj( );
        
        miReloj.enMarcha(3000, true);
        
        JOptionPane.showMessageDialog(null, "Pulsa acpetar para detener");
        
        System.exit(0);       
    }
}

class Reloj{
    
    public void enMarcha(int intervalo, boolean sonido){
        
        class DameLaHora2 implements ActionListener{
        
        public void actionPerformed(ActionEvent evento){
            
            Date ahora = new Date();
            System.out.println("Te pongo la hora cada 3 segundos " + ahora);
            
            if(sonido==true){
                
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
         
        ActionListener oyente = new DameLaHora2();
        
        Timer mitemporizador = new Timer(intervalo, oyente);
        
        mitemporizador.start();
    
    }    
}

