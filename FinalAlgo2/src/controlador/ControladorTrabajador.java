
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import modelo.Trabajador;
import vista.frmTrabajador;
import vista.frmIngreso;

public class ControladorTrabajador {
    Trabajador modelo;
    frmTrabajador vista;

    public ControladorTrabajador(Trabajador modelo, frmTrabajador vista) {
        this.modelo = modelo;
        this.vista = vista;
        
        vista.lblsubtitulo.setText("Empleado:"+ modelo.getNombre());
        this.vista.btnsalir.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                frmIngreso fIngreso = new frmIngreso();
                ControladorPrincipal controlador;
                controlador = new ControladorPrincipal();
                controlador.iniciar();
                
                vista.dispose();
            }
        });
    }
     
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true);
    }
}
