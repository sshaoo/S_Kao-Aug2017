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
    		String equation;
    		while (true) {
    			System.out.println("Type quit to end. Otherwise, enter your equation.");
    			equation = console.nextLine();
    			System.out.println(produceAnswer(equation));
    			if (equation.toLowerCase().equals("quit")) {
    				break;
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
		//checkpointOne:
    		String[] answerParseInput = parseInput(userInput);
        String operandOne = answerParseInput[0];
        String operator = answerParseInput[1];
        String operandTwo = answerParseInput[2];
        return operandTwo;
        
        String[] parseOperandOne = parseOperand(operandOne);
    }
    
    // TODO: Fill in the space below with any helper methods that you think you will need
    
    // checkpointOne:
    public static String[] parseInput (String input) {
    		String[] inputSplit = input.split(" ");
    		return inputSplit;
    }
    
    public static int[] parseOperand (String operand) {
    		String[] partsSplit = operand.split("_");
    		String[] fractionSplit = partsSplit[1].split("/");
    		String[] operandSplit = {partsSplit[0], fractionSplit[0], fractionSplit[1]};
    		int[] operandSplitInt = new int [3];
    		for (int i = 0; i < operandSplitInt.length; i++) {
    			operandSplitInt[i] = Integer.parseInt(operandSplit[i]);
    		}
    		return operandSplitInt;
    }
}
