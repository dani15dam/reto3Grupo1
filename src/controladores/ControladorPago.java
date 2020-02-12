package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import modelo.Cliente;
import modelo.ModeloPago;
import vista.Devolucion;
import vista.Inicio;
import vista.InicioSesion;
import vista.Pago;

public class ControladorPago implements ActionListener, ListSelectionListener {

	modelo.ModeloPago model;
	vista.Pago vistaPago;
	vista.Devolucion vistaDev;

	public ControladorPago(vista.Pago vistaPago) {
		this.vistaPago = vistaPago;

		inicializarControlador();

	}

	public ControladorPago() {

	}

	public void inicializarControlador() {

		vistaPago.getTxtRestante().setText(vistaPago.getTxtTotal().getText().toString());
		// inicializar botones
		this.vistaPago.getBtnPagar().addActionListener(this);
		this.vistaPago.getBtnPagar().setActionCommand(Pago.enumAcciones.BtnPagar.toString());
		this.vistaPago.getBtnDevolver().addActionListener(this);
		this.vistaPago.getBtnDevolver().setActionCommand(Pago.enumAcciones.BtnDevolver.toString());
		this.vistaPago.getBtnSiguiente().addActionListener(this);
		this.vistaPago.getBtnSiguiente().setActionCommand(Pago.enumAcciones.BtnSiguiente.toString());
		this.vistaPago.getBtnCancelar().addActionListener(this);
		this.vistaPago.getBtnCancelar().setActionCommand(Pago.enumAcciones.BtnCancelar.toString());
	}

