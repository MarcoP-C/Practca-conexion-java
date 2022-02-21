/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.MDB;
import Vista.FrmCliente;
//import Vista.FrmVista;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class ControladorCliente implements ActionListener {
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
        leyenda=_model.registrarAlta("clientes"," null, ' " +_view.txtCedula.getText()+" ',' " +_view.txtLugarExp.getText() +" ', "+_view.txtNombreCom.getText()+" ', "+_view.txtProfesion.getText()+" ', "+_view.txtDireccion.getText()+" ', "+_view.txtCiudad.getText()+" ', "+_view.txtDepartamento.getText()+_view.txtEmail.getText() +_view.txtCelRecidencia.getText()+_view.txtTelTrabajo.getText() +_view.txtFechaCredito.getText() +_view.txtTipoCartera.getText() +_view.txtValorCredito.getText()+_view.txtNumCuotas.getText());//**************
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
_view.txtCedula.setText(null); //********************************************
_view.txtLugarExp.setText(null);
_view.txtNombreCom.setText(null);
_view.txtProfesion.setText(null);
_view.txtDireccion.setText(null);
_view.txtCiudad.setText(null);
_view.txtDepartamento.setText(null);
_view.txtEmail.setText(null);
_view.txtCelRecidencia.setText(null);
_view.txtTelTrabajo.setText(null);
_view.txtFechaCredito.setText(null);
_view.txtTipoCartera.setText(null);
_view.txtValorCredito.setText(null);
_view.txtNumCuotas.setText(null);

}
}
