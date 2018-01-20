package java_hasta_el_video_160.video108;      
 
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*; 
import javax.swing.text.*; 
import javax.swing.text.StyledEditorKit;

/**
 *
 * @author german
 *  
 */
 
public class MarcoMenuNuevo {
    
    public static void main(String[] args) {
        // TODO code application logic here
        MenuProcesador_III mimarco = new MenuProcesador_III(); 
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);          
        
        mimarco.setVisible(true); 
    }    
}

 class MenuProcesador_III extends JFrame{
    
    public MenuProcesador_III(){
        
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
        fuente = new JMenu("Fuente");        
        estilo = new JMenu("Estilo");        
        tamagno = new JMenu("Tamaño");        
        
        //---------------------------------------------------------
        configura_menu("Arial", "fuente", "Arial",1,1, "");
        configura_menu("Calibri", "fuente", "Calibri",1,1, "");
        configura_menu("Verdana", "fuente", "Verdana",1,1, "");
        //---------------------------------------------------------
        configura_menu("Negrita", "estilo","", Font.BOLD,1, "src/java_hasta_el_video_160/video107_1/graficos/negrita.gif");
        configura_menu("Cursiva", "estilo","", Font.ITALIC,1, "src/java_hasta_el_video_160/video107_1/graficos/cursiva.gif"); 
        
     /* JCheckBoxMenuItem negrita = new JCheckBoxMenuItem("Negrita", new ImageIcon("src/video107_1/graficos/negrita.gif"));
        
        JCheckBoxMenuItem cursiva = new JCheckBoxMenuItem("Cursiva", new ImageIcon("src/video107_1/graficos/cursiva.gif"));
        
        negrita.addActionListener(new StyledEditorKit.BoldAction());
        
        cursiva.addActionListener(new StyledEditorKit.ItalicAction());
        
        estilo.add(negrita);
        
        estilo.add(cursiva);
     */   
        
        //---------------------------------------------------------
        /*
        configura_menu("12", "tamaño","",1, 12, "");
        configura_menu("16", "tamaño","",1, 16, "");
        configura_menu("20", "tamaño","",1, 20, "");
        configura_menu("24", "tamaño","",1, 24, "");
        */
        ButtonGroup tamagno_letra = new ButtonGroup();
        
        JRadioButtonMenuItem doce = new JRadioButtonMenuItem("12");        
        JRadioButtonMenuItem dieciseis = new JRadioButtonMenuItem("16");        
        JRadioButtonMenuItem veinte = new JRadioButtonMenuItem("20");        
        JRadioButtonMenuItem veinticuatro = new JRadioButtonMenuItem("24");
        
        veinticuatro.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, InputEvent.CTRL_DOWN_MASK));
        
        tamagno_letra.add(doce);
        tamagno_letra.add(dieciseis);
        tamagno_letra.add(veinte);
        tamagno_letra.add(veinticuatro);
        
       doce.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", 12));
       
       dieciseis.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", 16));
       
       veinte.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", 20));
       
       veinticuatro.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", 24));
       
       tamagno.add(doce);
       tamagno.add(dieciseis);
       tamagno.add(veinte);
       tamagno.add(veinticuatro);
        //---------------------------------------------------------
        
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
        
        
        /* --------   Menu PopUp  --------------------  */
        
        JPopupMenu emergente = new JPopupMenu(); 
        
        JMenuItem negritaEmergente = new JMenuItem("Negrita");
                        
        JMenuItem cursivaEmergente = new JMenuItem("Cursiva"); 
                 
        negritaEmergente.addActionListener(new StyledEditorKit.BoldAction());
        
        cursivaEmergente.addActionListener(new StyledEditorKit.ItalicAction());
        
        emergente.add(negritaEmergente);
        
        emergente.add(cursivaEmergente);
        
        miarea.setComponentPopupMenu(emergente);
    }
    
    public void configura_menu (String rotulo, String menu, String tipo_letra, int estilos, int tam, String ruta_icono){
        
        JMenuItem elem_menu = new JMenuItem(rotulo, new ImageIcon(ruta_icono));
        //Construyo los elementos del menu
        if (menu=="fuente"){
            
            fuente.add(elem_menu);
            
            if (tipo_letra == "Arial"){
                
                elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Arial"));
                
            }else if (tipo_letra == "Calibri"){
                
                 elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Calibri"));
                
            }else if (tipo_letra == "Verdana"){
            
                 elem_menu.addActionListener(new StyledEditorKit.FontFamilyAction("cambia_letra", "Verdana"));
            
            } 
            
         }else if (menu=="estilo"){
            
            estilo.add(elem_menu);
            
            if(estilos == Font.BOLD){
                
                elem_menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, InputEvent.CTRL_DOWN_MASK));
                
                elem_menu.addActionListener(new StyledEditorKit.BoldAction());
                
            }else if (estilos == Font.ITALIC){
                
                elem_menu.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_K, InputEvent.CTRL_DOWN_MASK));
                
                elem_menu.addActionListener(new StyledEditorKit.ItalicAction());
            } 
              
        }else if(menu=="tamaño"){
            
            tamagno.add(elem_menu);
            
            elem_menu.addActionListener(new StyledEditorKit.FontSizeAction("cambia_tamaño", tam));
        }        
 }
      
    JTextPane miarea; 
    JMenu fuente, estilo, tamagno, linea;
    Font letras;
    
}
 
     