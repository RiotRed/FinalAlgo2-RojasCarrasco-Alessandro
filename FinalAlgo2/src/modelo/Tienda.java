
package modelo;


public class Tienda {
    private String nombre;
    private String ruc;
    private String direccion;

    public Tienda(String nombre, String ruc, String direccion) {
        this.nombre = nombre;
        this.ruc = ruc;
        this.direccion = direccion;
    }
    
    public String getNombre() {
        return nombre;
    }

    public String getRuc() {
        return ruc;
    }

    public String getDireccion() {
        return direccion;
    }
    
    public void agregarCliente(Cliente c){
        
    }
    
    public void agregarCategoria(Categoria cat){
        
    }
    
    public void agregarProducto(Producto p){
        
    }
}
