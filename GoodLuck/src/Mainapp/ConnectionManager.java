package Mainapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	public Connection getConnection() throws SQLException, ClassNotFoundException {
	Class.forName("oracle.jdbc.OracleDriver");
	Connection con = null;
	con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","SYSTEM","15092002");
	if(con!=null)
		System.out.print("established");
	
	return con;
	}	
}
