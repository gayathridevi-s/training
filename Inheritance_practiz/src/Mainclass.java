
public class Mainclass {

	public static void main(String[] args) {
		B b=new B();							//constructor A is also worked
		b.displayA();
		b.displayB();

	
	}
}
class A{
	int a;
	void displayA() {
		
		System.out.println("displayed A");
	}
	A(){
		System.out.println("this is the constructor of A");
	}
	//B boy =new B();
	//boy.displayA();
}
class B extends A{
	B(){
		System.out.println("this is the constructor of B");
	}
	//A obj=new A();
	//obj.displayA();
	void displayB() {
		System.out.println("displayed B");
	}
}
