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
import modelo.Precio;
import modelo.PrecioBBDD;
import vista.Ida;
import vista.IdaVuelta;
import vista.InicioSesion;
import vista.Lineas;

public class ControladorIdaVuelta implements ActionListener {

	private IdaVuelta ventanaIdaVuelta;
	private Lineas ventanaLinea;
	private Hora ventanaHora;
	private Precio modeloPrecio;

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
		rellenarHoras2();
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

			InicioSesion inicioSesion = new InicioSesion();
			inicioSesion.setVisible(true);

			ControladorEntrar controladorEntrar = new ControladorEntrar(inicioSesion);
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

	private void deshabilitarFecha() {
		this.ventanaIdaVuelta.getDateChooserIda().setMinSelectableDate(new Date());
		this.ventanaIdaVuelta.getDateChooserVuelta().setMinSelectableDate(new Date());
	}

	private void rellenarHoras2() {

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

	public double distanciaCoord() throws NumberFormatException, SQLException {
		ArrayList<Precio> preciodistancias = new ArrayList<Precio>();

		Paradas origen = (Paradas) this.ventanaIdaVuelta.getTrayectoIda2().getSelectedItem();

		double origenLongitud = Double.parseDouble(PrecioBBDD.obtenerLongOrigen(origen.getCod_parada()).toString());
		double origenLatitud = Double.parseDouble(PrecioBBDD.obtenerLongOrigen(origen.getCod_parada()).toString());
		double destinoLongitud = Double.parseDouble(PrecioBBDD.obtenerLongOrigen(origen.getCod_parada()).toString());
		double DestinoLatitud = Double.parseDouble(PrecioBBDD.obtenerLongOrigen(origen.getCod_parada()).toString());

		double radioTierra = 6371;
		double dLat = Math.toRadians(DestinoLatitud - origenLatitud);
		double dLng = Math.toRadians(destinoLongitud - origenLongitud);
		double sindLat = Math.sin(dLat / 2);
		double sindLng = Math.sin(dLng / 2);
		double va1 = Math.pow(sindLat, 2) + Math.pow(sindLng, 2) * Math.cos(Math.toRadians(origenLatitud))
				* Math.cos(Math.toRadians(DestinoLatitud));
		double va2 = 2 * Math.atan2(Math.sqrt(va1), Math.sqrt(1 - va1));
		double distancia = radioTierra * va2;

		return distancia;
	}

	public void obtenerPrecio(double distancia) throws NumberFormatException, SQLException {

		ArrayList<Paradas> paradas = new ArrayList<Paradas>();
		int origen1 = (int) this.ventanaIdaVuelta.getTrayectoIda2().getSelectedItem();
		int destino = (int) this.ventanaIdaVuelta.getComboBoxIdaVueltaDestino().getSelectedItem();

		for (int i = origen1; i < destino; i++) {

			distanciaCoord();

			int precio = (int) distancia * 8 * 30 / 12;

		}

	}
}