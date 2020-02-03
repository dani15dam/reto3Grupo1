package modelo;

public class Paradas {
	
	private String cod_parada;
	private String nombre_parada;
	private String calle;
	private String coordenadas;
	
	public Paradas() {
		super();
	}
	
	public Paradas(String pCod_parada, String pNombre_parada , String pCalle,String pCoordenadas) {
		super();
		
		this.cod_parada = pCod_parada;
		this.nombre_parada = pNombre_parada;
		this.calle = pCalle;
		this.coordenadas = pCoordenadas;
			
	}

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
	public String toString(){
	return this.nombre_parada;
	}
}

	