 package java_hasta_el_video_100.video88; 
  
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;
 
 /**
 *
 * @author german
 * 
 */
 
public class Prueba {
    
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoPrueba mimarco = new MarcoPrueba(); 
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);          
    }    
}

 class MarcoPrueba extends JFrame{
    
    public MarcoPrueba(){
        
       setTitle("Comprobador de texto");
        
       setBounds(500, 300, 500, 350); 
       
       LaminaPrueba milamina = new LaminaPrueba();
      
       add(milamina);
      
       setVisible(true);         
    }    
}

class LaminaPrueba extends JPanel{
    
    public LaminaPrueba(){ 

        JTextField micampo = new JTextField(20);
        
        EscuchaTexto el_evento = new EscuchaTexto();
        
        Document midoc = micampo.getDocument();
        
        midoc.addDocumentListener(el_evento);
        
        add(micampo); 
    }
    
    private class EscuchaTexto implements DocumentListener{
     
        public void insertUpdate(DocumentEvent e) {
            
            System.out.println("Has insertado texto");
            
        }

       
        public void removeUpdate(DocumentEvent e) {
        
            System.out.println("Has borrado texto");
            
        }

        public void changedUpdate(DocumentEvent e) {
      
        }
    }
}
