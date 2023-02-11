package heyhello;

public class Hey {
static int a;
public static void main(String[] args) {
	//int a=12;
 System.out.println(a);
 hello();
 Hey hari=new Hey();
 hari.speak();
 First f=new First();
 f.Displayfirst();
}
 static void hello() {
	System.out.println("hello guys");
  }
 void speak() {
	 System.out.println("let me speak");
	 
 }
 Hey(){
	 System.out.println("tell me hi");
 }
}
class First{
	void Displayfirst() {
		Final word=new Final();
		word.Displayfinal();
	}
}
	class Final{
		void Displayfinal(){
			System.out.println("we reached final");
	}
}