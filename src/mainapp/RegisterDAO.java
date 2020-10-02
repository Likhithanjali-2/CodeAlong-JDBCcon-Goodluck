package mainapp;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDAO {
	
	public void addUser(RegisterPojo registerpojo) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		String firstname = registerpojo.getFirstname();
		String lastname = registerpojo.getLastname();
		String username = registerpojo.getUsername();
		String password = registerpojo.getPassword();
		String email = registerpojo.getEmail();
		
		ConnectionManager cm = new ConnectionManager();
		//insert all details into db
		String sql = "insert into USERDETAILS(FIRSTNAME,LASTNAME,USERNAME,PASSWORD,EMAIL)VALUES(?,?,?,?,?)";
		//create stmt obj
		PreparedStatement st =cm.getConnection().prepareStatement(sql);
		
		st.setString(1, firstname);
		st.setString(2, lastname);
		st.setString(3, username);
		st.setString(4, password);
		st.setString(5, email);
		
		st.executeUpdate();
		cm.getConnection().close();
	} 

}
