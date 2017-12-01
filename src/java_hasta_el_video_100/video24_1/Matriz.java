package java_hasta_el_video_100.video24_1;
/**
 *
 * @author Germán
 * 
 */

public class Matriz {
    
    public static void main(String[] args) {
        
        int [] matriz_aleatorios = new int[150];
        
        for(int i=0; i<matriz_aleatorios.length;i++){
            
            matriz_aleatorios[i]=(int)Math.round(Math.random()*100);            
        }
        
        for(int numeros:matriz_aleatorios){
            
            System.out.print(numeros + " ");
            
        }        
    }    
}
