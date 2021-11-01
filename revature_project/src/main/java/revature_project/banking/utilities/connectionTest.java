package revature_project.banking.utilities;

import java.sql.SQLException;
import java.io.IOException;
import java.sql.Connection;;

public class connectionTest {
	public static void main(String[] args) {
//		try (Connection conn=ConnectionUtility.getConnection();){
//			System.out.println("Connection was established!");
//		} catch (SQLException e) {
//			System.out.println("an error occurred!");
//			e.printStackTrace();
//		} 
		
//		try (Connection conn=ConnectionUtility.getConnection_props();){
//			System.out.println("[Properties file] Connection was established!");
//		} catch (SQLException e) {
//			System.out.println("an SQL error occurred!");
//			e.printStackTrace();
//		} catch (IOException e1) {
//			System.out.println("an IO error occurred!");
//			e1.printStackTrace();
//		} 
		
		try (Connection conn=ConnectionUtility.getConnection_env();){
			System.out.println("[Env variables] Connection was established!");
		} catch (SQLException e) {
			System.out.println("an SQL error occurred!");
			e.printStackTrace();
		} catch (IOException e1) {
			e1.printStackTrace();
		} 
		
	}
}
