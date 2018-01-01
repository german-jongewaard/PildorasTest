package java_hasta_el_video_100.video26_2;

/**
 *
 * @author Germán
 * 
 */ 

public class Array {
     
    public static void main(String[] args) {              
          
        int [][]matrix ={
            {10, 15, 18, 19, 21},
            {34, 25, 87, 92, 73},
            {14, 22, 79, 56, 35},
            {69, 71, 90, 55, 30},           
        };
        
        for(int[] fila:matrix){
            
            System.out.println();
            
            for(int z:fila){
                
                System.out.print(z + " ");
            }            
        }
        
        System.out.println();        
    }    
}
