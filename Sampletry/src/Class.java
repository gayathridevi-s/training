class Sample{
	int a=10;												//global variable
	int b=30;
	Sample(int a,int b){									//local variable
		a=this.a;
		b=this.b;
		System.out.println(a+b);
	}
}
public class Class {
public static void main(String[] args) {
	new Sample(45,67);
}
}
