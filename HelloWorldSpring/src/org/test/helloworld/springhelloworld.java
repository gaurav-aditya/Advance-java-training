package org.test.helloworld;

public class springhelloworld {
String name;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
	
}
public void printHello() {
	System.out.println("Hello"+name);
}
}
