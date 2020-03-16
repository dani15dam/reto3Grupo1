package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Date;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

import modelo.Cliente;
import modelo.ClienteBD;
import vista.Ida;
import vista.IdaVuelta;
import vista.InicioSesion;

import vista.Pago;
import vista.Registro;

public class ControladorRegistro implements ActionListener {

	private Registro vistaRegistro;
	private Ida ventanaIda;		
	private IdaVuelta ventanaIdaVuelta;
	public ControladorRegistro(Registro pRegistro, Ida ventanaIda, IdaVuelta ventanaIdaVuelta) {

		this.vistaRegistro = pRegistro;
		
		inicializarControlador();
		
		this.ventanaIda = ventanaIda;
		this.ventanaIdaVuelta = ventanaIdaVuelta;
	}

	public void inicializarControlador() {

		this.vistaRegistro.getBtnContinuar().addActionListener(this);
		this.vistaRegistro.getBtnContinuar().setActionCommand(Registro.enumAcciones.BtnContinuar.toString());

		this.vistaRegistro.getBtnVolver().addActionListener(this);
		this.vistaRegistro.getBtnVolver().setActionCommand(Registro.enumAcciones.BtnVolver.toString());
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Registro.enumAcciones accion = Registro.enumAcciones.valueOf(e.getActionCommand());

		switch (accion) {

		case BtnVolver:

			InicioSesion vistaInicioSesion = new InicioSesion();

			vistaRegistro.setVisible(false);

			vistaInicioSesion.setVisible(true);

			ControladorEntrar controladorEntrar = new ControladorEntrar(vistaInicioSesion, ventanaIda, ventanaIdaVuelta);

			break;

		case BtnContinuar:

			try {
				if (registrar()) {

					Pago ventanaPago = new Pago();
					ventanaPago.setVisible(true);

					ControladorPago controladorPago = new ControladorPago(ventanaPago, ventanaIda, ventanaIdaVuelta);

					vistaRegistro.dispose();

				}
			} catch (ParseException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			break;
		}

	}

	private void validarUsuario() throws SQLException {

		String dni = this.vistaRegistro.getTextFieDni().getText();
		String contrasena = this.vistaRegistro.getTextFieCont().getText();

		ClienteBD clienteBD = new ClienteBD();

	}

	private boolean registrar() throws ParseException {

		Cliente cliente = new Cliente();

		boolean aux = true;

		if (vistaRegistro.getTextFieDni().getText().equals("") || vistaRegistro.getTextFieNombre().getText().equals("")
				|| vistaRegistro.getTextFielApellido().getText().equals("")
				|| vistaRegistro.getTextFieCont().getText().equals("")) {

			aux = false;

		}

		cliente.setDni(vistaRegistro.getTextFieDni().getText());

		cliente.setNombre(vistaRegistro.getTextFieNombre().getText());

		cliente.setApellidos(vistaRegistro.getTextFielApellido().getText());

		cliente.setFechaNaci(vistaRegistro.getTextFecNac().getText());

		if (vistaRegistro.getComboBoxSexo().getSelectedItem().equals("HOMBRE")) {

			cliente.setSexo("H");

		} else {

			cliente.setSexo("M");
		}

		cliente.setCont(vistaRegistro.getTextFieCont().getText());

		ClienteBD clienteBD = new ClienteBD();
		clienteBD.mInsetarContacto(cliente);

		return aux;

	}

}