package java_hasta_el_video_100.video80;
 
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author german
 * 
 */
 
public class VariosOyentes {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Marco_Principal mimarco = new Marco_Principal(); 
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        mimarco.setVisible(true);
    }    
}

 class Marco_Principal extends JFrame{
    
    public Marco_Principal(){
        
        setTitle("Prueba Varios");
        
       setBounds(900, 100, 300, 200);
       
       Lamina_Principal lamina = new Lamina_Principal();
       
       add(lamina);         
    }    
}

class Lamina_Principal extends JPanel  {

  public Lamina_Principal(){
      
      JButton boton_nuevo = new JButton("Nuevo");
      
      add(boton_nuevo);
      
      boton_cerrar = new JButton("Cerrar todo");
      
      add(boton_cerrar);
      
      OyenteNuevo miOyente = new OyenteNuevo();
      
      boton_nuevo.addActionListener(miOyente);      
  }
  
  private class OyenteNuevo implements ActionListener {
        
        public void actionPerformed(ActionEvent e) {
            
            Marco_Emergente marco = new Marco_Emergente(boton_cerrar);
            
            marco.setVisible(true);
        } 
  }
  
      JButton boton_cerrar;
}

class Marco_Emergente extends JFrame{
    //Cada vez que llame a la ventana
    public Marco_Emergente(JButton boton_de_principal){
        //El contador se incrementa
        contador++;
        // y coloca, Ventana 1, ventanda 2, etc...
        setTitle("Ventana " + contador);
    
        setBounds(40*contador, 40*contador, 300, 150);
        
        Cierra_Todos oyenteCerrar = new Cierra_Todos();
        
        boton_de_principal.addActionListener(oyenteCerrar);  
    }
    
    private class Cierra_Todos implements ActionListener{
        
        public void actionPerformed(ActionEvent e) {
            
            dispose();            
        }         
    }
    
    private static int contador = 0;
    
}


     

 