package Mainapp;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDAO {
	public void addUser(RegisterPojo registerpojo) throws ClassNotFoundException, SQLException {
		String fname = registerpojo.getFname();
		String lname = registerpojo.getLname();
		String uname = registerpojo.getUname();
		String pwd = registerpojo.getPwd();
		String email = registerpojo.getEmail();
		ConnectionManager cm = new ConnectionManager();
		String sql = "insert into USERDETAILS(FNAME,LNAME,UNAME,PWD,EMAIL)VALUES(?,?,?,?,?)";
		PreparedStatement st = cm.getConnection().prepareStatement(sql);
		st.setString(1,fname);
		st.setString(2,lname);
		st.setString(3,uname);
		st.setString(4,pwd);
		st.setString(5,email);
		st.executeUpdate();
		cm.getConnection().close();
	}
}
