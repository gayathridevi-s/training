class Capital {
	String input;

	Capital(String input) {
		this.input = input;
	}

	String capitalizeString() {
		String[] words = input.split(" ");
		String capitalString = "";
		for (String word : words) {
			String firstLtter = word.substring(0, 1);
			String remainingWord = word.substring(1);

			capitalString += firstLtter.toUpperCase() + remainingWord + " ";
		}
		return capitalString;

	}

	String toggle() {
		String[] words = input.split(" ");
		String toggleString = "";
		for (String word : words) {
			String first = word.substring(0, 1);
			String remainingWord = word.substring(1);

			toggleString += first.toLowerCase() + remainingWord.toUpperCase() + " ";
		}
		return toggleString;
	}
}

public class Capitalize {
	public static void main(String[] args) {
		Capital line = new Capital("i am hi");
		System.out.println(line.capitalizeString());
		System.out.println(line.toggle());
	}

}
