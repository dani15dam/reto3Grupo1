package vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.border.LineBorder;

public class Ticket extends JFrame {

	private JPanel contentPane;
	private JTable table_1;
	private JTable table_2;
	private JTable table_3;
	private JTable table_4;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ticket frame = new Ticket();
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
	public Ticket() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 422);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(Color.DARK_GRAY);
		panel.setBounds(0, 0, 434, 383);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("TICKET");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 25));
		lblNewLabel.setBounds(162, 5, 110, 42);
		panel.add(lblNewLabel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setForeground(Color.WHITE);
		panel_1.setBounds(10, 58, 414, 314);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("NOMBRE:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(38, 36, 67, 14);
		panel_1.add(lblNewLabel_1);
		
		JLabel lblNombre = new JLabel("");
		lblNombre.setBounds(115, 37, 48, 14);
		panel_1.add(lblNombre);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setBounds(115, 37, 48, 14);
		panel_1.add(lblNewLabel_2);
		
		JLabel lblApellido = new JLabel("New label");
		lblApellido.setBounds(261, 36, 83, 14);
		panel_1.add(lblApellido);
		
		JLabel label_3 = new JLabel("APELLIDO:");
		label_3.setFont(new Font("Tahoma", Font.BOLD, 13));
		label_3.setBounds(173, 37, 78, 14);
		panel_1.add(label_3);
		
		JLabel lbl_6 = new JLabel("DESTINO:");
		lbl_6.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbl_6.setBounds(208, 124, 67, 14);
		panel_1.add(lbl_6);
		
		JLabel lbl_5 = new JLabel("ORIGEN:");
		lbl_5.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbl_5.setBounds(51, 124, 67, 14);
		panel_1.add(lbl_5);
		
		JLabel lbl_4 = new JLabel("LINEA:");
		lbl_4.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbl_4.setBounds(96, 99, 67, 14);
		panel_1.add(lbl_4);
		
		JLabel lblLinea = new JLabel("New label");
		lblLinea.setBounds(158, 100, 48, 14);
		panel_1.add(lblLinea);
		
		JLabel lblOrigen = new JLabel("New label");
		lblOrigen.setBounds(115, 125, 48, 14);
		panel_1.add(lblOrigen);
		
		JLabel lblDestino = new JLabel("New label");
		lblDestino.setBounds(284, 125, 48, 14);
		panel_1.add(lblDestino);
		
		JLabel label_1 = new JLabel("");
		label_1.setBounds(51, 171, 48, 14);
		panel_1.add(label_1);
		
		JLabel lbl_7 = new JLabel("FECHA:");
		lbl_7.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbl_7.setBounds(51, 171, 67, 14);
		panel_1.add(lbl_7);
		
		JLabel lblFecha = new JLabel("New label");
		lblFecha.setBounds(104, 171, 104, 14);
		panel_1.add(lblFecha);
		
		JLabel lbl_9 = new JLabel("BUS:");
		lbl_9.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbl_9.setBounds(208, 171, 67, 14);
		panel_1.add(lbl_9);
		
		JLabel lbl_8 = new JLabel("PRECIO:");
		lbl_8.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbl_8.setBounds(277, 244, 67, 14);
		panel_1.add(lbl_8);
		
		JLabel lblBus = new JLabel("New label");
		lblBus.setBounds(250, 172, 48, 14);
		panel_1.add(lblBus);
		
		JLabel lblPrecio = new JLabel("New label");
		lblPrecio.setBounds(343, 245, 48, 14);
		panel_1.add(lblPrecio);
		
		table_1 = new JTable();
		table_1.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_1.setBounds(24, 95, 353, 55);
		panel_1.add(table_1);
		
		table_2 = new JTable();
		table_2.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_2.setBounds(24, 161, 354, 40);
		panel_1.add(table_2);
		
		table_3 = new JTable();
		table_3.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_3.setBounds(266, 227, 138, 47);
		panel_1.add(table_3);
		
		JLabel lblNewLabel_3 = new JLabel("TermiBus");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_3.setBounds(51, 243, 161, 14);
		panel_1.add(lblNewLabel_3);
		
		table_4 = new JTable();
		table_4.setBorder(new LineBorder(new Color(0, 0, 0)));
		table_4.setBounds(23, 227, 140, 47);
		panel_1.add(table_4);
		
		JLabel lbl_10 = new JLabel("DNI");
		lbl_10.setFont(new Font("Tahoma", Font.BOLD, 13));
		lbl_10.setBounds(125, 62, 67, 14);
		panel_1.add(lbl_10);
		
		JLabel lblDNI = new JLabel("New label");
		lblDNI.setBounds(183, 62, 48, 14);
		panel_1.add(lblDNI);
		
		table = new JTable();
		table.setBorder(new LineBorder(new Color(0, 0, 0)));
		table.setBounds(24, 24, 353, 62);
		panel_1.add(table);
	}
}
