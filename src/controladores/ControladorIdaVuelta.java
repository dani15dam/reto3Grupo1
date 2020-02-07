package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import conexion.Conexion;
import modelo.Hora;
import modelo.HoraBBDD;
import modelo.LineasBus;
import modelo.Paradas;
import modelo.ParadasBBDD;
import vista.Cuenta;
import vista.Ida;
import vista.IdaVuelta;
import vista.Lineas;

public class ControladorIdaVuelta implements ActionListener {

	private IdaVuelta ventanaIdaVuelta;
	private Lineas ventanaLinea;
	private Hora ventanaHora;

	public ControladorIdaVuelta(IdaVuelta pTrayectoIda) {

		this.ventanaIdaVuelta = pTrayectoIda;

		inicializarControladorIdaVuelta();

	}

	public ControladorIdaVuelta(IdaVuelta pTrayectoIda, Lineas pVentanaLinea, Hora pHora) {

		this.ventanaIdaVuelta = pTrayectoIda;
		this.ventanaLinea = pVentanaLinea;
		this.ventanaHora = pHora;

		inicializarControladorIdaVuelta();

		rellenarListaParadas();
		rellenarHoras();
		deshabilitarFecha();

	}

	public ControladorIdaVuelta() {

	}

	public void inicializarControladorIdaVuelta() {

		this.ventanaIdaVuelta.getBtnSiguienteIdaVuelta().addActionListener(this);
		this.ventanaIdaVuelta.getBtnSiguienteIdaVuelta().setActionCommand("siguiente");

		this.ventanaIdaVuelta.getTrayectoIda2().addActionListener(this);
		this.ventanaIdaVuelta.getTrayectoIda2().setActionCommand("trayectoIda2");

		this.ventanaIdaVuelta.getBtnCancelarIdaVuelta().addActionListener(this);
		this.ventanaIdaVuelta.getBtnCancelarIdaVuelta().setActionCommand("cancelar");

	}

	public void actionPerformed(ActionEvent arg0) {

		String botonPulsado = arg0.getActionCommand();

		switch (botonPulsado) {
		case "siguiente":

			Cuenta cuenta = new Cuenta();
			cuenta.getCuenta().setVisible(true);

			ControladorCuenta controladorCuenta = new ControladorCuenta(cuenta);
			ventanaIdaVuelta.getIdaVuelta().dispose();

			break;

		case "trayectoIda2":

			break;

		case "cancelar":
			Lineas lineas = new Lineas();
			lineas.getLineas().setVisible(true);

			ControladorLineas controladorLineas = new ControladorLineas(lineas);
			ventanaIdaVuelta.getIdaVuelta().dispose();

			break;

		}
	}

	private void rellenarListaParadas() {

		ArrayList<Paradas> paradas = new ArrayList<Paradas>();
		LineasBus linea = (LineasBus) this.ventanaLinea.getComboBoxLineas().getSelectedItem();

		try {
			paradas = ParadasBBDD.obtenerParadas(linea.getCod_lineas());

			for (int i = 0; i < paradas.size(); i++) {

				this.ventanaIdaVuelta.getTrayectoIda2().addItem(paradas.get(i));
				this.ventanaIdaVuelta.getComboBoxIdaVueltaDestino().addItem(paradas.get(i));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	private void rellenarHoras() {

		ArrayList<Hora> hora = new ArrayList<Hora>();

		LineasBus linea = (LineasBus) this.ventanaLinea.getComboBoxLineas().getSelectedItem();

		try {

			hora = HoraBBDD.obtenerHoras(linea.getCod_lineas());

			for (int i = 0; i < hora.size(); i++) {

				this.ventanaIdaVuelta.getHoraIda().addItem(hora.get(i).getHora());
				this.ventanaIdaVuelta.getHoraVuelta().addItem(hora.get(i).getHora());

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void deshabilitarFecha() {
		this.ventanaIdaVuelta.getDateChooserIda().setMinSelectableDate(new Date());
		this.ventanaIdaVuelta.getDateChooserVuelta().setMinSelectableDate(new Date());
	}
}