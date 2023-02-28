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

	StringBuilder toggle() {
		String[] words = input.split(" ");

		StringBuilder toggleString = new StringBuilder();
		for (String word : words) {
			String first = word.substring(0, 1);
			String remainingWord = word.substring(1);

			toggleString.append(first.toLowerCase()).append(remainingWord.toUpperCase()).append(" ");
		}
		return toggleString;
	}

	String removeAllChar(char x) {

		return input.replace(String.valueOf(x), ""); // java does not allow empty characters,
	} // "" is empty string.String.valueOf(x) converts character to string

	String removeSingleChar(int location) {
		return input.substring(0, location) + input.substring(location + 1);

	}
}

public class Capitalize {
	public static void main(String[] args) {
		Capital line = new Capital("i am gayathri");
		System.out.println(line.capitalizeString());
		System.out.println(line.toggle());
		System.out.println(line.removeAllChar('a'));
		System.out.println(line.removeSingleChar(7));
	}

}
