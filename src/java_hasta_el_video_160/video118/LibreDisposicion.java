package java_hasta_el_video_160.video118;   

import java.awt.BorderLayout;
import java.awt.Dimension; 
import javax.swing.*; 

/**
 *
 * @author german
 *  
 */
 
public class LibreDisposicion {

    public static void main(String[] args) {
        // TODO code application logic here
        
       MarcoLibre mimarco = new MarcoLibre();
       
       mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }    
}
 

class MarcoLibre extends JFrame{
    
    public MarcoLibre(){  
        
        setTitle("Marco Libre");
        
        setBounds(450, 200, 600, 400);  
        
        LaminaLibre milamina = new LaminaLibre();
        
        add(milamina);
        
        setVisible(true); 
    } 
}

class LaminaLibre extends JPanel{
    public LaminaLibre(){ 
        
        //Un layout nulo, una disposición LIBRE!!!
        setLayout(null);
        
        JLabel nombre = new JLabel("Nombre: ");
        
        JLabel apellido = new JLabel("Apellido: ");
        
        JTextField c_nombre = new JTextField(10);
        
        JTextField c_apellido = new JTextField(20);
        
        nombre.setBounds(20, 20, 80, 10);        
        c_nombre.setBounds(100, 17, 100, 20);        
        apellido.setBounds(20, 60, 80, 15);        
        c_apellido.setBounds(100, 55, 100, 20);
        
        
        add(nombre);
        add(apellido);
        add(c_nombre);
        add(c_apellido);
    }
}
 
     