package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexion.Conexion;

/**
 * se accede ala base de datos y guarda los datos de esta
 * 
 * @author Dani
 *
 */
public class PrecioBBDD {
	/**
	 * obtiene la lngitud del origen
	 * 
	 * @param cod_parada recibe un parametro de cod parada
	 * @return devuelve los resultados
	 * @throws SQLException lanza excepcion
	 */
	public static Double obtenerLongOrigen(String cod_parada) throws SQLException {
		Double result = null;
		/**
		 * conecta a la base de datos
		 */
		Connection con = Conexion.conectar();
		/**
		 * realiza la consulta a la base de datos
		 */
		String sql = "select longitud from parada where cod_parada='" + cod_parada + "';";

		PreparedStatement ps = con.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();

		/**
		 * comprueba la conexion
		 */
		try {

			ps = con.prepareStatement(sql);

			if (rs.next()) {
				result = rs.getDouble("Longitud");

			}

		} catch (Exception e) {

			System.out.println("Error: Clase Contacto, m�todo obtener paradas");

		} finally {
			ps.close();
			rs.close();
			con.close();

		}
		return result;

	}

	/**
	 * obtiene la latitud del origen accediendo a la base de datos
	 * 
	 * @param cod_parada recibe un parametro
	 * @return devuelve resultado
	 * @throws SQLException lanza excepcion
	 */
	public static Double obtenerLatOrigen(String cod_parada) throws SQLException {
		Double result = null;
		/**
		 * cone cta a la base de datos
		 */
		Connection con = Conexion.conectar();
		/**
		 * realiza la consulta a la base de datos
		 */
		String sql = "select latitud from Parada where cod_parada='" + cod_parada + "';";

		PreparedStatement ps = con.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();

		try {

			ps = con.prepareStatement(sql);

			if (rs.next()) {
				result = rs.getDouble("Latitud");
			}

		} catch (Exception e) {

			System.out.println("Error: Clase Contacto, m�todo obtener paradas");

		} finally {
			ps.close();
			rs.close();
			con.close();

		}

		return result;

	}

	/**
	 * ontiene de la base de datos la lngitud del destino
	 * 
	 * @param cod_parada recibe parametro
	 * @return devuelve resultado
	 * @throws SQLException lanza excepcion
	 */
	public static Double obtenerLongDestino(String cod_parada) throws SQLException {
		Double result = null;
		/**
		 * conecta con la base de datos
		 */
		Connection con = Conexion.conectar();
		/**
		 * hace la consulta a la base de datos
		 */
		String sql = "select longitud from parada where cod_parada='" + cod_parada + "';";

		PreparedStatement ps = con.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();

		try {

			ps = con.prepareStatement(sql);

			if (rs.next()) {
				result = rs.getDouble("Longitud");

			}

			ps.close();
			rs.close();
			con.close();

		} catch (Exception e) {

			System.out.println("Error: Clase Contacto, m�todo obtener paradas");

		} finally {
			ps.close();
			rs.close();
			con.close();

		}

		return result;

	}

	/**
	 * obtiene la latitud de la base de datos
	 * 
	 * @param cod_parada recibe parametro
	 * @return resultado
	 * @throws SQLException lanza excepcion
	 */
	public static Double obtenerLatDestino(String cod_parada) throws SQLException {

		Double result = null;
		/**
		 * conecta a la base de datos
		 */
		Connection con = Conexion.conectar();
		/**
		 * hace la consulta
		 */
		String sql = "select latitud from parada where cod_parada='" + cod_parada + "';";

		PreparedStatement ps = con.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();

		try {

			ps = con.prepareStatement(sql);

			if (rs.next()) {
				result = rs.getDouble("Latitud");

			}

		} catch (Exception e) {

			System.out.println("Error: Clase Contacto, metodo obtener paradas");

		} finally {
			ps.close();
			rs.close();
			con.close();

		}

		return result;

	}

}
