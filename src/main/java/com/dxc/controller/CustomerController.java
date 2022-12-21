package com.dxc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.dxc.model.Customer;

import com.dxc.service.CustomerService;

@RestController
public class CustomerController {

	
	private List<Customer> customers = createList();
	
	private CustomerService service = new CustomerService();

	
	
	@RequestMapping(value = "/customers", method = RequestMethod.GET, produces = "application/json")
	public List<Customer> getCustomers(){
		return service.getAllCustomers(); 
	}
	
	@RequestMapping(value = "/{customerId}", method = RequestMethod.GET, produces = "application/json")
	public Customer getCustomer(@PathVariable("customerId")long id) {
		return service.getCustomer(id);
	}
	

	
	@DeleteMapping(path = { "/{customerId}" })
	public void deleteCustomer(@PathVariable("customerId")long id) {
		 service.removeCustomer(id);
	}
	
	@PostMapping
	public Customer addCustomer(@RequestBody Customer customer) {
		return service.addCustomer(customer);
	}

	private static List<Customer> createList() {
		List<Customer> tempCustomers = new ArrayList<>();
		Customer cust1 = new Customer();
		cust1.setName("cust1");
		cust1.setDesignation("manager");
		cust1.setEmpId(1);
		cust1.setSalary("3000");

		Customer cust2 = new Customer();
		cust2.setName("cust2");
		cust2.setDesignation("developer");
		cust2.setEmpId(2);
		cust2.setSalary("3000");
		tempCustomers.add(cust1);
		tempCustomers.add(cust2);
		return tempCustomers;
	}
}