package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import conexion.Conexion;

public class ClienteBD {

	public boolean mInsetarContacto(Cliente cliente) {

		boolean registrar = false;

		Connection con = null;

		String sql = "INSERT INTO cliente VALUES (?,?,?,?,?,?) ";

		try {

			con = Conexion.conectar();

			PreparedStatement cs = con.prepareStatement(sql);

			cs.setString(1, cliente.getDni());
			cs.setString(2, cliente.getNombre());
			cs.setString(3, cliente.getApellidos());
			cs.setString(4, cliente.getFechaNaci());
			cs.setString(5, cliente.getSexo());
			cs.setString(6, cliente.getCont());

			cs.execute();

			registrar = true;

		} catch (SQLException e) {

			System.out.println("Error: Clase Contacto, mï¿½todo insertar");

			e.printStackTrace();
		}
		return registrar;
	}

	public boolean mBuscarContacto(String dni, String contrasena)  {


		boolean existeUsuario = false;

		try {
			
			Connection con= Conexion.conectar();
			
			String sql="SELECT * FROM cliente WHERE dni = ? and contraseña = ?";
			PreparedStatement ps=con.prepareStatement(sql);

			ps.setString(1, dni);
			ps.setString(2, contrasena);
			ResultSet rs=ps.executeQuery();

		
			while (rs.next()) {
				existeUsuario = true;
			}

			ps.close();
			rs.close();
			con.close();
			

		} catch (SQLException e) {
			
			System.out.println("Error: Clase Contacto, mï¿½todo buscar");
			e.printStackTrace();			
		}

		return existeUsuario;
	}

	
	
	

}