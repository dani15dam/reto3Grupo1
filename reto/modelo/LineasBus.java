package modelo;

import java.util.ArrayList;

import controladores.ControladorIda;
import vista.Ida;

	

public class LineasBus {
	
	private String cod_lineas;
	private String nombre_bus;
	private String autobus;
	private String municipio;
	
		
	
	public LineasBus() {
		
	}
	
	public LineasBus(String pCod_lineas, String pNombreBus, String pAutobus,String pMunicipio) {
		
		this.cod_lineas= pCod_lineas;
		this.nombre_bus= pNombreBus ;
		this.autobus=pAutobus;
		this.municipio = pMunicipio;
		
		
	}

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
		
}
