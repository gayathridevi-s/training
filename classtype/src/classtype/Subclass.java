package classtype;

public class Subclass extends Superclass {
	public static void print() {
		System.out.println("this is subclass");					//method hiding
	}
	public void display() {
		System.out.println("dyanamic binding in subclass");				//method overriding
	
	}
	public void supercall() {
		super.display();
	}
}
