package modelo;

public class Autobus {
	/**
	 * variable del codigo de autobus
	 */
	private int codBus;
	/**
	 * variable de numeros de plazas
	 */
	private int numPLazas;
	/**
	 * variable del consumo
	 */
	private int consumo;
	/**
	 * variable del color
	 */
	private String color;

	public Autobus() {

	}

	/**
	 * este metodo inicializa los atributos
	 * 
	 * @param pCodBus    variable del codigo
	 * @param pNumPLazas variable del numero de plazas
	 * @param pConsumo   guarda el consumo
	 * @param pColor     guarda el color
	 */
	public Autobus(int pCodBus, int pNumPLazas, int pConsumo, String pColor) {
		this.codBus = pCodBus;
		this.numPLazas = pNumPLazas;
		this.consumo = pConsumo;
		this.color = pColor;
	}

	/**
	 * los metodos get and set permiten obtener y modificar las variables
	 * 
	 * @return devuelve las variables
	 */
	public int getCodBus() {
		return codBus;
	}

	public void setCodBus(int codBus) {
		this.codBus = codBus;
	}

	public int getNumPLazas() {
		return numPLazas;
	}

	public void setNumPLazas(int numPLazas) {
		this.numPLazas = numPLazas;
	}

	public int getConsumo() {
		return consumo;
	}

	public void setConsumo(int consumo) {
		this.consumo = consumo;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

}
