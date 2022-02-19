/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.MDB;
import Vista.FrmCliente;
//import Vista.FrmVista;
import java.awt.event.ActionEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class ControladorCliente {
    private FrmCliente _view; //el formulario esat se modifica***********************************************
  private MDB _model;//el manejador de bases de datos

    
    public ControladorCliente(FrmCliente view, MDB model){
       this._model=model;
       this._view=view;
       this._view.cmdAlta.addActionListener(this);//se obtiene el control sobre el botón alta del formulario
       this._view.cmdEliminar.addActionListener(this);//se obtiene el control de botón eliminar
}
@Override
//En este método se ΗatrapaΗ la interacción del usuario
public void actionPerformed(ActionEvent e) {
        String leyenda="";//esta variable servirá para atrapar los errores sql

        if (e.getSource()==_view.cmdAlta){ //Si el botón presionado fue el de alta
         // System.out.print("paso");
        leyenda=_model.registrarAlta("clientes"," null, ' " +_view.txtNombre.getText()+" ',' " +_view.txtUsuario.getText() +" ', "+_view.txtpsw.getText() );//**************
        //Se puede usar una variable o el control, lo ideal es que se pudiera llamar una función de
       // validación aquí sobre los datos obteindos de las cajas de texto
       System.out.print (leyenda);
       JOptionPane.showMessageDialog(null, leyenda);//Se manda mensaje con elresultado de la
        //consulta de inserción
        limpiar();//se limpian las cajas de texto
        //agregar otros botones si se necesitan implementar
}
}
public void iniciar(){
_view.setTitle("MVC_Visual");
}
public void limpiar(){
_view.txtNombre.setText(null); //********************************************
_view.txtUsuario.setText(null);

_view.txtpsw.setText(null);
}
}
