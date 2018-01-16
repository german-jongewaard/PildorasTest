package java_hasta_el_video_160.video103;     
 
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*; 
 
/**
 *
 * @author german
 *  
 */

public class Procesador_III {

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
        configura_menu("Arial", "fuente", "Arial",1,1);
        configura_menu("Calibri", "fuente", "Calibri",1,1);
        configura_menu("Verdana", "fuente", "Verdana",1,1);
        //---------------------------------------------------------
        configura_menu("Negrita", "estilo","", Font.BOLD,1);
        configura_menu("Cursiva", "estilo","", Font.ITALIC,1);
        //---------------------------------------------------------
        configura_menu("12", "tamaño","",1, 12);
        configura_menu("16", "tamaño","",1, 16);
        configura_menu("20", "tamaño","",1, 20);
        configura_menu("24", "tamaño","",1, 24);
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
    }
    
    public void configura_menu (String rotulo, String menu, String tipo_letra, int estilos, int tam){
        
        JMenuItem elem_menu = new JMenuItem(rotulo);
        //Construyo los elementos del menu
        if (menu=="fuente"){
            
            fuente.add(elem_menu);
        }else if (menu=="estilo"){
            
            estilo.add(elem_menu);
        }else if(menu=="tamaño"){
            
            tamagno.add(elem_menu);
        }        
        //Pongo A LA ESCUCHA a los elementos del menu!
        elem_menu.addActionListener(new Gestiona_Eventos(rotulo, tipo_letra, estilos, tam));        
    }
    
    private class Gestiona_Eventos implements ActionListener{

        String tipo_texto, menu;
        int estilo_letra, tamagno_letra;
        
        Gestiona_Eventos(String elemento, String texto2, int estilo2, int tam_letra){
            
            tipo_texto=texto2;
            
            estilo_letra = estilo2;
            
            tamagno_letra = tam_letra;
            
            menu = elemento;
            
        }
        
        @Override
        public void actionPerformed(ActionEvent e) {
         
         letras = miarea.getFont();
            
         if(menu == "Arial" || menu == "Calibri" || menu == "Verdana"){
                
                estilo_letra = letras.getStyle();        
                
                tamagno_letra = letras.getSize();             
                
         }else if(menu == "Negrita" || menu == "Cursiva"){
             
             if (letras.getStyle()==1 || letras.getStyle()==2){
                 
                 estilo_letra = 3;
             }
             
             tipo_texto = letras.getFontName();
             
             tamagno_letra = letras.getSize();
             
         }else if( menu == "12" || menu == "16" || menu == "20" || menu == "24"){
             
             estilo_letra = letras.getSize();
             
             tipo_texto = letras.getFontName();
                         
         }
         
        //miarea.setFont(new Font("Arial", Font.BOLD, 14));
          miarea.setFont(new Font(tipo_texto, estilo_letra, tamagno_letra)); 
         
         
         
         
        }
        
    }
    
    
    JTextPane miarea; 
    JMenu fuente, estilo, tamagno;
    Font letras;
    
}
 
     