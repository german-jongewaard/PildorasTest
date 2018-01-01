package java_hasta_el_video_100.video26;

/**
 *
 * @author Germán
 * 
 */

public class matriz_bidimencional {
    
    public static void main(String[] args) {       
        
        int [][]matrix ={
            {10, 15, 18, 19, 21},
            {34, 25, 87, 92, 73},
            {14, 22, 79, 56, 35},
            {69, 71, 90, 55, 30},           
        };
        
        for(int i=0; i < 4;i++){
            
            System.out.println();
            
          for(int j=0; j<5;j++){
              
              System.out.print( matrix[i][j] + " ");
              
          }
        }
        
        System.out.println(" ");
    }    
}
