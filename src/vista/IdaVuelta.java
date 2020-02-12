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
import java.util.Date;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JDateChooser;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;
import java.awt.Color;

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
	private JComboBox horaIda;
	private JComboBox horaVuelta;
	private JDateChooser dateChooserIda;
	private JDateChooser dateChooserVuelta;

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
		idaVuelta.getContentPane().setBackground(Color.WHITE);
		idaVuelta.setBounds(100, 100, 531, 384);
		idaVuelta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		idaVuelta.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 515, 334);
		idaVuelta.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblIdaYVuelta = new JLabel("Ida y Vuelta");
		lblIdaYVuelta.setForeground(new Color(165, 42, 42));
		lblIdaYVuelta.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblIdaYVuelta.setBounds(217, 27, 89, 34);
		panel.add(lblIdaYVuelta);
		
		trayectoIda2 = new JComboBox<>();
		trayectoIda2.setBackground(Color.WHITE);
		trayectoIda2.setBounds(73, 86, 134, 20);
		panel.add(trayectoIda2);
		
		 horaVuelta = new JComboBox();
		 horaVuelta.setBackground(Color.WHITE);
		horaVuelta.setBounds(397, 142, 68, 20);
		panel.add(horaVuelta);
		
		cantidadIda2 = new JComboBox();
		cantidadIda2.setBackground(Color.WHITE);
		cantidadIda2.setBounds(239, 197, 38, 20);
		cantidadIda2.setModel(new DefaultComboBoxModel(new String[] { "1", "2","3","4","5","6","7","8","9" }));
		panel.add(cantidadIda2);
		
		horaIda = new JComboBox();
		horaIda.setBackground(Color.WHITE);
		horaIda.setBounds(73, 142, 69, 20);
		panel.add(horaIda);
		
		JLabel lblNewLabel = new JLabel("precio");
		lblNewLabel.setBounds(185, 231, 46, 14);
		panel.add(lblNewLabel);
		
		precioIda2 = new JTextField();
		precioIda2.setBackground(Color.WHITE);
		precioIda2.setBounds(217, 228, 86, 20);
		panel.add(precioIda2);
		precioIda2.setColumns(10);
		
		totalIdaVuelta = new JTextField();
		totalIdaVuelta.setBackground(Color.WHITE);
		totalIdaVuelta.setBounds(217, 259, 86, 20);
		panel.add(totalIdaVuelta);
		totalIdaVuelta.setColumns(10);
		

		
		JLabel lblTotal = new JLabel("total");
		lblTotal.setBounds(185, 262, 46, 14);
		panel.add(lblTotal);
		
		btnSiguienteIdaVuelta = new JButton("siguiente");
		btnSiguienteIdaVuelta.setBackground(Color.WHITE);
		btnSiguienteIdaVuelta.setBounds(397, 311, 89, 23);
		panel.add(btnSiguienteIdaVuelta);
		
		btnCancelarIdaVuelta = new JButton("cancelar");
		btnCancelarIdaVuelta.setBackground(Color.WHITE);
		btnCancelarIdaVuelta.setBounds(14, 311, 89, 23);
		panel.add(btnCancelarIdaVuelta);
		
		JLabel lblVuelta = new JLabel("Vuelta");
		lblVuelta.setBounds(314, 117, 46, 14);
		panel.add(lblVuelta);
		
		dateChooserIda = new JDateChooser();
		dateChooserIda.setDate(new Date());
		dateChooserIda.setBounds(73, 111, 95, 20);
		panel.add(dateChooserIda);
		
		dateChooserVuelta = new JDateChooser();
		dateChooserVuelta.setDate(new Date());
		dateChooserVuelta.setBounds(370, 111, 95, 20);
		panel.add(dateChooserVuelta);
		
		comboBoxIdaVueltaDestino = new JComboBox();
		comboBoxIdaVueltaDestino.setBackground(Color.WHITE);
		comboBoxIdaVueltaDestino.setBounds(337, 86, 128, 20);
		panel.add(comboBoxIdaVueltaDestino);
		
		JLabel lblNewLabel_1 = new JLabel("Destino");
		lblNewLabel_1.setBounds(288, 89, 46, 14);
		panel.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Origen");
		lblNewLabel_2.setBounds(27, 89, 46, 14);
		panel.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("ida");
		lblNewLabel_3.setBounds(43, 117, 46, 14);
		panel.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Cantidad");
		lblNewLabel_4.setBounds(185, 200, 46, 14);
		panel.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("Hora");
		lblNewLabel_5.setBounds(368, 145, 29, 14);
		panel.add(lblNewLabel_5);
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

	public JComboBox getHoraIda() {
		return horaIda;
	}

	public void setHoraIda(JComboBox horaIda) {
		this.horaIda = horaIda;
	}

	public JComboBox getHoraVuelta() {
		return horaVuelta;
	}

	public void setHoraVuelta(JComboBox horaVuelta) {
		this.horaVuelta = horaVuelta;
	}

	public JDateChooser getDateChooserIda() {
		return dateChooserIda;
	}

	public void setDateChooserIda(JDateChooser dateChooserIda) {
		this.dateChooserIda = dateChooserIda;
	}

	public JDateChooser getDateChooserVuelta() {
		return dateChooserVuelta;
	}

	public void setDateChooserVuelta(JDateChooser dateChooserVuelta) {
		this.dateChooserVuelta = dateChooserVuelta;
	}

	public JTextField getPrecioIda2() {
		return precioIda2;
	}

	public void setPrecioIda2(JTextField precioIda2) {
		this.precioIda2 = precioIda2;
	}

	public JTextField getTotalIdaVuelta() {
		return totalIdaVuelta;
	}

	public void setTotalIdaVuelta(JTextField totalIdaVuelta) {
		this.totalIdaVuelta = totalIdaVuelta;
	}
}
