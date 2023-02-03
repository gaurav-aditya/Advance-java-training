package org.test.helloworld1;

public class SpringWorld {
	String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
		
	}
	public void Display() {
		System.out.println("Hello"+name);
	}
}
