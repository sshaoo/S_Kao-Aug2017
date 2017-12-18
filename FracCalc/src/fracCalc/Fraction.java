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
		String[] operandSplit = operand.split("_");
		if (operandSplit.length == 2) {
				String[] fractionSplit = operandSplit[1].split("/");
				whole = toInt(operandSplit[0]);
				numerator = toInt(fractionSplit[0]);
				denominator = toInt(fractionSplit[1]);
		}
		else {
				String[] fractionSplit = operandSplit[0].split("/");
				if (fractionSplit.length == 2) {
					whole = 0;
					numerator = toInt(fractionSplit[0]);
					denominator = toInt(fractionSplit[1]);
				}
				else {
					whole = toInt(operandSplit[0]);
					numerator = 0;
					denominator = 1;
				}
			}
		}
	
	public String toString() {
		String endResult = "";
		if (whole == 0) {
			endResult += numerator + "/" + denominator;
		}
		else if (numerator == 0) {
			endResult += whole;
		}
		else {
			endResult += whole + "_" + numerator + "/" + denominator;
		}
		return endResult;
	}
	
	private int toInt (String input) {
		int answer = Integer.parseInt(input);
		return answer;
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
		whole = replaceNum;
	}
	
	public void setDen(int replaceDen) {
		whole = replaceDen;
	}
	
	public void toImproperFrac() {
		if (whole < 0) {
			numerator *= -1;
		}
		whole = 0;
		numerator += (denominator * whole);
	}	
}