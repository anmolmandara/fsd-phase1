package org.example.virtualkey.screens;

import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;

public class FileOptionsScreen implements Screen {

	private ArrayList<String> options = new ArrayList<>();

	public FileOptionsScreen() {
		options.add("1. Add a File");
		options.add("2. Delete A File");
		options.add("3. Search A FIle");
	}

	@Override
	public void Show() {
		System.out.println("Welcome to the submenu, select an option by inputting a number");
		System.out.println("\n");

		for (String s : options) {
			System.out.println(s);
		}
	}

	public void GetUserInput() {
		int selectedOption = this.getOption();
		this.NavigateOption(selectedOption);
	}

	@Override
	public void NavigateOption(int option) {
		switch (option) {
		case 1: 
			this.AddFile();
			this.ReturningToMenu();
			break;
		case 2:
			this.DeleteFile();
			this.ReturningToMenu();

			break;
		case 3:
			this.SearchFile();
			this.ReturningToMenu();

			break;
		default:
			System.out.println("Invalid Option");
			break;
		}
	}

	public void AddFile() {
		System.out.println("Enter the name of the file you would like to add.");
		String textfile = this.getInputString();
		try {
			File userfile = new File("C:/Users/Player1/Documents/VirtualKeyDataFiles/" + textfile);
			if (userfile.createNewFile()) {
				System.out.println("A new file was created named " + userfile.getName());
			} else {
				System.out.println("This file was already made.");
			}
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		}
	}

	public void DeleteFile() {
		System.out.println("Enter the name of the file you would like to delete.");
		boolean boo = false;
		String textfile = this.getInputString();
		try {
			File userfile = new File("C:/Users/Player1/Documents/VirtualKeyDataFiles/" + textfile);
			boo = userfile.exists();
			if (boo) {
				userfile.delete();
				System.out.println("The file, "+textfile+", was deleted.");
			} else {
				System.out.println(textfile+" was not found in folder.");
			}
		} catch (Exception ex) {
			System.err.println(ex.getMessage());
		}
	}

	public void SearchFile() {
		System.out.println("Enter the name of the file you would like to search.");
		boolean found = false;
		String filename = this.getInputString();
		System.out.println("Searching for file, "+filename);
		File file = new File("C:/Users/Player1/Documents/VirtualKeyDataFiles");
		String[] arr = file.list();
		for (String f : arr) {
			if (filename.equals(f.toLowerCase())) {
				found = true;
			}
		}
		System.out.println(found ? "The file, " + filename + ", is in the folder.\n"
				: "The file, " + filename + ", is not in the folder.\n");
	}

	private String getInputString() {
		Scanner in = new Scanner(System.in);
		return (in.nextLine());
	}

	private int getOption() {
		Scanner in = new Scanner(System.in);
		int returnOption = 0;

		try {
			returnOption = in.nextInt();
		} catch (InputMismatchException ex) {

		}
		return returnOption;
	}
	
	private void ReturningToMenu() {
		System.out.println("You are now returning to the main menu!");
	}

}