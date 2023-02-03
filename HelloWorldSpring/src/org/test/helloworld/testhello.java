package org.test.helloworld;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class testhello {

	
		public static void main(String[] args){
			// TODO Auto-generated method stub
			ApplicationContext con=new ClassPathXmlApplicationContext ("helloworld.xml");
			springhelloworld spbean=(springhelloworld)con.getBean("springhellobean");
			Tech tech=(Tech)con.getBean("tech");
			//System.out.println(spbean.getName());
			spbean.printHello();
			tech.Display();

		}

	}