	public void actionPerformed(ActionEvent e) {

		Pago.enumAcciones accion = Pago.enumAcciones.valueOf(e.getActionCommand());

		switch (accion) {

		case BtnSiguiente:

			Devolucion vistaDevolucion = new Devolucion();
			vistaPago.setVisible(false);
			vistaDevolucion.setVisible(true);
			ControladorDevolucion controladorDevolucion = new ControladorDevolucion(vistaDevolucion);

			break;

		case BtnPagar:

			float totaldevolver = 0;
			int b;
			String txtPanelRestante = "";

			String dineroRestante, dineroIntroducido, resultado;
			float dineroRestanteFloat, dineroIntroducidoFloat, resultadoFloat;
			dineroRestante = (vistaPago.getTxtRestante().getText().toString());
			dineroRestanteFloat = Float.parseFloat(dineroRestante);
			dineroIntroducido = (vistaPago.getTxtCantidadIngresada().getText().toString());
			dineroIntroducidoFloat = Float.parseFloat(dineroIntroducido);

			if (dineroIntroducidoFloat == dineroRestanteFloat) {

				resultadoFloat = (dineroRestanteFloat - dineroIntroducidoFloat);
				resultado = Float.toString(resultadoFloat);
				vistaPago.getTxtRestante().setText("0");
				vistaPago.getTxtCantidadIngresada().setText("");
				txtPanelRestante = "se ha introducido el dinero exacto";
				vistaPago.getTxtPanelRestante().setText(txtPanelRestante);

			}

			if (dineroIntroducidoFloat < dineroRestanteFloat) {

				resultadoFloat = (dineroRestanteFloat - dineroIntroducidoFloat);
				resultado = Float.toString(resultadoFloat);
				vistaPago.getTxtRestante().setText(resultado);
				vistaPago.getTxtCantidadIngresada().setText("");
				resultadoFloat = Float.parseFloat(resultado);

			} else {

				if (dineroIntroducidoFloat > dineroRestanteFloat) {

					resultadoFloat = ((dineroRestanteFloat - dineroIntroducidoFloat) * -1);
					resultado = Float.toString(resultadoFloat);
					vistaPago.getTxtRestante().setText("0");
					vistaPago.getTxtCantidadIngresada().setText("");

					resultadoFloat = Math.round(resultadoFloat * 100) / 100f;

					if (resultadoFloat != 0) {

						if (resultadoFloat >= 200f) {
							totaldevolver = resultadoFloat / 200;
							totaldevolver = (float) (Math.floor(totaldevolver * 1) / 1);
							resultadoFloat = resultadoFloat % 200;
							b = (int) totaldevolver;
							txtPanelRestante = txtPanelRestante + "Devolver " + b + " billete de 200€\n";
							vistaPago.getTxtPanelRestante().setText(txtPanelRestante);

						}
						resultadoFloat = Math.round(resultadoFloat * 100) / 100f;

						if (resultadoFloat >= 100f) {
							totaldevolver = resultadoFloat / 100;
							totaldevolver = (float) (Math.floor(totaldevolver * 1) / 1);
							resultadoFloat = resultadoFloat % 100;
							b = (int) totaldevolver;
							txtPanelRestante = txtPanelRestante + "Devolver " + b + " billetes de 100 € \n";
							vistaPago.getTxtPanelRestante().setText(txtPanelRestante);

						}
						resultadoFloat = Math.round(resultadoFloat * 100) / 100f;

						if (resultadoFloat >= 50f) {
							totaldevolver = resultadoFloat / 50;
							totaldevolver = (float) (Math.floor(totaldevolver * 1) / 1);
							resultadoFloat = resultadoFloat % 50;
							b = (int) totaldevolver;
							txtPanelRestante = txtPanelRestante + "Devolver " + b + " billetes de 50 € \n";
							vistaPago.getTxtPanelRestante().setText(txtPanelRestante);

						}
						resultadoFloat = Math.round(resultadoFloat * 100) / 100f;

						if (resultadoFloat >= 20f) {
							totaldevolver = resultadoFloat / 20;
							totaldevolver = (float) (Math.floor(totaldevolver * 1) / 1);
							resultadoFloat = resultadoFloat % 20;
							b = (int) totaldevolver;
							txtPanelRestante = txtPanelRestante + "Devolver " + b + " billetes de 20 € \n";
							vistaPago.getTxtPanelRestante().setText(txtPanelRestante);

						}
						resultadoFloat = Math.round(resultadoFloat * 100) / 100f;

						if (resultadoFloat >= 10f) {
							totaldevolver = resultadoFloat / 10;
							totaldevolver = (float) (Math.floor(totaldevolver * 1) / 1);
							resultadoFloat = resultadoFloat % 10;
							b = (int) totaldevolver;
							txtPanelRestante = txtPanelRestante + "Devolver " + b + " billete de 10 € \n";
							vistaPago.getTxtPanelRestante().setText(txtPanelRestante);

						}
						resultadoFloat = Math.round(resultadoFloat * 100) / 100f;

						if (resultadoFloat >= 5f) {
							totaldevolver = resultadoFloat / 5;
							totaldevolver = (float) (Math.floor(totaldevolver * 1) / 1);
							resultadoFloat = resultadoFloat % 5;
							b = (int) totaldevolver;
							txtPanelRestante = txtPanelRestante + "Devolver " + b + " billete de 5 € \n";
							vistaPago.getTxtPanelRestante().setText(txtPanelRestante);

						}
						resultadoFloat = Math.round(resultadoFloat * 100) / 100f;

						if (resultadoFloat >= 2f) {
							totaldevolver = resultadoFloat / 2;
							totaldevolver = (float) (Math.floor(totaldevolver * 1) / 1);
							resultadoFloat = resultadoFloat % 2;
							b = (int) totaldevolver;
							txtPanelRestante = txtPanelRestante + "Devolver " + b + " monedas de 2 € \n";
							vistaPago.getTxtPanelRestante().setText(txtPanelRestante);

						}
						resultadoFloat = Math.round(resultadoFloat * 100) / 100f;

						if (resultadoFloat >= 1f) {
							totaldevolver = resultadoFloat / 1;
							totaldevolver = (float) (Math.floor(totaldevolver * 1) / 1);
							resultadoFloat = resultadoFloat % 1;
							b = (int) totaldevolver;
							txtPanelRestante = txtPanelRestante + "Devolver " + b + " monedas de 1 € \n";
							vistaPago.getTxtPanelRestante().setText(txtPanelRestante);

						}
						resultadoFloat = Math.round(resultadoFloat * 100) / 100f;

						if (resultadoFloat >= 0.50f) {
							totaldevolver = resultadoFloat / 0.50f;
							resultadoFloat = resultadoFloat % 0.50f;
							b = (int) totaldevolver;
							txtPanelRestante = txtPanelRestante + "Devolver " + b + " monedas de 0.50 € \n";
							vistaPago.getTxtPanelRestante().setText(txtPanelRestante);

						}
						resultadoFloat = Math.round(resultadoFloat * 100) / 100f;

						if (resultadoFloat >= 0.20f) {
							totaldevolver = resultadoFloat / 0.20f;
							totaldevolver = (float) (Math.floor(totaldevolver * 1) / 1);
							resultadoFloat = resultadoFloat % 0.20f;
							b = (int) totaldevolver;
							txtPanelRestante = txtPanelRestante + "Devolver " + b + " monedas de 0.20 € \n";
							vistaPago.getTxtPanelRestante().setText(txtPanelRestante);

						}
						resultadoFloat = Math.round(resultadoFloat * 100) / 100f;

						if (resultadoFloat >= 0.10f) {
							totaldevolver = resultadoFloat / 0.10f;
							totaldevolver = (float) (Math.floor(totaldevolver * 1) / 1);
							resultadoFloat = resultadoFloat % 0.10f;
							b = (int) totaldevolver;
							txtPanelRestante = txtPanelRestante + "Devolver " + b + " monedas de 0.10 € \n";
							vistaPago.getTxtPanelRestante().setText(txtPanelRestante);

						}
						resultadoFloat = Math.round(resultadoFloat * 100) / 100f;

						if (resultadoFloat >= 0.05f) {
							totaldevolver = resultadoFloat / 0.05f;
							totaldevolver = (float) (Math.floor(totaldevolver * 1) / 1);
							resultadoFloat = resultadoFloat % 0.05f;
							b = (int) totaldevolver;
							txtPanelRestante = txtPanelRestante + "Devolver " + b + " monedas de 0.05 € \n";
							vistaPago.getTxtPanelRestante().setText(txtPanelRestante);

						}
						resultadoFloat = Math.round(resultadoFloat * 100) / 100f;

						if (resultadoFloat >= 0.02f) {
							totaldevolver = resultadoFloat / 0.02f;
							totaldevolver = (float) (Math.floor(totaldevolver * 1) / 1);
							resultadoFloat = resultadoFloat % 0.02f;
							b = (int) totaldevolver;
							txtPanelRestante = txtPanelRestante + "Devolver " + b + " monedas de 0.02 € \n";
							vistaPago.getTxtPanelRestante().setText(txtPanelRestante);

						}
						resultadoFloat = Math.round(resultadoFloat * 100) / 100f;

						if (resultadoFloat >= 0.01f) {
							totaldevolver = resultadoFloat / 0.01f;
							totaldevolver = (float) (Math.floor(totaldevolver * 1) / 1);
							resultadoFloat = resultadoFloat % 0.01f;
							b = (int) totaldevolver;
							txtPanelRestante = txtPanelRestante + "Devolver " + b + " monedas de 0.01 € \n";
							vistaPago.getTxtPanelRestante().setText(txtPanelRestante);

						}

					} else {

						System.out.println("Gracias por su compra, retire sus productos");

					}
				}

			}
			break;

		case BtnDevolver:

			String introducido = (vistaPago.getTxtCantidadIngresada().getText());
			float introducidoFloat = Float.parseFloat(introducido);

			introducidoFloat = Math.round(introducidoFloat * 100) / 100f;

			int c;
			String txtPanelRestante1 = "";
			if (introducidoFloat != 0) {

				if (introducidoFloat >= 200f) {
					totaldevolver = introducidoFloat / 200;
					totaldevolver = (float) (Math.floor(totaldevolver * 1) / 1);
					introducidoFloat = introducidoFloat % 200;
					c = (int) totaldevolver;
					txtPanelRestante1 = txtPanelRestante1 + "Devolver " + c + " billete de 200€\n";
					vistaPago.getTxtPanelRestante().setText(txtPanelRestante1);

				}
				introducidoFloat = Math.round(introducidoFloat * 100) / 100f;

				if (introducidoFloat >= 100f) {
					totaldevolver = introducidoFloat / 100;
					totaldevolver = (float) (Math.floor(totaldevolver * 1) / 1);
					introducidoFloat = introducidoFloat % 100;
					c = (int) totaldevolver;
					txtPanelRestante1 = txtPanelRestante1 + "Devolver " + c + " billetes de 100 € \n";
					vistaPago.getTxtPanelRestante().setText(txtPanelRestante1);

				}
				introducidoFloat = Math.round(introducidoFloat * 100) / 100f;

				if (introducidoFloat >= 50f) {
					totaldevolver = introducidoFloat / 50;
					totaldevolver = (float) (Math.floor(totaldevolver * 1) / 1);
					introducidoFloat = introducidoFloat % 50;
					c = (int) totaldevolver;
					txtPanelRestante1 = txtPanelRestante1 + "Devolver " + c + " billetes de 50 € \n";
					vistaPago.getTxtPanelRestante().setText(txtPanelRestante1);

				}
				introducidoFloat = Math.round(introducidoFloat * 100) / 100f;

				if (introducidoFloat >= 20f) {
					totaldevolver = introducidoFloat / 20;
					totaldevolver = (float) (Math.floor(totaldevolver * 1) / 1);
					introducidoFloat = introducidoFloat % 20;
					c = (int) totaldevolver;
					txtPanelRestante1 = txtPanelRestante1 + "Devolver " + c + " billetes de 20 € \n";
					vistaPago.getTxtPanelRestante().setText(txtPanelRestante1);

				}
				introducidoFloat = Math.round(introducidoFloat * 100) / 100f;

				if (introducidoFloat >= 10f) {
					totaldevolver = introducidoFloat / 10;
					totaldevolver = (float) (Math.floor(totaldevolver * 1) / 1);
					introducidoFloat = introducidoFloat % 10;
					c = (int) totaldevolver;
					txtPanelRestante1 = txtPanelRestante1 + "Devolver " + c + " billete de 10 € \n";
					vistaPago.getTxtPanelRestante().setText(txtPanelRestante1);

				}
				introducidoFloat = Math.round(introducidoFloat * 100) / 100f;

				if (introducidoFloat >= 5f) {
					totaldevolver = introducidoFloat / 5;
					totaldevolver = (float) (Math.floor(totaldevolver * 1) / 1);
					introducidoFloat = introducidoFloat % 5;
					c = (int) totaldevolver;
					txtPanelRestante1 = txtPanelRestante1 + "Devolver " + c + " billete de 5 € \n";
					vistaPago.getTxtPanelRestante().setText(txtPanelRestante1);

				}
				introducidoFloat = Math.round(introducidoFloat * 100) / 100f;

				if (introducidoFloat >= 2f) {
					totaldevolver = introducidoFloat / 2;
					totaldevolver = (float) (Math.floor(totaldevolver * 1) / 1);
					introducidoFloat = introducidoFloat % 2;
					c = (int) totaldevolver;
					txtPanelRestante1 = txtPanelRestante1 + "Devolver " + c + " monedas de 2 € \n";
					vistaPago.getTxtPanelRestante().setText(txtPanelRestante1);

				}
				introducidoFloat = Math.round(introducidoFloat * 100) / 100f;

				if (introducidoFloat >= 1f) {
					totaldevolver = introducidoFloat / 1;
					totaldevolver = (float) (Math.floor(totaldevolver * 1) / 1);
					introducidoFloat = introducidoFloat % 1;
					c = (int) totaldevolver;
					txtPanelRestante1 = txtPanelRestante1 + "Devolver " + c + " monedas de 1 € \n";
					vistaPago.getTxtPanelRestante().setText(txtPanelRestante1);

				}
				introducidoFloat = Math.round(introducidoFloat * 100) / 100f;

				if (introducidoFloat >= 0.50f) {
					totaldevolver = introducidoFloat / 0.50f;
					totaldevolver = (float) (Math.floor(totaldevolver * 1) / 1);
					introducidoFloat = introducidoFloat % 0.50f;
					c = (int) totaldevolver;
					txtPanelRestante1 = txtPanelRestante1 + "Devolver " + c + " monedas de 0.50 € \n";
					vistaPago.getTxtPanelRestante().setText(txtPanelRestante1);

				}
				introducidoFloat = Math.round(introducidoFloat * 100) / 100f;

				if (introducidoFloat >= 0.20f) {
					totaldevolver = introducidoFloat / 0.20f;
					totaldevolver = (float) (Math.floor(totaldevolver * 1) / 1);
					introducidoFloat = introducidoFloat % 0.20f;
					c = (int) totaldevolver;
					txtPanelRestante1 = txtPanelRestante1 + "Devolver " + c + " monedas de 0.20 € \n";
					vistaPago.getTxtPanelRestante().setText(txtPanelRestante1);

				}
				introducidoFloat = Math.round(introducidoFloat * 100) / 100f;

				if (introducidoFloat >= 0.10f) {
					totaldevolver = introducidoFloat / 0.10f;
					totaldevolver = (float) (Math.floor(totaldevolver * 1) / 1);
					introducidoFloat = introducidoFloat % 0.10f;
					c = (int) totaldevolver;
					txtPanelRestante1 = txtPanelRestante1 + "Devolver " + c + " monedas de 0.10 € \n";
					vistaPago.getTxtPanelRestante().setText(txtPanelRestante1);

				}
				introducidoFloat = Math.round(introducidoFloat * 100) / 100f;

				if (introducidoFloat >= 0.05f) {
					totaldevolver = introducidoFloat / 0.05f;
					totaldevolver = (float) (Math.floor(totaldevolver * 1) / 1);
					introducidoFloat = introducidoFloat % 0.05f;
					c = (int) totaldevolver;
					txtPanelRestante1 = txtPanelRestante1 + "Devolver " + c + " monedas de 0.05 € \n";
					vistaPago.getTxtPanelRestante().setText(txtPanelRestante1);

				}
				introducidoFloat = Math.round(introducidoFloat * 100) / 100f;

				if (introducidoFloat >= 0.02f) {
					totaldevolver = introducidoFloat / 0.02f;
					totaldevolver = (float) (Math.floor(totaldevolver * 1) / 1);
					introducidoFloat = introducidoFloat % 0.02f;
					c = (int) totaldevolver;
					txtPanelRestante1 = txtPanelRestante1 + "Devolver " + c + " monedas de 0.02 € \n";
					vistaPago.getTxtPanelRestante().setText(txtPanelRestante1);

				}
				introducidoFloat = Math.round(introducidoFloat * 100) / 100f;

				if (introducidoFloat >= 0.01f) {
					totaldevolver = introducidoFloat / 0.01f;
					totaldevolver = (float) (Math.floor(totaldevolver * 1) / 1);
					introducidoFloat = introducidoFloat % 0.01f;
					c = (int) totaldevolver;
					txtPanelRestante1 = txtPanelRestante1 + "Devolver " + c + " monedas de 0.01 € \n";
					vistaPago.getTxtPanelRestante().setText(txtPanelRestante1);

				}
				vistaPago.getTxtCantidadIngresada().setText("");}

				break;
				
			case BtnCancelar:

				Inicio inicio = new Inicio();
				inicio.setVisible(true);

		
				vistaPago.dispose();
				
				break;
			
		}

	}

	@Override
	public void valueChanged(ListSelectionEvent e) {
		// TODO Auto-generated method stub

	}
}
