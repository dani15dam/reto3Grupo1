package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import conexion.Conexion;

/**
 * en esta clase se obtienen las paradas de la base de datos
 * 
 * @author Dani
 *
 */
public class ParadasBBDD {

	/**
	 * esta lista guardara las paradas
	 */
	private ArrayList<Paradas> listaParadas;

	public ParadasBBDD() {

	}

	/**
	 * obtiene las paradas de la base de datos
	 * 
	 * @param cod_Linea recibe un parametro de cod linea
	 * @return devuelve las paradas
	 * @throws SQLException lanza excepcion
	 */
	public static ArrayList<Paradas> obtenerParadas(String cod_Linea) throws SQLException {
		/**
		 * conecta a la base de datos
		 */
		Connection con = Conexion.conectar();

		/**
		 * realiza la conulta a la base de datos
		 */
		String sql = "select Nombre, parada.Cod_Parada from parada INNER JOIN linea_parada ON parada.Cod_Parada = linea_parada.Cod_Parada where linea_parada.cod_linea='"
				+ cod_Linea + "';";

		PreparedStatement ps = con.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();

		ArrayList<Paradas> paradas = new ArrayList<Paradas>();

		try {

			ps = con.prepareStatement(sql);

			while (rs.next()) {

				Paradas parada = new Paradas();

				parada.setNombre_parada(rs.getString("Nombre"));
				parada.setCod_parada(rs.getString("Cod_Parada"));

				paradas.add(parada);

			}

			ps.close();
			rs.close();
			con.close();

		} catch (Exception e) {

			System.out.println("Error: Clase Contacto, m�todo obtener paradas");

		}

		return paradas;

	}

	public ArrayList<Paradas> getListaLineas() {
		return listaParadas;
	}

	public void setListaLineas(ArrayList<Paradas> listaParadas) {
		this.listaParadas = listaParadas;
	}

}
