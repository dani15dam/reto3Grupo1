package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.ComboBoxModel;

import conexion.Conexion;
import modelo.Hora;
import modelo.LineasBBDD;
import modelo.LineasBus;
import modelo.Paradas;
import modelo.ParadasBBDD;
import modelo.Precio;

import vista.Ida;
import vista.IdaVuelta;
import vista.Lineas;

public class ControladorLineas implements ActionListener {
	/**
	 * esta es una variable que llama a la ventana lineas
	 */
	private Lineas ventanaLinea;
	/**
	 * variable del objeto hora
	 */
	private Hora ventanaHoras;
	/**
	 * variable del objeto precio
	 */
	private Precio precio;
	
	public ControladorLineas(Lineas pLineas) {

		this.ventanaLinea = pLineas;
		inicializarControlador();
		rellenarComboParadas();

	}
	/**
	 * este metodo inicializa los botones
	 */
	public void inicializarControlador() {

		this.ventanaLinea.getBtnSiguienteLineas().addActionListener(this);
		this.ventanaLinea.getBtnSiguienteLineas().setActionCommand("btnSiguiente");


	}
	/**
	 * otorga una accion a cada boton
	 */
	@Override
	public void actionPerformed(ActionEvent e) {
		/**
		 * dependiendo el boton seleccionado el programa realizara una funcion
		 
		 */
		switch (e.getActionCommand()) {

		case "btnSiguiente":
			String tipo = ventanaLinea.getTipoLinea().getSelectedItem().toString();
			/**
			 * este if compara la eleccion del boton y dependiendo de la seleccion abrira una ventana u otra
			 */
			if (tipo.equalsIgnoreCase("ida")) {
				Ida ida = new Ida();
				ida.getIda().setVisible(true);

				ControladorIda controladorida = new ControladorIda(ida, this.ventanaLinea, ventanaHoras);
				ventanaLinea.getLineas().dispose();
			} else {
				IdaVuelta idaVuelta = new IdaVuelta();
				idaVuelta.getIdaVuelta().setVisible(true);

				ControladorIdaVuelta controladorida = new ControladorIdaVuelta(idaVuelta, this.ventanaLinea,
						ventanaHoras);
			}

			break;

		}
	}
	/**
	 * este metodo rellena la lista de lineas
	 */
	private void rellenarComboParadas() {
		/**
		 * este arraylist obtiene las lineas
		 */
		ArrayList<LineasBus> linea = new ArrayList<LineasBus>();
		try {
			linea = LineasBBDD.obtenerLineas();
			for (int i = 0; i < linea.size(); i++) {
				this.ventanaLinea.getComboBoxLineas().addItem(linea.get(i));
			}

		} catch (SQLException e) {

			e.printStackTrace();
		}
	}
}
