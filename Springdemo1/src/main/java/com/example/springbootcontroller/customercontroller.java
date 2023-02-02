package com.example.springbootcontroller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.springboot.model.customer;
import com.example.springboot.service.customerservice;
@RestController
@RequestMapping("/example")
public class customercontroller {
	@Autowired
	private customerservice custservice;
	private HttpStatusCode HttpStatus;
	@GetMapping(value="/customer")
	public ResponseEntity<List<customer>> getallcustomerDetails() throws Exception
	{
		List<customer> clist=custservice.getAllCustomerDetails();
		ResponseEntity<List<customer>> response=new ResponseEntity<List<customer>>(clist,HttpStatus);
		return response;
	}
	@GetMapping(value="/customer/{customerID}")
	public ResponseEntity <customer> getcustomerDetails (@PathVariable Integer customerID) throws Exception
	{
		customer cdetails=custservice.getcustomer(customerID);
		ResponseEntity<customer> response =new ResponseEntity<customer>(cdetails,HttpStatus);
		return response;
	}
	@PostMapping(value="/customer/{customerID}")
	public ResponseEntity <String> addCustomer (@RequestBody customer c) throws Exception
	{
		custservice.addCustomer(c);
		String msg="customer Added Successfully";
		ResponseEntity<String> response=new ResponseEntity<String>(msg,HttpStatus);
		return response;
	}
}
