package modelo;

public class ModeloPago {
	
	private int total;
	private int cantidadIngresada;
	private int resultado;
	
	public int getResultado() {
		return resultado;
	}

	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

	public ModeloPago() {
		
		
	}
	
	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public int getCantidadIngresada() {
		return cantidadIngresada;
	}

	public void setCantidadIngresada(int cantidadIngresada) {
		this.cantidadIngresada = cantidadIngresada;
	}
	
	public int pagar () {
		
		this.resultado =( this.getTotal() - this.getCantidadIngresada());
		
		return this.resultado;
		
		
	}
}
