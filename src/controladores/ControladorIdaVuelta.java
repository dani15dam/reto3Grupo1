package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import vista.Cuenta;
import vista.IdaVuelta;



public class ControladorIdaVuelta implements ActionListener  {
	

private IdaVuelta ventanaIdaVuelta;

public ControladorIdaVuelta(IdaVuelta pTrayectoIda, IdaVuelta pTrayectoVuelta) {
	
	this.ventanaIdaVuelta =pTrayectoIda;
	this.ventanaIdaVuelta=pTrayectoVuelta;
	
	inicializarControladorIdaVuelta();
	
	
}
public ControladorIdaVuelta(){
	
}	
	public void inicializarControladorIdaVuelta() {
		
		this.ventanaIdaVuelta.getBtnSiguienteIdaVuelta().addActionListener(this);
		this.ventanaIdaVuelta.getBtnSiguienteIdaVuelta().setActionCommand("siguiente");
		
		this.ventanaIdaVuelta.getTrayectoIda2().addActionListener(this);
		this.ventanaIdaVuelta.getTrayectoIda2().setActionCommand("trayectoIda2");
		
		this.ventanaIdaVuelta.getTrayectoVuelta().addActionListener(this);
		this.ventanaIdaVuelta.getTrayectoVuelta().setActionCommand("trayectoVuelta");
		
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
		case "trayectoIdaVuelta":
			
			break;

		case "cancelar":

			break;

		}
	}
	
	public ArrayList<String> ParadasLinea1() {
		ArrayList<String> listaParadasLinea1 = new ArrayList<String>();
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