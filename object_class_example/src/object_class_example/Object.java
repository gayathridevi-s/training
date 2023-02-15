package object_class_example;

public class Object {
public static void main(String[] args) {
	Object object1=new Object();
	Object object2=new Object();
	
	//object1.clone();
	System.out.println(object1.toString());
	System.out.println(object1.hashCode());
	System.out.println(object1.getClass());
	System.out.println(object1.equals(object1));
}
}
