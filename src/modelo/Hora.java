package modelo;
/**
 * esta clase guarda la hora
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
	 * @param pHora
	 */
	public Hora(String pHora ) {
		
		this.hora = pHora;
		
		
	}
	/**
	 * este metodo permite obtener la hora
	 * @return
	 */
	public String getHora() {
		return hora;
	}
	/**
	 * este metodo permite modificar la hora
	 * @param hora
	 */
	public void setHora(String hora) {
		this.hora = hora;
	}
	
}
