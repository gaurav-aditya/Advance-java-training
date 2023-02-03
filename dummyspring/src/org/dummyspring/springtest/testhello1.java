package org.test.helloworld;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testhello1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext ("helloworld.xml");
		Springhelloworld spbean=(Springhelloworld)con.getBean ("springhellobean");
		spbean.getName();
	}

}
