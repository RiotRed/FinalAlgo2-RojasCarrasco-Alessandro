
package controlador;

import vista.frmIngreso;
import modelo.Persona;
import modelo.Trabajador;
import modelo.Cliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import vista.frmTrabajador;

public class ControladorPrincipal {
    frmIngreso vista;
    Trabajador modelo;
    
    public ControladorPrincipal(frmIngreso vista, Trabajador modelo){
        this.modelo = modelo;
        this.vista = vista;
        
        this.vista.btnEntrar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                Trabajador u = modelo.ingresar(vista.txtEmail.getText(),vista.txtClave.getText());
            
            if(u!=null){
                frmTrabajador vista = new frmTrabajador();
                ControladorTrabajador controladorRegular = new ControladorTrabajador(u, vistaR);
                controladorTrabajador.ingresar();
                vista.dispose();
            }
            
            }
            
            
            
        });
    } 
    
}
