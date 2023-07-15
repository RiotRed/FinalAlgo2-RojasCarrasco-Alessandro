
package modelo;

public class Categoria {
    private String nombre;
    private boolean disponible;

    public Categoria(String nombre, boolean disponible) {
        this.nombre = nombre;
        this.disponible = disponible;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    
    public boolean habilitar(){
        boolean habilitar = false;
       
        return habilitar;
    }
    
    public boolean deshabilitar(){
        boolean deshabilitar = false;
        
        return deshabilitar;
    }
    
    
}
