package java_hasta_el_video_200.video171;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author german
 */
public class SincronizandoHilos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        HilosVarios hilo1 = new HilosVarios();
        
        HilosVarios hilo2 = new HilosVarios();
        
        hilo1.start();
        
        try {
            hilo1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        hilo2.start();
        
        try {
            hilo2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        System.out.println("Las tareas han sido terminadas");
    }
    
}


class HilosVarios extends Thread{
    
    public void run(){
        
        for(int i=0; i<15;i++){
            
            System.out.println("Ejecutando hilo "+ getName());
            
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
        
        
    }
    
    
}
