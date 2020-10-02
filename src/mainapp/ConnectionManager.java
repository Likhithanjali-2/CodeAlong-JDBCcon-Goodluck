package mainapp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionManager {
	public Connection getConnection() throws SQLException ,ClassNotFoundException {
		//register driver class 
		Class.forName("oracle.jdbc.OracleDriver");
		
		//create obj for establish connection
		Connection con = null;
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl","system","root");
		if(con !=null)
			System.out.println("Established !!");
		return con;
		
	}
}
