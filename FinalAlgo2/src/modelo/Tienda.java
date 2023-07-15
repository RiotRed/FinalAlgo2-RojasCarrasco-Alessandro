
package modelo;

import modelo.Producto;
import modelo.Cliente;
import modelo.Categoria;

public class Tienda {
    private String nombre;
    private String ruc;
    private String direccion;
    private Cliente[] clientes;
    private int indice;
    
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
    
    public void ClienteArreglo(int tamano){
        this.clientes = new Cliente[tamano];
        this.indice = 0;
    }
    
    public void agregarCliente(Cliente c){
        this.clientes[this.indice]= c;
        this.indice++;
    }
    
    public void agregarCategoria(Categoria cat){
        
    }
    
    public void agregarProducto(Producto p){
        
    }
}
