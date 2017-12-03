package java_hasta_el_video_100.video26_3;
/**
 *
 * @author Germán
 * 
 */ 
public class Ejemplo_chungo {
 
    public static void main(String[] args) {         
        
        double acumulado;
        double interes = 0.10;
        
        double [][] saldo = new double[6][5];
        
        for(int i=0; i<6; i++){
            
            saldo[i][0] = 10000;
            acumulado = 10000;
            
            for(int j=1; j<5; j++){
                
                acumulado = acumulado +(acumulado*interes);
                saldo[i][j] = acumulado;
            }
            interes=interes+0.01;
        }
        
        for(int h=0; h<6;h++){
            
            System.out.println();
            
            for(int k=0;k<5;k++){
                System.out.printf("%1.2f", saldo[h][k]);
                System.out.print(" ");
            }
        }
        System.out.println();
    }
    
}
