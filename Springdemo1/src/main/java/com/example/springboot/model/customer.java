package com.example.springboot.model;

public class customer {
	private int customerId;
	private String customerName;
	private String CustomerEmail;
	private int customerPhone;
	
	public customer(int customerId, String customerName, String customerEmail, int customerPhone) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
		this.CustomerEmail = customerEmail;
		this.customerPhone = customerPhone;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public String getCustomerEmail() {
		return CustomerEmail;
	}
	public void setCustomerEmail(String customerEmail) {
		CustomerEmail = customerEmail;
	}
	public int getCustomerPhone() {
		return customerPhone;
	}
	public void setCustomerPhone(int customerPhone) {
		this.customerPhone = customerPhone;
	}
		
}
