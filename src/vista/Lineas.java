package vista;

import java.awt.EventQueue;
import java.awt.Window;

import javax.swing.JFrame;
import javax.swing.JPanel;

import controladores.ControladorIda;
import controladores.ControladorLineas;
import modelo.Paradas;

import java.awt.BorderLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JComboBox;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.plaf.basic.BasicBorders.RadioButtonBorder;
import java.awt.Font;
import java.awt.Color;


public class Lineas {

	private JFrame lineas;
	private JButton btnSiguienteLineas;
	private JComboBox tipoLinea;
	private JComboBox <Paradas>comboBoxLineas;
	
	//get-set
	
	
	public JButton getBtnSiguienteLineas() {
		return btnSiguienteLineas;
	}


	public JComboBox getComboBoxLineas() {
		return comboBoxLineas;
	}


	public void setComboBoxLineas(JComboBox comboBoxLineas) {
		this.comboBoxLineas = comboBoxLineas;
	}


	public JComboBox getTipoLinea() {
		return tipoLinea;
	}

	public void setTipoLinea(JComboBox tipoLinea) {
		this.tipoLinea = tipoLinea;
	}

	public void setBtnSiguienteLineas(JButton btnSiguienteLineas) {
		this.btnSiguienteLineas = btnSiguienteLineas;
	}

	public JButton getBtnCancelarLineas() {
		return btnCancelarLineas;
	}

	public void setBtnCancelarLineas(JButton btnCancelarLineas) {
		this.btnCancelarLineas = btnCancelarLineas;
	}

	private JButton btnCancelarLineas;
	

	
	
	//otros metodos	
	
	public static  void mIniciarLineas () {

				try {
					Lineas linea = new Lineas();
					linea.lineas.setVisible(true);
					ControladorLineas controladorLinea = new ControladorLineas(linea);
				} catch (Exception e) {
					e.printStackTrace();
				}
	}

	/**
	 * JoptionPane.showmessage Create the application.
	 */
	public Lineas() {
		initialize();
	}

	public JFrame getLineas() {
		return lineas;
	}

	public void setLineas(JFrame lineas) {
		this.lineas = lineas;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		lineas = new JFrame();
		lineas.setBounds(100, 100, 450, 308);
		lineas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		lineas.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 434, 263);
		lineas.getContentPane().add(panel);
		panel.setLayout(null);

		JLabel lblLineas = new JLabel("Seleccione Linea");
		lblLineas.setForeground(new Color(165, 42, 42));
		lblLineas.setBackground(Color.WHITE);
		lblLineas.setFont(new Font("Tahoma", Font.ITALIC, 16));
		lblLineas.setBounds(157, 29, 125, 23);
		panel.add(lblLineas);

		tipoLinea = new JComboBox();
		tipoLinea.setBackground(Color.WHITE);
		tipoLinea.setModel(new DefaultComboBoxModel(new String[] { "ida", "ida-vuelta" }));
		tipoLinea.setBounds(349, 96, 62, 20);
		panel.add(tipoLinea);

		btnCancelarLineas = new JButton("cancelar");
		btnCancelarLineas.setBackground(Color.WHITE);
		btnCancelarLineas.setBounds(10, 201, 89, 23);
		panel.add(btnCancelarLineas);
		
		
		btnSiguienteLineas = new JButton("siguiente");
		btnSiguienteLineas.setBackground(Color.WHITE);
		btnSiguienteLineas.setBounds(322, 201, 89, 23);
		panel.add(btnSiguienteLineas);
		
		comboBoxLineas = new JComboBox();
		comboBoxLineas.setBackground(Color.WHITE);
		comboBoxLineas.setBounds(138, 87, 156, 38);
		
		panel.add(comboBoxLineas);
		
		
		
	}


}