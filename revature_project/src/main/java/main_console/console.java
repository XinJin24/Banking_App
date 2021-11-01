package main_console;

import java.util.List;
import java.util.Scanner;

import com.revature.branking.dao.CustomerDAO;
import com.revature.branking.dao.CustomerPostgresDAO;

import revature_project.banking.models.Customer;

public class console {

	public static void main(String[] args) {
		CustomerDAO cust=new CustomerPostgresDAO();
		Customer c=cust.selectCustomerById(3123001);
		List<Customer>clist=cust.selectAllCustomers();
		
		System.out.println("*****************Welcome to E-Banking system******************");
		System.out.println("                 Select a option to continue:");
		System.out.println("                     1. Apply for new card");
		System.out.println("                     2. Customer Login");
		System.out.println("                     3. employee Login");
		System.out.println("**************************************************************");
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext())
		{
			int option;
			option=scan.nextInt();
			switch(option)
			{
			case 1:
				break;
			case 2:
				System.out.println(c);
				break;
			case 3:
				for(Customer cu:clist)
				{
					System.out.println(cu);
				}
				break;
			default:
				System.out.println("invalid input, try again!");
			}
		}
		
	}

}
