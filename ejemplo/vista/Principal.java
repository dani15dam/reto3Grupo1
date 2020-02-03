package vista;
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.ControladorContacto;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Color;

public class Principal extends JFrame {
	
	//Acciones
	public static  enum enumAcciones{
		CARGAR_PANEL_CONSULTA,
		CARGAR_PANEL_INSERTAR,
		CARGAR_PANEL_MODIFICAR,
		CARGAR_PANEL_ELIMINAR,
		
		INSERTAR_CONTACTO,
		MODIFICAR_CONTACTO,
		ELIMINAR_CONTACTO
	}
	
	
	private JPanel panelContenedor;
	private PanelConsultar panelConsultar;
	private PanelInsertar panelInsertar;
	private PanelModificar panelModificar;
	private PanelEliminar panelEliminar;
	
	private JButton btnConsultarContactos; 
	private JButton btnInsertarContacto;
	private JButton btnModificarContacto;
	private JButton btnEliminarContacto;
	



	public Principal() {
		
		//Panel que contiene todo el contenido de la ventana
		mCrearPanelContenedor(); 
		
		//Panel izquierdo, contiene el menú del programa.
		mCrearPanelMenu();
		
		
		//Panel que contiene el listado de contactos.
		mCrearPanelConsulta();
		
		
		//Panel que contiene la pantalla para añadir contactos.
		mCrearPanelInsertar();
		
		//Panel que contiene la pantalla para añadir contactos.
		mCrearPanelModificar();
		
		
		//Panel que contiene la pantalla para eliminar contactos.
		mCrearPanelEliminar();
				
	}
	
	
	//*** Creación de paneles ***
	
	private void mCrearPanelContenedor() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		panelContenedor = new JPanel();
		panelContenedor.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(panelContenedor);
		panelContenedor.setLayout(null);
		
	}

	private void mCrearPanelMenu() {
		
		JPanel panelMenu = new JPanel();
		panelMenu.setBackground(Color.YELLOW);
		panelMenu.setBounds(10, 11, 268, 541);
		panelContenedor.add(panelMenu);
		panelMenu.setLayout(null);
		
		btnConsultarContactos = new JButton("Consultar contactos");
		btnConsultarContactos.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnConsultarContactos.setBounds(30, 75, 216, 35);
		panelMenu.add(btnConsultarContactos);
		
		btnInsertarContacto = new JButton("A\u00F1adir contacto");
		btnInsertarContacto.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnInsertarContacto.setBounds(30, 167, 216, 35);
		panelMenu.add(btnInsertarContacto);
		
		btnModificarContacto = new JButton("Modificar contacto");
		btnModificarContacto.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnModificarContacto.setBounds(28, 271, 216, 35);
		panelMenu.add(btnModificarContacto);
		
		btnEliminarContacto = new JButton("Eliminar contacto");
		btnEliminarContacto.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnEliminarContacto.setBounds(28, 363, 216, 35);
		panelMenu.add(btnEliminarContacto);
		

	}

	private void mCrearPanelConsulta() {
		panelConsultar = new PanelConsultar();
		panelContenedor.add(panelConsultar);
		panelConsultar.setVisible(false);
		
		
	}
	
	private void mCrearPanelInsertar() {
		panelInsertar = new PanelInsertar();
		panelContenedor.add(panelInsertar);
		panelInsertar.setVisible(false);
	}
	
	
	private void mCrearPanelModificar() {
		panelModificar = new PanelModificar();
		panelContenedor.add(panelModificar);
		panelModificar.setVisible(false);
	}
	
	
	private void mCrearPanelEliminar() {
		panelEliminar = new PanelEliminar();
		panelContenedor.add(panelEliminar);
		panelEliminar.setVisible(false);
	}
	
	
	//*** FIN creación de paneles ***
	
	
	public void mVisualizarPaneles(enumAcciones panel) {
		
		panelConsultar.setVisible(false);
		panelInsertar.setVisible(false);
		panelModificar.setVisible(false);
		panelEliminar.setVisible(false);
		
		
		switch (panel) {
		case CARGAR_PANEL_CONSULTA: 
			panelConsultar.setVisible(true);
			break;
			
		case CARGAR_PANEL_INSERTAR:
			panelInsertar.setVisible(true);
			break;
			
			
		case CARGAR_PANEL_MODIFICAR:
			panelModificar.setVisible(true);
			break;
		case CARGAR_PANEL_ELIMINAR:
			panelEliminar.setVisible(true);
			break;
		default:
			break;
			

		}
	}


	
	
	
	public PanelInsertar getPanelInsertar() {
		return panelInsertar;
	}


	public void setPanelInsertar(PanelInsertar panelInsertar) {
		this.panelInsertar = panelInsertar;
	}
	
	public PanelModificar getPanelModificar() {
		return panelModificar;
	}


	public void setPanelModificar(PanelModificar panelModificar) {
		this.panelModificar = panelModificar;
	}


	public JPanel getPanelContenedor() {
		return panelContenedor;
	}

	public void setPanelContenedor(JPanel panelContenedor) {
		this.panelContenedor = panelContenedor;
	}

	public PanelConsultar getPanelConsultar() {
		return panelConsultar;
	}

	public void setPanelConsultar(PanelConsultar panelConsultar) {
		this.panelConsultar = panelConsultar;
	}

	public JButton getBtnConsultarContactos() {
		return btnConsultarContactos;
	}

	public void setBtnConsultarContactos(JButton btnConsultarContactos) {
		this.btnConsultarContactos = btnConsultarContactos;
	}

	public JButton getBtnInsertarContacto() {
		return btnInsertarContacto;
	}

	public void setBtnAnyadirContacto(JButton btnInsertarContacto) {
		this.btnInsertarContacto = btnInsertarContacto;
	}

	public JButton getBtnModificarContacto() {
		return btnModificarContacto;
	}

	public void setBtnModificarContacto(JButton btnModificarContacto) {
		this.btnModificarContacto = btnModificarContacto;
	}

	public JButton getBtnEliminarContacto() {
		return btnEliminarContacto;
	}

	public void setBtnEliminarContacto(JButton btnEliminarContacto) {
		this.btnEliminarContacto = btnEliminarContacto;
	}
	
	
	public PanelEliminar getPanelEliminar() {
		return panelEliminar;
	}


	public void setPanelEliminar(PanelEliminar panelEliminar) {
		this.panelEliminar = panelEliminar;
	}


	public void setBtnInsertarContacto(JButton btnInsertarContacto) {
		this.btnInsertarContacto = btnInsertarContacto;
	}
	
}
