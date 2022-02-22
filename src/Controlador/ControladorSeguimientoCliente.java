/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.MDB;
import Vista.FrmSeguimientoCliente;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author 980013684
 */
public class ControladorSeguimientoCliente implements ActionListener{
    private FrmSeguimientoCliente _view; //el formulario esat se modifica***********************************************
  private MDB _model;//el manejador de bases de datos

    
    public ControladorSeguimientoCliente(FrmSeguimientoCliente view, MDB model){
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
         //En estas linea se toman los valores puestos en el formulario, para llevarlos a la base de datos.
        leyenda=_model.registrarAlta("seguimiento_clientes"," null, ' " +_view.txtCedula.getText()+" ',' " +_view.txtLugarExpcn.getText() +" ', "
                + ""+_view.txtNombre.getText()+" ',' " +_view.txtProfesion.getText()+" ',' " +_view.txtDireccion.getText()+" ',' " +_view.txtCiudad.getText()+" ',' "
                        + "" +_view.txtDepartamento.getText()+ "" +_view.txtEmail.getText()+" ',' " +_view.txtTel_Residencia.getText() +" ', "+ ""+_view.txtTel_Trabajo.getText()+" ',' " +_view.txtNum_Factura.getText()+" ',' " +_view.txtTipo_Cartera.getText()+" ',' " +_view.txtFecha_Mora.getText()+" ',' "+ "" +_view.txtDias_Mora.getText() +_view.txtValMora.getText()+ "" +_view.txtVSeguro.getText()+ "" +_view.txtInteresMora.getText()
                            + "" +_view.txtSaldRestante.getText()+ "" +_view.txtTipoCobro.getText()+ "" +_view.txtFechaAcuerdoUno.getText()+ "" +_view.txtAcuerdoUno.getText()
                                    + "" +_view.txtFechaAcuerdoDos.getText()+""+_view.txtAcuerdoDos.getText()+""+_view.txtFechaAcuerdoTres.getText()+""+_view.txtAcuerdoTres.getText()+""+_view.txtFechaAcuerdoCuatro.getText()+""+_view.txtAcuerdoCuatro.getText());//**************
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
_view.txtCedula.setText(null);//********************************************
_view.txtLugarExpcn.setText(null);
_view.txtNombre.setText(null);
_view.txtProfesion.setText(null);
_view.txtDireccion.setText(null);
_view.txtCiudad.setText(null);
_view.txtDepartamento.setText(null);
_view.txtEmail.setText(null);
_view.txtTel_Residencia.setText(null);
_view.txtTel_Trabajo.setText(null);
_view.txtNum_Factura.setText(null);
_view.txtTipo_Cartera.setText(null);
_view.txtFecha_Mora.setText(null);
_view.txtDias_Mora.setText(null);
_view.txtValMora.setText(null);
_view.txtVSeguro.setText(null);
_view.txtInteresMora.setText(null);
_view.txtSaldRestante.setText(null);
_view.txtTipoCobro.setText(null);
_view.txtFechaAcuerdoUno.setText(null);
_view.txtAcuerdoUno.setText(null);
_view.txtFechaAcuerdoDos.setText(null);
_view.txtAcuerdoDos.setText(null);
_view.txtFechaAcuerdoTres.setText(null);
_view.txtAcuerdoTres.setText(null);
_view.txtFechaAcuerdoCuatro.setText(null);
_view.txtAcuerdoCuatro.setText(null);
}
}
