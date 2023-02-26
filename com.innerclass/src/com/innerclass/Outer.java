package com.innerclass;

import java.security.DomainCombiner;


public class Outer {
	private int secretNumber=50;
	private int x = 5;
	public int display() {
		final class InnerClass{  //local inner class inside a method,no access modifiers are possible ,only final and abstract possible
			int anotherNum=10;   //local variable
			public int  printData() {
				return secretNumber+anotherNum;   //accessing pvt variable 
			}
		}
		InnerClass object=new InnerClass();
		return object.printData();
		
	}
	class Inner { // member inner class
		private final void name() {   //even private final methods can be accessed
			System.out.println("my name is gayathri");

		}

		int getX() {
			return x; // i can access private variable of outer class inside inner class
		}
	}
public static void main(String[] args) {
	Outer myObject=new Outer();
	int value=myObject.display();
	
	System.out.println("my secret number:"+Integer.toString(value));
	Outer obj1=new Outer();   //creating outer class object
	Outer.Inner obj2=obj1.new Inner();  //creating innerclass object,member inner class
	obj2.name();
	
	System.out.println(obj2.getX());
	Person man=new Person() {
		public void myName(){   //defining abstract methods inside anonymous inner class
			System.out.println("i am a man");
	}
	
	};   //anonymous inner class
	man.myName();
	
}
}

abstract class Person{
	abstract void myName();
}

