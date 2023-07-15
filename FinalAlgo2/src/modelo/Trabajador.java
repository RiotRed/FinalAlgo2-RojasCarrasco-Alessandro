
package modelo;

import java.util.Date;


public class Trabajador extends Persona {
    private String password;
    private String email;

    public Trabajador(String nombre, String paterno, String materno, Date nacimiento, String numDocumento) {
        super(nombre, paterno, materno, nacimiento, numDocumento);
    }

    public Trabajador(String password, String email, String nombre, String paterno, String materno, Date nacimiento, String numDocumento) {
        super(nombre, paterno, materno, nacimiento, numDocumento);
        this.password = password;
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public String getEmail() {
        return email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String getNumDocumento() {
        return super.getNumDocumento(); 
    }   
    
    
    public boolean ingresar(String email, String password){
        boolean ingresar = false;
        
        
        
        return ingresar;
    }
    
    public boolean salir(){
        boolean salir = false; 
        
        return salir;
    }
    
    public boolean crearVenta(Cliente c){
        boolean venta = false;
        
        
        return venta;
    }
    
}
