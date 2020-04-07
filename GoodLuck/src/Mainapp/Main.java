package Mainapp;
import java.io.*;
public class Main {

	public static void main(String[] args) throws Exception {
		System.out.println("1.Register here : ");
		System.out.println("2.Login");
		int x;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		x = Integer.parseInt(br.readLine());
		RegisterPojo registerpojo = new RegisterPojo();
		RegisterDAO registerdao = new RegisterDAO();
		LoginDAO logindao = new LoginDAO();
		LoginPojo loginpojo = new LoginPojo();
		switch(x) {
		case 1:
			System.out.println("Enter your First Name : ");
			String fname = br.readLine();
			System.out.println("Enter your Last Name : ");
			String lname = br.readLine();
			System.out.println("Enter your User Name : ");
			String uname = br.readLine();
			System.out.println("Enter your Password : ");
			String pwd = br.readLine();
			System.out.println("Enter your Email : ");
			String email = br.readLine();
			registerpojo.setFname(fname);
			registerpojo.setLname(lname);
			registerpojo.setUname(uname);
			registerpojo.setPwd(pwd);
			registerpojo.setEmail(email);
			registerdao.addUser(registerpojo);
			break;
		case 2:
			System.out.println("Enter your User Name : ");
			String name = br.readLine();
			System.out.println("Enter your Password : ");
			String passwd = br.readLine();
			loginpojo.setUname(name);
			loginpojo.setPwd(passwd);
			if(logindao.validate(loginpojo)==true) {
				Luck luck = new Luck();
				luck.display();
			}
			else
				System.out.println("Incorrect Username Password");
			break;
		default:
			break;
		}
	}	
}

	

