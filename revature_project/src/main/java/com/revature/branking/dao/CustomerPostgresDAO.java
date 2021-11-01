package com.revature.branking.dao;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import revature_project.banking.models.Customer;
import revature_project.banking.utilities.ConnectionUtility;

public class CustomerPostgresDAO implements CustomerDAO {

	@Override
	public boolean inserIntoCustomers(Customer cust) {
		PreparedStatement ps = null;
		try (Connection conn = ConnectionUtility.getConnection();) {
			String query = "INSERT INTO bankingapp.customerinfo VALUES(NULL,?,?,?,?)";

			ps = conn.prepareStatement(query);

			ps.setString(1, cust.getCustomer_name());
			ps.setInt(2, cust.getCustomer_age());
			ps.setInt(3, cust.getCusotmer_card());
			ps.setString(4, cust.getCustomer_password());

			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			System.out.println("Problem here!");
			// mainapp.restart();
			return false;
		}
		return true;
	}

	@Override
	public Customer selectCustomerById(Integer id) {
		PreparedStatement ps=null;
		ResultSet rs=null;
		Customer cust=null;
		try(Connection conn=ConnectionUtility.getConnection();){
			String query="select * from bankingapp.customerinfo WHERE customer_id=?" ;
			ps=conn.prepareStatement(query);
			ps.setInt(1, id);
			rs=ps.executeQuery();
			
			while(rs.next())
			{
				cust=new Customer();
				cust.setCustomer_id(rs.getInt(1));
				cust.setCustomer_name(rs.getString(2));
				cust.setCustomer_age(rs.getInt(3));
				cust.setCusotmer_card(rs.getInt(4));
				cust.setCustomer_password(rs.getString(5));
			}
		}catch(SQLException e) {
			e.printStackTrace();
		}	
		return cust;
	}

	@Override
	public List<Customer> selectAllCustomers() {
		java.sql.Statement stmt = null;
		ResultSet rs = null;
		List<Customer> cList = null;
		try (Connection conn = ConnectionUtility.getConnection();) {
			String query = "SELECT * from bankingapp.customerinfo";
			stmt = conn.createStatement();
			rs = stmt.executeQuery(query);
			cList = new ArrayList<Customer>();

			while (rs.next()) {
				Customer cust=new Customer();
				cust.setCustomer_id(rs.getInt(1));
				cust.setCustomer_name(rs.getString(2));
				cust.setCustomer_age(rs.getInt(3));
				cust.setCusotmer_card(rs.getInt(4));
				cust.setCustomer_password(rs.getString(5));

				cList.add(cust);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}

		return cList;
	}

	@Override
	public boolean updateCustomer(Customer cust) {
		PreparedStatement ps = null;

		try (Connection conn = ConnectionUtility.getConnection()) {
			String query = "UPDATE bankingapp.customerinfo SET "
					+ "customer_name=?, customer_age=?,customer_card=? "
					+ "customer_password=? WHERE customer_id=?";
			ps = conn.prepareStatement(query);

			ps.setString(2, cust.getCustomer_name());
			ps.setInt(3, cust.getCustomer_age());
			ps.setInt(4, cust.getCusotmer_card());
			ps.setString(5, cust.getCustomer_password());

			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}

	@Override
	public boolean deleteCustomerById(Integer id) {
		PreparedStatement ps = null;
		try (Connection conn = ConnectionUtility.getConnection()) {
			String query = "DELETE FROM bankingapp.customerinfo WHERE customer_id=?";
			ps = conn.prepareStatement(query);
			ps.setInt(1, id);
			ps.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}

}
