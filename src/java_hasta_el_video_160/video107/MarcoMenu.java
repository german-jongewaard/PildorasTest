 package java_hasta_el_video_160.video107;     
  
import java.awt.Dimension; 
import javax.swing.*; 

 /**
 *
 * @author german
 *  
 */
 
public class MarcoMenu {

    public static void main(String[] args) {
        // TODO code application logic here
        MenuFrame mimarco = new MenuFrame(); 
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);          
        
        mimarco.setVisible(true); 
    }    
}

 class MenuFrame extends JFrame{
    
    public MenuFrame(){
        
       setTitle("Probando Menu's");
        
       setBounds(500, 300, 550, 400);  
       
       MenuLamina milamina = new MenuLamina();
       
       add(milamina);
       
       setVisible(true);       
    }    
} 

class MenuLamina extends JPanel{
    
    public MenuLamina(){ 
    
        JMenuBar mibarra = new JMenuBar();
        
        /* Menú principal / Barra de Menú */
        JMenu archivo = new JMenu("Archivo");
        
        JMenu edicion = new JMenu("Edicion");
        
        JMenu herramientas = new JMenu("Herramientas");
        
        JMenu opciones = new JMenu("Opciones");
        
        /* Sub-Menu de Archivo */        
        JMenuItem guardar = new JMenuItem("Guardar", new ImageIcon("src/java_hasta_el_video_160/video107/graficos/guardar.gif"));
        
        JMenuItem guardar_como = new JMenuItem("Guardar como", new ImageIcon("src/java_hasta_el_video_160/video107/graficos/guardar.gif"));
        
        /* Sub-Menu de Edición */        
        JMenuItem cortar = new JMenuItem("Cortar", new ImageIcon("src/java_hasta_el_video_160/video107/graficos/cortar.gif"));
        
        JMenuItem copiar = new JMenuItem("Copiar", new ImageIcon("src/java_hasta_el_video_160/video107/graficos/copiar.gif"));
        
        JMenuItem pegar = new JMenuItem("Pegar", new ImageIcon("src/java_hasta_el_video_160/video107/graficos/pegar.gif"));
        
        /* Sub-Menu de Herramientas */        
        JMenuItem generales = new JMenuItem("Generales", new ImageIcon("src/java_hasta_el_video_160/video107/graficos/tools.gif"));
        
        /* Sub-Menu del Sub-menú de Edicion */
        JMenuItem opcion1 = new JMenuItem("Opcion1", new ImageIcon("src/java_hasta_el_video_160/video107/graficos/negrita.gif"));
        
        JMenuItem opcion2 = new JMenuItem("Opcion2", new ImageIcon("src/java_hasta_el_video_160/video107/graficos/negrita1.gif"));
        
        /* Aparecen segun su ORDEN!!! */  
        /* Sub menu opciones */   
        opciones.add(opcion1);        
        opciones.add(opcion2); 
        
        /* Archivo */   
        archivo.add(guardar);        
        archivo.add(guardar_como);
        
        /* Edicion */  
        edicion.add(cortar);        
        edicion.add(copiar);        
        edicion.add(pegar);         
        /* Pintar una linea de separación con: addSeparator();*/ 
        edicion.addSeparator();
        edicion.add(opciones);
        
        /* Herramientas */ 
        herramientas.add(generales);
        
        mibarra.add(archivo);        
        mibarra.add(edicion);        
        mibarra.add(herramientas);        
        add(mibarra);
    }
}
 
     