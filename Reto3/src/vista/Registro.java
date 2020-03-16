package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JPasswordField;

public class Registro extends JFrame {
	public static enum enumAcciones {

		BtnContinuar, BtnVolver

	}

	private JPanel contentPane;
	private JTextField textFieNombre;
	private JTextField textFielApellido;
	private JTextField textFieDni;
	private JTextField textFecNac;

	private JButton btnContinuar;
	private JButton btnVolver;

	private JLabel lblNombre;
	private JLabel lblApellido;
	private JLabel lblDni;
	private JLabel lblSexo;
	private JLabel lblContrasena;
	private JLabel lblFechaNacimiento;

	private JPasswordField passwordField;
	private JComboBox comboBoxSexo;

	// get-set

	public JComboBox getComboBoxSexo() {
		return comboBoxSexo;
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}

	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}

	public void setComboBoxSexo(JComboBox comboBoxSexo) {
		this.comboBoxSexo = comboBoxSexo;
	}

	public JButton getBtnContinuar() {
		return btnContinuar;
	}

	public void setBtnContinuar(JButton btnContinuar) {
		this.btnContinuar = btnContinuar;
	}

	public JTextField getTextFieNombre() {
		return textFieNombre;
	}

	public void setTextFieNombre(JTextField textFieNombre) {
		this.textFieNombre = textFieNombre;
	}

	public JTextField getTextFielApellido() {
		return textFielApellido;
	}

	public void setTextFielApellido(JTextField textFielApellido) {
		this.textFielApellido = textFielApellido;
	}

	public JTextField getTextFieDni() {
		return textFieDni;
	}

	public void setTextFieDni(JTextField textFieDni) {
		this.textFieDni = textFieDni;
	}

	public JTextField getTextFieCont() {
		return passwordField;
	}

	public void setTextFieCont(JPasswordField textFieCont) {
		this.passwordField = textFieCont;
	}

	public JLabel getLblNombre() {
		return lblNombre;
	}

	public void setLblNombre(JLabel lblNombre) {
		this.lblNombre = lblNombre;
	}

	public JLabel getLblApellido() {
		return lblApellido;
	}

	public void setLblApellido(JLabel lblApellido) {
		this.lblApellido = lblApellido;
	}

	public JLabel getLblDni() {
		return lblDni;
	}

	public void setLblDni(JLabel lblDni) {
		this.lblDni = lblDni;
	}

	public JLabel getLblSexo() {
		return lblSexo;
	}

	public void setLblSexo(JLabel lblSexo) {
		this.lblSexo = lblSexo;
	}

	public JLabel getLblContrasena() {
		return lblContrasena;
	}

	public void setLblContrasena(JLabel lblContrasena) {
		this.lblContrasena = lblContrasena;
	}

	public JTextField getTextFecNac() {
		return textFecNac;
	}

	public void setTextFecNac(JTextField textFecNac) {
		this.textFecNac = textFecNac;
	}

	// otros metodos
	public void mControladorRegistro() {

		try {

			Registro ventanaRegistro = new Registro();
			ventanaRegistro.setVisible(true);

		} catch (Exception e) {

			e.printStackTrace();
		}
	}

	@SuppressWarnings("unchecked")
	public Registro() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 433);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 434, 394);
		contentPane.add(panel);
		panel.setLayout(null);

		JLabel lblRegistro = new JLabel("REGISTRAR");
		lblRegistro.setForeground(new Color(165, 42, 42));
		lblRegistro.setBounds(121, 11, 183, 36);
		lblRegistro.setFont(new Font("Arial", Font.BOLD, 30));
		panel.add(lblRegistro);

		lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Arial", Font.BOLD, 15));
		lblNombre.setBounds(29, 57, 68, 18);
		panel.add(lblNombre);

		lblApellido = new JLabel("Apellido");
		lblApellido.setFont(new Font("Arial", Font.BOLD, 15));
		lblApellido.setBounds(29, 111, 85, 18);
		panel.add(lblApellido);

		lblDni = new JLabel("DNI");
		lblDni.setFont(new Font("Arial", Font.BOLD, 15));
		lblDni.setBounds(223, 171, 68, 18);
		panel.add(lblDni);

		lblSexo = new JLabel("Sexo");
		lblSexo.setFont(new Font("Arial", Font.BOLD, 15));
		lblSexo.setBounds(223, 80, 68, 18);
		panel.add(lblSexo);

		lblContrasena = new JLabel("Contrase\u00F1a");
		lblContrasena.setFont(new Font("Arial", Font.BOLD, 15));
		lblContrasena.setBounds(29, 171, 112, 18);
		panel.add(lblContrasena);

		textFieNombre = new JTextField();
		textFieNombre.setBounds(29, 86, 184, 20);
		panel.add(textFieNombre);
		textFieNombre.setColumns(10);

		textFielApellido = new JTextField();
		textFielApellido.setColumns(10);
		textFielApellido.setBounds(29, 140, 184, 20);
		panel.add(textFielApellido);

		textFieDni = new JTextField();
		textFieDni.setColumns(10);
		textFieDni.setBounds(223, 187, 112, 20);
		panel.add(textFieDni);

		comboBoxSexo = new JComboBox();
		comboBoxSexo.setModel(new DefaultComboBoxModel(new String[] { "MUJER", "HOMBRE" }));
		comboBoxSexo.setMaximumRowCount(2);
		comboBoxSexo.setBounds(280, 79, 96, 22);
		panel.add(comboBoxSexo);

		btnContinuar = new JButton("CONTINUAR");
		btnContinuar.setBounds(290, 347, 116, 36);
		panel.add(btnContinuar);

		btnVolver = new JButton("VOLVER");
		btnVolver.setBounds(29, 347, 104, 36);
		panel.add(btnVolver);

		passwordField = new JPasswordField();
		passwordField.setBounds(29, 187, 184, 20);
		panel.add(passwordField);

		JLabel label = new JLabel("");
		label.setForeground(Color.RED);
		label.setBounds(386, 83, 48, 14);
		panel.add(label);

		JLabel label_1 = new JLabel("");

		label_1.setBounds(386, 127, 48, 14);
		panel.add(label_1);

		JLabel label_2 = new JLabel("");

		label_2.setBounds(386, 168, 48, 14);
		panel.add(label_2);

		JLabel label_3 = new JLabel("");

		label_3.setBounds(386, 255, 48, 14);
		panel.add(label_3);

		lblFechaNacimiento = new JLabel("Fecha Nacimiento\r\n");
		lblFechaNacimiento.setFont(new Font("Arial", Font.BOLD, 15));
		lblFechaNacimiento.setBounds(211, 113, 165, 14);
		panel.add(lblFechaNacimiento);

		textFecNac = new JTextField();
		textFecNac.setColumns(10);
		textFecNac.setBounds(221, 140, 122, 20);
		panel.add(textFecNac);

		JLabel label_4 = new JLabel("");

		label_4.setBounds(386, 207, 48, 14);
		panel.add(label_4);

		JLabel label_5 = new JLabel("");

		label_5.setBounds(386, 303, 48, 14);
		panel.add(label_5);
	}
}