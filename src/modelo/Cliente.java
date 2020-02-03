package modelo;

public class Cliente {

	private String dni;
	private String contrasena;
	
	
	
	public Cliente() {
		
	}
	
	public Cliente(String pDni, String pContrasena) {
		this.dni = pDni;
		this.contrasena = pContrasena;
	}
	
	
	public boolean logear(String pDni, String pContrasena) {
		
		
		return true;
		
	}
}
