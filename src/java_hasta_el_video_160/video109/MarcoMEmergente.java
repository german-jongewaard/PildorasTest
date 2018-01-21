 
package java_hasta_el_video_160.video109;     
 
  
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*; 
import javax.swing.text.*; 
import javax.swing.text.StyledEditorKit;
 
public class MarcoMEmergente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MenuProcesador_III mimarco = new MenuProcesador_III(); 
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);          
        
        mimarco.setVisible(true); 
    }    
}

 class MenuProcesador_III extends JFrame{
    
    public MenuProcesador_III(){
        
       setTitle("Probando PopUp Menu");
        
       setBounds(500, 300, 300, 250);  
       
       LaminaEmergenteM milamina = new LaminaEmergenteM();
       
       add(milamina);
       
       setVisible(true);
       
    }    
} 

class LaminaEmergenteM extends JPanel{
    
    public LaminaEmergenteM(){ 
        
        setLayout(new BorderLayout());        
        
        JPanel lamina_menu = new JPanel();
                
        JMenuBar mi_barra = new JMenuBar(); 
        
        JMenu fuente = new JMenu("Fuente");        
        JMenu estilo = new JMenu("Estilo");        
        JMenu tamagno = new JMenu("Tamaño");        
        
        mi_barra.add(fuente);        
        mi_barra.add(estilo);        
        mi_barra.add(tamagno); 
        
        /*Aqui agrego la barra a la LAMINA*/
        lamina_menu.add(mi_barra);
        /*Aqui muestro todo y coloco en el norte de la lamina*/
        add(lamina_menu, BorderLayout.NORTH);
        
        JTextPane miarea = new JTextPane(); 
        
        add(miarea);
        
        
        /* -------------------------------------------------  */
        
        JPopupMenu emergente = new JPopupMenu();
        
        JMenuItem opcion1 = new JMenuItem("Opción 1");
        
        JMenuItem opcion2 = new JMenuItem("Opción 2");
         
        JMenuItem opcion3 = new JMenuItem("Opción 3");
        
        emergente.add(opcion1);
        
        emergente.add(opcion2);
        
        emergente.add(opcion3   );
        
        miarea.setComponentPopupMenu(emergente);
        
      
    }
     
}
 
     