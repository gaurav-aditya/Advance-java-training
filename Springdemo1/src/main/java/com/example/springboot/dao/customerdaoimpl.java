package com.example.springboot.dao;
import com.example.springboot.model.customer;
import java.util.List;
public interface customerdaoimpl {
	public List<customer> getAllcustomerDetails();
	public customer getcustomer(int customerID);
	public void addCustomer(customer c);
	public void updateEmail(int customerId,String customerEmail);
	public void updatePhone(int customerId,int customerPhone);
	public void removeCustomer(int customerId);

}
/*public List<customer> getAllcustomerDetails();
public static customer getcustomer(int customerID) {
	return null;
}
*/