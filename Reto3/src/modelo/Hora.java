package modelo;

/**
 * esta clase guarda la hora
 * 
 * @author Dani
 *
 */
public class Hora {
	/**
	 * variable donde se localizara la hora
	 */
	private String hora;

	public Hora() {

	}

	/**
	 * en eeste metodo se inicializa los atributos
	 * 
	 * @param pHora recibe un parametro hora
	 */
	public Hora(String pHora) {

		this.hora = pHora;

	}

	/**
	 * este metodo permite obtener la hora
	 * 
	 * @return hora
	 */
	public String getHora() {
		return hora;
	}

	/**
	 * este metodo permite modificar la hora
	 * 
	 * @param hora recibe un parametro hora
	 */
	public void setHora(String hora) {
		this.hora = hora;
	}

}
