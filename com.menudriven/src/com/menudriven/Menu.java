package com.menudriven;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

class Browser {
	String name;
	double version;
	ArrayList<String> history = new ArrayList<>();
}

public class Menu {
	public static void main(String[] args) {
		ArrayList<Browser> browserList = new ArrayList<>();

		String condition;
		do {
			System.out.println("Main Menu");
			System.out.println("1.Add new browser");
			System.out.println("2.Remove a browser");
			System.out.println("3.Show all browser");
			System.out.println("4.Browser history");
			System.out.println("5.Exit");
			System.out.println("choose a case");
			Scanner input = new Scanner(System.in);
			int caseNum = input.nextInt();

			switch (caseNum) {
			case 1:
				Browser B = new Browser();
				System.out.println("enter a new browser:");
				B.name = input.next();
				// System.out.println(list);
				System.out.println("enter version");
				B.version = input.nextFloat();
				System.out.println("how many histories do you want to add?");
				int historyNumber = input.nextInt();
				// String[] url = new String[historyNumber];
				for (int i = 0; i < historyNumber; i++) {
					System.out.println("Enter url " + (i + 1));
					B.history.add(input.next());
				}
				browserList.add(B);
				System.out.println("Name: " + B.name);
				System.out.println("Version: " + B.version);
				System.out.println("History: ");
				for (String str : B.history)
					System.out.println(str);
				// System.out.println("do you wish to continue?");
				// boolean condition=input.nextBoolean();

				break;
			case 2:
				System.out.println("Which browser you need to remove?");
				String removeBrowser = input.next();
				for (Browser B1 : browserList) {
					if (Objects.equals(B1.name, removeBrowser)) {
						browserList.remove(B1);
					}
				}

				break;

			case 3:
				for (Browser B1 : browserList) {
					System.out.println(B1.name);

				}
				break;
			case 4:
				System.out.println("select a browser");
				String selectBrowser = input.next();
				for (Browser B1 : browserList) {
					if (Objects.equals(B1.name, selectBrowser)) {
						for (String str : B1.history)
							System.out.println(str);
					}
				}

				break;

			}
			System.out.println("do you wish to continue? (Y/N) ");
		//	String condition;
			condition=input.next();

		} while (condition.equals("Y"));
	}

}
