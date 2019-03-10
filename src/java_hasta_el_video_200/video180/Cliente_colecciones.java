package java_hasta_el_video_200.video180;

/**
 *
 * @author german
 */
public class Cliente_colecciones {
    
    private String nombre;
    
    private  String n_cuenta;
    
    private double saldo; 

    public Cliente_colecciones(String nombre, String n_cuenta, double saldo) {
        this.nombre = nombre;
        this.n_cuenta = n_cuenta;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getN_cuenta() {
        return n_cuenta;
    }

    public void setN_cuenta(String n_cuenta) {
        this.n_cuenta = n_cuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
