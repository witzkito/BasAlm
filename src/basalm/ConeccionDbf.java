/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basalm;

import java.sql.*;
public class ConeccionDbf {
	
	private Connection conn;
	private Statement stmt;
	private ResultSet rst;
		
	public ConeccionDbf(String ubicacion){
		
		try{
                    String db = "jdbc:ucanaccess://pes_peso.dbf";
			conn = DriverManager.getConnection(db, "", "");
			
			
		}catch(SQLException ex){
			System.out.println("Error Coneccion Base de Datos" + " " + ex);
		}try{
			stmt = conn.createStatement();
		}catch(SQLException ex){
			System.out.println("Error Creando el Statment");
		}
	}
	
	public void insert(String sql) throws SQLException{
		stmt.executeUpdate(sql);
	}
	public void delete(String sql) throws SQLException{
		stmt.executeUpdate(sql);
		
		}
	public void update(String sql) throws SQLException{
		stmt.executeUpdate(sql);
		
	}
	public ResultSet select(String sql) throws SQLException{
		rst = stmt.executeQuery(sql);
		
		return rst;
	}
	
	public Connection getConeccion(){
		return this.conn;
	}
}