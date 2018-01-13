 package java_hasta_el_video_100.video95;   
 
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.*; 
import javax.swing.*;
 
 /**
 *
 * @author german
 * 
 */
 
public class Prueba_Combo {

    public static void main(String[] args) {
        // TODO code application logic here
        Marco_combo mimarco = new Marco_combo(); 
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);          
        
        mimarco.setVisible(true); 
    }    
}

 class Marco_combo extends JFrame{
    
    public Marco_combo(){
        
       setVisible(true);
       
       setTitle("Probando ComboBox con tipos de texto");
        
       setBounds(550, 300, 500, 300);  
       
       Lamina_combo milamina = new Lamina_combo();
       
       add(milamina);       
    }    
} 

class Lamina_combo extends JPanel{
    public Lamina_combo(){
          
        setLayout(new BorderLayout());
        
        texto = new JLabel("En un lugar de la mancha de cuyo nombre...");
        
        texto.setFont(new Font("Serif", Font.PLAIN, 18));
        
        add(texto, BorderLayout.CENTER);
        
        JPanel lamina_norte = new JPanel();
        
        micombo = new JComboBox();
        
        micombo.setEditable(true);
        
        micombo.addItem("Serif");
        micombo.addItem("SansSerif");
        micombo.addItem("Monospaced");
        micombo.addItem("Dialog");
        
        Evento_combo mievento = new Evento_combo();
        
        micombo.addActionListener(mievento);
        
        lamina_norte.add(micombo);
        
        add(lamina_norte, BorderLayout.NORTH);          
    } 
    
    private class Evento_combo implements ActionListener{
         
        public void actionPerformed(ActionEvent e) {
                        //Hago un Casting para que mi combo se convierta en String
            texto.setFont(new Font((String)micombo.getSelectedItem(), Font.PLAIN, 18));
        }       
    }
    
    private JLabel texto;    
    private JComboBox micombo;
}
     