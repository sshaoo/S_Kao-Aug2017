/* Shao Ching Kao
 * Ms.Dreyer's first period AP computer science
 * November 7th, 2017
 * This is where the work for frac calc will be stored
 */

package fracCalc;
import java.util.*;

public class FracCalc {

    public static void main(String[] args) {
    		Scanner console = new Scanner (System.in);
    		String equation = "";
    		boolean test = false;
    		while (!test == true) {
    			System.out.println("Type quit to end. Otherwise, enter your equation.");
    			equation = console.nextLine();
    			System.out.println(produceAnswer(equation));
    			if (equation.toLowerCase().equals("quit")) {
    				test = false;
    			}
    		}
    		System.out.println(produceAnswer(equation));
    }
    		
    // TODO: Read the input from the user and call produceAnswer with an equation
    
    // ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
    // This function takes a String 'input' and produces the result
    //
    // input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
    //      e.g. input ==> "1/2 + 3/4"
    //        
    // The function should return the result of the fraction after it has been calculated
    //      e.g. return ==> "1_1/4"
    // TODO: Implement this function to produce the solution to the input
    
    public static String produceAnswer (String userInput) {
		// checkpointOne: This section puts each part of the input as a variable and returns the latter part of the equation
    		String[] answerParseInput = parseInput(userInput);
        String operandOne = answerParseInput[0];
        String operator = answerParseInput[1];
        String operandTwo = answerParseInput[2];
        // checkpointTwo: This section calls on parseOperand and figures out the whole numbers, numerators and denominator of the two operand of the equation.
        int[] parseOperandTwo = parseOperand(operandTwo);
        
        return operandTwo;
        
    }
    
    // TODO: Fill in the space below with any helper methods that you think you will need
    
    // checkpointOne: This method splits the input by spaces
    public static String[] parseInput (String input) {
    		String[] inputSplit = input.split(" ");
    		return inputSplit;
    }
    
    // checkpointTwo: This method looks at the equation and determines which number is the whole number, numerator or denominator
    public static int[] parseOperand (String operand) {
    		String[] operandSplit = operand.split("_");
    		int[] equationSplit = new int[3];
    		String[] fractionSplit = null;
    		if (operandSplit.length == 1) {
    			equationSplit[0] = 0;
    			fractionSplit = operand.split("/");
    		}
    		else if (operandSplit.length > 1) {
    			equationSplit[0] = Integer.parseInt(operandSplit[0]); 
    			fractionSplit = operandSplit[1].split("/");
    		}
    		if (operandSplit.length == 1 && fractionSplit.length == 1) {
    			equationSplit[2] = 1;
    		}
    		for (int i = 0; i < fractionSplit.length; i++) {
    			equationSplit[i+1] = Integer.parseInt(fractionSplit[i]);
    		}
    		return equationSplit;
    }
}
