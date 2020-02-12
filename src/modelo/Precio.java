package modelo;

public class Precio {
	
	
	private String latitud;
	private String longitud;
	private String precio;
	private String consumo;
	private String asientos;

	
		
	
	public Precio() {
		
	}
	
	public Precio(String longitud, String latitud, String precio, String consumo,String asientos ) {
		
		this.latitud = latitud;
		this.asientos=asientos;
		this.consumo=consumo;
		this.precio=precio;
		this.longitud=longitud;
		
				
		
	}

	public String getLatitud() {
		return latitud;
	}

	public void setLatitud(String latitud) {
		this.latitud = latitud;
	}

	public String getLongitud() {
		return longitud;
	}

	public void setLongitud(String longitud) {
		this.longitud = longitud;
	}

	public String getPrecio() {
		return precio;
	}

	public void setPrecio(String precio) {
		this.precio = precio;
	}

	public String getConsumo() {
		return consumo;
	}

	public void setConsumo(String consumo) {
		this.consumo = consumo;
	}

	public String getAsientos() {
		return asientos;
	}

	public void setAsientos(String asientos) {
		this.asientos = asientos;
	}
	


}
