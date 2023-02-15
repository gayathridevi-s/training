package classtype;

public class Classtype {

	public static void main(String[] args) {
		Superclass obj1=new Superclass();
		Superclass obj2=new Subclass();
		Subclass obj3=new Subclass();
		obj1.print();
		obj2.print();					//static binding
		obj3.print();
		obj1.display();						
		obj2.display();					//dynamic binding
		obj3.display();
		obj3.supercall();						//using super keyword

	}

}
