/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basalm;

import java.sql.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author witzkito
 */
public class ConeccionBasFab {
   
  
	private Connection conn;
	private Statement stmt;
	private ResultSet rst;
	
	public ConeccionBasFab(String direccion){
		try{
                        String db = "jdbc:ucanaccess://" + direccion;
			conn = DriverManager.getConnection(db, "", ""); 
			
			
		}catch(SQLException ex){
                        System.out.println("Primera intencion de Coneccion de Base de Datos fallado: " + ex);
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
