package com.example.springboot.service;
import java.util.List;
import com.example.springboot.model.*;
public abstract class customerservice {
	public abstract List<customer> getAllCustomerDetails() throws Exception;
	public abstract customer getcustomer(Integer customerId) throws Exception;
	public abstract void addCustomer(customer c) throws Exception;
	public abstract void updateEmail (int customerId,String customerEmail) throws Exception;
	public abstract void updatePhone(int customerId,int customerPhone) throws Exception;
	public abstract void removeCustomer(int customerId) throws Exception;
	

}
