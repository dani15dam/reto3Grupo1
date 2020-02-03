package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import controladores.ControladorIda;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ida {

	private JFrame Ida;
	private JTextField precioIda;
	private JTextField totalIda;
	private JComboBox<String> fechaIda;
	private JComboBox<String> trayectoIda;
	private JComboBox<String> horaIda;
	private JComboBox<String> cantidadIda;
	private JButton btnSiguienteIda;
	private JButton btnCancelarIda;

	/**
	 * Launch the application.
	 */
	public static void mInicioIda(String lugar) {

		try {
			Ida ida = new Ida(lugar);
			ida.Ida.setVisible(true);

			ControladorIda controladorIda = new ControladorIda(ida);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the application.
	 */
	public Ida(String lugar) {
		initialize(lugar);
	}

	public JFrame getIda() {
		return Ida;
	}

	public void setIda(JFrame ida) {
		Ida = ida;
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize(String lugar) {
		Ida = new JFrame();
		Ida.setBounds(100, 100, 450, 300);
		Ida.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Ida.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 250);
		Ida.getContentPane().add(panel);
		panel.setLayout(null);

		trayectoIda = new JComboBox<>();
		trayectoIda.setBounds(20, 86, 73, 20);
		panel.add(trayectoIda);

		fechaIda = new JComboBox<>();
		fechaIda.setBounds(103, 86, 67, 20);
		panel.add(fechaIda);

		horaIda = new JComboBox<String>();
		horaIda.setBounds(180, 86, 55, 20);
		panel.add(horaIda);

		cantidadIda = new JComboBox();
		cantidadIda.setBounds(245, 86, 40, 20);
		panel.add(cantidadIda);
		ControladorIda controladorIda = new ControladorIda();
		// Inicializar listas trayectos
		
		switch (lugar) {
		case "Bilbao-Donostia":
			trayectoIda.setModel(new DefaultComboBoxModel(controladorIda.ParadasLinea1().toArray()));
			cantidadIda.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
			fechaIda.setModel(new DefaultComboBoxModel(new String[] { "fecha" }));
			horaIda.setModel(new DefaultComboBoxModel(new String[] { "hora" }));
			break;

		case "Bilbao-Mungia":

			trayectoIda.setModel(new DefaultComboBoxModel(controladorIda.ParadasLinea2().toArray()));
			cantidadIda.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
			fechaIda.setModel(new DefaultComboBoxModel(new String[] { "fecha" }));
			horaIda.setModel(new DefaultComboBoxModel(new String[] { "hora" }));
			break;
		case "Bilbao-Gernika":
			trayectoIda.setModel(new DefaultComboBoxModel(controladorIda.ParadasLinea3().toArray()));
			cantidadIda.setModel(new DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9" }));
			fechaIda.setModel(new DefaultComboBoxModel(new String[] { "fecha" }));
			horaIda.setModel(new DefaultComboBoxModel(new String[] { "hora" }));
			break;

		default:
			throw new IllegalArgumentException("Unexpected value: " + lugar);
		}

		JLabel lblPrecio = new JLabel("precio");
		lblPrecio.setBounds(295, 89, 46, 14);
		panel.add(lblPrecio);

		precioIda = new JTextField();
		precioIda.setBounds(338, 86, 86, 20);
		panel.add(precioIda);
		precioIda.setColumns(10);

		totalIda = new JTextField();
		totalIda.setBounds(326, 128, 86, 20);
		panel.add(totalIda);
		totalIda.setColumns(10);

		JLabel lblTotal = new JLabel("total");
		lblTotal.setBounds(295, 131, 46, 14);
		panel.add(lblTotal);

		btnSiguienteIda = new JButton("siguiente");
		btnSiguienteIda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Ida.setVisible(false);
				Cuenta d = new Cuenta();
				d.getCuenta().setVisible(true);
			}
		});

		btnSiguienteIda.setBounds(323, 199, 89, 23);
		panel.add(btnSiguienteIda);

		btnCancelarIda = new JButton("Cancelar");
		btnCancelarIda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				Ida.setVisible(false);
				Lineas h = new Lineas();
				h.getLineas().setVisible(true);
			}
		});
		btnCancelarIda.setBounds(20, 199, 89, 23);
		panel.add(btnCancelarIda);

		JLabel lblIda = new JLabel("Ida");
		lblIda.setFont(new Font("Tahoma", Font.ITALIC, 23));
		lblIda.setBounds(203, 11, 60, 28);
		panel.add(lblIda);
	}

	public JComboBox getFechaIda() {
		return fechaIda;
	}

	public void setFechaIda(JComboBox fechaIda) {
		this.fechaIda = fechaIda;
	}

	public JComboBox getTrayectoIda() {
		return trayectoIda;
	}

	public void setTrayectoIda(JComboBox trayectoIda) {
		this.trayectoIda = trayectoIda;
	}

	public JComboBox getHoraIda() {
		return horaIda;
	}

	public void setHoraIda(JComboBox horaIda) {
		this.horaIda = horaIda;
	}

	public JComboBox getCantidadIda() {
		return cantidadIda;
	}

	public void setCantidadIda(JComboBox cantidadIda) {
		this.cantidadIda = cantidadIda;
	}

	public JButton getBtnSiguienteIda() {
		return btnSiguienteIda;
	}

	public void setBtnSiguienteIda(JButton btnSiguienteIda) {
		this.btnSiguienteIda = btnSiguienteIda;
	}

	public JButton getBtnCancelarIda() {
		return btnCancelarIda;
	}

	public void setBtnCancelarIda(JButton btnCancelarIda) {
		this.btnCancelarIda = btnCancelarIda;
	}

}
