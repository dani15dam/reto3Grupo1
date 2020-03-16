package modelo;

import java.util.ArrayList;

import controladores.ControladorIda;
import vista.Ida;

	
/**
 * clase recogera las lineas de autobus
 * esta 
 * @author Dani
 *
 */
public class LineasBus {
	/**
	 * esta variable guarda el codigo de autobus
	 */
	private String cod_lineas;
	/**
	 * guarda el nombre del bus
	 */
	private String nombre_bus;
	/**
	 * guarda el autobus
	 */
	private String autobus;
	/**
	 * guarda el municipio
	 */
	private String municipio;
	
		
	
	public LineasBus() {
		
	}
	/**
	 * este metodo inicia los atributos
	 * @param pCod_lineas
	 * @param pNombreBus
	 * @param pAutobus
	 * @param pMunicipio
	 */
	public LineasBus(String pCod_lineas, String pNombreBus, String pAutobus,String pMunicipio) {
		
		this.cod_lineas= pCod_lineas;
		this.nombre_bus= pNombreBus ;
		this.autobus=pAutobus;
		this.municipio = pMunicipio;
		
		
	}
	/**
	 * los metodos get y set sirven para obtener y modificar los atributos
	 * @return
	 */
	public String getCod_lineas() {
		return cod_lineas;
	}

	public void setCod_lineas(String cod_lineas) {
		this.cod_lineas = cod_lineas;
	}

	public String getNombreBus() {
		return nombre_bus;
	}

	public void setNombreBus(String nombre) {
		this.nombre_bus = nombre;
	}

	public String getAutobus() {
		return autobus;
	}

	public void setAutobus(String autobus) {
		this.autobus = autobus;
	}

	public String getMunicipio() {
		return municipio;
	}

	public void setMunicipio(String municipio) {
		this.municipio = municipio;
	}
	/**
	 * cambia a string
	 */
	public String toString() {
		
		return this.nombre_bus;
		
	}
		
}
