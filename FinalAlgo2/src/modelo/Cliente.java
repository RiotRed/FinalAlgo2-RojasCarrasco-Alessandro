
package modelo;

import java.util.Date;


public class Cliente extends Persona {
    
    private int celular;
    private float dinero;
    
    public Cliente(String nombre, String paterno, String materno, Date nacimiento, String numDocumento) {
        super(nombre, paterno, materno, nacimiento, numDocumento);
    }

    public Cliente(int celular, float dinero, String nombre, String paterno, String materno, Date nacimiento, String numDocumento) {
        super(nombre, paterno, materno, nacimiento, numDocumento);
        this.celular = celular;
        this.dinero = dinero;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public float getDinero() {
        return dinero;
    }

    public void setDinero(float dinero) {
        this.dinero = dinero;
    }
    
    public boolean pagar(){
        boolean pago=false;
        return pago;
    }
    
    public boolean recargarDinero(){
        boolean d=false;
        return d;
    }
}
