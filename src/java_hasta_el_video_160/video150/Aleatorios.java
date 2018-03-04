package java_hasta_el_video_160.video150;
 
import java.io.*;
import java.util.*;
import javax.swing.*;

/**
 *
 * @author German
 * 
 */

public class Aleatorios {
    
    public static void main(String[] args) {
     
        int elementos = Integer.parseInt(JOptionPane.showInputDialog("Introduce elementos de la matriz"));
        
        int num_aleat[] = new int[elementos];
        
        for(int i=0; i<num_aleat.length; i++){
            
/* en el programa original los parentecis de (int)Math.random()*100;  no estaban y el
programa funcionaba bien y compilaba sin mostrar error, al hacer Debuggin mostro que no hacia
correctamente el CASTING porque Math.random quitaba los numeros despues de la coma y enviaba el cero
            0,2374, al colocar los parentesis convierte ese numero en entero */
            
            num_aleat[i] = (int)(Math.random()*100);
            
        }
        
        for(int elem: num_aleat){
            
            System.out.println(elem);
            
        }
        
    }
    
}
