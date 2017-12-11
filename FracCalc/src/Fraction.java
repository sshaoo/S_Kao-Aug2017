/* Shao Ching Kao
 * Ms.Dreyer's first period AP computer science
 * November 7th, 2017
 * This is where the work for frac calc will be stored
 */

import java.util.*;

public class Fraction {

	//instance variable
	private int numerator;
	private int denominator;
	private int whole;
	private String sign;

	public void toMixedNumber() {
		if (denominator == 0) {
			throw new IllegalArgumentException ("Denominator cannot be zero");
		}
		int x = (numerator/denominator);
		int y = (numerator%denominator);
		String toMixedNum = x + ("_" + y + "/" + denominator); 
	}