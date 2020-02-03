package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.ComboBoxModel;

import conexion.Conexion;
import modelo.LineasBus;
import modelo.Paradas;
import modelo.ParadasBBDD;
import vista.Ida;
import vista.IdaVuelta;
import vista.Lineas;

public class ControladorLineas implements ActionListener {

	private Lineas ventanaLinea;

	public ControladorLineas(Lineas pLineas) {

		this.ventanaLinea = pLineas;

		inicializarControlador();
		rellenarComboParadas();

	}

	public void inicializarControlador() {

		this.ventanaLinea.getBtnSiguienteLineas().addActionListener(this);
		this.ventanaLinea.getBtnSiguienteLineas().setActionCommand("btnSiguiente");
//		
//		this.ventanaTrayecto.getBtnSalir().addActionListener(this);
//		this.ventanaTrayecto.getBtnSalir().setActionCommand("btnSalir");
//

	}

	@Override
	public void actionPerformed(ActionEvent e) {

		switch (e.getActionCommand()) {

		case "btnSiguiente":

			String tipo = ventanaLinea.getTipoLinea().getSelectedItem().toString();

//			if (tipo.equalsIgnoreCase("ida")) {
//				ventanaLinea.getLineas().setVisible(false);
//				Ida d;
//				if (ventanaLinea.getRbBilbaoDonostia().isSelected())
//					d = new Ida("Bilbao-Donostia");
//				else if (ventanaLinea.getRbBilbaoMunguia().isSelected())
//					d = new Ida("Bilbao-Mungia");
//				else
//					d = new Ida("Bilbao-Gernika");
//				d.getIda().setVisible(true);
//
//			} else {
//				ventanaLinea.getLineas().setVisible(false);
//				IdaVuelta f;
//				if (ventanaLinea.getRbBilbaoDonostia().isSelected())
//					f = new IdaVuelta("Bilbao-Donostia");
//				else if (ventanaLinea.getRbBilbaoMunguia().isSelected())
//					f = new IdaVuelta("Bilbao-Mungia");
//				else
//					f = new IdaVuelta("Bilbao-Gernika");
//				f.getIdaVuelta().setVisible(true);
//
//			}

			break;

		}
	}

	private void rellenarComboParadas() {
		
		
		ArrayList<Paradas> paradas = new ArrayList<Paradas>();
		
		LineasBus linea = (LineasBus) this.ventanaLinea.getComboBoxLineas().getSelectedItem();
		 

		try {
			
			paradas = ParadasBBDD.obtenerParadas(linea.getNombreBus());

			for (int i = 0; i < paradas.size(); i++) {

				this.ventanaLinea.getComboBoxLineas().addItem(paradas.get(i));
				

			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

	


