 
package java_hasta_el_video_200.video166;

/**
 *
 * @author german
 */
public class MetodosGenericos_Dos {

    public static void main(String[] args) {
        // TODO code application logic here
        
        
        String nombres[] = {"Jose", "Ana", "Pepe"}; 
        
        System.out.println(MisMatrices_Dos.getMenor(nombres));
         
        }  
}


class MisMatrices_Dos {
    
    public static <T extends Comparable> T getMenor(T[]a){
        
        if(a==null || a.length==0){
            
            return null;
        }
        
        T elementoMenor=a[0];
        
        for(int i=1; i<a.length;i++){
            
            if(elementoMenor.compareTo(a[i])>0){
                
                elementoMenor=a[i];
                
            }
        }
        
        return elementoMenor;
    }
    
}
