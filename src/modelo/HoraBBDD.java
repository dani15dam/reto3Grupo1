package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import conexion.Conexion;

public class HoraBBDD {
	private ArrayList<Hora>horario;
	
	public HoraBBDD(){
		
	}

	public ArrayList<Hora> getListaHora() {
		return horario;
	}

	public void setListaHora(ArrayList<Hora> listaLineas) {
		this.horario = listaLineas;
	}

	public static ArrayList<Hora> obtenerHoras(String cod_linea) throws SQLException{
		
		Connection con= Conexion.conectar();
		String sql="SELECT Hora FROM linea_autobuses where ='"+cod_linea+"' ";
		
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
