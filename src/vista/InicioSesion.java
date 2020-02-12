package vista;




import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;


import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.UIManager;

import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class InicioSesion extends JFrame {
	public static enum enumAcciones{
		
		BtnContinuar, BtnSalir, BtnCrearCuenta
	
	}

	private JPanel contentPane;
	private JTextField textFieldDni;
	private JButton btnContinuar;
	private JButton btnSalir;
	private JPasswordField passwordField;
	private JButton btnCrearCuenta;
	
	
	
	//get-set
	
	public JButton getBtnSalir() {
		return btnSalir;
	}

	public JButton getBtnCrearCuenta() {
		return btnCrearCuenta;
	}

	public void setBtnCrearCuenta(JButton btnCrearCuenta) {
		this.btnCrearCuenta = btnCrearCuenta;
	}

	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public void setPasswordField(JPasswordField passwordField) {
		this.passwordField = passwordField;
	}

	public void setBtnSalir(JButton btnSalir) {
		this.btnSalir = btnSalir;
	}

	public JTextField getTextFieldDni() {
		return textFieldDni;
	}

	public void setTextFieldDni(JTextField textFieldDni) {
		this.textFieldDni = textFieldDni;
	}

	public JButton getBtnContinuar() {
		return btnContinuar;
	}

	public void setBtnContinuar(JButton btnContinuar) {
		this.btnContinuar = btnContinuar;
	}


	//otros metodos

		
		


	/**
	 * Create the frame.
	 */
	public InicioSesion() {
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 524, 366);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 0, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		panel.setBackground(Color.WHITE);
		panel.setBackground(UIManager.getColor("ToggleButton.background"));
		panel.setBounds(0, 0, 508, 327);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblTitulo = new JLabel("Inicio Sesion");
		lblTitulo.setForeground(new Color(165, 42, 42));
		lblTitulo.setFont(new Font("Microsoft JhengHei Light", Font.BOLD, 19));
		lblTitulo.setBounds(171, 11, 162, 36);
		panel.add(lblTitulo);
		
		JLabel lblDni = new JLabel("DNI:");
		lblDni.setForeground(Color.BLACK);
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblDni.setBounds(80, 70, 91, 27);
		panel.add(lblDni);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a:");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblContrasea.setBounds(80, 134, 141, 36);
		panel.add(lblContrasea);
		
		textFieldDni = new JTextField();
		textFieldDni.setBounds(80, 96, 253, 27);
		panel.add(textFieldDni);
		textFieldDni.setColumns(10);
		
		btnContinuar = new JButton("Siguiente");
		btnContinuar.setBackground(Color.WHITE);
		btnContinuar.setFont(new Font("Tahoma", Font.PLAIN, 13));
		btnContinuar.setBounds(322, 257, 99, 27);
		panel.add(btnContinuar);
		
		btnSalir = new JButton("Salir");
		btnSalir.setBackground(Color.WHITE);
		btnSalir.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnSalir.setBounds(65, 257, 91, 27);
		panel.add(btnSalir);
		
		passwordField= new JPasswordField();
		passwordField.setBounds(80, 179, 253, 27);
		panel.add(passwordField);
		
		btnCrearCuenta = new JButton("Crear Cuenta");
		btnCrearCuenta.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnCrearCuenta.setBounds(357, 91, 99, 32);
		panel.add(btnCrearCuenta);
	}
}
