package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextPane;

public class Devolucion extends JFrame {
	
	public static enum enumAcciones{
		BtnSiguiente, BtnTicket
		
		
	}

	private JPanel contentPane;
	private JButton btnSiguiente;
	public JTextPane txtVueltas;
	private JButton btnTicket;

	
	public JButton getBtnSiguiente() {
		return btnSiguiente;
	}

	public void setBtnSiguiente(JButton btnSiguiente) {
		this.btnSiguiente = btnSiguiente;
	}

	public JTextPane getTxtVueltas() {
		return txtVueltas;
	}

	public void setTxtVueltas(JTextPane txtVueltas) {
		this.txtVueltas = txtVueltas;
	}

	public JButton getBtnTicket() {
		return btnTicket;
	}

	public void setBtnTicket(JButton btnTicket) {
		this.btnTicket = btnTicket;
	}

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Devolucion frame = new Devolucion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Devolucion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnTicket = new JButton("SI");
		btnTicket.setBounds(140, 199, 43, 23);
		contentPane.add(btnTicket);
		
		JButton button_1 = new JButton("NO");
		button_1.setBounds(198, 199, 48, 23);
		contentPane.add(button_1);
		
		btnSiguiente = new JButton("siguiente");
		btnSiguiente.setBounds(335, 227, 89, 23);
		contentPane.add(btnSiguiente);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(10, 227, 89, 23);
		contentPane.add(btnCancelar);
		
		JLabel lblDevolucion = new JLabel("DEVOLUCION");
		lblDevolucion.setBounds(157, 11, 89, 23);
		contentPane.add(lblDevolucion);
		
		txtVueltas = new JTextPane();
		txtVueltas.setBounds(54, 40, 308, 138);
		contentPane.add(txtVueltas);
	}
}
