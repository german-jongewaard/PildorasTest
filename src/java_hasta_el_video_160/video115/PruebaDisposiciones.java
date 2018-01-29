package java_hasta_el_video_160.video115;     
 
import java.awt.BorderLayout;
import java.awt.Dimension; 
import javax.swing.*; 

/**
 *
 * @author german
 *  
 */
 
public class PruebaDisposiciones {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
       MarcoCaja mimarco = new MarcoCaja();
       
       mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       
       mimarco.setVisible(true); 
    }    
}
 

class MarcoCaja extends JFrame{
    
    public MarcoCaja(){  
        
        setTitle("Marco en la caja");
        
        setBounds(400, 250, 600, 400);  
         
        //Primera caja Horizontal
        JLabel rotulo1 = new JLabel("Nombre:");
         
        JTextField texto1 = new JTextField(10);
         
        texto1.setMaximumSize(texto1.getPreferredSize());
        //aqui creo la Caja
        Box cajaH1 = Box.createHorizontalBox();
         
        //Aqui agrego todo al contenedor 1 Box
        cajaH1.add(rotulo1);
        cajaH1.add(Box.createHorizontalStrut(10));
        cajaH1.add(texto1);
         
        //-------------------------------------------------
        //Segunda caja Horizontal
        JLabel rotulo2 = new JLabel("Contraseña:");
        JTextField texto2 = new JTextField(10);
        texto2.setMaximumSize(texto1.getPreferredSize());
        Box cajaH2 = Box.createHorizontalBox();
         
        //Aqui agrego todo al contenedor 2 Box
        cajaH2.add(rotulo2);
        cajaH2.add(Box.createHorizontalStrut(10));
        cajaH2.add(texto2);
        
        //-------------------------------------------------
        //Segunda caja Horizontal
        JButton boton1 = new JButton("Ok");
        JButton boton2 = new JButton("Cancelar");
        texto2.setMaximumSize(texto1.getPreferredSize());
        Box cajaH3 = Box.createHorizontalBox();
         
        //Aqui agrego todo al contenedor 2 Box
        cajaH3.add(boton1);
        //Adapta los botones a la caja.
        cajaH3.add(Box.createHorizontalGlue());
        cajaH3.add(boton2);
        
        //Ahora creo un contenedor PADRE VERTICAL para agregar todas las cajas.
        Box cajaVertical = Box.createVerticalBox();
        //aqui agrego las cajas Horizontales al contenedor PADRE Vertical
        cajaVertical.add(cajaH1);
        cajaVertical.add(cajaH2);
        cajaVertical.add(cajaH3);
        
        //aqui agrego el contenedor PADRE con todos sus elementos al Panel
        add(cajaVertical, BorderLayout.CENTER);
        
    }

}
 
     