/* Shao Ching Kao
September 5, 2017
This is our home grown library that will contain various mathematical methods.
 */
public class Calculate {

	public static int square (int operand) {
		int square = operand * operand;
		return square; }		
	/* A call to "square" returns the square of the value passed. 
	 * The method acccepts an integer and returns an integer.
	 */

	public static int cube (int numberCubed) {
		int cube = numberCubed * numberCubed * numberCubed;
		return cube; }			
	/* A call to "cube" returns the cube of the value passed. 
	 * The method accepts an integer and returns an integer.
	 */

	public static double average (double valueOne, double valueTwo) {
		double average = (valueOne + valueTwo)/2; 
		return average; }
	/* A call to "average" returns the average of the balues passed to it. 
	 * This method accepts two doubles and returns a double.
	 */

	public static double average (double valueOne, double valueTwo, double valueThree) {
		double average = (valueOne + valueTwo + valueTwo)/3;
		return average; }
	/* Another "average" method. 
	 * This one accepts three doubles and returns a double. 
	 * The name is the same, the difference is in the header and the calculation
	 * An example of overloading = the ability to define two or more different methods 
	 * with the same name but different method. 
	 */

	public static double toDegrees (double radians) {	
		double toDegrees = ((180/3.14159) * radians);
		return toDegrees; }
	/* A call to "toDegrees" converts an angle measure given in radians into degrees. 
	 * The method accepts a double and returns a double.
	 * the method should use 3.14159 as an approximation for pi.
	 */

	public static double toRadians (double degrees) {
		double toRadians = ((3.14159/180) * degrees);
		return toRadians; }
	/* A call to "toRadians" converts an angle measure given in degrees into radians. 
	 * The method accepts a double and returns a double. 
	 * The method should use 3.14159 as an approximation for pi.
	 */

	public static double discriminant (double a, double b, double c) {
		double discriminant = ((b * b) - (4 * a * c));
		return discriminant; }
	/* A call to "discriminant" provides the coefficients of a quadratic equation in standard form (a,b,c)
	 *  and returns the value of the discriminant. 
	 *  The method accepts three doubles and returns a double.
	 */

	public static String toImproperFrac (int wholeNumber, int numerator, int denominator) {
		if (denominator == 0) {
			throw new IllegalArgumentException ("Denominator cannot be zero");
		}
		String toImproperFrac = (((denominator * wholeNumber) + numerator) + "/" + denominator);
		return toImproperFrac; }
	/* A call to "toImproperFrac" converts mixed number into an improper function
	 * The method accepts three integers and return a String
	 */

	public static String toMixedNum (int numerator, int denominator) {
		if (denominator == 0) {
			throw new IllegalArgumentException ("Denominator cannot be zero");
		}
		int x = (numerator/denominator);
		int y = (numerator%denominator);
		String toMixedNum = x + (y + "/" +denominator); 
		return toMixedNum; }
	/* A call to "toMixedNum" converts an improper fraction into a mixed number. 
	 * The method accepts two integers and returns a string.
	 */

	public static String foil (int a, int b, int c, int d, String variable) {
		String foil = (((a * c) + (variable) + "^2" + "+" + (((a * d) + (b * c)) + variable) + "+" + (b * d) ));
		return foil; }
	/* A call to "foil" converts a binomial multiplication of the form (ax + b)(cx + d)
	 * into a quadratic equation of the form ax^2 + bx + c. 
	 * The method accepts a four integers and a String and then returns a String.
	 */

	public static boolean isDivisibleBy (int valueOne, int valueTwo) {
		if (valueTwo == 0) {
			throw new IllegalArgumentException("Denominator cannot be zero"); 
		}
		if (valueOne % valueTwo == 0) {
			return true; }
		else {
			return false; }
	}
	/* A call to "isDivisibleBy" determines whether or not one integer is evenly divisble by another. 
	 * The method accepts two integers and returns a boolean.		
	 */

	public static double absValue (double value) {
		if (value < 0) {
			return value * -1; }
		else {
			return value; }
	}
	/* A call to "absValue returns the absolute value of the number passed.
	 * The method accepts a double and returns a double.
	 */

	public static double max (double valueOne, double valueTwo) {
		if (valueOne > valueTwo) {
			return valueOne; }
		else {
			return valueTwo; }
	}
	/* A call to "max" returns the larger of the values passed. 
	 * The method accepts two double and returns a double
	 */

