package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import modelo.Cliente;
import vista.Cuenta;
import vista.Lineas;

public class ControladorCuenta implements ActionListener {

	private Cuenta ventanaCuenta;

	public ControladorCuenta(Cuenta pVentanaCuenta) {
		this.ventanaCuenta = pVentanaCuenta;

		inicializarControlador();

	}

	public void inicializarControlador() {

		// inicializar botones
		this.ventanaCuenta.getBtnIniciarSesion().addActionListener(this);
		this.ventanaCuenta.getBtnIniciarSesion().setActionCommand("BtnIniciarSesion");

		this.ventanaCuenta.getBtnCrear().addActionListener(this);
		this.ventanaCuenta.getBtnCrear().setActionCommand("crear");

		this.ventanaCuenta.getBtnSiguienteCuenta().addActionListener(this);
		this.ventanaCuenta.getBtnSiguienteCuenta().setActionCommand("siguiente");

		this.ventanaCuenta.getCancelarCuenta().addActionListener(this);
		this.ventanaCuenta.getCancelarCuenta().setActionCommand("cancelar");

	}

	public void actionPerformed(ActionEvent e) {

		String botonPulsado = e.getActionCommand();

		switch (botonPulsado) {
		case "BtnIniciarSesion":
			this.logear();

			break;

		case "crear":
			this.crearCuenta();
			break;
		case "siguiente":

			break;

		}

	}

	public void logear() {

		Cliente cliente = new Cliente();

		String dni = this.ventanaCuenta.getCrearDNI().getText();
		String contrasena = this.ventanaCuenta.getCrearNombre().getText();

		cliente.logear(dni, contrasena);

	}

	public void crearCuenta() {

	}

	public void mostarSiguienteCuenta() {

	}

}
