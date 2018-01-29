package java_hasta_el_video_160.video116;     
 
import java.awt.BorderLayout;
import java.awt.Dimension; 
import javax.swing.*; 

/**
 *
 * @author german
 *  
 */
 
public class DisposicionMuelle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       MarcoMuelle mimarco = new MarcoMuelle();
       
       mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
        
    }    
}
 

class MarcoMuelle extends JFrame{
    
    public MarcoMuelle(){  
        
        setTitle("Marco en la caja");
        
        setBounds(200, 200, 1000, 400);  
        
        LaminaMuelle milamina = new LaminaMuelle();
        
        add(milamina);
        
        setVisible(true); 
    } 
}

class LaminaMuelle extends JPanel{
    public LaminaMuelle(){
        
        JButton boton1 = new JButton("Botón 1");
        
        JButton boton2 = new JButton("Botón 2");
        
        JButton boton3 = new JButton("Botón 3");
        
        SpringLayout milayout = new SpringLayout();
        
        setLayout(milayout);
        
        add(boton1);
        add(boton2);
        add(boton3);
        
        //construcción del muelle!!!
        Spring mimuelle = Spring.constant(0, 10, 100);
        
        Spring muelle_rigido = Spring.constant(10);
        
        milayout.putConstraint(SpringLayout.WEST, boton1, mimuelle, SpringLayout.WEST, this);
        
        milayout.putConstraint(SpringLayout.WEST, boton2, muelle_rigido, SpringLayout.EAST, boton1);
        
        milayout.putConstraint(SpringLayout.WEST, boton3, muelle_rigido, SpringLayout.EAST, boton2);
        
        milayout.putConstraint(SpringLayout.EAST, this, mimuelle, SpringLayout.EAST, boton3);
        
    }
}
 
     