package com.dxc.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.dxc.database.DatabaseClass;
import com.dxc.model.Customer;

public class CustomerService {
		
	private Map<Long,Customer> customerList = DatabaseClass.getData();

	public CustomerService() {
	}
	
	public List<Customer> getAllCustomers(){
	 return new ArrayList<Customer>(customerList.values());
	}
	
	public Customer getCustomer(long id) {
			return customerList.get(id);
	}
	
	public Customer addCustomer(Customer customer) {
		customer.setEmpId(customerList.size() + 1);
		customerList.put(customer.getEmpId(), customer);
		return customer;
	}
	
	public Customer updateCustomer(Customer customer) {
		if(customer.getEmpId()<=0) {
			return null;
		}
		customerList.put(customer.getEmpId(), customer);
		return customer;
	}
	
	public void removeCustomer(long id) {
		customerList.remove(id);
	}
}
