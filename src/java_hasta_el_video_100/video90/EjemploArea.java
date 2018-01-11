 
package java_hasta_el_video_100.video90;  
 
 
import java.awt.event.*; 

import javax.swing.*;
 

 
public class EjemploArea {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoArea mimarco = new MarcoArea(); 
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);          
    }    
}

 class MarcoArea extends JFrame{
    
    public MarcoArea(){
        
       setTitle("Marco Area");
        
       setBounds(500, 300, 500, 400); 
       
       LaminaArea milamina = new LaminaArea();
      
       add(milamina);
      
       setVisible(true);         
    }    
}

class LaminaArea extends JPanel{ 
    
    public LaminaArea(){ 
/*
++++++++++      AREA DE TEXTO CREADA    +++++++++++++++++++++++++
*/
        miarea = new JTextArea(8,20);
        //Para poder tener el Scroll usamos:
        JScrollPane laminaConBarras = new JScrollPane(miarea); 
       
        //con setLineWrap controlamos que no se extienda el TextArea cuando escribimos
        miarea.setLineWrap(true);
        
        add(laminaConBarras);   
                
/*
++++++++++      El Boton    +++++++++++++++++++++++++
*/
        JButton miboton = new JButton("Dale");
        
        miboton.addActionListener(new GestionaArea());
        
        add(miboton);
    }
    
    private class GestionaArea implements ActionListener{
        
        public void actionPerformed(ActionEvent e) {
            
            System.out.println(miarea.getText());
        }
    }
    
    JTextArea miarea;
    
    
}
 