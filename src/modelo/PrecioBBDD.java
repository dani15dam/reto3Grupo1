package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexion.Conexion;

public class PrecioBBDD {

	public static Double obtenerLongOrigen(String cod_parada) throws SQLException {
		Double result = null;

		Connection con = Conexion.conectar();

		String sql = "select longitud from parada where cod_parada='" + cod_parada + "';";
		
		PreparedStatement ps = con.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();


		try {

			ps = con.prepareStatement(sql);

			if (rs.next()) {
				result =  rs.getDouble("Longitud");

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

	public static Double obtenerLatOrigen(String cod_parada) throws SQLException {
		Double result = null;

		Connection con = Conexion.conectar();

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

	public static Double obtenerLongDestino(String cod_parada) throws SQLException {
		Double result = null;

		Connection con = Conexion.conectar();

		String sql = "select longitud from parada where cod_parada='" + cod_parada + "';";

		PreparedStatement ps = con.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();

		try {

			ps = con.prepareStatement(sql);

			if(rs.next()) {
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

	public static Double obtenerLatDestino(String cod_parada) throws SQLException {

		Double result = null;
		
		Connection con = Conexion.conectar();

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
