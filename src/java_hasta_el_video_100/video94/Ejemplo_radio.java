 
package java_hasta_el_video_100.video94;  

 
import java.awt.BorderLayout;
import java.awt.Font;

import java.awt.event.*; 

import javax.swing.*;
 

 
public class Ejemplo_radio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Marco_radio mimarco = new Marco_radio(); 
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);          
        
        mimarco.setVisible(true); 
    }    
}

 class Marco_radio extends JFrame{
    
    public Marco_radio(){
        
       setVisible(true);
       
       setTitle("Probando Radio Button");
        
       setBounds(550, 300, 500, 300); 
       
       
       
       Lamina_radio milamina = new Lamina_radio();
       
       add(milamina);
       
    }    
} 


class Lamina_radio extends JPanel{
    public Lamina_radio(){
         
        setLayout(new BorderLayout());
        
        texto = new JLabel("En un lugar de la Mancha de cuyo nombre...");
        
        add(texto, BorderLayout.CENTER);
        
        //primero creo un grupo y luego los botones que van dentro de el
         ButtonGroup migrupo1 = new ButtonGroup();
         
          
         
         boton1 = new JRadioButton("Pequeño", false);
         
         boton2 = new JRadioButton("Mediano", true); //al ser true el boton aparece activado
         
         boton3 = new JRadioButton("Grande", false);         
         
         boton4 = new JRadioButton("Muy grande", false);
         
         JPanel lamina_radio = new JPanel(); 
          
         migrupo1.add(boton1);
         
         migrupo1.add(boton2);
         
         migrupo1.add(boton3);
         
         migrupo1.add(boton4); 
         
         //aqui pongo el BOTON A LA ESCUCHA!!!!!!
         Evento_radio mievento = new Evento_radio();
         
         boton1.addActionListener(mievento);
         boton2.addActionListener(mievento);
         boton3.addActionListener(mievento);
         boton4.addActionListener(mievento);
         
         
         /*
         aqui agrego los botones uno a una a la lamina, el grupo jamas puede agregarse.
         */
         lamina_radio.add(boton1);
         
         lamina_radio.add(boton2);
         
         lamina_radio.add(boton3);
         
         lamina_radio.add(boton4); 
         
         add(lamina_radio, BorderLayout.SOUTH);
    }
    
    private class Evento_radio implements ActionListener{

        
        public void actionPerformed(ActionEvent e) {

            if(e.getSource()==boton1){
                texto.setFont(new Font("Serif", Font.PLAIN, 10));
            }else if(e.getSource()==boton2){
                texto.setFont(new Font("Serif", Font.PLAIN, 12));
            }else if(e.getSource()==boton3){
                texto.setFont(new Font("Serif", Font.PLAIN, 18));
            }else if(e.getSource()==boton4){
                texto.setFont(new Font("Serif", Font.PLAIN, 24));
            }
        }
        
        
    }
    
    
    
    private JLabel texto;
    
    private JRadioButton boton1, boton2, boton3, boton4;
}
     