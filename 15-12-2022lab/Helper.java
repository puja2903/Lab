package College;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Helper {
	static {
		 try {   //try block
		 	Class.forName("com.mysql.cj.jdbc.Driver");//registering my SQL driver
	 }
		 catch(Exception e) {  //catch block
			 e.printStackTrace();
		 }
		 }
	 public static Connection con()throws SQLException{  //throwing the exception
		 return DriverManager.getConnection("jdbc:mysql://localhost:3306/pujadb","root","root");
		 
	 }
}
