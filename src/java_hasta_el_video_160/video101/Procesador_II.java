package java_hasta_el_video_160.video101;     
 
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*; 

/**
 *
 * @author german
 *  
 */
 
public class Procesador_II {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MenuProcesador_II mimarco = new MenuProcesador_II(); 
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);          
        
        mimarco.setVisible(true); 
    }    
}

 class MenuProcesador_II extends JFrame{
    
    public MenuProcesador_II(){
        
       setTitle("Probando Menu's");
        
       setBounds(500, 300, 550, 400);  
       
       LaminaProcesador milamina = new LaminaProcesador();
       
       add(milamina);
       
       setVisible(true);
       
    }    
} 

class LaminaProcesador extends JPanel{
    
    public LaminaProcesador(){ 
     
        setLayout(new BorderLayout());
        
        JPanel lamina_menu = new JPanel();
        
        //---------------------------------------------------------
        /*Aqui creo la barra*/
        JMenuBar mi_barra = new JMenuBar(); 
        
        /*Aqui creo los botones que van en la barra*/
        JMenu fuente = new JMenu("Fuente");        
        JMenu estilo = new JMenu("Estilo");        
        JMenu tamagno = new JMenu("Tamaño");
        
        //-------------   FUENTE SUB-MENU  ----------------------        
        JMenuItem arial = new JMenuItem("Arial");        
        JMenuItem calibri = new JMenuItem("Calibri");  
        
        /*Aqui creola instancia que le dara funcion a el tipo de letra*/
        Gestiona_menus tipo_letra = new Gestiona_menus();
        calibri.addActionListener(tipo_letra);
        
        JMenuItem verdana = new JMenuItem("Verdana");        
        
        /*Aqui agrego los tipos de letra a el boton Fuente!!!*/
        fuente.add(arial);        
        fuente.add(calibri);        
        fuente.add(verdana);
        
        //------------   ESTILO SUB-MENU  ----------------------       
        /*Aqui agrego llos tipos de negrita y cursiva a el submenu del ESTILO!*/
        JMenuItem negrita = new JMenuItem("Negrita");        
        JMenuItem cursiva = new JMenuItem("Cursiva");        
        
        /*Aqui agrego los tipos a el boton ESTILO!!!*/
        estilo.add(negrita);
        estilo.add(cursiva);
        
        //-----------   TAMAÑO SUB-MENU  ----------------------
        /*Aqui agrego a Fuentes el tamaño de letra*/                
        JMenuItem tam_12 = new JMenuItem("12");        
        JMenuItem tam_16 = new JMenuItem("16");        
        JMenuItem tam_20 = new JMenuItem("20");
        JMenuItem tam_24 = new JMenuItem("24");
        
        tamagno.add(tam_12);
        tamagno.add(tam_16);
        tamagno.add(tam_20);
        tamagno.add(tam_24);
        
        //--------------------------------------------------------  
        /*Aqui agrego los botones a la barra*/
        mi_barra.add(fuente);        
        mi_barra.add(estilo);        
        mi_barra.add(tamagno);
        
        /*Aqui agrego la barra a la LAMINA*/
        lamina_menu.add(mi_barra);
        /*Aqui muestro todo y coloco en el norte de la lamina*/
        add(lamina_menu, BorderLayout.NORTH);
        
        miarea = new JTextPane(); 
        
        add(miarea, BorderLayout.CENTER);
    }
    
    private class Gestiona_menus implements ActionListener{ 
         
        @Override
        public void actionPerformed(ActionEvent e) {
            
            miarea.setFont(new Font("Calibri", Font.PLAIN, 12));
        } 
    } 
    JTextPane miarea; 
}
 
     