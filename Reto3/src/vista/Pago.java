package vista;

import java.awt.EventQueue;
import java.awt.GridLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.FlowLayout;
import java.awt.CardLayout;
import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;

import java.awt.Font;

public class Pago extends JFrame {

	public static enum enumAcciones {
		BtnPagar, BtnDevolver, BtnSiguiente

	}

	private JTextField txtTotal;
	private JTextField txtRestante;
	private JTextField txtCantidadIngresada;
	private JButton btnPagar;
	private JTextArea txtPanelRestante;
	private JButton btnDevolver;
	private JButton btnPunto;
	private JButton btnSiguiente;

	public JButton getBtnSiguiente() {
		return btnSiguiente;
	}

	public void setBtnSiguiente(JButton btnSiguiente) {
		this.btnSiguiente = btnSiguiente;
	}

	public JButton getBtnDevolver() {
		return btnDevolver;
	}

	public void setBtnDevolver(JButton btnDevolver) {
		this.btnDevolver = btnDevolver;
	}

	public JTextArea getTxtPanelRestante() {
		return txtPanelRestante;
	}

	public void setTxtPanelRestante(JTextArea txtPanelRestante) {
		this.txtPanelRestante = txtPanelRestante;
	}

	public JTextField getTxtTotal() {
		return txtTotal;
	}

	public void setTxtTotal(JTextField txtTotal) {
		this.txtTotal = txtTotal;
	}

	public JTextField getTxtRestante() {
		return txtRestante;
	}

	public void setTxtRestante(JTextField txtRestante) {
		this.txtRestante = txtRestante;
	}

	public JTextField getTxtCantidadIngresada() {
		return txtCantidadIngresada;
	}

	public void setTxtCantidadIngresada(JTextField txtCantidadIngresada) {
		this.txtCantidadIngresada = txtCantidadIngresada;
	}

	public JButton getBtnPagar() {
		return btnPagar;
	}

	public void setBtnPagar(JButton btnPagar) {
		this.btnPagar = btnPagar;
	}

	/**
	 * Launch the application.
	 */

	/**
	 * Create the application.
	 */
	public Pago() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		setBounds(100, 100, 450, 421);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBounds(20, 115, 154, 146);
		getContentPane().add(panel);

		JButton btn3 = new JButton("3");
		btn3.setBackground(Color.WHITE);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				txtCantidadIngresada.setText(txtCantidadIngresada.getText() + "3");

			}
		});

		JButton btn4 = new JButton("4");
		btn4.setBackground(Color.WHITE);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				txtCantidadIngresada.setText(txtCantidadIngresada.getText() + "4");

			}
		});

		JButton btn9 = new JButton("9");
		btn9.setBackground(Color.WHITE);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				txtCantidadIngresada.setText(txtCantidadIngresada.getText() + "9");

			}
		});

		JButton btn5 = new JButton("5");
		btn5.setBackground(Color.WHITE);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				txtCantidadIngresada.setText(txtCantidadIngresada.getText() + "5");

			}
		});

		JButton btn8 = new JButton("8");
		btn8.setBackground(Color.WHITE);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				txtCantidadIngresada.setText(txtCantidadIngresada.getText() + "8");

			}
		});

		JButton btn7 = new JButton("7");
		btn7.setBackground(Color.WHITE);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				txtCantidadIngresada.setText(txtCantidadIngresada.getText() + "7");

			}
		});

		JButton btn6 = new JButton("6");
		btn6.setBackground(Color.WHITE);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				txtCantidadIngresada.setText(txtCantidadIngresada.getText() + "6");

			}
		});

		JButton btn1 = new JButton("1");
		btn1.setBackground(Color.WHITE);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				txtCantidadIngresada.setText(txtCantidadIngresada.getText() + "1");

			}
		});

		JButton btn2 = new JButton("2");
		btn2.setBackground(Color.WHITE);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				txtCantidadIngresada.setText(txtCantidadIngresada.getText() + "2");

			}
		});

		JButton btn0 = new JButton("0");
		btn0.setBackground(Color.WHITE);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				txtCantidadIngresada.setText(txtCantidadIngresada.getText() + "0");

			}
		});

		JButton btnBorrar = new JButton("...");
		btnBorrar.setBackground(Color.WHITE);
		btnBorrar.setLayout(new GridLayout(0, 1, 1, 10));
		btnBorrar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				String cadena = txtCantidadIngresada.getText();
				txtCantidadIngresada.setText(cadena.substring(0, cadena.length() - 1));
				if ((cadena.substring(cadena.length() - 1)).equals(".")) {

					btnPunto.setEnabled(true);

				}
				if (txtCantidadIngresada.getText().equals("0")) {

					txtCantidadIngresada.setText("");

				}
				if (txtCantidadIngresada.getText().contentEquals("")) {

					btnBorrar.setEnabled(false);

				}

			}
		});

		btnPunto = new JButton(".");
		btnPunto.setForeground(Color.BLACK);
		btnPunto.setBackground(Color.WHITE);
		btnPunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				txtCantidadIngresada.setText(txtCantidadIngresada.getText() + ".");

				btnPunto.setEnabled(false);

			}

		});
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		panel.add(btn9);
		panel.add(btn8);
		panel.add(btn7);
		panel.add(btn6);
		panel.add(btn5);
		panel.add(btn4);
		panel.add(btn3);
		panel.add(btn2);
		panel.add(btn1);
		panel.add(btnBorrar);
		panel.add(btn0);
		panel.add(btnPunto);

		JLabel label = new JLabel("Pago:");
		label.setBounds(20, 84, 79, 20);
		getContentPane().add(label);

		btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setBounds(307, 333, 104, 38);
		getContentPane().add(btnSiguiente);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCancelar.setBounds(20, 333, 112, 38);
		getContentPane().add(btnCancelar);

		// este jtext contiene el precio a pagar
		txtTotal = new JTextField();
		txtTotal.setColumns(10);
		txtTotal.setBounds(315, 23, 96, 20);
		getContentPane().add(txtTotal);

		JLabel label_1 = new JLabel("Total a Pagar:");
		label_1.setBounds(315, 11, 96, 14);
		getContentPane().add(label_1);

		btnPagar = new JButton("Pagar");
		btnPagar.setBounds(20, 275, 96, 38);
		getContentPane().add(btnPagar);

		txtRestante = new JTextField();
		txtRestante.setColumns(10);
		txtRestante.setBounds(196, 23, 96, 20);
		getContentPane().add(txtRestante);

		JLabel lblTotalAPagar = new JLabel("falta:");
		lblTotalAPagar.setBounds(196, 11, 79, 14);
		getContentPane().add(lblTotalAPagar);

		txtCantidadIngresada = new JTextField();
		txtCantidadIngresada.setBounds(50, 84, 96, 20);
		getContentPane().add(txtCantidadIngresada);
		txtCantidadIngresada.setColumns(10);

		txtPanelRestante = new JTextArea();
		txtPanelRestante.setBounds(210, 69, 183, 192);
		getContentPane().add(txtPanelRestante);

		btnDevolver = new JButton("Devolver");
		btnDevolver.setBounds(126, 275, 97, 38);
		getContentPane().add(btnDevolver);

		JLabel label_2 = new JLabel("");
		label_2.setBounds(50, 26, 48, 14);
		getContentPane().add(label_2);

		JLabel lblNewLabel = new JLabel("PAGO");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(20, 11, 126, 53);
		getContentPane().add(lblNewLabel);
	}
}
