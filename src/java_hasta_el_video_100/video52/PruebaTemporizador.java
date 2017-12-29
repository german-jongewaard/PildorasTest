package java_hasta_el_video_100.video52;

import javax.swing.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
 
/**
 *
 * @author german
 * 
 */

public class PruebaTemporizador {

    public static void main(String[] args) {
        

        DameLaHora oyente=new DameLaHora();
        
        Timer mitemporizador = new Timer(5000, oyente);
        
        mitemporizador.start();
        
        JOptionPane.showMessageDialog(null, "Pulsa acpetar para detener");
        
        System.exit(0);
    }
}

class DameLaHora implements ActionListener {
        
        public void actionPerformed(ActionEvent e){
            
            Date ahora = new Date();            
            /* Cada cinco segundos se pone la hora, se ejecuta en actionPerformed */
            System.out.println("Te pongo la hora cada 5 sg: " + ahora);
        }
        
    }
