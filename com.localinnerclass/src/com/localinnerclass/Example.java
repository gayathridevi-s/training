package com.localinnerclass;

 class Example {
	int y=10;
	public  void print() {
		
		class Names{
			public void printName() {
				System.out.println("Anandhu");
				System.out.println("age is"+y);				// local innerclass
			}
		}
		Names name1=new Names();
		name1.printName();
	}
public static void main(String[] args) {
	
	Example example1=new Example();
	example1.print();
		
	}
 }
	


