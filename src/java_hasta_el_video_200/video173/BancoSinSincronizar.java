package java_hasta_el_video_200.video173;

/**
 *
 * @author german
 */
public class BancoSinSincronizar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
         
    }
    
}


class Banco{
    
    
    public Banco(){
        
        cuentas = new double[100];
        
        for(int i=0; i<cuentas.length; i++){
            
            cuentas[i] = 2000;
         
           
        }
    }
    
    
    public void transferencias(int cuentaOrigen, int cuentaDestino, double cantidad){
        
        /*aquí controlo que la cantidad de la cuenta de origen 
        no sea menor que la cantidad que quiera mover a otra cuenta.
        Evalua que el saldo no es inferior a la transferencia */
        if(cuentas[cuentaOrigen]<cantidad){
            
            return;
        }       
         //imprime el hilo que va a realizar la transferencia.
        System.out.println(Thread.currentThread());
        
        cuentas[cuentaOrigen] -= cantidad; //dinero que sale de la cuenta Origen
        
                      //imprime dos decimales
        System.out.printf("%10.2f de %d para %d", cantidad, cuentaOrigen, cuentaDestino);
        
        cuentas[cuentaDestino] += cantidad; //suma la cantidad
                                //llamada al metodo que esta mas abajo
        System.out.printf("Saldo total: %10.2f/n", getSaldoTotal());
        
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
}