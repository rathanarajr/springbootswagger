package com.dxc.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Customer {

	private long id;
	private String name;
	private String designation;
	private String salary;
	
	
	public Customer() {
		
	}
		

	public Customer(long id, String name, String company) {
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}



	public long getEmpId() {
		return id;
	}

	public void setEmpId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getSalary() {
		return salary;
	}

	public void setSalary(String company) {
		this.salary = salary;
	}
	
	
}
