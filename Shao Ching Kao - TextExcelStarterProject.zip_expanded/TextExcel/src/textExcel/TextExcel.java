/*
 * Shao Ching Kao
 * Ms.Dreyer
 * 1st Period Computer Science
 * March 11th, 2018
 */
package textExcel;
import java.util.Scanner;

// Update this file with your own code.

public class TextExcel {

	public static void main(String[] args) {
		Spreadsheet sheet = new Spreadsheet();
	    Scanner console = new Scanner(System.in); // creates the console to allow user input
	    System.out.println("Welcome to TextExcel. To perform your command, type in command. To quit, type \"quit\".");
	    String input = console.nextLine();
	    while (!input.toLowerCase().equals("quit")) { // if user types in quit, the system will break the while loop
	    		System.out.println(sheet.processCommand(input));
	    	    System.out.println("To perform next command, type in command. To quit, type \"quit\"."); // to indicate to the user that the program has ran
	    		input = console.nextLine();
	    }
	}
}