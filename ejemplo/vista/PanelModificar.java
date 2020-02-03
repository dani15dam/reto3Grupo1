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

public class PanelModificar extends JPanel {
	private JTable tablaContactos;
	private DefaultTableModel defaultTableModel;

	private JTextField txtNombre;
	private JTextField txtTelfono;
	private JTextField txtEmail;
	private JButton btnModificar;

	/**
	 * Create the panel.
	 */
	public PanelModificar() {
		setBackground(Color.PINK);
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
		this.mCrearEtiquetas();
		this.mCrearCamposDeTexto();
	

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

	public JTextField getTxtNombre() {
		return txtNombre;
	}

	public void setTxtNombre(JTextField txtNombre) {
		this.txtNombre = txtNombre;
	}

	public JTextField getTxtTelfono() {
		return txtTelfono;
	}

	public void setTxtTelfono(JTextField txtTelfono) {
		this.txtTelfono = txtTelfono;
	}

	public JTextField getTxtEmail() {
		return txtEmail;
	}

	public void setTxtEmail(JTextField txtEmail) {
		this.txtEmail = txtEmail;
	}

	public JButton getBtnModificar() {
		return btnModificar;
	}

	public void setBtnModificar(JButton btnModificar) {
		this.btnModificar = btnModificar;
	}

	
	private void mCrearEtiquetas() {

		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNombre.setBounds(40, 26, 145, 41);
		add(lblNombre);

		JLabel lblTelfono = new JLabel("Tel\u00E9fono:");
		lblTelfono.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblTelfono.setBounds(40, 78, 85, 14);
		add(lblTelfono);

		JLabel lblEmail = new JLabel("E-mail:");
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEmail.setBounds(256, 78, 49, 14);
		add(lblEmail);
	}

	private void mCrearCamposDeTexto() {
		txtNombre = new JTextField();
		txtNombre.setText("");
		txtNombre.setBounds(129, 38, 255, 20);
		add(txtNombre);
		txtNombre.setColumns(10);

		txtTelfono = new JTextField();
		txtTelfono.setText("");
		txtTelfono.setBounds(129, 77, 96, 20);
		add(txtTelfono);
		txtTelfono.setColumns(10);

		txtEmail = new JTextField();
		txtEmail.setText("");
		txtEmail.setBounds(315, 77, 188, 20);
		add(txtEmail);
		txtEmail.setColumns(10);
	}

	private void mCrearBotones() {
		btnModificar = new JButton("Modificar contacto");
		btnModificar.setBounds(409, 108, 89, 23);
		add(btnModificar);
	}
	
	public void mLimpiarTxt() {
		txtNombre.setText("");
		txtTelfono.setText("");
		txtEmail.setText("");
	}
	
	
}
