 package controladores;

import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.sql.SQLException;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import modelo.Cliente;
import modelo.ClienteBD;
import vista.InicioSesion;
import vista.Ida;
import vista.IdaVuelta;
import vista.Inicio;
import vista.Pago;
import vista.Registro;

public class ControladorEntrar implements ActionListener {

	private InicioSesion vistaEntrar;
	private Ida ventanaIda;
	private IdaVuelta ventanaIdaVuelta;
	public ControladorEntrar(InicioSesion pEntrar,Ida ventanaIda, IdaVuelta ventanaIdaVuelta) {

		this.vistaEntrar = pEntrar;
		this.ventanaIda = ventanaIda;
		this.ventanaIdaVuelta = ventanaIdaVuelta;
		inicializarControlador();
	}

	public void inicializarControlador() {

		this.vistaEntrar.getBtnContinuar().addActionListener(this);
		this.vistaEntrar.getBtnContinuar().setActionCommand(InicioSesion.enumAcciones.BtnContinuar.toString());
		this.vistaEntrar.getBtnSalir().addActionListener(this);
		this.vistaEntrar.getBtnSalir().setActionCommand(InicioSesion.enumAcciones.BtnSalir.toString());
		this.vistaEntrar.getBtnCrearCuenta().addActionListener(this);
		this.vistaEntrar.getBtnCrearCuenta().setActionCommand(InicioSesion.enumAcciones.BtnCrearCuenta.toString());
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		InicioSesion.enumAcciones accion = InicioSesion.enumAcciones.valueOf(e.getActionCommand());

		switch (accion) {

		case BtnContinuar:

			try {

				this.validar();

			} catch (HeadlessException | SQLException e1) {

				e1.printStackTrace();
			}

			break;

		case BtnSalir:
			
			Inicio inicio = new Inicio();
			inicio.setVisible(true);

	
			vistaEntrar.dispose();

			break;

		case BtnCrearCuenta:

			Registro vistaRegistro = new Registro();

			vistaEntrar.setVisible(false);

			vistaRegistro.setVisible(true);

			ControladorRegistro controladorRegistro = new ControladorRegistro(vistaRegistro, ventanaIda, ventanaIdaVuelta);

			break;

		}

	}

	private void validar() throws HeadlessException, SQLException {

		String dni = this.vistaEntrar.getTextFieldDni().getText();
		String contrasena = this.vistaEntrar.getPasswordField().getText();

		ClienteBD clienteBD = new ClienteBD();

		if (clienteBD.mBuscarContacto(dni, contrasena) == true) {

			Pago ventanaPago = new Pago();
			ventanaPago.setVisible(true);

			ControladorPago controladorPago = new ControladorPago(ventanaPago, ventanaIda, ventanaIdaVuelta);

			vistaEntrar.dispose();

		} else

			JOptionPane.showMessageDialog(null, "datos incorrectos");

	}

}

