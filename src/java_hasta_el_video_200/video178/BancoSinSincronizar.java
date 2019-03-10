package java_hasta_el_video_200.video178;

import java.util.concurrent.locks.*;

/**
 *
 * @author german
 */
public class BancoSinSincronizar {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Banco b = new Banco();
        
        for(int i=0; i<100; i++){
            
            EjecucionTransferencias r = new EjecucionTransferencias(b, i, 2000);
            
            Thread t= new Thread(r);
            
            t.start();
        }       
    }    
}


class Banco{
    
    public Banco(){
        
        cuentas = new double[100];
        
        for(int i=0; i<cuentas.length; i++){
            
            cuentas[i] = 2000;            
        }
        
        /*¿Que digo aqui? que el bloqueo tiene que establecerse en base a una condicion, 
        y esa condicion la llamo saldo suficiente. Un bloqueo establecido con una condicion 
        y que se almacena en campo tipo saldoSuficiente y esto me va a permitir este campo 
        como condicion en cualquier metodo que pertenezca a esta clase*/
        //saldoSuficiente = cierreBanco.newCondition();
    }
    
    
    public synchronized void transferencias(int cuentaOrigen, int cuentaDestino, double cantidad) throws InterruptedException{
        
        //cuando un Hilo llama este metodo lo que hace es Bloquearlo, hasta que termine de trabajar ese Hilo
        //cierreBanco.lock();
        
            // try{

             /*aquí controlo que la cantidad de la cuenta de origen 
             no sea menor que la cantidad que quiera mover a otra cuenta.
             Evalua que el saldo no es inferior a la transferencia */
        while(cuentas[cuentaOrigen]<cantidad){
          /* aqui digo: que mientras esta condicion (while) sea VERDAD, el HILO permanezca a la espera*/  
               //saldoSuficiente.await(); //el hilo se pone a la espera, 
                                        //a demas de ponerse a la espera, se LIBERA el bloqueo (lock())

                                   
                                   
            wait(); // indico que el hilo espere.
                                    
                                   
            
            
        } 
     
         //imprime el hilo que va a realizar la transferencia.
        System.out.println(Thread.currentThread());
        
        cuentas[cuentaOrigen] -= cantidad; //dinero que sale de la cuenta Origen
        
                      //imprime dos decimales
        System.out.printf("Envío %10.2f € de la cuenta: %d para la cuenta: %d ", cantidad, cuentaOrigen, cuentaDestino);
        
        cuentas[cuentaDestino] += cantidad; //suma la cantidad
                                //llamada al metodo que esta mas abajo
        System.out.printf("Saldo total: %10.2f/n ", getSaldoTotal());  
        
        
       // saldoSuficiente.signalAll();
       
        notifyAll(); /* Cuando se termine de realizar la transferencia, este 
                        metodo de la clase Object, lo que hace es informr a toso los hilos 
                        que puedan estar a la espera, que ya se ha terminado de ejecutar.
        
            En conclucion, indica a los hilos que despierten o que notifiquen a los hilos  de que ya se ha terminado la espera.*/
        
    //}//finally{
            //cuando el Hilo termina de trabajar se desbloquea
           // cierreBanco.unlock();
            
       // }
    
     }
    
    
    public double getSaldoTotal(){
        
        double suma_cuentas = 0;
        
        for(double a: cuentas){ //en el for each almaceno en el valor a las cuentas.
            
            suma_cuentas += a; 
        }        
        return suma_cuentas;        
    }    
    //private:campo de clase encapsulado.  final: constante para que no se pueda modificar.
    private final double[] cuentas;
    
    //private Lock cierreBanco = new ReentrantLock();
    
    //private Condition saldoSuficiente; 
    
}

class EjecucionTransferencias implements Runnable{
    
    public EjecucionTransferencias(Banco b, int de, double max){ 
        
        banco = b;
        
        deLaCuenta = de;
        
        cantidadMax = max;   
    }

    @Override
    public void run() {
        
    try {
        while(true){
                        /*casting, porque random da numero 
            entero por ejemplo si tengo un numero 0,259789 
            Math.random desplaza la coma dos posiciones a la 
            derecha y devolveria el 25*/
            int paraLaCuenta = (int)(100*Math.random());
            /* Cantidad maxima va a ser 2000, eso quiere decir 
            que el numero que de el random se desplaza 3 lugares, 
            por ejemplo0,7854112 quedaria en 785 y luego por(*) 2 */
            double cantidad = cantidadMax*Math.random();
            
            banco.transferencias(deLaCuenta, paraLaCuenta, cantidad); 
            
                Thread.sleep((int)(Math.random()*10));
            }  
             
        }catch (InterruptedException e) {
                e.printStackTrace();
            } 
    }  
    
    
    private Banco banco;
    
    private int deLaCuenta;
    
    private double cantidadMax;
    
    
}

