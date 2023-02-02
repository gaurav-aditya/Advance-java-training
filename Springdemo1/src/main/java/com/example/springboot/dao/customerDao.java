package com.example.springboot.dao;
import java.util.List;
import java.util.*;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import com.example.springboot.model.customer;

public abstract class customerDao implements customerdaoimpl
{
	private Map<Integer ,customer> customers=new HashMap<Integer,customer>();
	public customerDao()
	{
		
		customers.put(101,new customer(100,"amit","amit@gmail.com",123445));
		customers.put(102,new customer(101,"ankit","ankit@gmail.com",123446));
	}
	@Override
	public List<customer> getAllcustomerDetails()
	{
		return new ArrayList<customer>(customers.values());
	}
	@Override
	public customer getcustomer (int customerID) {
		return customers.get(customerID);
	}
	@Override
	public void addCustomer(customer customer)
	{
		customers.put(customer.getCustomerId(), customer);
		
	}
	@Override
	public void updateEmail(int customerId,String customerEmail)
	{
		customers.get(customerId).setCustomerEmail(customerEmail);
	}
	@Override
	public void updatePhone(int customerId,int customerPhone)
	{
		customers.get(customerId).setCustomerPhone(customerPhone);
	}
	@Override
	public void removeCustomer(int customerId)
	{
		customers.remove(customerId);
	}
	
																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																											
}
