
package java_hasta_el_video_100.video82;
 
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.*;
 
public class Layout_II {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Marco_Layout mimarco = new Marco_Layout(); 
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        mimarco.setVisible(true);
    }
    
}

 class Marco_Layout extends JFrame{
    
    public Marco_Layout(){
        
       setTitle("Prueba Acciones");
        
       setBounds(400, 150, 600, 300);
       
       Panel_Layout lamina = new Panel_Layout();
       
        //Ejemplo con BorderLayout
       
       Panel_Layout2 lamina2 = new Panel_Layout2();
        
       add(lamina, BorderLayout.NORTH);
       add(lamina2, BorderLayout.SOUTH);
         
    }    
}

class Panel_Layout extends JPanel  {

  public Panel_Layout(){
                //Instancio la clase BorderLayout
      setLayout(new FlowLayout(FlowLayout.LEFT));
      
      add(new JButton("Amarillo"));
      
      add(new JButton("Rojo"));
      
      
  }
}

class Panel_Layout2 extends JPanel{
    
    public Panel_Layout2(){
        
      setLayout(new BorderLayout());
        
      add(new JButton("Azul"), BorderLayout.WEST);
      
      add(new JButton("Verde"), BorderLayout.EAST);
      
      add(new JButton("Negro"), BorderLayout.CENTER); 
    }
}

   