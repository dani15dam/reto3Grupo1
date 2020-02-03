package controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import modelo.Cliente;
import modelo.ModeloPago;
import vista.Cuenta;
import vista.Pago;

public class ControladorPago implements ActionListener {
		
	private Pago ventanaPago;
	private ModeloPago model;
	int resto = this.model.getResultado() ;
	
		
	public ControladorPago(Pago pVentanaPago, ModeloPago pModel) {
		this.ventanaPago = pVentanaPago; 
		this.model = pModel;
		
			
		
			
	}
		
		
	public void inicializarControlador() {
			
		//inicializar botones
		this.ventanaPago.getBtnPagar().addActionListener(this);
		this.ventanaPago.getBtnPagar().setActionCommand("BtnPagar");
		
		
			
			
	}
		
		
		
	public void actionPerformed(ActionEvent e) {
			
		String botonPulsado = e.getActionCommand();
		
		switch (botonPulsado){
			case "BtnPagar":
				this.model.setTotal(Integer.parseInt(ventanaPago.getTxtTotal().getText()));
				this.model.setCantidadIngresada(Integer.parseInt(ventanaPago.getTxtCantidadIngresada().getText()));
				this.pagar();
				this.ventanaPago.getTxtRestante().setText(Integer.toString(resto));	
			break;
					
		}
			
			
	}
	public int pagar () {
	
		resto =this.model.getTotal() - this.model.getCantidadIngresada();
		
		return resto;
		
		
	}
}
