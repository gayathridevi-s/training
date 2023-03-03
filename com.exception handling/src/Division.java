import java.util.InputMismatchException;
import java.util.Scanner;
 class myException extends Exception{
	myException(String str){
		super(str);   //to print message in custom exception,exception class has a constructor that prints message
	}
}
public class Division {
	public static void main(String[] args) {
		int i = 0;
		int j = 0;
		try {
			j = 18 / i;
			System.out.println("the value of j is " + j);
//			if (j==0) {
//				throw new myException("i dont want to print zero");
//			}
		} catch (Exception e) {
			//j=18/1;
			j=18/1;
			System.out.println("prints default value "+e);
		}
			
		
		;
		int[] numArray = { 1, 2, 5, 8 };
		try {
			numArray[5] = 9;
			System.out.println(numArray[5]);
		} catch (Exception e) {
			System.out.println(e);
			System.out.println("continue");
		}

		System.out.println("remaining");
		System.out.println("whats your fav number?");
		Scanner s = new Scanner(System.in);
		// int number=0;
		while (true) {
			try {
				int number = s.nextInt();
				System.out.println("your fav number is " + Integer.toString(number));
				break;

			} catch (Exception e) {
				System.out.println("Sorry,enter a number");
				s.nextLine(); // to consume leftover invalid input
			}

		}
		try {
			int[] array =new int[2];
			System.out.println("lets give array elements");
			for (int a = 0; a < array.length; a++) {
				while (true) {
					try {
						array[a] = s.nextInt();
						break;
					} catch (InputMismatchException e) {
						System.out.println("enter a number!");
						s.nextLine();
					}

				}
			}
			System.out.println(array[2]);
		} catch (NullPointerException e) {
			System.out.println("sorry, the array is null!");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("next element cant be printed !");
		}catch(Exception e) {
			System.out.println("something else went wrong!");
		}

	}

}
