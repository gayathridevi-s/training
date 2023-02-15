package classtype;

public class Subclass extends Superclass {
	public static void print() {
		System.out.println("this is subclass");
	}
	public void display() {
		System.out.println("dyanamic binding in subclass");
	
	}
	public void supercall() {
		super.display();
	}
}
