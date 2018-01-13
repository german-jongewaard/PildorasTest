 package java_hasta_el_video_100.video94_1_ejemplo_mejorado;  
 
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.*; 
import javax.swing.*;
 
 /**
 *
 * @author german
 * 
 */
 
public class Ejemplo_radio_mejorado {

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
        
        /*
            -------  mejora   ------
        */
        texto.setFont(new Font("Serif", Font.PLAIN, 12));        
        /*
            -------  mejora   ------   ^
        */
        
        add(texto, BorderLayout.CENTER); 
        
        /*
        lamina_botones y migrupo, aqui son INICIADOS EN la LAMINA!!!!! si no hacia esto no funcionaba!
        */
        lamina_botones = new JPanel();
        
        migrupo = new ButtonGroup();
        
        colocarBotones("Pequeño", false, 10);
        colocarBotones("Mediano", true, 12);
        colocarBotones("Grande", false, 18);
        colocarBotones("Muy grande", false, 26);
        
        add(lamina_botones, BorderLayout.SOUTH);
        
         
    }
                                          //al poner tamagno en final, protejo que tamagno 
                                         //no pueda ser modificado
    public void colocarBotones (String nombre, boolean seleccionado, final int tamagno){
        
        JRadioButton boton = new JRadioButton(nombre, seleccionado);
        
        migrupo.add(boton);        
        
        lamina_botones.add(boton);
        
        ActionListener mievento = new ActionListener(){

            
            public void actionPerformed(ActionEvent e) {
             
                texto.setFont(new Font("Serif", Font.PLAIN, tamagno));   
            }
            
        };
        
        boton.addActionListener(mievento);        
    }
     
    //variables de CLASE
    private JLabel texto;
    
    private JRadioButton boton1, boton2, boton3, boton4;
    
    private ButtonGroup migrupo;
    
    private JPanel lamina_botones;
}
     