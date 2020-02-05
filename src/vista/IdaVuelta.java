package vista;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.JTextField;

import controladores.ControladorIda;
import controladores.ControladorIdaVuelta;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IdaVuelta {

	private JFrame idaVuelta;
	private JTextField precioIda2;
	private JTextField totalIdaVuelta;
	protected Object ida_vuelta;
	private JButton btnSiguienteIdaVuelta;
	private JButton btnCancelarIdaVuelta;
	private JComboBox <String> trayectoIda2;

	/**
	 * Launch the application.
	 */
	public static void mIniciarIdaVuelta() {
				try {
					IdaVuelta ida = new IdaVuelta();
					ida.idaVuelta.setVisible(true);
					
				
					
					ControladorIdaVuelta controladorIdaVuelta = new ControladorIdaVuelta(ida);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
	}

	/**
	 * Create the application.
	 */
	public IdaVuelta() {
		initialize();
	}
	

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		idaVuelta = new JFrame();
		idaVuelta.setBounds(100, 100, 450, 300);
		idaVuelta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		idaVuelta.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 250);
		idaVuelta.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblIdaYVuelta = new JLabel("Ida y Vuelta");
		lblIdaYVuelta.setBounds(185, 11, 69, 14);
		panel.add(lblIdaYVuelta);
		
		trayectoIda2 = new JComboBox<>();
		trayectoIda2.setBounds(32, 88, 51, 20);
		panel.add(trayectoIda2);
		
		JComboBox fechaIda2 = new JComboBox();
		fechaIda2.setBounds(93, 88, 54, 20);
		panel.add(fechaIda2);
		
		JComboBox horaIda2 = new JComboBox();
		horaIda2.setBounds(157, 88, 68, 20);
		panel.add(horaIda2);
		
		JComboBox cantidadIda2 = new JComboBox();
		cantidadIda2.setBounds(240, 88, 38, 20);
		panel.add(cantidadIda2);
		
		JComboBox comboBox_5 = new JComboBox();
		comboBox_5.setBounds(93, 131, 54, 20);
		panel.add(comboBox_5);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setBounds(156, 131, 69, 20);
		panel.add(comboBox_6);
		
		JComboBox comboBox_7 = new JComboBox();
		comboBox_7.setBounds(240, 131, 38, 20);
		panel.add(comboBox_7);
		
		JLabel lblNewLabel = new JLabel("precio");
		lblNewLabel.setBounds(302, 91, 46, 14);
		panel.add(lblNewLabel);
		
		precioIda2 = new JTextField();
		precioIda2.setBounds(342, 88, 66, 20);
		panel.add(precioIda2);
		precioIda2.setColumns(10);
		
		totalIdaVuelta = new JTextField();
		totalIdaVuelta.setBounds(322, 161, 86, 20);
		panel.add(totalIdaVuelta);
		totalIdaVuelta.setColumns(10);
		
//		ControladorIdaVuelta controladorIdaVuelta = new ControladorIdaVuelta();
//		switch (destino) {
//		case "Bilbao-Donostia":
//			trayectoIda2.setModel(new DefaultComboBoxModel(controladorIdaVuelta .ParadasLinea1().toArray()));
//			trayectoVuelta.setModel(new DefaultComboBoxModel(controladorIdaVuelta .ParadasLinea1().toArray()));
//			break;
//
//		case "Bilbao-Mungia":
//
//			trayectoIda2.setModel(new DefaultComboBoxModel(controladorIdaVuelta.ParadasLinea2().toArray()));
//			trayectoVuelta.setModel(new DefaultComboBoxModel(controladorIdaVuelta .ParadasLinea1().toArray()));
//			break;
//		case "Bilbao-Gernika":
//			trayectoIda2.setModel(new DefaultComboBoxModel(controladorIdaVuelta.ParadasLinea3().toArray()));
//			trayectoVuelta.setModel(new DefaultComboBoxModel(controladorIdaVuelta .ParadasLinea1().toArray()));
//			break;
//
//		default:
//			throw new IllegalArgumentException("Unexpected value: " + destino);
//			
//		}
		
		JLabel lblTotal = new JLabel("total");
		lblTotal.setBounds(272, 164, 46, 14);
		panel.add(lblTotal);
		
		btnSiguienteIdaVuelta = new JButton("siguiente");
		btnSiguienteIdaVuelta.setBounds(319, 216, 89, 23);
		panel.add(btnSiguienteIdaVuelta);
		
		btnCancelarIdaVuelta = new JButton("cancelar");
		btnCancelarIdaVuelta.setBounds(10, 216, 89, 23);
		panel.add(btnCancelarIdaVuelta);
		
		JLabel lblVuelta = new JLabel("Vuelta:");
		lblVuelta.setBounds(37, 134, 46, 14);
		panel.add(lblVuelta);
	}


	public JFrame getIdaVuelta() {
		return idaVuelta;
	}

	public void setIdaVuelta(JFrame idaVuelta) {
		this.idaVuelta = idaVuelta;
	}

	public JButton getBtnSiguienteIdaVuelta() {
		return btnSiguienteIdaVuelta;
	}

	public void setBtnSiguienteIdaVuelta(JButton btnSiguienteIdaVuelta) {
		this.btnSiguienteIdaVuelta = btnSiguienteIdaVuelta;
	}

	public JButton getBtnCancelarIdaVuelta() {
		return btnCancelarIdaVuelta;
	}

	public void setBtnCancelarIdaVuelta(JButton btnCancelarIdaVuelta) {
		this.btnCancelarIdaVuelta = btnCancelarIdaVuelta;
	}


	public JComboBox getTrayectoIda2() {
		return trayectoIda2;
	}

	public void setTrayectoIda2(JComboBox trayectoIda2) {
		this.trayectoIda2 = trayectoIda2;
	}
}
