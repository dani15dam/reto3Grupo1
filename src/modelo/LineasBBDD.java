package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexion.Conexion;
import vista.Lineas;

public class LineasBBDD {
	private ArrayList<LineasBus>listaLineas;
	
	public LineasBBDD(){
		
	}

	public ArrayList<LineasBus> getListaLineas() {
		return listaLineas;
	}

	public void setListaLineas(ArrayList<LineasBus> listaLineas) {
		this.listaLineas = listaLineas;
	}

	public static ArrayList<LineasBus> obtenerLineas() throws SQLException{
		
		Connection con= Conexion.conectar();
		String sql="SELECT * FROM Linea ";
		
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
			
			System.out.println("Error: Clase Contacto, método obtener linea");
			
		}
		
		return lineas ;
	
	
	}
}
