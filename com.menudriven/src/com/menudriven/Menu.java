package com.menudriven;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();

		do {
			System.out.println("Main Menu");
			System.out.println("1.Add new browser");
			System.out.println("2.Remove a browser");
			System.out.println("3.Show all browser");
			System.out.println("4.Browser history");
			System.out.println("5.Exit");
			Scanner input = new Scanner(System.in);
			System.out.println("choose a case");
			int caseNum = input.nextInt();
			switch (caseNum) {
			case 1:
				System.out.println("enter a new browser:");
				Scanner inputBrowser = new Scanner(System.in);
				String newBrowser = inputBrowser.nextLine();
				list.add(newBrowser);
				//System.out.println(list);
				System.out.println("enter version");
				Scanner inputVersion = new Scanner(System.in);
				float version = inputVersion.nextFloat();
				System.out.println("how many histories do you want to add?");
				Scanner inputHistory = new Scanner(System.in);
				int historyNumber = inputHistory.nextInt();
				// String[] url = new String[historyNumber];
				ArrayList<String> addUrl = new ArrayList<>();
				Scanner inputUrl = new Scanner(System.in);
				for (int i = 0; i < historyNumber; i++) {
					System.out.println("Enter url " + (i + 1));
					String url = inputUrl.nextLine();
					addUrl.add(url);

				}
				System.out.println("Name: " + newBrowser);
				System.out.println("Version: " + version);
				System.out.println("History: " + addUrl);
				//System.out.println("do you wish to continue?");
				
				break;
			case 2:
				System.out.println("Which browser you need to remove?");
				Scanner remove=new Scanner(System.in);
				String removeBrowser=remove.nextLine();
				list.remove(removeBrowser);
				break;
				
			case 3:
				System.out.println(list);
				break;
			case 4:
				System.out.println(list);
				System.out.println("select a browser:");
				
				break;
				
				
			}

		} while (true);
	}

}
