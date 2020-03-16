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
	public static enum enumAcciones {

		BtnContinuar, BtnSalir, BtnCrearCuenta

	}

	private JPanel contentPane;
	private JTextField textFieldDni;
	private JButton btnContinuar;
	private JButton btnSalir;
	private JPasswordField passwordField;
	private JButton btnCrearCuenta;

	// get-set

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

	// otros metodos

	/**
	 * Create the frame.
	 */
	public InicioSesion() {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 516, 366);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new LineBorder(new Color(0, 0, 0), 2, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 0));
		panel.setBackground(Color.WHITE);
		panel.setBackground(UIManager.getColor("ToggleButton.background"));
		panel.setBounds(0, 0, 500, 327);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblTitulo = new JLabel("Iniciar Sesion");
		lblTitulo.setForeground(new Color(165, 42, 42));
		lblTitulo.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblTitulo.setBounds(175, 11, 182, 36);
		panel.add(lblTitulo);

		JLabel lblDni = new JLabel("DNI:");
		lblDni.setFont(new Font("Tahoma", Font.PLAIN, 23));
		lblDni.setBounds(119, 68, 91, 27);
		panel.add(lblDni);

		JLabel lblContrasea = new JLabel("CONTRASE\u00D1A:");
		lblContrasea.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblContrasea.setBounds(109, 132, 213, 36);
		panel.add(lblContrasea);

		textFieldDni = new JTextField();
		textFieldDni.setBounds(114, 94, 188, 27);
		panel.add(textFieldDni);
		textFieldDni.setColumns(10);

		btnContinuar = new JButton("CONTINUAR");
		btnContinuar.setBackground(UIManager.getColor("ToggleButton.light"));
		btnContinuar.setFont(new Font("Arial", Font.BOLD, 12));
		btnContinuar.setBounds(369, 257, 99, 27);
		panel.add(btnContinuar);

		btnSalir = new JButton("SALIR");
		btnSalir.setBackground(UIManager.getColor("ToggleButton.light"));
		btnSalir.setFont(new Font("Arial", Font.BOLD, 12));
		btnSalir.setBounds(30, 257, 83, 27);
		panel.add(btnSalir);

		passwordField = new JPasswordField();
		passwordField.setBounds(119, 168, 188, 27);
		panel.add(passwordField);

		btnCrearCuenta = new JButton("CREAR CUENTA");
		btnCrearCuenta.setBounds(328, 94, 109, 27);
		panel.add(btnCrearCuenta);
	}
}
