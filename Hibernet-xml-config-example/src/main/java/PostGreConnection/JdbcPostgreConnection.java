package PostGreConnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class JdbcPostgreConnection {

	public static void main(String[] args) {
		
		//Establish the connection
		Connection connection = null;
		try {
			Class.forName("org.postgresql.Driver");
			connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/Practice","postgres","root1234");
			
			if(connection != null) {
				System.out.println("Connection is Ok");
			}else {
				System.out.println("Connection failed..!");
			}
			
		}catch(Exception e) {
			System.out.println("Connection refused"+e);
		}

	}

}
