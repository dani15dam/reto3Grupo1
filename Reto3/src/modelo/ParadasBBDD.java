package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import conexion.Conexion;


public class ParadasBBDD {
		
		
		private  ArrayList<Paradas> listaParadas;


		
		public ParadasBBDD() {
			
			
		}

		
		
		public static ArrayList<Paradas> obtenerParadas(String cod_Linea) throws SQLException{
			
			Connection con= Conexion.conectar();
			
			
			String sql="select Nombre from Parada INNER JOIN linea_parada ON parada.Cod_Parada = linea_parada.Cod_Parada where linea_parada.cod_linea='"+cod_Linea+"';";
			
			PreparedStatement ps=con.prepareStatement(sql);
			
			ResultSet rs=ps.executeQuery();
			

			ArrayList<Paradas> paradas= new ArrayList<Paradas>();
			
			try {
				
				ps=con.prepareStatement(sql);
			
				while (rs.next()) {
					
					Paradas parada = new Paradas();
					
					parada.setNombre_parada(rs.getString("Nombre"));
					
					paradas.add(parada);
				
				}

				ps.close();
				rs.close();
				con.close();
				
				
			} catch (Exception e) {
				
				System.out.println("Error: Clase Contacto, método obtener paradas");
				
			}
			
			return paradas ;
			
		}



		public ArrayList<Paradas> getListaLineas() {
			return listaParadas;
		}



		public void setListaLineas(ArrayList<Paradas> listaParadas) {
			this.listaParadas = listaParadas;
		}
		

	}

