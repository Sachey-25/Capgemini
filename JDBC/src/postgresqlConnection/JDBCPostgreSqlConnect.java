package postgresqlConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCPostgreSqlConnect {
	//jdbc url,jdbc username,jdbc password.
	private final String url = "jdbc:postgresql://localhost/Practice";
	private final String user = "postgres";
	private final String password = "root";
	
	//Connection done - I will create a method to communicate.
	private void connect() {
		// whenever we deal with the server we always go for exception handling
		//Server may active, busy , not responsive...
		try (Connection	connection = DriverManager.getConnection(url, user, password);){
			if(connection != null) {
				System.out.println("Conected to PostgreSql Server SUccessfully..!");
			}else {
				System.out.println("Conection failed.!");
			}			
			//I would like check whether connection established or not from the postGreSide...
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("Insert into demon values ('JasBantha','23','Orissa');");
			if(resultSet.next()) {
				System.out.println(resultSet.getString(1) + " " + resultSet.getInt(2)); //Sachin 28
			}
			if(resultSet.next()) {
				System.out.println(resultSet.getString(1) + " " + resultSet.getInt(2));
			}
			if(resultSet.next()) {
				System.out.println(resultSet.getString(1) + " " + resultSet.getInt(2));
			}
			//System.out.println(resultSet);
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		JDBCPostgreSqlConnect sqlConnect = new JDBCPostgreSqlConnect();
		sqlConnect.connect();
	}
}
