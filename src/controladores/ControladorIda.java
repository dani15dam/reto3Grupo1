package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JOptionPane;

import modelo.Fecha;
import modelo.Hora;
import modelo.HoraBBDD;
import modelo.LineasBBDD;
import modelo.LineasBus;
import modelo.Paradas;
import modelo.ParadasBBDD;
import modelo.Precio;
import modelo.PrecioBBDD;
import vista.Ida;
import vista.InicioSesion;
import vista.Lineas;

public class ControladorIda implements ActionListener {

	private Ida ventanaIda;
	private Lineas ventanaLinea;
	private Hora ventanaHora;
	private Fecha fechaActual;

	private Fecha fechas = new Fecha();

	public ControladorIda(Ida pTrayecto) {

		this.ventanaIda = pTrayecto;

		inicializarControlador();

	}

	public ControladorIda(Ida pTrayecto, Lineas pVentanaLinea, Hora pHora) {

		this.ventanaIda = pTrayecto;
		this.ventanaLinea = pVentanaLinea;
		this.ventanaHora = pHora;

		inicializarControlador();

		rellenarListaParadas();

		rellenarHoras();

		deshabilitarFecha();

	}

	public ControladorIda() {

	}

	public void inicializarControlador() {

		this.ventanaIda.getBtnSiguienteIda().addActionListener(this);
		this.ventanaIda.getBtnSiguienteIda().setActionCommand("siguiente");

		this.ventanaIda.getTrayectoIda().addActionListener(this);
		this.ventanaIda.getTrayectoIda().setActionCommand("trayecto");

		this.ventanaIda.getBtnCancelarIda().addActionListener(this);
		this.ventanaIda.getBtnCancelarIda().setActionCommand("cancelar");

	}

	public void actionPerformed(ActionEvent e) {

		String botonPulsado = e.getActionCommand();

		switch (botonPulsado) {
		case "siguiente":

			JOptionPane.showMessageDialog(null, "la fecha: " + fechas.getFecha(ventanaIda.getDateChooserFechaIda()));

			InicioSesion sesion = new InicioSesion();
			sesion.setVisible(true);

			ControladorEntrar controladorCuenta = new ControladorEntrar(sesion);
			ventanaIda.getIda().dispose();

			break;

		case "trayecto":

			break;

		case "cancelar":

			Lineas lineas = new Lineas();
			lineas.getLineas().setVisible(true);

			ControladorLineas controladorLineas = new ControladorLineas(lineas);
			ventanaIda.getIda().dispose();

			break;

		}
	}

	public void rellenarListaParadas() {

		ArrayList<Paradas> paradas = new ArrayList<Paradas>();
		LineasBus linea = (LineasBus) this.ventanaLinea.getComboBoxLineas().getSelectedItem();

		try {
			paradas = ParadasBBDD.obtenerParadas(linea.getCod_lineas());

			for (int i = 0; i < paradas.size(); i++) {

				this.ventanaIda.getTrayectoIda().addItem(paradas.get(i));
				this.ventanaIda.getCbDestinoIda().addItem(paradas.get(i));

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	public void rellenarHoras() {

		ArrayList<Hora> hora = new ArrayList<Hora>();

		LineasBus linea = (LineasBus) this.ventanaLinea.getComboBoxLineas().getSelectedItem();

		try {

			hora = HoraBBDD.obtenerHoras(linea.getCod_lineas());

			for (int i = 0; i < hora.size(); i++) {

				this.ventanaIda.getHoraIda().addItem(hora.get(i).getHora());

			}

		} catch (SQLException e) {

			e.printStackTrace();
		}

	}

	public void deshabilitarFecha() {
		this.ventanaIda.getDateChooserFechaIda().setMinSelectableDate(new Date());
	}
//	public void JcomboBoxItemStateChanged() {
//		if (this.ventanaIda.getTrayectoIda().getItemCount()>0) {
//			
//		}
//	}

	public double distanciaCoord() throws NumberFormatException, SQLException {
		ArrayList<Precio> preciodistancias = new ArrayList<Precio>();

		Paradas origen = (Paradas) this.ventanaIda.getTrayectoIda().getSelectedItem();

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

	public double obtenerPrecio(double distancia) throws NumberFormatException, SQLException {

		ArrayList<Paradas> paradas = new ArrayList<Paradas>();
		double precio = 0;
		double origen1 = (double) this.ventanaIda.getCbDestinoIda().getSelectedItem();
		double destino = (double) this.ventanaIda.getTrayectoIda().getSelectedItem();

		for (double i = origen1; i < destino; i++) {

			distanciaCoord();

			precio = (double) distancia * 8 * 30 / 12;

		}
		return precio;

	}
}
	

