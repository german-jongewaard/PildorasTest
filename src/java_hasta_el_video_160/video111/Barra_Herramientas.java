package java_hasta_el_video_160.video111; 

import java.awt.*;
import java.awt.Event.*;
import java.awt.event.ActionEvent;
import javax.swing.*;

public class Barra_Herramientas {

    public static void main(String[] args) {
            // TODO Auto-generated method stub

            Marco_Barra mimarco=new Marco_Barra();
            mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            mimarco.setVisible(true);
    }
}

class Marco_Barra extends JFrame{

    public Marco_Barra(){

            setTitle("Barra de Herramientas I");

            setBounds(500,300,600,450);

            lamina=new JPanel();

            add(lamina);

            // configuración de acciones

            Action accionAzul=new AccionColor("Azul", new ImageIcon("src/video111/imagenes/azul.gif"), Color.BLUE);

            Action accionAmarillo=new AccionColor("Amarillo", new ImageIcon("src/video111/imagenes/amarilla.gif"), Color.YELLOW);

            Action accionRojo=new AccionColor("Rojo", new ImageIcon("src/video111/imagenes/roja.gif"), Color.RED);
            
            Action accionSalir = new AbstractAction("Rojo", new ImageIcon("src/video111/imagenes/salir.gif")) {
                 
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);
                }
            };

            JMenu menu = new JMenu("Color");
            
            menu.add(accionAzul);
            
            menu.add(accionAmarillo);
            
            menu.add(accionRojo);
            
            JMenuBar barra_menus = new JMenuBar();
            
            barra_menus.add(menu);
            
            setJMenuBar(barra_menus);
            
            //Construcción de la barra de herramientas
            JToolBar barra = new JToolBar();
            
            barra.add(accionAzul);
            
            barra.add(accionAmarillo);
            
            barra.add(accionRojo);
            
            //Separador
            barra.addSeparator();
            
            barra.add(accionSalir); 
            
            //Aqui coloco la barra y la posiciono arriba
            add(barra, BorderLayout.NORTH);
            
            
            

    }
   //Clase interna
    private class AccionColor extends AbstractAction{

            public AccionColor(String nombre, Icon icono, Color c){

                    putValue(Action.NAME, nombre);

                    putValue(Action.SMALL_ICON, icono);

                    putValue(Action.SHORT_DESCRIPTION, "Color de fondo..." + nombre);

                    putValue("Color", c);
            }

            @Override
            public void actionPerformed(ActionEvent arg0) {
                    // TODO Auto-generated method stub

                    Color c=(Color) getValue("Color");

                    lamina.setBackground(c);

            }		

    }
    private JPanel lamina;
}
 