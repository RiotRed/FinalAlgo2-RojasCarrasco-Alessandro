
package modelo;


public class Detalle {
    private int cantidad;
    private float precio;
    private float descuento;
    private float total;

    public Detalle(int cantidad, float precio, float descuento, float total) {
        this.cantidad = cantidad;
        this.precio = precio;
        this.total = total;
    }

    public int getCantidad() {
        return cantidad;
    }

    public float getPrecio() {
        return precio;
    }

    public float getTotal() {
        return total;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
    
    
    
}
