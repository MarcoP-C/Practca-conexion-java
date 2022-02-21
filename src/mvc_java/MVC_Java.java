/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc_java;

import Controlador.ControladorCliente;
import Controlador.ControladorMDB;
import Modelo.MDB;
import Vista.FrmCliente;
import Vista.FrmVista;

/**
 *
 * @author Stevia
 */
public class MVC_Java {
// La parte del cliente fue agregada por Marco Palacios
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        MDB objModelo=new MDB();
        FrmVista objVista=new FrmVista();
        FrmCliente objCliente=new FrmCliente();
        
        ControladorMDB objController;
        ControladorCliente objController1;
        
        objController = new ControladorMDB(objVista,objModelo);
        objController1 = new ControladorCliente(objCliente,objModelo);
        objController.iniciar();
        objController1.iniciar();
        objVista.setVisible(true);
        objCliente.setVisible(true);
            
    }
    
}
