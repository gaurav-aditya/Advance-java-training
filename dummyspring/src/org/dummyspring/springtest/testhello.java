package org.dummyspring.springtest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class testhello {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext ("mybean.xml");
		Springhelloworld spbean=(Springhelloworld)con.getBean ("mybean");
		spbean.getName();

	}

}
