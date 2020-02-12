package vista;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import controladores.ControladorIda;
import modelo.Fecha;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.util.Date;
import java.awt.event.ActionEvent;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.awt.Color;

public class Ida {

	private JFrame Ida;
	private JTextField precioIda;
	private JTextField totalIda;
	private JComboBox<String> trayectoIda;
	private JComboBox<String> horaIda;
	private JComboBox<String> cantidadIda;
	private JComboBox<String> cbDestinoIda;
	private JButton btnSiguienteIda;
	private JButton btnCancelarIda;
	private JDateChooser dateChooserFechaIda;
	Fecha fechas=new Fecha();
	
	/**
	 * Launch the application.
	 */
	public static void mInicioIda() {

		try {
			Ida ida = new Ida();
			ida.Ida.setVisible(true);

			ControladorIda controladorIda = new ControladorIda(ida);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the application.
	 */
	public Ida() {
		initialize();
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
	private void initialize() {
		Ida = new JFrame();
		Ida.getContentPane().setBackground(Color.WHITE);
		Ida.setBounds(100, 100, 468, 375);
		Ida.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		Ida.getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.WHITE);
		panel.setBounds(0, 0, 452, 325);
		Ida.getContentPane().add(panel);
		panel.setLayout(null);

		trayectoIda = new JComboBox<>();
		trayectoIda.setBackground(Color.WHITE);
		trayectoIda.setBounds(20, 86, 133, 20);
		panel.add(trayectoIda);

		horaIda = new JComboBox<String>();
		horaIda.setBackground(Color.WHITE);
		horaIda.setBounds(175, 137, 90, 20);
		panel.add(horaIda);

		cantidadIda = new JComboBox();
		cantidadIda.setBackground(Color.WHITE);
		cantidadIda.setBounds(125, 137, 40, 20);
		cantidadIda.setModel(new DefaultComboBoxModel(new String[] { "1", "2","3","4","5","6","7","8","9" }));
		panel.add(cantidadIda);


		JLabel lblPrecio = new JLabel("precio");
		lblPrecio.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblPrecio.setBounds(294, 141, 46, 14);
		panel.add(lblPrecio);

		precioIda = new JTextField();
		precioIda.setBackground(Color.WHITE);
		precioIda.setBounds(340, 137, 86, 20);
		panel.add(precioIda);
		precioIda.setColumns(10);
		precioIda.setEditable(false);

		totalIda = new JTextField();
		totalIda.setBackground(Color.WHITE);
		totalIda.setBounds(340, 178, 86, 20);
		panel.add(totalIda);
		totalIda.setColumns(10);
		totalIda.setEditable(false);

		JLabel lblTotal = new JLabel("total");
		lblTotal.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblTotal.setBounds(294, 182, 46, 14);
		panel.add(lblTotal);

		btnSiguienteIda = new JButton("siguiente");
		btnSiguienteIda.setBackground(Color.WHITE);
		btnSiguienteIda.setBounds(350, 291, 89, 23);
		panel.add(btnSiguienteIda);
		

		btnCancelarIda = new JButton("Cancelar");
		btnCancelarIda.setBackground(Color.WHITE);
		btnCancelarIda.setBounds(10, 291, 89, 23);
		panel.add(btnCancelarIda);

		JLabel lblIda = new JLabel("Ida");
		lblIda.setForeground(new Color(165, 42, 42));
		lblIda.setFont(new Font("Tahoma", Font.ITALIC, 23));
		lblIda.setBounds(205, 11, 60, 28);
		panel.add(lblIda);
		
		cbDestinoIda = new JComboBox();
		cbDestinoIda.setBackground(Color.WHITE);
		cbDestinoIda.setBounds(312, 86, 114, 20);
		panel.add(cbDestinoIda);
		
		dateChooserFechaIda = new JDateChooser();
		dateChooserFechaIda.getCalendarButton().setBackground(Color.WHITE);
		dateChooserFechaIda.setDate(new Date());
		dateChooserFechaIda.setBounds(20, 134, 95, 20);
		panel.add(dateChooserFechaIda);
	}

	public JComboBox getCbDestinoIda() {
		return cbDestinoIda;
	}

	public void setCbDestinoIda(JComboBox cbDestinoIda) {
		this.cbDestinoIda = cbDestinoIda;
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

	public JDateChooser getDateChooserFechaIda() {
		return dateChooserFechaIda;
	}

	public void setDateChooserFechaIda(JDateChooser dateChooserFechaIda) {
		this.dateChooserFechaIda = dateChooserFechaIda;
	}

	@Override
	public String toString() {
		
		return "Ida [dateChooserFechaIda=" + dateChooserFechaIda + "]";
	}

	


	
}
