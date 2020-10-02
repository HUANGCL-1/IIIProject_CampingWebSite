package login.sumit.registration;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyCp implements Myp {
	
	static Connection con=null;
	
	public static Connection getCon() {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
			con=DriverManager.getConnection(connUrl,username,password);
		} catch (Exception e) {
			System.out.println(e);
		}
		
		return con;
	}

}