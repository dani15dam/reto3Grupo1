package modelo;

public class Autobus {
	private int codBus;
	private int numPLazas;
	private int consumo;
	private String color;

	
	public Autobus(){
		
	}
	
	public Autobus(int pCodBus, int pNumPLazas,int pConsumo, String pColor){
		this.codBus = pCodBus;
		this.numPLazas = pNumPLazas;
		this.consumo = pConsumo;
		this.color = pColor;
	}

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
