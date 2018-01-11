 package java_hasta_el_video_100.video89; 
  
 
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.event.*;
import javax.swing.text.*;

 /**
 *
 * @author german
 * 
 */
 
public class CampoPassword {
    
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoPassword mimarco = new MarcoPassword(); 
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);          
    }    
}

 class MarcoPassword extends JFrame{
    
    public MarcoPassword(){
        
       setTitle("Marco Password");
        
       setBounds(400, 300, 550, 400); 
       
       LaminaPassword milamina = new LaminaPassword();
      
       add(milamina);
      
       setVisible(true);         
    }    
}

class LaminaPassword extends JPanel{
    
        JPasswordField c_contrasenia; 
        
        JLabel resultado;
     
    public LaminaPassword(){ 
        
        setLayout(new BorderLayout());
        
        JPanel lamina_superior = new JPanel();
        
        lamina_superior.setLayout(new GridLayout(3,3));
        
        JPanel lamina_central = new JPanel();
        
        lamina_central.setLayout(new GridLayout(1,1));
        
        /* ******************************************************** */
        
        add(lamina_superior, BorderLayout.NORTH);
        
        JLabel etiqueta1 = new JLabel("Usuario");
        
        JLabel etiqueta2 = new JLabel("Contraseña");
        
        resultado = new JLabel("", JLabel.CENTER);
        
        JTextField c_usuario = new JTextField(15);
        
        Comprueba_pass mievento = new Comprueba_pass();
        
        c_contrasenia = new JPasswordField(15);
        
        /* ******************************************************** */
        
        //pongo a c-cpontrasenia A LA ESCUCHA
        
        c_contrasenia.getDocument().addDocumentListener(mievento);
        
        lamina_superior.add(etiqueta1);
        
        lamina_superior.add(c_usuario);
        
        lamina_superior.add(etiqueta2);
        
        lamina_superior.add(c_contrasenia);
        
        add(resultado);
        
        /* ******************************************************** */
        
        JButton enviar = new JButton("Enviar");
        
        enviar.addActionListener(new Comprueba_pass());
                
        add(enviar, BorderLayout.SOUTH);
        
    }
    
    //Clase respetora de los eventos
    private class Comprueba_pass implements DocumentListener, ActionListener{
        
         //Cada vez que el usuario inserta un caracter aqui analizo que caracter introdujo.
        public void insertUpdate(DocumentEvent e) {
            
            char[] contrasena;        
            contrasena = c_contrasenia.getPassword();
            
                          
            if(contrasena.length < 8){                
                
                c_contrasenia.setBackground(Color.red);
                
               resultado.setText("La contraseña es menor de 8 caracteres"); 
                
            }else if(contrasena.length > 12){
                
               c_contrasenia.setBackground(Color.red);
                
               resultado.setText("La contraseña es mayor de 12 caracteres"); 
                
            }else {
                
                c_contrasenia.setBackground(Color.WHITE);
                
                resultado.setText("La contraseña es Correcta");
            }
        }

  
        public void removeUpdate(DocumentEvent e) {           
            
            char[] contrasena;        
            contrasena = c_contrasenia.getPassword();            
                          
            if(contrasena.length < 8){   
                
                c_contrasenia.setBackground(Color.red);
                
                resultado.setText("La contraseña es menor de 8 caracteres"); 
                
            }else if(contrasena.length > 12){
                
                c_contrasenia.setBackground(Color.red);
                
                resultado.setText("La contraseña es mayor de 12 caracteres"); 
                
            }else {                
               
                c_contrasenia.setBackground(Color.WHITE);
                
                resultado.setText("La contraseña es Correcta");
            }
        }

  
        public void changedUpdate(DocumentEvent e) {
  
        }

        
        public void actionPerformed(ActionEvent e) {           
            
            char[] contrasena;        
            contrasena = c_contrasenia.getPassword();            
                          
            if(contrasena.length < 8){    
                
                c_contrasenia.setBackground(Color.red);
                
               System.out.println("La contraseña es menor de 8 caracteres"); 
                
            }else if(contrasena.length > 12){
                
                c_contrasenia.setBackground(Color.red);
                
              System.out.println("La contraseña es mayor de 12 caracteres"); 
                
            }else {
                
                c_contrasenia.setBackground(Color.WHITE);
                
               System.out.println("La contraseña es Correcta");
            }
        }
    } 
}
