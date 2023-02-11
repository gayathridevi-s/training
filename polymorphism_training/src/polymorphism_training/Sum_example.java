package polymorphism_training;

public class Sum_example {

	public static void main(String[] args) {
		Addition num=new Addition();
		num.sum(2,3);									//method overloading
		num.sum(5,6,7);
		Add digit =new Add();
		digit.multiply();
		digit.display();
//super.multiply();								//cannot use super in static context
	}

}
class Addition{
	  void sum(int a,int b) {
		System.out.println(a+b);
	}
	 void sum(int a,int b,int c) {
		System.out.println(a+b+c);
	}
	 void multiply() {
		 System.out.println("multiplication method");
	 }
}
class Add extends Addition{
	void multiply() {
		System.out.println("subclass multiplication");			//method overriding
	}
	void display() {
		super.multiply();						//using super keyword to access base class
		
	}
}
