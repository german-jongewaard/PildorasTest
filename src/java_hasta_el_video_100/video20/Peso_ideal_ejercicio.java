package java_hasta_el_video_100.video20;
/**
 *
 * @author Germán
 * 
 */
import javax.swing.JOptionPane; 

public class Peso_ideal_ejercicio {

    public static void main(String[] args) {
        
        String genero="";
        
        do{
            genero = JOptionPane.showInputDialog("Introduce tu género (H/M)");
            
            
        }while(genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
        
        int altura = Integer.parseInt(JOptionPane.showInputDialog("Introduce altura en cm"));
        
        int pesoideal = 0;
        
        if (genero.equalsIgnoreCase("H")){
            
            pesoideal = altura-110;
            
        }else if(genero.equalsIgnoreCase("M")){
            
            pesoideal = altura-120;
            
        }
        System.out.println("Tu peso ideal es: " + pesoideal);
        
    }
    
}
