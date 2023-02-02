package com.example.springboot.exception;

public class CustomerException extends Exception{
	private static final long serialVersionID=1L;
	String errormsg;
	
	public CustomerException (String errorMsg)
	{
		super();
		this.errormsg=errorMsg;
	}
	

}
