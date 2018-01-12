 package java_hasta_el_video_100.video91;  
  
import java.awt.BorderLayout;
import java.awt.event.*; 
import javax.swing.*;
 
  /**
 *
 * @author german
 * 
 */
 
public class PruebaArea {
    
    public static void main(String[] args) {
        // TODO code application logic here
        MarcoPruebaArea mimarco = new MarcoPruebaArea(); 
        
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);          
        
        mimarco.setVisible(true); 
    }    
}

 class MarcoPruebaArea extends JFrame{
    
    public MarcoPruebaArea(){
        
       setTitle("Probando área de texto");
        
       setBounds(500, 300, 500, 400); 
       
      setLayout(new BorderLayout());
      
      laminaBotones = new JPanel();
      
      botonInsertar = new JButton("Insertar");
      
      botonInsertar.addActionListener(new ActionListener() {

          
           public void actionPerformed(ActionEvent e) {
         
               areaTexto.append("En un lugar de la mancha de cuyo nombre no quiero acordarme... ");
               
           }
       });
      //aqui agrego el Boton a la lamina!
      laminaBotones.add(botonInsertar);
      
      botonSaltoLinea = new JButton("Salto línea");
      
      botonSaltoLinea.addActionListener(new ActionListener() {

       
           public void actionPerformed(ActionEvent e) {

    //Si no hay saltos de linea, se almacena en saltar un TRUE!                
               boolean saltar =! areaTexto.getLineWrap();
               
               areaTexto.setLineWrap(saltar);
               
               if(saltar== true){
                   
                   botonSaltoLinea.setText("Quitar salto");
               }else{
                   botonSaltoLinea.setText("Salto línea");
               }
           }
       });
      
        laminaBotones.add(botonSaltoLinea);
        
        add(laminaBotones, BorderLayout.SOUTH);
        
        areaTexto = new JTextArea(8,20);
        
        laminaConBarras = new JScrollPane(areaTexto);
        
        add(laminaConBarras, BorderLayout.CENTER);
      
    }  
    private JPanel laminaBotones;
    
    private JButton botonInsertar, botonSaltoLinea;
    
    private JTextArea areaTexto;
    
    private JScrollPane laminaConBarras;
    
} 
