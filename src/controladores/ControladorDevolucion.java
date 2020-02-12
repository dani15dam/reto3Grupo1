package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import vista.Devolucion;

public class ControladorDevolucion {

	private Devolucion vistaDevolucion;

	public ControladorDevolucion(Devolucion pDevolucion) {

		this.vistaDevolucion = pDevolucion;

		inicializarControlador();

	}

	public void inicializarControlador() {

		this.vistaDevolucion.getBtnTicket().addActionListener((ActionListener) this);
		this.vistaDevolucion.getBtnTicket().setActionCommand(Devolucion.enumAcciones.BtnTicket.toString());

	}

	public void actionPerformed(ActionEvent e) {

		Devolucion.enumAcciones accion = Devolucion.enumAcciones.valueOf(e.getActionCommand());

		switch (accion) {

		case BtnTicket:

			break;

		}
	}
}
