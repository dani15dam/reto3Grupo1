package modelo;

/**
 * esta clase guarda las paradas de autobus
 * 
 * @author Dani
 *
 */
public class Paradas {
	/**
	 * guarda el codigo de parada
	 */
	private String cod_parada;
	/**
	 * guarda el nombre de la parada
	 */
	private String nombre_parada;
	/**
	 * guarda la calle de la parada
	 */
	private String calle;
	/**
	 * guarda las coordenadas
	 */
	private String coordenadas;

	public Paradas() {
		super();
	}

	/**
	 * inicializa los atributos
	 * 
	 * @param pCod_parada    guarda el codigo de parada
	 * @param pNombre_parada guarda el nombre de la parada
	 * @param pCalle         guarda la calle
	 * @param pCoordenadas   guarda las coordenadas
	 */
	public Paradas(String pCod_parada, String pNombre_parada, String pCalle, String pCoordenadas) {
		super();

		this.cod_parada = pCod_parada;
		this.nombre_parada = pNombre_parada;
		this.calle = pCalle;
		this.coordenadas = pCoordenadas;

	}

	/**
	 * los metodos get y set permiten obtener y modificar los atributos
	 * 
	 * @return devuelve las variables
	 */
	public String getCod_parada() {
		return cod_parada;
	}

	public void setCod_parada(String cod_parada) {
		this.cod_parada = cod_parada;
	}

	public String getNombre_parada() {
		return nombre_parada;
	}

	public void setNombre_parada(String nombre_parada) {
		this.nombre_parada = nombre_parada;
	}

	public String getCalle() {
		return calle;
	}

	public void setCalle(String calle) {
		this.calle = calle;
	}

	public String getCoordenadas() {
		return coordenadas;
	}

	public void setCoordenadas(String coordenadas) {
		this.coordenadas = coordenadas;
	}

	public String toString() {
		return this.nombre_parada;
	}
}
