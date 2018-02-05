package java_hasta_el_video_160.video123_practica_mia;
 
import java_hasta_el_video_100.video83.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author german
 * 
 */
 
public class Practica {
    
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoPractica mimarco = new MarcoPractica(); 
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        mimarco.setVisible(true);
    }
    
}

 class MarcoPractica extends JFrame{
    
    public MarcoPractica(){
        
       setTitle("Práctica");
        
       setBounds(500, 300, 450, 300); 
       
       LaminaPractica milamina = new LaminaPractica();
      
       add(milamina);
      
      // pack();
         
    }    
}

class LaminaPractica extends JPanel{
    
    public LaminaPractica(){
        
        setLayout(new BorderLayout());
        
        milamina1 = new JPanel();
        
        milamina1.setLayout(new GridLayout(2,3));
        
        
    }
     private JPanel milamina1;
}
     
    
class LaminaPractica2 extends JPanel{
    
    public LaminaPractica2(){
        
        milamina2 = new JPanel();
        
        milamina2.setLayout(new FlowLayout());
        
        add(milamina2, FlowLayout.CENTER);
        
           
    }
    //Creo un metodo que se encarga de agregar los botones a la lamina.
    private void ponerBoton (String rotulo, ActionListener oyente){
        
        JButton boton =new JButton(rotulo);
        
        boton.addActionListener(oyente);
        
        milamina2.add(boton); 
    } 
    
    private JPanel milamina2;
 }
     
    
    
 
 