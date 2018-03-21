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
	    // TestsALL.Helper th = new TestsALL.Helper();
	    // System.out.println(th.getText());
	    // System.out.println(sheet.getGridText());
	    String input = console.nextLine();
	    while (!input.toLowerCase().equals("quit")) {
	    		System.out.print(sheet.processCommand(input));
	    	    System.out.println("Please enter next command. To quit, type \"quit\".");
	    		input = console.nextLine();
	    }		
	}
}