package java_hasta_el_video_100.video75_1;
  
import java.awt.event.*;
import javax.swing.JFrame;

/**
 *
 * @author german
 * 
 */ 

public class FocoVentana extends JFrame implements WindowFocusListener{
     
    public static void main(String[] args) {
        
        FocoVentana miventana = new FocoVentana();
        
        miventana.iniciar();
    }
    
    //Metodo donde construyo los marcos
    public void iniciar(){
        
        marco1 = new FocoVentana();
        
        marco2 = new FocoVentana();
        
        marco1.setVisible(true);
        
        marco2.setVisible(true);
        
        marco1.setBounds(200, 100, 400, 350);
        
        marco2.setBounds(700, 100, 400, 350);
        
        marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        marco2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        marco1.addWindowFocusListener(this);
        
        marco2.addWindowFocusListener(this);
    }

    @Override
    public void windowGainedFocus(WindowEvent e) {
        
        if(e.getSource()==marco1){
            marco1.setTitle("Tengo el foco!!");
        }else {
            marco2.setTitle("Tengo el foco!!");
        } 
    }

    @Override
    public void windowLostFocus(WindowEvent e){
         if(e.getSource()==marco1){
            marco1.setTitle("NO!!! Tengo el foco!!");
        }else {
            marco2.setTitle("NO!!! Tengo el foco!!");
        }
    }
    
    FocoVentana marco1;    
    FocoVentana marco2;    
}
 