package com.testcon;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("bean.xml");
		Student stu=(Student)context.getBean("student");
		System.out.println(stu);
		//((AbstractApplicationContext) context).close();

	}

}
