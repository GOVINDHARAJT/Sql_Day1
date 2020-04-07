package Mainapp;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class LoginDAO {

	public boolean validate(LoginPojo loginpojo) throws ClassNotFoundException, SQLException {
		String uname = loginpojo.getUname();
		String pwd = loginpojo.getPwd();
		ConnectionManager con = new ConnectionManager();
		Statement st = con.getConnection().createStatement();
		ResultSet rs = st.executeQuery("SELECT * FROM USERDETAILS");
		while(rs.next()) {
			if(uname.equals(rs.getString("UNAME")) && pwd.equals(rs.getString("PWD"))) {
				con.getConnection().close();
				return true;
			}
			else {
				con.getConnection().close();
			    return false;
			}
		}
		return true;
	}

}
