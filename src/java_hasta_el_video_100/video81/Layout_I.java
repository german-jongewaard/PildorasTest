package java_hasta_el_video_100.video81;
 
import java.awt.FlowLayout;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author german
 * 
 */
 
public class Layout_I {
    
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
       
       //FlowLayout disposicion = new FlowLayout(FlowLayout.CENTER);
       
       //lamina.setLayout(disposicion);   
       
       //Una diferente disposicion a la que esta comentada arriba. pero hace lo mismo
       lamina.setLayout(new FlowLayout(FlowLayout.LEFT));
       add(lamina);         
    }    
}

class Panel_Layout extends JPanel  {

  public Panel_Layout(){
      
      add(new JButton("Amarillo"));
      
      add(new JButton("Rojo"));
      
      add(new JButton("Azul"));
  }
}

   