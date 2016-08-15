package com.CountriesAppProject;

public class Validator {

	public static boolean validateInput(String userInput) {
		boolean isValid = true;

		if (userInput.equals("1") || userInput.equals("2") || userInput.equals("3")) {
			return false;
		}

		return isValid;
	}

	public static boolean validateRestartInput(String userRestartInput) {

		boolean isValid = true;

		if (userRestartInput.equals("Y") || userRestartInput.equals("N")) {
			isValid = false;
		}

		return isValid;
	}
}
