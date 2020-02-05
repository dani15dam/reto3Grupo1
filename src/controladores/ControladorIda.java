package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import modelo.LineasBus;
import modelo.Paradas;
import modelo.ParadasBBDD;
import vista.Cuenta;
import vista.Ida;
import vista.Lineas;

public class ControladorIda implements ActionListener {

	private Ida ventanaIda;
	private Lineas ventanaLinea;
	
	public ControladorIda(Ida pTrayecto) {
		this.ventanaIda = pTrayecto;
		
		inicializarControlador();

	}
	

	public ControladorIda(Ida pTrayecto ,Lineas pVentanaLinea) {

		this.ventanaIda = pTrayecto;
		this.ventanaLinea=pVentanaLinea;
		
		inicializarControlador();
		
		rellenarListaParadas();

	}
	
	public ControladorIda(){
		
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

			Cuenta cuenta = new Cuenta();
			cuenta.getCuenta().setVisible(true);

			ControladorCuenta controladorCuenta = new ControladorCuenta(cuenta);
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

	private void rellenarListaParadas() {
		
		ArrayList<Paradas> paradas= new ArrayList<Paradas>();
		LineasBus linea=(LineasBus) this.ventanaLinea.getComboBoxLineas().getSelectedItem();
		
		try {			
			paradas = ParadasBBDD.obtenerParadas(linea.getCod_lineas());
			
			for (int i = 0; i < paradas.size(); i++) {
				
				this.ventanaIda.getTrayectoIda().addItem(paradas.get(i));
				this.ventanaIda.getCbDestinoIda().addItem(paradas.get(i));
				

			}

		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
		}
	}
	
		
	
}
	

