
package modelo;


public class Producto {
    private float precio;
    private String nombre;
    private int stock;
    private String marca;

    public Producto(float precio, String nombre, int stock, String marca) {
        this.precio = precio;
        this.nombre = nombre;
        this.stock = stock;
        this.marca = marca;
    }

    public float getPrecio() {
        return precio;
    }

    public String getNombre() {
        return nombre;
    }

    public int getStock() {
        return stock;
    }

    public String getMarca() {
        return marca;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
    
    public boolean vender(int cantidad){
        boolean venta = false;
        
        return venta;
    }
    
    public boolean reponer(int cantidad){
        boolean reponer = false;
        
        return reponer;
    }
    
}
