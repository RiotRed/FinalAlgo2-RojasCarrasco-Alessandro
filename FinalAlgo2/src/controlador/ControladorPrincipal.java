
package controlador;

import vista.frmIngreso;
import modelo.Persona;
import modelo.Trabajador;
import modelo.Cliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;
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
                frmTrabajador vistaT = new frmTrabajador();
                ControladorTrabajador controladorTrabajador = new ControladorTrabajador(u, vistaT);
                controladorTrabajador.iniciar();
                vista.dispose();
            }else{
                 JOptionPane.showMessageDialog( vista, "Credenciales invalidas" );
            }
            
            }
            
            
            
        });
        
       
       }

    ControladorPrincipal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    public void iniciar(){
        this.vista.setLocationRelativeTo(null);
        this.vista.setVisible(true); 
    }
    } 
    

