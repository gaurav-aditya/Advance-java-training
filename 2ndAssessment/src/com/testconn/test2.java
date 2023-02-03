package com.testconn;


public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context=new ClassPathXmlApplicationContext("mybean.xml");
		Student stu=(Student)context.getBean("student");
		System.out.println(stu);

	}

}
