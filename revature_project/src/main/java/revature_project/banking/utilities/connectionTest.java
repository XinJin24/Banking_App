package revature_project.banking.utilities;

import java.sql.SQLException;

public class connectionTest {
	public static void main(String[] args) {
		try {
			ConnectionUtility.getConnection();
			System.out.println("Connection was established!");
		} catch (SQLException e) {
			System.out.println("an error occurred!");
			e.printStackTrace();
		}
	}
}
