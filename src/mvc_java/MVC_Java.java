/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc_java;

import Controlador.ControladorMDB;
import Controlador.ControladorSeguimientoCliente;
import Modelo.MDB;
import Vista.FrmSeguimientoCliente;
import Vista.FrmVista;

/**
 *
 * @author Stevia
 */
public class MVC_Java {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //FrmCliente
        MDB objModelo=new MDB();
        FrmVista objVista=new FrmVista();
        ControladorMDB objController;
        
        objController = new ControladorMDB(objVista,objModelo);
        objController.iniciar();
        objVista.setVisible(true);
        //FrmSeguimientoCliente
        MDB objModeloSc=new MDB();
        FrmSeguimientoCliente objVistaSC=new FrmSeguimientoCliente();
        ControladorSeguimientoCliente objControllerSC;
        
        objControllerSC = new ControladorSeguimientoCliente(objVistaSC,objModeloSc);
        objControllerSC.iniciar();
        objVistaSC.setVisible(true); 
    }
}