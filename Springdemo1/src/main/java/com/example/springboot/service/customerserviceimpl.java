package com.example.springboot.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import com.example.springboot.dao.customerDao;
import com.example.springboot.dao.customerdaoimpl;
import com.example.springboot.model.customer;

@Service

public abstract class customerserviceimpl {
	@Autowired
	private customerdaoimpl cdimp;
	//@Override
	public List<customer>getAllcustomerDetails() throws Exception
	{
		List<customer> clist=cdimp.getAllcustomerDetails();
	if(clist==null)
	{
		throw new Exception("No customer Available");
	}
	return clist;
}
	public customer getcustomer(Integer customerId) throws Exception
	{
		customer cdetails=cdimp.getcustomer(customerId);
	
	if(cdetails==null)
	{
		throw new Exception("No customer Available with this customerid"+customerId);
	}
	return cdetails;
}
	public void addCustomer(customer c)throws Exception
	{
		if(cdimp.getcustomer(c.getCustomerId())!=null)
		{
			throw new Exception("customer already Exist");
		}
	}
	public void updateEmail(int customerId,String customerEmail)throws Exception
	{
		customer cdetails=cdimp.getcustomer(customerId);
		if(cdetails==null) {
			throw new Exception("No customer Available with this customer id"+customerId);
		}
		cdimp.updateEmail(customerId, customerEmail);
	}
}


