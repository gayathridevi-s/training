package com.downcasting;

public class Child extends Parent {
	void msg() {
		System.out.println("hello child");
	}

	void sleep() {
		System.out.println("child is sleeping");
	}

	public static void main(String[] args) {
		int x = 10;
		double d = x; // typecasting(implicit)
		// float f=d; //explicit
		System.out.println(d);
		Parent p = new Child();
		// Child c=new Parent(); //trying to downcast directly,error

		if (p instanceof Child) { // to check whether p is referencing to child,then only downcast
			p.msg();
			Child c = (Child) p; // downcasting
			c.sleep();
		}
	}

}
