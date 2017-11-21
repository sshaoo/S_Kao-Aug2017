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
    	
    		String[] answerParseInput = parseInput(userInput);
        String operandOne = answerParseInput[0];
        String operator = answerParseInput[1];
        String operandTwo = answerParseInput[2];
        int[] parseOperandOne = parseOperand(operandOne);
        int[] parseOperandTwo = parseOperand(operandTwo);
        int[] improperFracOperandOne = toImproperFrac(parseOperandOne);
		int[] improperFracOperandTwo = toImproperFrac(parseOperandTwo);
		int[] result = commonDenominator(improperFracOperandOne, improperFracOperandTwo);
		if (operator.equals("+")){
			return addition(result);
		}
		else if (operator.equals("-")){
			return subtraction(result);
		}
		else if (operator.equals("*")){
			return multiplication(result);
		}
		else if (operator.equals("/")){
			return division(result);
		}
		else {
			String error = "Error";
			return error;
		}
    }
    
    // TODO: Fill in the space below with any helper methods that you think you will need
    
    public static String[] parseInput (String input) {
    		String[] inputSplit = input.split(" ");
    		return inputSplit;
    }
    
    public static int[] parseOperand (String operand) {
    		int[] equationSplit = new int[3];
    		String[] fractionSplit = null;
    		String[] operandSplit = operand.split("_");
    		if (operandSplit.length == 1) {
    			fractionSplit = operand.split("/");
    		}
    		else if (operandSplit.length > 1) {
    			equationSplit[0] = Integer.parseInt(operandSplit[0]); 
    			fractionSplit = operandSplit[1].split("/");
    		}
    		for (int i = 0; i < fractionSplit.length; i++) {
    			equationSplit[i+1] = Integer.parseInt(fractionSplit[i]);
    		}
    		if (operandSplit.length == 1 && fractionSplit.length == 1) {
    			equationSplit[0] = Integer.parseInt(operandSplit[0]); 
    			equationSplit[1] = 0;
    			equationSplit[2] = 1;
    		}
    		return equationSplit;
    }
    
    public static int[] toImproperFrac(int[] operand){
		operand[1] = operand[2] * operand[0] + operand[1];
		int[] improperFraction = {operand[1], operand[2]};
		return improperFraction;
    }
    
    public static int[] commonDenominator(int[] operandOne, int[] operandTwo){
		int leftNumerator = operandOne[0] * operandTwo[1];
		int rightNumerator = operandTwo[0] * operandOne[1];
		int denominator = operandOne[1] * operandTwo[1];
		int[] twoCommonFractions = {leftNumerator, rightNumerator, denominator};
		return twoCommonFractions;
    }
    
    public static String addition(int[] expression){
		int intNumerator = expression[0] + expression[1];
		String stringNumerator = Integer.toString(intNumerator);
		String answerString = stringNumerator + "/" + expression[2];
		return answerString;
	}
	public static String subtraction(int[] expression){
		int intNumerator = expression[0] - expression[1];
		String stringNumerator = Integer.toString(intNumerator);
		String answerString = stringNumerator + "/" + expression[2];
		return answerString;
	}
	public static String multiplication(int[] expression){
		int intNumerator = expression[0] * expression[1];
		int intDenominator = expression[2] * expression[2];
		String stringNumerator = Integer.toString(intNumerator);
		String stringDenominator = Integer.toString(intDenominator);
		String answerString = stringNumerator + "/" + stringDenominator;
		return answerString;
	}
	public static String division(int[] expression){
		int intNumerator = expression[0] * expression[2];
		int intDenominator = expression[1] * expression[2];
		String stringNumerator = Integer.toString(intNumerator);
		String stringDenominator = Integer.toString(intDenominator);
		String answerString = stringNumerator + "/" + stringDenominator;
		return answerString;
	}
}
