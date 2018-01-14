 package java_hasta_el_video_100.video99; 
 
import java.awt.Dimension; 
import javax.swing.*; 

 /**
 *
 * @author german
 *  
 */
 
public class MarcoSpinnerII {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Frame_Spinner mimarco = new Frame_Spinner(); 
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);          
        
        mimarco.setVisible(true); 
    }    
}

 class Frame_Spinner extends JFrame{
    
    public Frame_Spinner(){
        
       setTitle("Probando Spinner");
        
       setBounds(550, 400, 550, 350);  
       
       Lamina_Spinner milamina = new Lamina_Spinner();
       
       add(milamina);
       
       setVisible(true);       
    }    
} 

class Lamina_Spinner extends JPanel{
    
    public Lamina_Spinner(){ 
        
        //JSpinner control = new JSpinner(new MiModeloJspinner(){            
        JSpinner control = new JSpinner(new SpinnerNumberModel(){
            
            public Object getNextValue(){

                return super.getPreviousValue();
            } 
            
            public Object getPreviousValue(){
                
                return super.getNextValue(); 
            }            
        });
        
        Dimension d = new Dimension(200, 20);
        
        control.setPreferredSize(d); 
        
        add(control);  
        
        }
                
     /*
    private class MiModeloJspinner extends SpinnerNumberModel{
        
           //constructor
            public MiModeloJspinner(){
                //con super llamamos a la clase padre SpinnerNumberModel 
                super(5,0,10,1);
        }
             
            aqui lo que hago es dar vuelta las flechitas para poder
            pulsar la de abajo y que de esa manera INCREMENTE LOS NUMEROS
             
            public Object getNextValue(){
                
                return super.getPreviousValue();
            } 
            
            public Object getPreviousValue(){
                
                return super.getNextValue();
            }
       } */
 } 
 
     