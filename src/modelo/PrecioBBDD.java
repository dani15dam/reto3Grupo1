package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexion.Conexion;
import controladores.ControladorIdaVuelta;
import vista.IdaVuelta;

public class PrecioBBDD {

	private ArrayList<Precio> distancia;

	public static ArrayList<Precio> obtenerLongOrigen(String cod_parada) throws SQLException {

		IdaVuelta posicion = new IdaVuelta();

		String origen = posicion.getTrayectoIda2().getSelectedItem().toString();

		Connection con = Conexion.conectar();

		String sql = "select longitud from Parada where cod_parada='" + cod_parada + "';";

		PreparedStatement ps = con.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();

		ArrayList<Precio> preciodistancias = new ArrayList<Precio>();

		try {

			ps = con.prepareStatement(sql);

			while (rs.next()) {

				Precio precios = new Precio();

				precios.setLongitud(rs.getString("Longitud"));

				preciodistancias.add(precios);

			}

			ps.close();
			rs.close();
			con.close();

		} catch (Exception e) {

			System.out.println("Error: Clase Contacto, método obtener paradas");

		}

		return preciodistancias;

	}

	public static ArrayList<Precio> obtenerLatOrigen(String cod_parada) throws SQLException {

		IdaVuelta posicion = new IdaVuelta();

		String origen = posicion.getTrayectoIda2().getSelectedItem().toString();

		Connection con = Conexion.conectar();

		String sql = "select latitud from Parada where cod_parada='" + cod_parada + "';";

		PreparedStatement ps = con.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();

		ArrayList<Precio> origenLat = new ArrayList<Precio>();

		try {

			ps = con.prepareStatement(sql);

			while (rs.next()) {

				Precio precios = new Precio();

				precios.setLatitud(rs.getString("Latitud"));

				origenLat.add(precios);

			}

			ps.close();
			rs.close();
			con.close();

		} catch (Exception e) {

			System.out.println("Error: Clase Contacto, método obtener paradas");

		}

		return origenLat;

	}

	public static ArrayList<Precio> obtenerLongDestino(String cod_parada) throws SQLException {

		IdaVuelta posicion = new IdaVuelta();

		String origen = posicion.getTrayectoIda2().getSelectedItem().toString();

		Connection con = Conexion.conectar();

		String sql = "select longitud from Parada where cod_parada='" + cod_parada + "';";

		PreparedStatement ps = con.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();

		ArrayList<Precio> preciodistancias = new ArrayList<Precio>();

		try {

			ps = con.prepareStatement(sql);

			while (rs.next()) {

				Precio precios = new Precio();

				precios.setLongitud(rs.getString("Longitud"));

				preciodistancias.add(precios);

			}

			ps.close();
			rs.close();
			con.close();

		} catch (Exception e) {

			System.out.println("Error: Clase Contacto, método obtener paradas");

		}

		return preciodistancias;

	}

	public static ArrayList<Precio> obtenerLatDestino(String cod_parada) throws SQLException {

		IdaVuelta posicion = new IdaVuelta();

		String origen = posicion.getTrayectoIda2().getSelectedItem().toString();

		Connection con = Conexion.conectar();

		String sql = "select latitud from Parada where cod_parada='" + cod_parada + "';";

		PreparedStatement ps = con.prepareStatement(sql);

		ResultSet rs = ps.executeQuery();

		ArrayList<Precio> preciodistancias = new ArrayList<Precio>();

		try {

			ps = con.prepareStatement(sql);

			while (rs.next()) {

				Precio precios = new Precio();

				precios.setLatitud(rs.getString("Latitud"));

				preciodistancias.add(precios);

			}

			ps.close();
			rs.close();
			con.close();

		} catch (Exception e) {

			System.out.println("Error: Clase Contacto, método obtener paradas");

		}

		return preciodistancias;

	}

}
