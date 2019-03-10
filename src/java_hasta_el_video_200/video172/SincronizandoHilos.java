package java_hasta_el_video_200.video172; 

 

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
        
        HilosVarios2 hilo2 = new HilosVarios2(hilo1);
        
        hilo2.start(); 
        
        hilo1.start();
        
        
        System.out.println("Las tareas han sido terminadas");
    }
    
}


class HilosVarios extends Thread{
    
    public void run(){
        
        for(int i=0; i<15;i++){
            
            System.out.println("Ejecutando hilo "+ getName() + " " + i);
            
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
        
        
    }
    
    
}

class HilosVarios2 extends Thread{
    
    //constructor
    public HilosVarios2(Thread hilo){
        
        //el campo de clase hilo es igual al constructor hilo.
        this.hilo = hilo;
        
    }
    
    public void run(){
        
        try {
            hilo.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        
        
        for(int i=0; i<15;i++){
            
            System.out.println("Ejecutando hilo "+ getName());
            
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            
        }
        
        
    }
    
    private Thread hilo;
    
    
}

