package modelo;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import conexion.Conectar;

public class Contacto {
	
	//*** Atributos ***
	
	private int idContacto;
	private String nombre;
	private String telefono;
	private String email;

	
	//*** Constructores ***
	
	public Contacto(){
		
	}
	
	public Contacto(String pNombre, String pTelefono, String pEmail){
		this.nombre = pNombre;
		this.telefono = pTelefono;
		this.email = pEmail;
	}
	
	
	
	
	//*** Métodos get-set ***
	
	public int getIdContacto() {
		return idContacto;
	}

	public void setIdContacto(int idContacto) {
		this.idContacto = idContacto;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getTelefono() {
		return telefono;
	}
	
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
	
	//*** Métodos CRUD ***
	
	public boolean mInsetarContacto() {
		boolean registrar = false;
		
		Connection con=null;
		

		String sql = "{ CALL spInsertarContacto(?,?,?) }";
		
		try {
			con=Conectar.conectar();
			
		    CallableStatement cs = con.prepareCall(sql);
		    
		    cs.setString(1, this.nombre);
		    cs.setString(2, this.telefono);
		    cs.setString(3, this.email);
		    
		    cs.execute();
			
		
		    registrar=true;
		

		} catch (SQLException e) {
			System.out.println("Error: Clase Contacto, método insertar");
			e.printStackTrace();
		}
		return registrar;
	}
	
	public boolean mActualizarContacto() {
		Connection connect= null;
		
		boolean actualizar=false;
				
		
		String sql = "{ CALL spActualizarContacto(?,?,?,?) }";
		
		try {
			connect=Conectar.conectar();
			
			
		    CallableStatement cs = connect.prepareCall(sql);
		    cs.setInt(1, this.idContacto);
		    cs.setString(2, this.nombre);
		    cs.setString(3, this.telefono);
		    cs.setString(4, this.email);
		    cs.execute();
			
		
		    actualizar=true;
		
		
		} catch (SQLException e) {
			System.out.println("Error: Clase Contacto, método actualizar");
			e.printStackTrace();
		}		
		return actualizar;
	}
	
	
	
	public boolean mEliminarContacto() {
		Connection connect= null;
		
		boolean eliminar=false;
				
		String sql = "{ CALL spEliminarContacto(?) }";
		
		try {
			connect=Conectar.conectar();
			
			
		    CallableStatement cs = connect.prepareCall(sql);
		    cs.setInt(1, this.idContacto);
		    cs.execute();
			
		
			eliminar=true;
		} catch (SQLException e) {
			System.out.println("Error: Clase Contacto, método eliminar");
			e.printStackTrace();
		}		
		return eliminar;
	}

	public Contacto mObtenerContacto(int idContacto) {
		Connection co =null;
		
		
		String sql = "{ CALL spObtenerContacto(?) }";
		
		try {
			co=Conectar.conectar();
			
			
		    CallableStatement cs = co.prepareCall(sql);
		    cs.setInt(1, idContacto);
		    cs.execute();
			
		
	
		
		} catch (SQLException e) {
			System.out.println("Error: Clase Contacto, método obtener");
			e.printStackTrace();
		}
		
		return this;
	}
		
	public ArrayList<Contacto> mObtenerContactos() {
		Connection co =null;
		Statement stm= null;
		ResultSet rs=null;
		
		String sql="CALL spObtenerContactos()";
		
		ArrayList<Contacto> listaContactos= new ArrayList<Contacto>();
		
		try {			
			co= Conectar.conectar();
			stm=co.createStatement();
			rs=stm.executeQuery(sql);
			while (rs.next()) {
				Contacto c=new Contacto();
				c.setIdContacto(rs.getInt(1));
				c.setNombre(rs.getString(2));
				c.setTelefono(rs.getString(3));
				c.setEmail(rs.getString(4));
				listaContactos.add(c);
			}
			stm.close();
			rs.close();
			co.close();
		} catch (SQLException e) {
			System.out.println("Error: Clase Contacto, método mObtenerContactos");
			e.printStackTrace();
		}
		
		return listaContactos;
	}
	
	
	
	
	//*** Otros métodos ***
	
	

}
