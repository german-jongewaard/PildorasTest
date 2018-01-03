
package java_hasta_el_video_100.video53;

 
import java.awt.Toolkit;

import javax.swing.*;

import java.awt.event.*;

import java.util.*;

import javax.swing.Timer;

 

public class PruebaTemporizadorDos {

    public static void main(String[] args) {
        
        Reloj miReloj = new Reloj(3000, true);
        
        miReloj.enMarcha();
        
        JOptionPane.showMessageDialog(null, "Pulsa acpetar para detener");
        
        System.exit(0);
        

    }
}

class Reloj{
    
    public Reloj(int intervalo, boolean sonido){
        
        this.intervalo = intervalo;
        
        this.sonido = sonido;
        
    }
    
    public void enMarcha(){
        ActionListener oyente = new DameLaHora2();
        
        Timer mitemporizador = new Timer(intervalo, oyente);
        
        mitemporizador.start();
    
}
    
    
    //Campos privados
    private int intervalo;
    private boolean sonido;
    
    private class DameLaHora2 implements ActionListener{
        
        public void actionPerformed(ActionEvent evento){
            
            Date ahora = new Date();
            System.out.println("Te pongo la hora cada 3 segundos " + ahora);
            
            if(sonido==true){
                
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }
    
}

