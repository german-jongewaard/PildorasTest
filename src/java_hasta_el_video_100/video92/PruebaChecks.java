 package java_hasta_el_video_100.video92;  
  
import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.event.*; 
import javax.swing.*;
 
  /**
 *
 * @author german
 * 
 */
 
public class PruebaChecks {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoPruebaChecks mimarco = new MarcoPruebaChecks(); 
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);          
        
        mimarco.setVisible(true); 
    }    
}

 class MarcoPruebaChecks extends JFrame{
    
    public MarcoPruebaChecks(){
        
       setTitle("Probando Checks");
        
       setBounds(500, 300, 500, 400); 
       
       setVisible(true);
       
       LaminaCheck milamina = new LaminaCheck();
       
       add(milamina);
       
    }   
    
} 


class LaminaCheck extends JPanel{
    public LaminaCheck(){
        
        setLayout(new BorderLayout());
        
        Font miletra = new Font("Serif", Font.PLAIN, 24);
        
        texto = new JLabel("En un lugar de la Mancha de cuyo nombre...");
        
        texto.setFont(miletra);
        
        //aqui creo una segunda lamina, que tiene el texto dentro.
        JPanel laminatexto = new JPanel();
        
        laminatexto.add(texto);
        
        //coloco la segunda lamina, centrada!
        add(laminatexto, BorderLayout.CENTER);
        
        //Ahora creo las casillas CheckBox
        check1 = new JCheckBox("Negrita");
        
        check2 = new JCheckBox("Cursiva"); 
        
        check1.addActionListener(new ManejaChecks());
        
        check2.addActionListener(new ManejaChecks());
        
        //Ahora creo la lamina donde iran estos elementos...
        JPanel laminachecks = new JPanel();
        
        laminachecks.add(check1);
        
        laminachecks.add(check2);
        
        add(laminachecks, BorderLayout.SOUTH);
        
        
    }
    
    private class ManejaChecks implements ActionListener{

      //al pulsar el boton hace esto...
        public void actionPerformed(ActionEvent e) {
        //primero creo una variable y la pongo en cero.
            int tipo = 0;
            //si el check esta seleccionado (true) cambio el tipo a BOLD
            /*
            Esto lo que hace es: si el check esta "seleccionado" la variable TIPO
            que vale cero, se incrementa a 1. 
            en el caso que haga click en el check otra vez, al no estar 
            seleccionado no entrara en la condicion y seguira valiendo cero (tipo = 0;)
            */
            if(check1.isSelected()) tipo+=Font.BOLD;
         
            if(check2.isSelected()) tipo+=Font.ITALIC;
            
            
            //aqui cambio el texto, el valor de tipo cambia
            //de 0 a 1, 2 o 3. segun los check box pulsados
            texto.setFont(new Font("Serif", tipo, 24));
        }
        
    }
    
    private JLabel texto;
    
    private JCheckBox check1, check2;
    
    
}