package com.revature.branking.dao;
import java.util.List;

import revature_project.banking.models.Customer;
public interface CustomerDAO {
	public boolean inserIntoCustomers(Customer cust);
	public Customer selectCustomerById(Integer id);
	public List<Customer> selectAllCustomers();
	public boolean updateCustomer(Customer cust);
	public boolean deleteCustomerById(Integer id);
}
