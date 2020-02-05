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
import com.toedter.calendar.JDateChooser;
import com.jgoodies.forms.factories.DefaultComponentFactory;

public class IdaVuelta {

	private JFrame idaVuelta;
	private JTextField precioIda2;
	private JTextField totalIdaVuelta;
	protected Object ida_vuelta;
	private JButton btnSiguienteIdaVuelta;
	private JButton btnCancelarIdaVuelta;
	private JComboBox <String> trayectoIda2;
	private JComboBox comboBoxIdaVueltaDestino;
	private JComboBox cantidadIda2;

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
		idaVuelta.setBounds(100, 100, 551, 331);
		idaVuelta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		idaVuelta.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 535, 292);
		idaVuelta.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblIdaYVuelta = new JLabel("Ida y Vuelta");
		lblIdaYVuelta.setBounds(185, 11, 69, 14);
		panel.add(lblIdaYVuelta);
		
		trayectoIda2 = new JComboBox<>();
		trayectoIda2.setBounds(52, 88, 134, 20);
		panel.add(trayectoIda2);
		
		JComboBox horaIda2 = new JComboBox();
		horaIda2.setBounds(297, 151, 68, 20);
		panel.add(horaIda2);
		
		cantidadIda2 = new JComboBox();
		cantidadIda2.setBounds(273, 195, 38, 20);
		cantidadIda2.setModel(new DefaultComboBoxModel(new String[] { "1", "2","3","4","5","6","7","8","9" }));
		panel.add(cantidadIda2);
		
		JComboBox comboBox_6 = new JComboBox();
		comboBox_6.setBounds(97, 151, 69, 20);
		panel.add(comboBox_6);
		
		JLabel lblNewLabel = new JLabel("precio");
		lblNewLabel.setBounds(396, 91, 46, 14);
		panel.add(lblNewLabel);
		
		precioIda2 = new JTextField();
		precioIda2.setBounds(439, 88, 66, 20);
		panel.add(precioIda2);
		precioIda2.setColumns(10);
		
		totalIdaVuelta = new JTextField();
		totalIdaVuelta.setBounds(225, 226, 86, 20);
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
		lblTotal.setBounds(180, 229, 46, 14);
		panel.add(lblTotal);
		
		btnSiguienteIdaVuelta = new JButton("siguiente");
		btnSiguienteIdaVuelta.setBounds(436, 258, 89, 23);
		panel.add(btnSiguienteIdaVuelta);
		
		btnCancelarIdaVuelta = new JButton("cancelar");
		btnCancelarIdaVuelta.setBounds(14, 258, 89, 23);
		panel.add(btnCancelarIdaVuelta);
		
		JLabel lblVuelta = new JLabel("Vuelta");
		lblVuelta.setBounds(246, 122, 46, 14);
		panel.add(lblVuelta);
		
		JDateChooser dateChooserIda = new JDateChooser();
		dateChooserIda.setBounds(88, 119, 95, 20);
		panel.add(dateChooserIda);
		
		JDateChooser dateChooserVuelta = new JDateChooser();
		dateChooserVuelta.setBounds(287, 119, 95, 20);
		panel.add(dateChooserVuelta);
		
		comboBoxIdaVueltaDestino = new JComboBox();
		comboBoxIdaVueltaDestino.setBounds(258, 88, 128, 20);
		panel.add(comboBoxIdaVueltaDestino);
		
		JLabel lblNewLabel_1 = new JLabel("Destino");
		lblNewLabel_1.setBounds(208, 91, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Origen");
		lblNewLabel_2.setBounds(14, 91, 46, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("ida");
		lblNewLabel_3.setBounds(53, 122, 46, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Cantidad");
		lblNewLabel_4.setBounds(217, 198, 46, 14);
		panel.add(lblNewLabel_4);
	}


	public JComboBox getComboBoxIdaVueltaDestino() {
		return comboBoxIdaVueltaDestino;
	}

	public void setComboBoxIdaVueltaDestino(JComboBox comboBoxIdaVueltaDestino) {
		this.comboBoxIdaVueltaDestino = comboBoxIdaVueltaDestino;
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
