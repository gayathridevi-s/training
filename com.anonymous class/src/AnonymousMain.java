
public class AnonymousMain {
public static void main(String[] args) {
	MyInterface object=new MyInterface() {    //implementing interfaces using anonymous inner class without creating new class
		public void printSomething() {
			System.out.println("print hello!");   //defining method inside
		}
	};
	MyClass girlName=new MyClass() {
		public void print() {
			System.out.println("i am gayathri");   //overriding methods of existing class MyClass using anonymous inner class
		}
	};
	object.printSomething();
	girlName.print();
}
}
class MyClass{
	public void print() {
		System.out.println("i am reshma");
	}
}