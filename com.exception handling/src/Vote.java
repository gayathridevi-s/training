class IllegalAgeException extends Exception {
	IllegalAgeException(String message) {
		super(message);
	}
}

public class Vote {
	public static void votingAge(int age) throws IllegalAgeException {
		if (age < 18) {
			throw new IllegalAgeException("not eligible for vote");
		} else {
			System.out.println("eligible to vote");
		}
	}

	public static void main(String[] args) {
		try {
			votingAge(13);
		} catch (Exception e) {
			System.out.println(e);
		}
		try {
			votingAge(19);
		} catch (IllegalAgeException e) {
			System.out.println(e);
		}
	}
}
