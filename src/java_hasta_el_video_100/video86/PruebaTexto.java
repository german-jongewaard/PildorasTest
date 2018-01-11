 
package java_hasta_el_video_100.video86; 
 
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.*;

import javax.swing.*;
 
public class PruebaTexto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoTexto mimarco = new MarcoTexto(); 
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        //mimarco.setVisible(true);
    }
    
}

 class MarcoTexto extends JFrame{
    
    public MarcoTexto(){
        
       setTitle("Calculadora");
        
       setBounds(600, 300, 600, 350); 
       
       LaminaTexto milamina = new LaminaTexto();
      
       add(milamina);
      
       setVisible(true);
         
    }    
}

class LaminaTexto extends JPanel{
    
    public LaminaTexto(){

        setLayout(new BorderLayout());

        JPanel milamina2 = new JPanel();

        milamina2.setLayout(new FlowLayout());

        //aqui muestro el resultado y con JLabel.Center lo centro!!
        resultado = new JLabel("", JLabel.CENTER);

        JLabel texto1 = new JLabel("E-mail: ");

        milamina2.add(texto1);

        //JTextField campo1 = new JTextField(("   texto por defecto").trim(), 20 );
        campo1 = new JTextField(20);
        milamina2.add(campo1);

        add(resultado, BorderLayout.CENTER);

        JButton miboton = new JButton("Comprobar");

        DameTexto mievento = new DameTexto();

        miboton.addActionListener(mievento);

        milamina2.add(miboton); 
        
        add(milamina2, BorderLayout.NORTH);
    }
    
    private class DameTexto implements ActionListener{

       
        public void actionPerformed(ActionEvent e) {
            
            int correcto = 0;
            
            String email = campo1.getText().trim();
            
            
             for(int i=0; i<email.length(); i++){
                 
                 if(email.charAt(i) == '@'){
                     
                     correcto ++;
                     
                 }
                 
             }
             
             if(correcto!=1){
                 resultado.setText("Incorrecto");
             }else{
                resultado.setText("Correcto");
             }
             
            
        }        
    }
    
    private JTextField campo1;
    
    private JLabel resultado;
    
}
