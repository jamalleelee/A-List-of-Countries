package com.CountriesAppProject;

import java.io.*;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadAndWrite {

	public static void writeMe(String userCountiesAddInput) {
		Path myContriesListPath = Paths
				.get("\\Users\\admin\\newWorkspace\\Week Three\\src\\com\\CountriesAppProject\\CountriesApp.txt");
		File myContriesListFile = myContriesListPath.toFile();

		try (PrintWriter out = new PrintWriter(new BufferedWriter((new FileWriter(myContriesListFile, true))))) {
			out.println(userCountiesAddInput);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String readMe() {
		String CountriesInList = null;
		Path myContriesListPath = Paths
				.get("\\Users\\admin\\newWorkspace\\Week Three\\src\\com\\CountriesAppProject\\CountriesApp.txt");
		File myContriesListFile = myContriesListPath.toFile();

		try (BufferedReader in = new BufferedReader(new FileReader(myContriesListFile))) {
			while ((CountriesInList = in.readLine()) != null) {
				System.out.println(CountriesInList);
			}
		} catch (IOException ex) {
			ex.printStackTrace();
		}
		return "Please add more if you like.";

	}

}
