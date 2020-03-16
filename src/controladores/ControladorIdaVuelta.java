package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;

import javax.swing.JTextField;

import conexion.Conexion;
import controladores.ControladorIda;
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
	/**
	 * la variable ventanaIda nos permite acceder a la vista Ida y vuelta
	 */
	private IdaVuelta ventanaIdaVuelta;
	/**
	 * la variable ventanaLinea nos permite acceder a la vista Linea
	 */
	private Lineas ventanaLinea;
	/**
	 * la variable hora nos permite acceder a los datos del objeto
	 */
	private Hora ventanaHora;

	private Precio modeloPrecio;

	public ControladorIdaVuelta(IdaVuelta pTrayectoIda) {

		this.ventanaIdaVuelta = pTrayectoIda;

		inicializarControladorIdaVuelta();

	}
	/**
	 * inicializa los atributos y los metodos
	 * @param pTrayectoIda
	 * @param pVentanaLinea
	 * @param pHora
	 */
	public ControladorIdaVuelta(IdaVuelta pTrayectoIda, Lineas pVentanaLinea, Hora pHora) {

		this.ventanaIdaVuelta = pTrayectoIda;
		this.ventanaLinea = pVentanaLinea;
		this.ventanaHora = pHora;

		inicializarControladorIdaVuelta();

		rellenarListaParadas();
		rellenarHoras2();
		deshabilitarFecha();
		
		Calculadora calculadora = new Calculadora(this);
		calculadora.compute();
		ventanaIdaVuelta.getTrayectoIda2().addItemListener(calculadora);
		ventanaIdaVuelta.getComboBoxIdaVueltaDestino().addItemListener(calculadora);	


	}

	public ControladorIdaVuelta() {

	}
	/**
	 * este metodo iicializa los botonees de la ventana ida y vuelta
	 */
	public void inicializarControladorIdaVuelta() {

		this.ventanaIdaVuelta.getBtnSiguienteIdaVuelta().addActionListener(this);
		this.ventanaIdaVuelta.getBtnSiguienteIdaVuelta().setActionCommand("siguiente");

		this.ventanaIdaVuelta.getTrayectoIda2().addActionListener(this);
		this.ventanaIdaVuelta.getTrayectoIda2().setActionCommand("trayectoIda2");

		this.ventanaIdaVuelta.getBtnCancelarIdaVuelta().addActionListener(this);
		this.ventanaIdaVuelta.getBtnCancelarIdaVuelta().setActionCommand("cancelar");

	}
	/**
	 * este metodo da acciones a los botones
	 */
	public void actionPerformed(ActionEvent arg0) {

		String botonPulsado = arg0.getActionCommand();
		/**
		 * con el switch dependiendo del boton pulsado el programa realizara una funcion u otra 
		 */
		switch (botonPulsado) {
		case "siguiente":

			InicioSesion inicioSesion = new InicioSesion();
			inicioSesion.setVisible(true);

			ControladorEntrar controladorEntrar = new ControladorEntrar(inicioSesion,null, ventanaIdaVuelta);
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
	/**
	 * este metodo rellena la lista despegable de las paradas
	 */
	private void rellenarListaParadas() {
		/**
		 * este arraylist guarda las paradas
		 */
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
	/**
	 * este metodo rellena la lista desplegable de las horas
	 */
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
	/**
	 * este metodo deshabilita la fecha de seleccion en el calendario si es anterior a la fecha actual
	 */
	private void deshabilitarFecha() {
		this.ventanaIdaVuelta.getDateChooserIda().setMinSelectableDate(new Date());
		this.ventanaIdaVuelta.getDateChooserVuelta().setMinSelectableDate(new Date());
	}
	/**
	 * este metodo rellena la lista desplegable de las horas
	 */
	private void rellenarHoras2() {
		/**
		 * este arraylist es de tipo hora y reocge las horas que hay
		 */
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
	/**
	 * este metodo calcula la distancia entre las cordenadas
	 * @return
	 * @throws NumberFormatException
	 * @throws SQLException
	 */
	public double distanciaCoord() throws NumberFormatException, SQLException {
	
		/**
		 * este objeto guarda el origen de la lista desplegable
		 */
		Paradas origen = (Paradas) this.ventanaIdaVuelta.getTrayectoIda2().getSelectedItem();
		/**
		 * este objeto guarda el destino de la lista desplegable
		 */
		Paradas destino = (Paradas) this.ventanaIdaVuelta.getComboBoxIdaVueltaDestino().getSelectedItem();

		double origenLongitud = Double.parseDouble(PrecioBBDD.obtenerLongOrigen(origen.getCod_parada()).toString());
		double origenLatitud = Double.parseDouble(PrecioBBDD.obtenerLatOrigen(origen.getCod_parada()).toString());
		double destinoLongitud = Double.parseDouble(PrecioBBDD.obtenerLongDestino(destino.getCod_parada()).toString());
		double DestinoLatitud = Double.parseDouble(PrecioBBDD.obtenerLatDestino(destino.getCod_parada()).toString());
		/**
		 * esta variable es el radio de la tierra que se usara para calcular coordindas
		 */
		double radioTierra = 6371;
		/**
		 * esta variable marca la latitud
		 */
		double dLat = Math.toRadians(DestinoLatitud - origenLatitud);
		/**
		 * esta cariable marca la longitud
		 */
		double dLng = Math.toRadians(destinoLongitud - origenLongitud);
		double sindLat = Math.sin(dLat / 2);
		double sindLng = Math.sin(dLng / 2);
		double va1 = Math.pow(sindLat, 2) + Math.pow(sindLng, 2) * Math.cos(Math.toRadians(origenLatitud))
				* Math.cos(Math.toRadians(DestinoLatitud));
		double va2 = 2 * Math.atan2(Math.sqrt(va1), Math.sqrt(1 - va1));
		double distancia = radioTierra * va2;

		return distancia;
	}
	/**
	 * este metodo calcula el precio teniendo en cuneta la distancia
	 * @param distancia
	 * @return
	 * @throws NumberFormatException
	 * @throws SQLException
	 */
	public double obtenerPrecio(double distancia) throws NumberFormatException, SQLException {
		return distanciaCoord() * 8 * 30 / 12;
	}
	
	public JTextField getPrecio() {
		return ventanaIdaVuelta.getPrecioIda2();
	}
	/**
	 * esta clase permite que al pulsar seleccionar en e arraylist las distancias el precio se rellene
	 * @author Dani
	 *
	 */
	class Calculadora implements ItemListener {
		
		private ControladorIdaVuelta controladorVuelta;
		
		public Calculadora(ControladorIdaVuelta controladorVuelta) {
			System.out.println("handler");
			this.controladorVuelta = controladorVuelta;
		}

		@Override
		public void itemStateChanged(ItemEvent e) {
			compute();
		}
		/**
		 * este metodo rellena el espacio para el precio
		 */
		public void compute() {
			try {
				double distancia = controladorVuelta.distanciaCoord();
				double precio = controladorVuelta.obtenerPrecio(distancia);
				double precioRedondeado=Math.floor(precio*100)/100;
				controladorVuelta.getPrecio().setText(Double.toString(precioRedondeado));
			
			} catch (Exception ignore) {
				ignore.printStackTrace();
			}
			
		}
		
	}
}