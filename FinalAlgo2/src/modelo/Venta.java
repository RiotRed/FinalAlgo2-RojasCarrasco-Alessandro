
package modelo;

import java.util.Date;


public class Venta {
    private float total;
    private Date fecha;
    private boolean estado;

    public Venta(float total, Date fecha, boolean estado) {
        this.total = total;
        this.fecha = fecha;
        this.estado = estado;
    }

    public float getTotal() {
        return total;
    }

    public Date getFecha() {
        return fecha;
    }

    public boolean isEstado() {
        return estado;
    }
    
    public void agregarProducto(Producto p, int cantidad){
        
    }
    
    public void eliminarProducto(Producto p){
        
    }
    
    public boolean validarCarrito(){
        boolean validar = false;
        
        
        return validar;
    }
    
}
