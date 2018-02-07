/* Shao Ching Kao
 * Ms.Dreyer's first period AP computer science
 * December 14, 2017
 * This is where the work for frac calc objects will be stored
 */

package fracCalc;
import java.util.*;

public class Fraction {

	// instance variables
	private int numerator;
	private int denominator;
	private int whole;
	
	public Fraction(String frac) {
		parseOperand(frac);
	}
	
	public Fraction() {
		whole = 0;
		numerator = 0;
		denominator = 1;
	}
	
	private void parseOperand (String operand) {
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
    		this.whole = equationSplit[0];
    		this.numerator = equationSplit[1];
    		this.denominator = equationSplit[2];
    		if (operandSplit.length == 1 && fractionSplit.length == 1) {
    			whole = Integer.parseInt(operandSplit[0]); 
    			numerator = 0;
    			denominator = 1;
    		}
    }
	
	public String toString() {
		String answerString = numerator + "/" + denominator;
		return answerString;
	}
	
	private int toInt (String input) {
		int answer = Integer.parseInt(input);
		return answer;
	}
	 
	public void toImproperFrac() {
		if (whole < 0) {
			numerator *= -1;
		}
		numerator = (denominator * whole) + numerator;
		whole = 0;
		int[] improperFraction = {numerator, denominator};
	}
		
	//getters
	public int getWhole() {
		return whole;
	}
	
	public int getNum() {
		return numerator;
	}
	
	public int getDen() {
		return denominator;
	}
	
	//setters
	public void setWhole(int replaceWhole) {
		whole = replaceWhole;
	}
	
	public void setNum(int replaceNum) {
		numerator = replaceNum;
	}
	
	public void setDen(int replaceDen) {
		denominator = replaceDen;
	}	
}