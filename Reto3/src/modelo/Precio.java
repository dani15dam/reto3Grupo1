package modelo;

/**
 * esta clase guardara el precio
 * 
 * @author Dani
 *
 */
public class Precio {

	/**
	 * guarada la latitud
	 */
	private String latitud;
	/**
	 * guarda la longitud
	 */
	private String longitud;
	/**
	 * guarda el precio
	 */
	private String precio;
	/**
	 * guarda el consumo
	 */
	private String consumo;
	/**
	 * guarda el numero de asientos
	 */
	private String asientos;

	public Precio() {

	}

	/**
	 * inicializa los atributos
	 * 
	 * @param longitud guarda la longitud
	 * @param latitud  guarda la latitud
	 * @param precio   guarda el precio
	 * @param consumo  guarda el consumo
	 * @param asientos guarda el numero de asientos
	 */
	public Precio(String longitud, String latitud, String precio, String consumo, String asientos) {

		this.latitud = latitud;
		this.asientos = asientos;
		this.consumo = consumo;
		this.precio = precio;
		this.longitud = longitud;

	}

	/**
	 * permiten obetener y modificar los atributos
	 * 
	 * @return devuelve las variables
	 */
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
