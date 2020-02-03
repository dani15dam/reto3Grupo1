package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.event.TableModelEvent;
import javax.swing.event.TableModelListener;

import modelo.Contacto;
import vista.Principal;


public class ControladorContacto implements ActionListener, ListSelectionListener {

	private vista.Principal vistaPrincipal;
	
	
	/*
	 * *** CONSTRUCTORES ***
	 */
	
	/*
	 * Contructor del objeto controlador
	 * @param vistaPrincipal Objeto vista.
	 */
	public ControladorContacto(vista.Principal vistaPrincipal) {
		this.vistaPrincipal = vistaPrincipal;
		
		this.inicializarControlador();
		
	}

	
	
	private void inicializarControlador() {


		// Acciones del menú izquierdo
		this.vistaPrincipal.getBtnConsultarContactos().addActionListener(this);
		this.vistaPrincipal.getBtnConsultarContactos()
				.setActionCommand(Principal.enumAcciones.CARGAR_PANEL_CONSULTA.toString());

		this.vistaPrincipal.getBtnInsertarContacto().addActionListener(this);
		this.vistaPrincipal.getBtnInsertarContacto()
				.setActionCommand(Principal.enumAcciones.CARGAR_PANEL_INSERTAR.toString());

		this.vistaPrincipal.getBtnModificarContacto().addActionListener(this);
		this.vistaPrincipal.getBtnModificarContacto()
				.setActionCommand(Principal.enumAcciones.CARGAR_PANEL_MODIFICAR.toString());
		
		this.vistaPrincipal.getBtnEliminarContacto().addActionListener(this);
		this.vistaPrincipal.getBtnEliminarContacto()
				.setActionCommand(Principal.enumAcciones.CARGAR_PANEL_ELIMINAR.toString());

		
		// Acciones del panel Insertar
		this.vistaPrincipal.getPanelInsertar().getBtnInsertar().addActionListener(this);
		this.vistaPrincipal.getPanelInsertar().getBtnInsertar()
				.setActionCommand(Principal.enumAcciones.INSERTAR_CONTACTO.toString());

		// Acciones del panel Modificar
		this.vistaPrincipal.getPanelModificar().getBtnModificar().addActionListener(this);
		this.vistaPrincipal.getPanelModificar().getBtnModificar()
				.setActionCommand(Principal.enumAcciones.MODIFICAR_CONTACTO.toString());
		this.vistaPrincipal.getPanelModificar().getTablaContactos().getSelectionModel().addListSelectionListener(this);

		//Acciones del panel Eliminar
		this.vistaPrincipal.getPanelEliminar().getBtnEliminar().addActionListener(this);
		this.vistaPrincipal.getPanelEliminar().getBtnEliminar()
				.setActionCommand(Principal.enumAcciones.ELIMINAR_CONTACTO.toString());

	}


	
	/*** Tratamiento de las acciones ***/
	
	@Override
	public void actionPerformed(ActionEvent e) {

		Principal.enumAcciones accion = Principal.enumAcciones.valueOf(e.getActionCommand());

		switch (accion) {
			case CARGAR_PANEL_CONSULTA:
				this.vistaPrincipal.mVisualizarPaneles(Principal.enumAcciones.CARGAR_PANEL_CONSULTA);
				this.mCargarContactos(accion);
				break;
			case CARGAR_PANEL_INSERTAR:
				this.vistaPrincipal.mVisualizarPaneles(Principal.enumAcciones.CARGAR_PANEL_INSERTAR);
				this.mCargarContactos(accion);
				break;
			case CARGAR_PANEL_MODIFICAR:
				this.vistaPrincipal.mVisualizarPaneles(Principal.enumAcciones.CARGAR_PANEL_MODIFICAR);
				this.mCargarContactos(accion);
				break;
			case CARGAR_PANEL_ELIMINAR:
				this.vistaPrincipal.mVisualizarPaneles(Principal.enumAcciones.CARGAR_PANEL_ELIMINAR);
				this.mCargarContactos(accion);
				break;
			case INSERTAR_CONTACTO:
				this.mInsertarContacto();
				this.mCargarContactos(accion);
				break;
			case MODIFICAR_CONTACTO:
				this.mModificarContacto();
				this.mCargarContactos(accion);
				break;
			case ELIMINAR_CONTACTO:
				this.mEliminarContacto();
				this.mCargarContactos(accion);
				break;
		}
	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
	
		if (vistaPrincipal.getPanelModificar().getTablaContactos().getSelectedRow() > -1) {
		
			String nombre = vistaPrincipal.getPanelModificar().getTablaContactos()
					.getValueAt(vistaPrincipal.getPanelModificar().getTablaContactos().getSelectedRow(), 1).toString();
			String telefono = vistaPrincipal.getPanelModificar().getTablaContactos()
					.getValueAt(vistaPrincipal.getPanelModificar().getTablaContactos().getSelectedRow(), 2).toString();
			String email = vistaPrincipal.getPanelModificar().getTablaContactos()
					.getValueAt(vistaPrincipal.getPanelModificar().getTablaContactos().getSelectedRow(), 3).toString();

			vistaPrincipal.getPanelModificar().getTxtNombre().setText(nombre);
			vistaPrincipal.getPanelModificar().getTxtTelfono().setText(telefono);
			vistaPrincipal.getPanelModificar().getTxtEmail().setText(email);
		}
		 
	}

	
	
