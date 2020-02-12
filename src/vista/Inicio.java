package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controladores.ControladorLineas;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Inicio extends JFrame {

	private JPanel contentPane;

	public static void mInicio() {
		
				try {
					Inicio frame = new Inicio();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
	
	

	public Inicio() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Lineas ventanalineas  = new Lineas();
					ventanalineas.getLineas().setVisible(true);
					ControladorLineas controladorLinea = new ControladorLineas(ventanalineas);
					
				
				} catch (Exception a) {
					a.printStackTrace();
				}
				dispose();
			}
		});
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JLabel lblbienvenido = new JLabel("\u00A1bienvenido!");
		lblbienvenido.setBounds(140, 11, 158, 52);
		lblbienvenido.setFont(new Font("Arial Black", Font.PLAIN, 22));
		panel.add(lblbienvenido);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Inicio.class.getResource("/reto3/imagen/images.png")));
		label.setBounds(51, 74, 321, 146);
		panel.add(label);
	}
}
