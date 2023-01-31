package com.tutbean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("Studentbean.xml");
		Student s=(Student)context.getBean("studentBean");
		s.studentDetails();
	}

}
