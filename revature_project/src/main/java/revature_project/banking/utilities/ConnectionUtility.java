package revature_project.banking.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionUtility {
	public static Connection getConnection() throws SQLException {
		String url="jdbc:postgresql://localhost:5432/postgres";
		String user="customers";
		String pass="password";
		return DriverManager.getConnection(url,user,pass);
	}

}
