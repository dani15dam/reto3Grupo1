package vista;

import java.awt.EventQueue;


import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import controladores.ControladorCuenta;
import controladores.ControladorIda;

public class Cuenta {

	private JFrame cuenta;
	private JTextField crearDNI;
	private JTextField crearContraseña;
	private JTextField CrearNombre;
	private JTextField ContraseñaSesion;
	private JTextField DNIsesion;
	private JButton btnIniciarSesion;
	private JButton btnCrear;
	private JButton btnSiguienteCuenta;
	private JButton cancelarCuenta;

	/**
	 * Launch the application.
	 */
	public static void mInicioCuenta () {
	
				try {
					Cuenta cuenta = new Cuenta();
					cuenta.cuenta.setVisible(true);
					
		ControladorCuenta controladorCuenta = new ControladorCuenta(cuenta);
		
				} catch (Exception e) {
					e.printStackTrace();
				}
	}

	/**
	 * Create the application.
	 */
	
	public Cuenta() {
		initialize();
	}
	

	public JFrame getCuenta() {
		return cuenta;
	}

	public void setCuenta(JFrame cuenta) {
		this.cuenta = cuenta;
	}

	public JTextField getCrearDNI() {
		return crearDNI;
	}

	public void setCrearDNI(JTextField crearDNI) {
		this.crearDNI = crearDNI;
	}

	public JTextField getCrearContraseña() {
		return crearContraseña;
	}

	public void setCrearContraseña(JTextField crearContraseña) {
		this.crearContraseña = crearContraseña;
	}

	public JTextField getCrearNombre() {
		return CrearNombre;
	}

	public void setCrearNombre(JTextField crearNombre) {
		CrearNombre = crearNombre;
	}

	public JTextField getContraseñaSesion() {
		return ContraseñaSesion;
	}

	public void setContraseñaSesion(JTextField contraseñaSesion) {
		ContraseñaSesion = contraseñaSesion;
	}

	public JTextField getDNIsesion() {
		return DNIsesion;
	}

	public void setDNIsesion(JTextField dNIsesion) {
		DNIsesion = dNIsesion;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		cuenta = new JFrame();
		cuenta.setBounds(100, 100, 450, 358);
		cuenta.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		cuenta.getContentPane().setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(0, 0, 434, 0);
		cuenta.getContentPane().add(label);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 308);
		cuenta.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblCuenta = new JLabel("Cuenta");
		lblCuenta.setFont(new Font("Tahoma", Font.ITALIC, 24));
		lblCuenta.setBounds(165, 11, 97, 29);
		panel.add(lblCuenta);
		
		JLabel lblIniciarSesion = new JLabel("iniciar sesion");
		lblIniciarSesion.setBounds(31, 48, 73, 14);
		panel.add(lblIniciarSesion);
		
		JLabel lblCrearCuenta = new JLabel("crear cuenta");
		lblCrearCuenta.setBounds(273, 48, 87, 14);
		panel.add(lblCrearCuenta);
		
		JLabel lblDni = new JLabel("DNI");
		lblDni.setBounds(22, 86, 46, 14);
		panel.add(lblDni);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(22, 137, 56, 14);
		panel.add(lblContrasea);
		
		JLabel lblDni_1 = new JLabel("DNI");
		lblDni_1.setBounds(216, 137, 46, 14);
		panel.add(lblDni_1);
		
		crearDNI = new JTextField();
		crearDNI.setBounds(251, 134, 109, 20);
		panel.add(crearDNI);
		crearDNI.setColumns(10);
		
		crearContraseña = new JTextField();
		crearContraseña.setBounds(251, 165, 109, 20);
		panel.add(crearContraseña);
		crearContraseña.setColumns(10);
		
		JLabel lblContrasea_1 = new JLabel("Contrase\u00F1a");
		lblContrasea_1.setBounds(189, 168, 73, 14);
		panel.add(lblContrasea_1);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(204, 100, 46, 14);
		panel.add(lblNombre);
		
		CrearNombre = new JTextField();
		CrearNombre.setBounds(254, 97, 106, 20);
		panel.add(CrearNombre);
		CrearNombre.setColumns(10);
		
		ContraseñaSesion = new JTextField();
		ContraseñaSesion.setBounds(22, 162, 86, 20);
		panel.add(ContraseñaSesion);
		ContraseñaSesion.setColumns(10);
		
		DNIsesion = new JTextField();
		DNIsesion.setBounds(22, 111, 86, 20);
		panel.add(DNIsesion);
		DNIsesion.setColumns(10);
		
		btnCrear = new JButton("crear");
		btnCrear.setBounds(260, 209, 89, 23);
		panel.add(btnCrear);
		
		btnIniciarSesion = new JButton("iniciar sesion");
		btnIniciarSesion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnIniciarSesion.setBounds(22, 209, 106, 23);
		panel.add(btnIniciarSesion);
		
		btnSiguienteCuenta = new JButton("siguiente");
		btnSiguienteCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

			}
		});
		btnSiguienteCuenta.setBounds(312, 258, 89, 23);
		panel.add(btnSiguienteCuenta);
		
		cancelarCuenta = new JButton("cancelar");
		cancelarCuenta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				
				
			}
		});
		cancelarCuenta.setBounds(31, 258, 89, 23);
		panel.add(cancelarCuenta);
	}

	public JButton getBtnIniciarSesion() {
		return btnIniciarSesion;
	}

	public void setBtnIniciarSesion(JButton btnIniciarSesion) {
		this.btnIniciarSesion = btnIniciarSesion;
	}

	public JButton getBtnCrear() {
		return btnCrear;
	}

	public void setBtnCrear(JButton btnCrear) {
		this.btnCrear = btnCrear;
	}

	public JButton getBtnSiguienteCuenta() {
		return btnSiguienteCuenta;
	}

	public void setBtnSiguienteCuenta(JButton btnSiguienteCuenta) {
		this.btnSiguienteCuenta = btnSiguienteCuenta;
	}

	public JButton getCancelarCuenta() {
		return cancelarCuenta;
	}

	public void setCancelarCuenta(JButton cancelarCuenta) {
		this.cancelarCuenta = cancelarCuenta;
	}




	
}
