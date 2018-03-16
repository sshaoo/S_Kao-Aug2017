/*
 * Shao Ching Kao
 * Ms.Dreyer
 * 1st Period Computer Science
 * March 11th, 2018
 */
package textExcel;
import java.util.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

// Update this file with your own code.

public class TextExcel {

	public static void main(String[] args) {
		Spreadsheet sheet = new Spreadsheet();
	    Scanner console = new Scanner(System.in);
	    System.out.println("Please Enter Command.");
	    boolean done = false;
	    while (!done == true) {
	    	String input = console.nextLine();
	    	System.out.println(sheet.processCommand(input));
	    	if (input.equalsIgnoreCase("quit")) {
	    		System.out.println("program exited");
	    		done = true;
	    	}
	    }
	}
}
