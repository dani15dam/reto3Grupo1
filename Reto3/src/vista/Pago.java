package vista;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JLabel;

public class Pago {

	private JFrame prueba;
	private JTextField txtCantidadIngresada;
	private JTextField txtTotal;
	private JButton btnPagar;
	private JTextField txtRestante;
	

	

	public JTextField getTxtCantidadIngresada() {
		return txtCantidadIngresada;
	}

	public void setTxtCantidadIngresada(JTextField txtCantidadIngresada) {
		this.txtCantidadIngresada = txtCantidadIngresada;
	}

	public JTextField getTxtRestante() {
		return txtRestante;
	}

	public void setTxtRestante(JTextField txtRestante) {
		this.txtRestante = txtRestante;
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
	public void mIniciarPago(String[] args) {
	
				try {
					Pago window = new Pago();
					window.prueba.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
	}

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
		prueba = new JFrame();
		prueba.setBounds(100, 100, 450, 300);
		prueba.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		prueba.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(114, 64, 161, 172);
		prueba.getContentPane().add(panel);
		
		JButton btnPago9 = new JButton("9");
		btnPago9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtCantidadIngresada.setText( txtCantidadIngresada.getText() + "9") ;
			
			}
		});
		
		panel.add(btnPago9);
		
		JButton btnPago8 = new JButton("8");
		btnPago8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtCantidadIngresada.setText( txtCantidadIngresada.getText() + "8") ;
			
			}
		});
		
		panel.add(btnPago8);
		
		JButton btnPago7 = new JButton("7");
		btnPago7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtCantidadIngresada.setText( txtCantidadIngresada.getText() + "7") ;
			
			}
		});
		
		panel.add(btnPago7);
		
		JButton btnPago6 = new JButton("6");
		btnPago6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtCantidadIngresada.setText( txtCantidadIngresada.getText() + "6") ;
			
			}
		});
		
		panel.add(btnPago6);
		
		JButton btnPago5 = new JButton("5");
		btnPago5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtCantidadIngresada.setText( txtCantidadIngresada.getText() + "5") ;
			
			}
		});
			
			panel.add(btnPago5);
		
		JButton btnPago4 = new JButton("4");
		btnPago4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtCantidadIngresada.setText( txtCantidadIngresada.getText() + "4") ;
			
			}
		});
			
			panel.add(btnPago4);
		
		JButton btnPago3 = new JButton("3");
		btnPago3.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			
			txtCantidadIngresada.setText( txtCantidadIngresada.getText() + "3") ;
		
		}
	});
		
		panel.add(btnPago3);
		
		JButton btnPago2 = new JButton("2");
		btnPago2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				txtCantidadIngresada.setText( txtCantidadIngresada.getText() + "2") ;
			
			}
		});
		panel.add(btnPago2);
		
		JButton btnPago1 = new JButton("1");
		panel.add(btnPago1);
		btnPago1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				txtCantidadIngresada.setText( txtCantidadIngresada.getText() + "1") ;
			}
		});
		
		JButton btnBorrar = new JButton("...");
		btnBorrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
					
				cleartextFieldPago();
				
			}

			private void cleartextFieldPago() {
				// TODO Auto-generated method stub
				txtCantidadIngresada.setText("");
			}
		});
		panel.add(btnBorrar);
		
		JButton btnPago0 = new JButton("0");
		btnPago0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				txtCantidadIngresada.setText( txtCantidadIngresada.getText() + "0") ;
			
			}
		});
		
		panel.add(btnPago0);
		
		JButton btnPagoPunto = new JButton(".");
		btnPagoPunto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				txtCantidadIngresada.setText( txtCantidadIngresada.getText() + ".") ;
			
			}
		});
		
		panel.add(btnPagoPunto);
		
		txtCantidadIngresada = new JTextField();
		txtCantidadIngresada.setBounds(164, 33, 96, 20);
		prueba.getContentPane().add(txtCantidadIngresada);
		txtCantidadIngresada.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Pago:");
		lblNewLabel.setBounds(133, 39, 48, 14);
		prueba.getContentPane().add(lblNewLabel);
		
		JButton btnSiguiente = new JButton("Siguiente");
		btnSiguiente.setBounds(335, 227, 89, 23);
		prueba.getContentPane().add(btnSiguiente);
		
		btnSiguiente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
		          // ventana.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);

		/*	prueba.setVisible(false);
				Devolucion window = new Devolucion();
				window.getDevolucion().setVisible(true);  */
			
				}
			});
		
		JButton btnNewButton_12 = new JButton("Cancelar");
		btnNewButton_12.setBounds(10, 227, 89, 23);
		prueba.getContentPane().add(btnNewButton_12);
		
		setTxtTotal(new JTextField());
		getTxtTotal().setBounds(308, 33, 96, 20);
		prueba.getContentPane().add(getTxtTotal());
		getTxtTotal().setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Total a Pagar:");
		lblNewLabel_1.setBounds(308, 8, 96, 14);
		prueba.getContentPane().add(lblNewLabel_1);
		
		btnPagar = new JButton("Pagar");
		btnPagar.setBounds(287, 128, 89, 23);
		prueba.getContentPane().add(btnPagar);
		
		JLabel lblRestante = new JLabel("restante:");
		lblRestante.setBounds(328, 65, 48, 14);
		prueba.getContentPane().add(lblRestante);
		
		txtRestante = new JTextField();
		txtRestante.setBounds(308, 84, 96, 20);
		prueba.getContentPane().add(txtRestante);
		txtRestante.setColumns(10);
	}

	public JTextField getTxtTotal() {
		return txtTotal;
	}

	public void setTxtTotal(JTextField txtTotal) {
		this.txtTotal = txtTotal;
	}
}
