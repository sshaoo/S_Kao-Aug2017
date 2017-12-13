/* Shao Ching Kao
 * Ms.Dreyer's first period AP computer science
 * November 7th, 2017
 * This is where the work for frac calc objects will be stored
 */

import java.util.*;

public class Fraction {

	// instance variables
	private int numerator;
	private int denominator;
	private int whole;
	private String sign;
	
	//constructor
	public Fraction (String operand) {
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
	}
	
	public String toString() {
		if (denominator == 0) {
			throw new IllegalArgumentException ("Denominator cannot be zero");
		}
		int x = (numerator/denominator);
		int y = (numerator%denominator);
		String toMixedNum = x + ("_" + y + "/" + denominator); 
		return toMixedNum;
	}
	
	 public void addition(int[] expression) {
		int intNumerator = expression[0] + expression[1];
		String stringNumerator = Integer.toString(intNumerator);
		String answerString = stringNumerator + "/" + expression[2];
	 }
		
	public void subtraction(int[] expression) {
		int intNumerator = expression[0] - expression[1];
		String stringNumerator = Integer.toString(intNumerator);
		String answerString = stringNumerator + "/" + expression[2];
	}			
	
	public void multiplication(int[] expression) {
		int intNumerator = expression[0] * expression[1];
		int intDenominator = expression[2] * expression[2];
		String stringNumerator = Integer.toString(intNumerator);
		String stringDenominator = Integer.toString(intDenominator);
		String answerString = stringNumerator + "/" + stringDenominator;
	}
	
	public void division(int[] expression) {
		int intNumerator = expression[0] * expression[2];
		int intDenominator = expression[1] * expression[2];
		String stringNumerator = Integer.toString(intNumerator);
		String stringDenominator = Integer.toString(intDenominator);
		String answerString = stringNumerator + "/" + stringDenominator;
	}
	
	public void toImproperFrac (int wholeNumber, int numerator, int denominator) {
		if (denominator == 0) {
			throw new IllegalArgumentException ("Denominator cannot be zero");
		}
		String toImproperFrac = (((denominator * wholeNumber) + numerator) + "/" + denominator);
	}
	
	private void toInt (String str) {
		int parsedStr = Integer.parseInt(str);
	}	
}