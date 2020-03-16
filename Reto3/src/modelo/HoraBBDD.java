package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexion.Conexion;
/**
 * este metodo guardara las horas obtenidas de una base de datos
 * @author Dani
 *
 */
public class HoraBBDD {
	/**
	 * este arraylist guardara todas las horas disponibles
	 */
	private ArrayList<Hora>horario;
	
	public HoraBBDD(){
		
	}
	/**
	 * este metodo inicializa el arraylist
	 * @return devuelve el horario
	 */
	public ArrayList<Hora> getListaHora() {
		return horario;
	}
	/**
	 * en este metodo se puede modificar el arraylist
	 * @param listaLineas recibe un parametro de lista lineas
	 */
	public void setListaHora(ArrayList<Hora> listaLineas) {
		this.horario = listaLineas;
	}
	/**
	 * en este metodo se accede a la base de datos para obtener las horas
	 * @param cod_linea necesita un parametro
	 * @return devuelve las horas
	 * @throws SQLException lanza excepcion
	 */
	public static ArrayList<Hora> obtenerHoras(String cod_linea) throws SQLException{
		
		Connection con= Conexion.conectar();
		/**
		 * en esta variable se hace la consulta a la base de datos
		 */
		String sql="SELECT DISTINCT Hora FROM linea_autobus where cod_linea='A0651'AND Hora > SYSDATE()";
	
		PreparedStatement ps=con.prepareStatement(sql);
		
		ResultSet rs=ps.executeQuery();
		

		ArrayList<Hora> horas= new ArrayList<Hora>();
try {
			
			ps=con.prepareStatement(sql);
		
			while (rs.next()) {
				
				Hora hora = new Hora();
				
				hora.setHora(rs.getString("Hora"));
				
				
				horas.add(hora);
			

			}

			ps.close();
			rs.close();
			con.close();
			
		} catch (Exception e) {
			
			System.out.println("Error: Clase Contacto, método obtener linea");
			
		}
		
		return horas ;
	
	
	}
}
