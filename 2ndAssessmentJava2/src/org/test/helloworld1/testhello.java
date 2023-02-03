package org.test.helloworld1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class testhello {
	public static void main(String args[]){
	ApplicationContext con=new ClassPathXmlApplicationContext ("hello.xml");
	SpringWorld spbean=(SpringWorld)con.getBean("springhellobean");
	spbean.Display();
	}
}
