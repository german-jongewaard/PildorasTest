package java_hasta_el_video_160.video120;
 
import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension; 
import java.awt.LayoutManager;
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
        
        setResizable(false); 
        
        add(milamina);
                        
        setVisible(true); 
    } 
}

class LaminaLibre extends JPanel{
    
    public LaminaLibre(){ 
         
        /* EnColumnas() es una clase creada por mi para colocar los elementos */
        setLayout(new EnColumnas());
        
        JLabel nombre = new JLabel("Nombre: ");        
        JLabel apellido = new JLabel("Apellido: ");        
        JLabel telefono = new JLabel("Teléfono: ");        
       
        
        JTextField c_nombre = new JTextField(10);        
        JTextField c_apellido = new JTextField(20);        
        JTextField c_telefono = new JTextField(10);
        
        /*nombre.setBounds(20, 20, 80, 10);
        
        c_nombre.setBounds(100, 17, 100, 20);
        
        apellido.setBounds(20, 60, 80, 15);
        
        c_apellido.setBounds(100, 55, 100, 20); */
        
        //segun como vaya colocando aqui los elementos, se muestra en la app.
        add(nombre);
        add(c_nombre);
        add(apellido);         
        add(c_apellido);
        add(telefono);         
        add(c_telefono);
    }
}


class EnColumnas implements LayoutManager{

   
    public void addLayoutComponent(String name, Component comp) { }

    
    public void removeLayoutComponent(Component comp) { }
  
    public Dimension preferredLayoutSize(Container parent) {return null; }

    
    public Dimension minimumLayoutSize(Container parent) {return null; }


    public void layoutContainer(Container micontenedor) {
     
        /* Aqui guardo el ANCHO de la ventana*/
        int d = micontenedor.getWidth();
        /* Aqui DIVIDO entre dos el ANCHO de la ventana*/
        x = d / 2;
        
        int contador = 0;
        
        //en la variable n tengo almacenado cuantos componentes hemos 
        //agregado a nuestro contenedor!!!
        int n = micontenedor.getComponentCount();
        
        for(int i=0; i<n;i++){
            
            contador ++;
            
            Component c = micontenedor.getComponent(i);
            /*  el primer componente se agrega a la izquierda del centro
            de la ventana y el siguiente del otro lado del centro*/
            c.setBounds(x-100, y, 100, 20);
            
            /*incremento X (en 100) para que el siguiente elemento se coloque 100 
            posiciones por delante de la posicion del elemento anterior*/            
            x += 100; 
            
            /*Si la division con el contador es igual a cero
            eso quiere decir que es PAR y agrega una pareja!*/
            if(contador%2 == 0){
                x = d / 2;
                y += 40;
                
            }
        }        
    }
    
    private int x;
    
    private int y = 20;    
}









 
     