package modelo;

public class Cliente {
	
	private String dni;
	private String nombre;
	private String apellidos;
	private String sexo;
	private String cont;
	private String fechaNaci;
	
	public Cliente() {
		super();
	}

	public Cliente(String dni, String nombre, String apellidos, String sexo, String cont,String fechaNacimi) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.sexo = sexo;
		this.cont = cont;
		this.fechaNaci=fechaNacimi;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni=dni ;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public String getCont() {
		return cont;
	}

	public void setCont(String cont) {
		this.cont = cont;
	}

	public String getFechaNaci() {
		return fechaNaci;
	}

	public String setFechaNaci(String fechaNaci) {
		return this.fechaNaci = fechaNaci;
	}



}