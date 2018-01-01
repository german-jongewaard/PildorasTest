package java_hasta_el_video_100.video30;

/**
 *
 * @author Germán
 * 
 */

public class Coche {
    
    private int ruedas;    
    private int largo;    
    private int ancho;
    private int motor;
    private int peso_plataforma;
    
    private String color;
    
    private int peso_total;
    
    private boolean asientos_cuero, climatizador;
    
    /*El metodo constructor se llama igual que la Clase */
    
    public Coche(){
        
        /*Aqui contruyo el estado inicial del OBJETO! */
        
        ruedas = 4;
        largo = 2000;
        ancho = 300;
        motor = 1600;
        peso_plataforma = 500;
        
    }
    
    
    public String dime_datos_generales(){//Método GETTER
        
        return "La plataforma del vehículo tiene " + ruedas + " ruedas" + ". Mide " + largo/1000 + 
                " metros con un ancho de " + ancho + " cm y un peso de plataforma de " + 
                peso_plataforma + " kg." ;        
    }     
    
    public void establece_color(String color_coche){//Método SETTER
        
        color = color_coche;
    }
    
    public String dime_color(){//Método GETTER
        
        return "El color del coche es: " + color;
    }
    
    public void configura_asientos(String asientos_cuero){//Método SETTER
        
        if(asientos_cuero=="si"){
            this.asientos_cuero = true;
        }else{
            this.asientos_cuero = false;
        }        
    }
    
    public String dime_asientos(){//Método GETTER (devuelve algo...)
        
        if(asientos_cuero== true){
            
            return "El coche tiene asientos de cuero...";
        }else{
            return "El coche tiene asientos de serie...";
        }
    }
    
    public void configura_climatizador(String climatizador){//Método SETTER
        
        if(climatizador == "si"){
            this.climatizador = true;
        }else{
            this.climatizador = false;
        }
    }
    
    public String dime_climatizador(){//Método GETTER (devuelve algo...)
        
        if(climatizador==true){
            return "El coche incorpora climatizador.";
        }else{
            return "El coche lleva aire acondicionado.";
        }
    }
    
    public String dime_peso_coche(){/*SETTER (por un lado establece
                                     Y por otro lado obtiene GETTER*/
        
        int peso_carroceria = 500;
        
        peso_total = peso_plataforma + peso_carroceria;
        
        if(asientos_cuero == true){
            peso_total = peso_total + 50; 
        }
        
        if(climatizador == true){
            peso_total = peso_total + 20;           
        }
        
        return "El peso del coche es " + peso_total;        
    }
    
    public int precio_coche(){//Método GETTER
        int precio_final = 10000;
        
        if(asientos_cuero==true){
            precio_final += 2000;            
        }
        if(climatizador==true){
            precio_final += 1500;
        }
        
        return precio_final;
    }   
}
