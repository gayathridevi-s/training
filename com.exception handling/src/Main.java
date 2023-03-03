class NegativeNumberException extends Exception {
	NegativeNumberException() {
		super();
	}
}

public class Main {
	public void SquareRoot(int n) throws NegativeNumberException {
		if (n < 0) {
			throw new NegativeNumberException();
		}
		else {
			double x=Math.sqrt(n);
			System.out.println(x);
		}
	}

public static void main(String[] args) {
	Main obj=new Main();
	try {
	obj.SquareRoot(-10);
	}catch(NegativeNumberException e) {
		System.out.println(" root of negative number cannot be formed");
	}
}
}
