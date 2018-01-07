
package java_hasta_el_video_100.video75;
  
import java.awt.Graphics;

import java.awt.event.*;
import javax.swing.JFrame;

import javax.swing.JPanel;
import javax.swing.JTextField;

  

public class FocoEvento {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoFoco mimarco = new MarcoFoco();
         
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        
         
    }
}

 class MarcoFoco extends JFrame{
    
    public MarcoFoco(){
        
        setVisible(true); 
        
        setTitle("Marco Estado"); 
         
        setBounds(300,300,600,450);   
        
        LaminaFoco mi_lamina_foco = new LaminaFoco();
        
        add(mi_lamina_foco);
         
    }    
}

class LaminaFoco extends JPanel {
    
   public void paintComponent(Graphics g){
       
       super.paintComponent(g);
       
    /*Aqui invalido el posisionamiento por defecto que le da java a los elementos del layout
       con esto puedo colocar los elementos como textbox donde yo quiera
    */
       setLayout(null);
       
    //Ahora instancio las variables a JTextField
       cuadro1 = new JTextField();
       
       cuadro2 = new JTextField();
       
       
       //Con esto estan construidos los cuadros de texto
       cuadro1.setBounds(120, 10, 150, 20);
       
       cuadro2.setBounds(120, 50, 150, 20);
       
       //con esto estan agregados los cuadros de texto
       
       add(cuadro1);
       add(cuadro2);
       
       LanzaFocos elFoco= new LanzaFocos();
       
       cuadro1.addFocusListener(elFoco);
       
   }
/*La clase LanzaFocos la pongo dentro de la clase LaminaFoco (la hago Clase Interna 
   y conviene ENCAPSULARLA con el modificador private)
   para poder acceder desde los metodos focusGained y focusLost a 
   los Objetos cuadro1 y cuadro2.
   Si la pusiera fuera como una clase normal no podria acceder a ellos.
   Con lo cual ahora tengo una clase LanzaFocos (oyente) dentro de otra clase LaminaFoco,
   esto me permitira acceder con los metodos a los objetos que antes mencione. auuua!
   
   */
   
private class LanzaFocos implements FocusListener{

    @Override
    public void focusGained(FocusEvent e) {
       
    }

    @Override
    public void focusLost(FocusEvent e) {
       
        //Capturo el texto y lo meto en la variable email
        String email=cuadro1.getText();
        
        boolean comprobacion = false;
        
        int conteoArroba=0;
        
        //Recorro el email
        for(int i=0; i<email.length();i++){
            //pregunto si hay un arroba
            if(email.charAt(i)=='@'){
                conteoArroba++;
                //hay un arroba
                comprobacion=true;
                
            }
        }
        
        //aqui dice que si comprobacion es TRUE
        if(comprobacion== true && conteoArroba==1){
            System.out.println("Correcto " + " Hay " + conteoArroba + " arrobas, auuua! ");
        }else if(email.isEmpty()){
            System.out.println("Solo cambie de foco... ");
        }else{             
            System.out.println("Incorrecto " + " Hay " + conteoArroba + " arrobas, MAL! ");
        }
        
    }
    
}

   /*
        Las declaro fuera por el ambito de variables y a futuro necesito 
        acceder a estas variables, si las hubiera declarado dentro de 
        paintComponent no podria utilizarlas fuera. Al declararlas dentro de la clase
        LaminaFoco y fuera de paintComponent puede ser utilizada desde otro ambito.
   
   */
   JTextField cuadro1;
   JTextField cuadro2;
   
}
 

  