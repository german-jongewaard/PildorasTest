 
package java_hasta_el_video_100.video55;

import javax.swing.*;


public class CreandoMarcos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        miMarco marco1 = new miMarco();
        
        marco1.setLocationRelativeTo(null);                
                
        
        marco1.setVisible(true);
        
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}

class miMarco extends JFrame {
    
    public miMarco(){
        
        //setSize(500,300);
        
        //setLocation(500,300);
        
        setBounds(500,300,550,250);
        
        //setResizable(false);
        
        //setExtendedState(Fraame.MAXIMISED_BOTH);
        
        setTitle("Mi Ventana");
    }
    
}
