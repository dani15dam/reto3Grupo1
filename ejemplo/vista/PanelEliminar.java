package vista;

import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import java.awt.Color;
import java.util.ArrayList;

import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import modelo.Contacto;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;

public class PanelEliminar extends JPanel {
	private JTable tablaContactos;
	private DefaultTableModel defaultTableModel;

	private JButton btnEliminar;

	/**
	 * Create the panel.
	 */
	public PanelEliminar() {
		setBackground(Color.RED);
		setLayout(null);
		setBounds(288, 11, 688, 541);

	

		JScrollPane jScrollPanel;
		jScrollPanel = new JScrollPane();
		jScrollPanel.setBounds(40, 150, 508, 267);
		add(jScrollPanel);

		String columnas[] = { "Id", "Nombre", "Teléfono", "E-mail" };

		defaultTableModel = new DefaultTableModel(columnas, 0);

		tablaContactos = new JTable(defaultTableModel);
		tablaContactos.setAutoCreateRowSorter(true);
		tablaContactos.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);


		tablaContactos.setDefaultEditor(Object.class, null); //Anulamos la edición en la propia celda

		
		
		jScrollPanel.setViewportView(tablaContactos);


		this.mCrearBotones();

}

	public DefaultTableModel getDefaultTableModel() {
		return defaultTableModel;
	}

	public void setDefaultTableModel(DefaultTableModel defaultTableModel) {
		this.defaultTableModel = defaultTableModel;
	}

	public JTable getTablaContactos() {
		return tablaContactos;
	}

	public void setTablaContactos(JTable tablaContactos) {
		this.tablaContactos = tablaContactos;
	}
	
	private void mCrearBotones() {
		btnEliminar = new JButton("Eliminar contacto");
		btnEliminar.setBounds(409, 108, 89, 23);
		add(btnEliminar);
	}

	public JButton getBtnEliminar() {
		return btnEliminar;
	}

	public void setBtnEliminar(JButton btnEliminar) {
		this.btnEliminar = btnEliminar;
	}
	
	
	
	
}
