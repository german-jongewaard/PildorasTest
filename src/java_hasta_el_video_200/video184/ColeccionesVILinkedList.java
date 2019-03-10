package java_hasta_el_video_200.video184;

import java.util.*; 

/**
 *
 * @author german
 */
 
public class ColeccionesVILinkedList {
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        LinkedList<String> personas = new LinkedList<String>();
                
        personas.add("Pepe");
        personas.add("Sandra");
        personas.add("Léa");
        personas.add("Mia");
        
        System.out.println(personas.size());        
        
        ListIterator<String> it = personas.listIterator();
        
        it.next();
        
        it.add("Juan");
        
        for(String persona: personas){
            System.out.println(persona);            
        }        
    }    
}

