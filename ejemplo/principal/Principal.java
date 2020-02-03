package principal;

import controlador.ControladorContacto;
import modelo.Contacto;


public class Principal {

	public static void main(String[] args) {
		try {
			
			
			//Creamos el objeto vista.
			vista.Principal ventanaPrincipal = new vista.Principal();
			ventanaPrincipal.setVisible(true);
			
			
			//Creamos en controlador con acceso al modelo y la vista
			ControladorContacto controladoroContacto = new ControladorContacto(ventanaPrincipal);
			
				
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
