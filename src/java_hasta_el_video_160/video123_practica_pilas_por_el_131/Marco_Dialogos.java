package java_hasta_el_video_160.video123_practica_pilas_por_el_131;

import java.awt.*;
import javax.swing.*; 
import java.awt.event.*;
import java.awt.geom.Rectangle2D;
import java.util.Date;

public class Marco_Dialogos extends JFrame {
    
    public Marco_Dialogos(){
        
        setTitle("Prueba de diálogos");
        
        setBounds(300, 100, 600, 450);
        
        JPanel lamina_cuadricula = new JPanel();
        
        lamina_cuadricula.setLayout(new GridLayout(2,3)); 
        
        lamina_tipo = new Lamina_Botones("Tipo", new String[]{
                        "Mensaje", 
                        "Confirmar", 
                        "Opción", 
                        "Entrada"}); 
        
        lamina_tipo_mensajes = new Lamina_Botones("Tipo de Mensaje", new String[]{
                        "ERROR_MESSAGE", 
                        "INFORMATION_MESSAGE", 
                        "WARNING_MESSAGE", 
                        "QUESTION_MESSAGE", 
                        "PLAIN_MESSAGE"});
        
        lamina_mensaje = new Lamina_Botones("Mensaje", new String[]{
                        "Cadena", 
                        "Icono", 
                        "Componente", 
                        "Otros", 
                        "Object[]"});
        
        lamina_confirmar = new Lamina_Botones("Confirmar", new String[]{
                        "DEFAULT_OPTION", 
                        "YES_NO_OPTION", 
                        "YES_NO_CANCEL_OPTION", 
                        "OK_CANCEL_OPTION"});
        
        lamina_tipo_opcion = new Lamina_Botones("Opción", new  String[]{
                        "String[]", 
                        "Icon[]", 
                        "Object[]"});
        
        lamina_entrada = new Lamina_Botones("Entrada", new String[]{
                        "Campo de texto", 
                        "Combo"});
        
        setLayout(new BorderLayout()); 
        
        lamina_cuadricula.add(lamina_tipo);
        
        lamina_cuadricula.add(lamina_tipo_mensajes);
        
        lamina_cuadricula.add(lamina_mensaje);
        
        lamina_cuadricula.add(lamina_confirmar);
        
        lamina_cuadricula.add(lamina_tipo_opcion);     
        
        lamina_cuadricula.add(lamina_entrada);
        
        //Construimos la lamina inferior 
        
        JPanel lamina_mostrar = new JPanel();
        
        JButton boton_mostrar = new JButton("Mostrar");
        
        boton_mostrar.addActionListener(new AccionMostrar());
        
        lamina_mostrar.add(boton_mostrar);
        
        //aqui coloco el boton mostrar
        add(lamina_mostrar, BorderLayout.SOUTH);
        
        //aqui coloco las seis cajas
        add(lamina_cuadricula, BorderLayout.CENTER);         
    }
    
    //-------------- PROPORCIONA EL MENSAJE ---------------------    
    public Object dameMensaje(){
        String s = lamina_mensaje.dameSeleccion();
        
        if(s.equals("Cadena")){
            
            return cadenaMensaje;
        }else if(s.equals("Icono")){
            
            return iconoMensaje;
        }else if(s.equals("Componente")){
            
            return componenteMensaje;
        }else if(s.equals("Otros")){
            
            return objetoMensaje;
        }else if(s.equals("Object[]")){
            
            return new Object[]{cadenaMensaje,
                                iconoMensaje,
                                componenteMensaje,
                                objetoMensaje  
            };
        }else {
            return null;
        } 
}
    
    //-----------------------------------------------------------
    
    //------- DEVUELVE TIPO ICONO Y TAMBIEN NUMERO DE BOTONES EN COFIRMAR ------
    /* con lamina almaceno el texto seleccionado en cualquier lamina */
    public int dameTipo(Lamina_Botones lamina){
        
        String s = lamina.dameSeleccion();
        
        if(s.equals("ERROR_MESSAGE") || s.equals("YES_NO_OPTION")){
            
            return 0;
        }else if(s.equals("INFORMATION_MESSAGE") || s.equals("YES_NO_CANCEL_OPTION")){
            
            return 1;
        }else if(s.equals("WARNING_MESSAGE") || s.equals("OK_CANCEL_OPTION")){
            
            return 2;
        }else if(s.equals("QUESTION_MESSAGE")){
            
            return 3;
        }else if(s.equals("PLAIN_MESSAGE") || s.equals("DEFAULT_OPTION")){
            
            return -1;
        }else{
            return 0;
        }               
    }
    //----------------------------------------------------------- 
    //-------------- DA OPCIONES A LA LAMINA OPCION ------------------ 
    
