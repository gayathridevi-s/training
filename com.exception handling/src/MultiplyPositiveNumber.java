
 class MultiplyCost  {
public void costMultiply(int a,int b) throws ArithmeticException {
	if (b<=0||a<=0||(a<=0&&b<=0)){
		throw new ArithmeticException ();
		
	}
	else {
		int product=a*b;
		System.out.println(product);
	}
}
}
public class MultiplyPositiveNumber{
public static void main(String[] args) {
	MultiplyCost obj=new MultiplyCost();
	try {
		System.out.println("lets multiply two prices,input 2 numbers as price");
	obj.costMultiply(-3,-4);
	}catch(ArithmeticException e) {
		System.out.println("exception is "+e);
		System.out.println("cost cant be negative");
	}
}
}