	public static double max (double valueOne, double valueTwo, double valueThree) {
		if (valueOne > valueTwo && valueOne > valueThree) {
			return valueOne; }
		else if (valueTwo > valueOne && valueTwo > valueThree) {
			return valueTwo; }
		else {
			return valueThree; }
	}
	/* Overload the max method. 
	 * This one accepts three doubles and returns a double
	 */

	public static int min (int valueOne, int valueTwo) {
		if (valueOne < valueTwo) {
			return valueOne; }
		else {
			return valueTwo; }
	}
	/* A call to "min" returns the smaller of the values passed. 
	 * The method accepts two integers and returns an int.
	 */

	public static double round2 (double value) {
		if (value * 1000 % 10 < 5) {
			return (value * 1000) - (value * 1000 % 10); }
		else {
			return ((value * 1000) + (1 + (value * 1000 % 10)))/1000; }
	}
	/* A call to "round2" rounds a double correctly to 2 decimal places 
	 * and returns a double
	 */

	public static double exponent (double base, int exponent) {
		if (exponent < 0) {
			throw new IllegalArgumentException ("Please input a positive exponent");
		}
		int i;
		for (i = 2; i <= exponent; i++) {
			base *= base; }
		return base; 
	}
	/* A call to "exponent" raises a value to a positive integer power. 
	 * The method accepts a double and an integer and returns a double. 
	 * For time being, assume that the exponent is positive. 
	 */

	public static int factorial (int value) {
		if (value < 0) {
			throw new IllegalArgumentException ("The value cannot be negative");
		}
		int product = 1;
		for (int i = 2; i <= value; i++) {
			product *= i; }
		return product; 
	}
	/* A call to "factorial" returns the factorial of the value passed. 
	 * The method accepts an integer and returns an integer. 
	 * For the time being, assume that the exponent is positive.
	 */

	public static boolean isPrime (int value) {
		if (value < 0) {
			throw new IllegalArgumentException ("Please input a positive value");
		}
		for (int i = 2; i < value; i++) {
			if (Calculate.isDivisibleBy(value, i) == true) {
				return true; }
		}
		return false; 
	}
	/* A call to "isPrime" determines whether or not an integer is prime.
	 * The method accepts an integer and return a boolean. 
	 * For the time being, you can assume that both integers are positive.
	 */

	public static int gcf (int valueOne, int valueTwo) {
		if (valueOne < 0) {
			throw new IllegalArgumentException ("Please enter a positive value");
		}
		if (valueTwo < 0) {
			throw new IllegalArgumentException ("Please enter a positive value");
		}
		int gcf = 1;
			for (int i = 1; i <= valueTwo; i++) {
				if (isDivisibleBy(valueOne, i) && isDivisibleBy (valueTwo, i)) {
					gcf = i; } 
			}	
		return gcf;
	}
	/* A call to "gcf" finds the greatest common factor of two integers.
	 * The method accepts two positive integers and returns an integer. 
	 * For the time being, you can assume that both integers are positive. 
	 */
	
	public static double sqrt (double valueOne) {
		if (valueOne >0) {
			throw new IllegalArgumentException("Cannot square root negatives"); }
		double integerOne;
		double squareRoot = valueOne / 2;
		do {
			integerOne = squareRoot; 
			squareRoot = (integerOne + (squareRoot / integerOne) / 2); }
		while ((integerOne - squareRoot) != 0); 
			return Calculate.round2 (squareRoot); 
	}
	/* A call to "sqrt" return an approximation of the square root of the value passed,
	 *  rounded to two decimal places. 
	 *  This method accepts a double and returns a double. 
	 */

	public static String quadForm (int valueOne, int valueTwo, int valueThree) {
		double valueOneDouble = valueOne;
		double valueTwoDouble = valueTwo;
		double valueThreeDouble = valueThree;
		double discriminant = Calculate.discriminant(valueOneDouble, valueTwoDouble, valueThreeDouble);
			if (discriminant < 0) {
				return ("no real roots"); }
		double quadFormAddition = ((-1 * valueTwoDouble) + (Calculate.sqrt(discriminant))/(2 * valueThreeDouble));
		double quadFormSubtraction = ((-1 * valueTwoDouble) - (Calculate.sqrt(discriminant))/(2 * valueThreeDouble));
		quadFormAddition = Calculate.round2(quadFormAddition);
		quadFormSubtraction = Calculate.round2(quadFormSubtraction);
			if (quadFormAddition == quadFormSubtraction) {
				return (quadFormAddition + ""); }
			if (quadFormAddition < quadFormSubtraction) {
				return (quadFormAddition + " and " + quadFormSubtraction); }
			else {
				return (quadFormSubtraction + " and " + quadFormAddition); }
	}
}