    public Object[] dameOpciones(Lamina_Botones lamina){
        
        String s = lamina.dameSeleccion();
        
        if(s.equals("String[]")){
            
            return new String[]{"Amarillo", "Azul", "Rojo"};
            
        }else if(s.equals("Icon[]")){
            
            return new Object[]{new ImageIcon("src/java_hasta_el_video_160/video123_practica_pilas_por_el_131"
            + "/img/azul.gif"), new ImageIcon("src/video123_practica_pilas_por_el_131"
            + "/img/amarilla.gif"),new ImageIcon("src/video123_practica_pilas_por_el_131"
            + "/img/roja.gif")};
            
        }else if(s.equals("Object[]")){
           
            return new Object[]{cadenaMensaje,
                                iconoMensaje,
                                componenteMensaje,
                                objetoMensaje  
            }; 
        }else{
            
            return null;            
        }  
    }    
    
    //----------------------------------------------------------- 
    
    private class AccionMostrar implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
           //System.out.println(lamina_tipo.dameSeleccion());
            
            if(lamina_tipo.dameSeleccion().equals("Mensaje")){
                
                JOptionPane.showMessageDialog(Marco_Dialogos.this, dameMensaje(), 
                        "Título", dameTipo(lamina_tipo_mensajes));
                
            }else if(lamina_tipo.dameSeleccion().equals("Confirmar")){
                
                JOptionPane.showConfirmDialog(Marco_Dialogos.this, dameMensaje(), 
                        "Título", dameTipo(lamina_confirmar), dameTipo(lamina_tipo_mensajes));  
                
        }else if(lamina_tipo.dameSeleccion().equals("Opción")){
                
                  JOptionPane.showOptionDialog(Marco_Dialogos.this, dameMensaje(), 
                          "Título", dameTipo(lamina_tipo_opcion), dameTipo(lamina_tipo_mensajes), null, dameOpciones(lamina_tipo_opcion), null);
                  
        }else if(lamina_tipo.dameSeleccion().equals("Entrada")){
            
                if(lamina_entrada.dameSeleccion().equals("Campo de texto")){
                    JOptionPane.showInputDialog(Marco_Dialogos.this, dameMensaje(), 
                        "Título", dameTipo(lamina_tipo_mensajes));
                }else if(lamina_entrada.dameSeleccion().equals("Combo")){
                
                JOptionPane.showInputDialog(Marco_Dialogos.this, dameMensaje(), "Título", 
                          dameTipo(lamina_tipo_mensajes), null, new String[]{"Amarillo", "Azul", "Rojo"}, "Azul");
                 }        
            } 
        }
    }
    
    private Lamina_Botones lamina_tipo, lamina_tipo_mensajes, lamina_mensaje, 
                           lamina_confirmar, lamina_tipo_opcion, lamina_entrada; 
    
    private String cadenaMensaje="Mensaje";
    
    private Icon iconoMensaje = new ImageIcon("src/java_hasta_el_video_160/video123_practica_pilas_por_el_131"
            + "/img/Lady_gangsta.gif");
    
    private Object objetoMensaje = new Date();
    
    private Component componenteMensaje = new Lamina_Ejemplo();
   
}

class Lamina_Ejemplo extends JPanel{
    
    public void paintComponent(Graphics g){
        
        super.paintComponents(g);
        
        // ahora hago un casting para transformar a g en graphics2D
        
        Graphics2D g2 = (Graphics2D) g;
        
        Rectangle2D rectangulo = new Rectangle2D.Double(0, 0, getWidth(), getHeight());
        
        g2.setPaint(Color.YELLOW);
        
        g2.fill(rectangulo);
        
    }
    
} 
