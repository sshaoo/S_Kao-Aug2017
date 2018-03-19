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
	    Scanner console = new Scanner(System.in);
	    System.out.println("Please enter command. To quit, type \"quit\".");
	    boolean done = false;
	    //TestsALL.Helper th = new TestsALL.Helper();
	    //System.out.println(th.getText());
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
