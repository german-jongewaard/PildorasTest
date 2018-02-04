package java_hasta_el_video_160.video121;    

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*; 

/**
 *
 * @author german
 * 
 */
 
public class Tipos_Cuadros_Dialogos {
   
    public static void main(String[] args) {
        // TODO code application logic here
        
       Cuadros_Dialogos mimarco = new Cuadros_Dialogos();       
       mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
       mimarco.setVisible(true);
    }    
}
 

class Cuadros_Dialogos extends JFrame{
    
    public Cuadros_Dialogos(){  
        
        setTitle("Cuadros Dialogos");
        
        setBounds(500, 300, 400, 250);   
         
        
        add(new Lamina_Cuadros_Dialogos());
        
         
    } 
}

class Lamina_Cuadros_Dialogos extends JPanel{
    
    public Lamina_Cuadros_Dialogos(){  
        
        boton1 = new JButton("Boton 1");
        
        boton2 = new JButton("Boton 2");
        
        boton3 = new JButton("Boton 3");
        
        boton4 = new JButton("Boton 4");
        
        boton1.addActionListener(new Accion_botones());
        boton2.addActionListener(new Accion_botones());
        boton3.addActionListener(new Accion_botones());
        boton4.addActionListener(new Accion_botones());
        
        add(boton1);
        add(boton2);
        add(boton3);
        add(boton4);
    }
    
private class Accion_botones implements ActionListener{
 
        public void actionPerformed(ActionEvent e) {
            
            if(e.getSource()==boton1){
                
                //System.out.println("Has pulsado el botón 1");
                //JOptionPane.showMessageDialog(Lamina_Cuadros_Dialogos.this, "Mensaje de Prueba");
                  JOptionPane.showMessageDialog(Lamina_Cuadros_Dialogos.this, "Mensaje de Prueba", 
                          "Advertencia", 0);
                
            }else if(e.getSource()==boton2){
                    
                //System.out.println("Has pulsado el botón 2");
                 JOptionPane.showInputDialog(Lamina_Cuadros_Dialogos.this, "Introduce nombre",
                         "Introduccion datos", 2);
                
            }else if(e.getSource()==boton3){
                
                //System.out.println("Has pulsado el botón 3");
                JOptionPane.showConfirmDialog(Lamina_Cuadros_Dialogos.this, "Elige opción", "V Confirmar", 1);
                
            }else if(e.getSource()==boton4){
                
                //System.out.println("Has pulsado el botón 4");
                JOptionPane.showOptionDialog(Lamina_Cuadros_Dialogos.this, "Elige",
                        "V de Opciones", 1, 1, null, null, null);
            }
        }
    
}
    
private JButton boton1, boton2, boton3, boton4;
}
 
 