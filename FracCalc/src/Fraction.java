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
		return "whole: " + whole + ", numerator: " + numerator + ", denominator: " + denominator;
	}
	
	// instance methods
	public void toMixedNum (int numerator, int denominator) {
		if (denominator == 0) {
			throw new IllegalArgumentException ("Denominator cannot be zero");
		}
		int x = (numerator/denominator);
		int y = (numerator%denominator);
		String toMixedNum = x + ("_" + y + "/" + denominator);
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