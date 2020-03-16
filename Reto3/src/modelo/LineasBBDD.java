package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexion.Conexion;
import vista.Lineas;
/**
 * esta clase accedera a la base de datos y obtendra los datos para guardarlos en un arraylist
 * @author Dani
 *
 */
public class LineasBBDD {
	/**
	 * en este arraylist se guardara las lineas
	 */
	private ArrayList<LineasBus>listaLineas;
	
	public LineasBBDD(){
		
	}
	/**
	 * en este arraylist se inicializa el arraylist
	 * @return
	 */
	public ArrayList<LineasBus> getListaLineas() {
		return listaLineas;
	}
	/**
	 * este metodo permite la modificacion de la lista de lineas
	 * @param listaLineas
	 */
	public void setListaLineas(ArrayList<LineasBus> listaLineas) {
		this.listaLineas = listaLineas;
	}
	/**
	 * este metodo obtiene las lineas de la base de datos y las carga en la lista
	 * @return
	 * @throws SQLException
	 */
	public static ArrayList<LineasBus> obtenerLineas() throws SQLException{
		/**
		 * conecta a la base de datos
		 */
		Connection con= Conexion.conectar();
		/**
		 * realiza la consulta a la base de datos
		 */
		String sql="SELECT * FROM linea ";
		
		PreparedStatement ps=con.prepareStatement(sql);
		
		ResultSet rs=ps.executeQuery();
		

		ArrayList<LineasBus> lineas= new ArrayList<LineasBus>();

try {
			
			ps=con.prepareStatement(sql);
		
			while (rs.next()) {
				
				LineasBus miLinea = new LineasBus();
				
				miLinea.setCod_lineas(rs.getString("Cod_Linea"));
				miLinea.setNombreBus(rs.getString("Nombre"));
				
				lineas.add(miLinea);
			

			}

			ps.close();
			rs.close();
			con.close();
			
		} catch (Exception e) {
			
			System.out.println("Error: Clase Contacto, metodo obtener linea");
			
		}
		
		return lineas ;
	
	
	}
}