	/*** Llamados a métodos CRUD ***/
	
	private void mInsertarContacto() {
		Contacto nuevoContacto = new Contacto();

		nuevoContacto.setNombre(vistaPrincipal.getPanelInsertar().getTxtNombre().getText());
		nuevoContacto.setTelefono(vistaPrincipal.getPanelInsertar().getTxtTelfono().getText());
		nuevoContacto.setEmail(vistaPrincipal.getPanelInsertar().getTxtEmail().getText());

		nuevoContacto.mInsetarContacto();

		
		vistaPrincipal.getPanelInsertar().mLimpiarTxt();

	}

	private void mModificarContacto() {
		Contacto contactoModificar = new Contacto();

		int idContacto = Integer.parseInt(vistaPrincipal.getPanelModificar().getTablaContactos()
				.getValueAt(vistaPrincipal.getPanelModificar().getTablaContactos().getSelectedRow(), 0).toString());
		String nombre = vistaPrincipal.getPanelModificar().getTxtNombre().getText();
		String telefono = vistaPrincipal.getPanelModificar().getTxtTelfono().getText();
		String email = vistaPrincipal.getPanelModificar().getTxtEmail().getText();

		contactoModificar.setIdContacto(idContacto);
		contactoModificar.setNombre(nombre);
		contactoModificar.setTelefono(telefono);
		contactoModificar.setEmail(email);

		contactoModificar.mActualizarContacto();

		vistaPrincipal.getPanelInsertar().mLimpiarTxt();
		
	}

	private void mEliminarContacto() {
		Contacto contactoEliminar = new Contacto();

		int idContacto = Integer.parseInt(vistaPrincipal.getPanelEliminar().getTablaContactos()
				.getValueAt(vistaPrincipal.getPanelEliminar().getTablaContactos().getSelectedRow(), 0).toString());

		contactoEliminar.setIdContacto(idContacto);
		
		contactoEliminar.mEliminarContacto();

	}

	
	/*** Otros métodos ***/

	private void mCargarContactos(Principal.enumAcciones accion) {

		Contacto contactos = new Contacto();
		
		
		mLimpiarTabla(accion);

		ArrayList<Contacto> listaContactos = contactos.mObtenerContactos();

		String matrizInfo[][] = new String[listaContactos.size()][4];

		for (int i = 0; i < listaContactos.size(); i++) {
			matrizInfo[i][0] = Integer.toString(listaContactos.get(i).getIdContacto());
			matrizInfo[i][1] = listaContactos.get(i).getNombre();
			matrizInfo[i][2] = listaContactos.get(i).getTelefono();
			matrizInfo[i][3] = listaContactos.get(i).getEmail();

			switch (accion) {
			case CARGAR_PANEL_CONSULTA:
				this.vistaPrincipal.getPanelConsultar().getDefaultTableModel().addRow(matrizInfo[i]);
				break;
			case CARGAR_PANEL_INSERTAR:
			case INSERTAR_CONTACTO:

				this.vistaPrincipal.getPanelInsertar().getDefaultTableModel().addRow(matrizInfo[i]);
				break;

			case MODIFICAR_CONTACTO:
			case CARGAR_PANEL_MODIFICAR:
				this.vistaPrincipal.getPanelModificar().getDefaultTableModel().addRow(matrizInfo[i]);
				break;

			case ELIMINAR_CONTACTO:
			case CARGAR_PANEL_ELIMINAR:
				this.vistaPrincipal.getPanelEliminar().getDefaultTableModel().addRow(matrizInfo[i]);
				break;
			}

		}

	}

	private void mLimpiarTabla(Principal.enumAcciones accion) {

		switch (accion) {
		case CARGAR_PANEL_CONSULTA:
			if (this.vistaPrincipal.getPanelConsultar().getDefaultTableModel().getRowCount() > 0) {
				this.vistaPrincipal.getPanelConsultar().getDefaultTableModel().setRowCount(0);
			}
			break;
		case CARGAR_PANEL_INSERTAR:
		case INSERTAR_CONTACTO:

			if (this.vistaPrincipal.getPanelInsertar().getDefaultTableModel().getRowCount() > 0) {
				this.vistaPrincipal.getPanelInsertar().getDefaultTableModel().setRowCount(0);
			}
			break; 
		case CARGAR_PANEL_MODIFICAR:
		case MODIFICAR_CONTACTO:
			if (this.vistaPrincipal.getPanelModificar().getDefaultTableModel().getRowCount() > 0) {
				this.vistaPrincipal.getPanelModificar().getDefaultTableModel().setRowCount(0);
			}
			break;
		case CARGAR_PANEL_ELIMINAR:
		case ELIMINAR_CONTACTO:
			if (this.vistaPrincipal.getPanelEliminar().getDefaultTableModel().getRowCount() > 0) {
				this.vistaPrincipal.getPanelEliminar().getDefaultTableModel().setRowCount(0);
			}
			break;
		}
	}




}
