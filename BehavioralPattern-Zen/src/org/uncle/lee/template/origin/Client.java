package org.uncle.lee.template.origin;

public class Client {
	public static void main(String[] args) {
		ConcreteClass1 concreteClass1 = new ConcreteClass1();
		concreteClass1.templateMethod();
		
		ConcreteClass2 concreteClass2 = new ConcreteClass2();
		concreteClass2.templateMethod();
	}
}
