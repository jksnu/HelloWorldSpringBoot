package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Customer {
	private int custId;
	private String customerName;
	@Autowired
	private Technologies tech;
	
	public Technologies getTech() {
		return tech;
	}
	public void setTech(Technologies tech) {
		this.tech = tech;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	
	public void displayName() {
		System.out.println("This is customer class object");
		tech.display();
	}
	
}
