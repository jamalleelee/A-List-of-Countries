package com.CountriesAppProject;

import java.util.Scanner;

public class CountriesApp {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String userMenuSelection = null;
		String userCountryAddInput = null;
		boolean isValidMenuOption = false;
		boolean isValidRestartOption = false;
		boolean restartApp = false;
		String userRestartInput = null;

		do {
			System.out.println("Welcome to the Countries App!");
			System.out.println("What would you like to do?");
			do {
				System.out.println("1. Display a list of countries.\r2. Add a new country.\r3. Exit Countries App.");
				userMenuSelection = keyboard.nextLine();
				isValidMenuOption = Validator.validateInput(userMenuSelection);

			} while (isValidMenuOption);

			switch (userMenuSelection) {

			case "1":
				System.out.println("The Countries added to the list so far:");
				System.out.println(ReadAndWrite.readMe());

				break;

			case "2":
				System.out.println("Please type the country you would like to add:");
				userCountryAddInput = keyboard.nextLine();
				ReadAndWrite.writeMe(userCountryAddInput);

				break;

			case "3":
				System.out.println("Thank you for using my app!");
				System.exit(0);

				break;

			default:
				break;
			}

			do {
				System.out.println("Would you like to continue adding or viewing countries? Y/N");
				userRestartInput = keyboard.nextLine().toUpperCase();
				isValidRestartOption = Validator.validateRestartInput(userRestartInput);
			} while (isValidRestartOption);

			if (userRestartInput.equals("Y")) {
				restartApp = true;

			} else {
				System.out.println("Thank you for using my app!");
				restartApp = false;

			}

		} while (restartApp);
		keyboard.close();
	}

}
