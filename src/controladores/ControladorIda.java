package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import vista.Cuenta;
import vista.Ida;

public class ControladorIda implements ActionListener {

	private Ida ventanaIda;

	public ControladorIda(Ida ptrayecto) {

		this.ventanaIda = ptrayecto;
		inicializarControlador();

	}
	
	public ControladorIda(){
		
	}

	public void inicializarControlador() {

		// inicializar botones
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

			break;

		}
	}

	public ArrayList<String> ParadasLinea1() {
		ArrayList<String> listaParadasLinea1 = new ArrayList<>();
		listaParadasLinea1.add("parada1");
		listaParadasLinea1.add("parada2");
		return listaParadasLinea1;

	}

	public ArrayList<String> ParadasLinea2() {
		ArrayList<String> listaParadasLinea2 = new ArrayList<String>();
		listaParadasLinea2.add("parada3");
		listaParadasLinea2.add("parada4");
		return listaParadasLinea2;
	}

	public ArrayList<String> ParadasLinea3() {
		ArrayList<String> listaParadasLinea3 = new ArrayList<String>();
		listaParadasLinea3.add("parada5");
		listaParadasLinea3.add("parada6");
		return listaParadasLinea3;
	}
	

}