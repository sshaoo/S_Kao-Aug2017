package fracCalc;

import java.util.Scanner;

public class FracCalc {

    public static void main(String[] args) {
    	Scanner console = new Scanner (System.in);
		System.out.println("Please enter your equation.");
		String equation = console.nextLine();
		while (!equation.equals("quit")) {
			System.out.println(produceAnswer(equation));
			System.out.println("Type \"quit\" with no capital letters to end. Otherwise, enter your equation.");
			equation = console.nextLine();
			}
}
    }
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    public static String produceAnswer(String input) { 
        String[] inputSplit = input.split(" ");
        Fraction finalAnswer = new Fraction (inputSplit[0]);
      
        
        		}
    } 
}
