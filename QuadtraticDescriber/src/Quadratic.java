/* Shao Ching Kao
 * September 26th, 2017
 * Quadratic will be responsible for all the for all calculation
 */
public class Quadratic {
	public static String quadrDescriber (double a, double b, double c) {
		
		String description = "Description of the graph of: \ny = " + a + " x^2 + " + b + " x + " + c + "\n";
		
		//determines if the quadratic opens upwards or downwards
		String concavity = "\nOpens: ";
		if (a > 0) {
			concavity += "Up \n"; }
		else {
			concavity += "Down \n";  }
		
		//determines the axis of symmetry of the quadratic
		String aOS = "Axis of Symmetry: " + round2(-b / (2 * a)) + "\n";
		
		//determines the vertex of the quadratic
		String vertex = "Vertex: " + vertex (a, b, c) + "\n";
				
		//determines the x-intercepts of the quadratic
		String xIntercept = "X-intercepts(s): " + quadForm (a, b, c) + "\n";
		
		//determines the y intercept 
		String yIntercept = "Y-intercept: " + c + "\n";
		
		return description + concavity + aOS + vertex + xIntercept + yIntercept;
	}
		public static double absValue (double value) {
			if (value < 0) {
				return value * -1; }
			else {
				return value; }
		}
		/* A call to "absValue returns the absolute value of the number passed.
		 * The method accepts a double and returns a double.
		 */
		
		public static double round2 (double value) {
			double timesOneHundered = value * 100.0;
			int truncNum = (int)timesOneHundered;
			double difference = absValue(truncNum - (value*100));
			if (difference < .5){
				double returnNum = truncNum/100.0; 
				return (returnNum);
			}
			else if (difference >= .5){
				if (value <0){
					double returnNum = (truncNum - 1.0)/100.0;
					return (returnNum);
				}
				double returnNum = (truncNum + 1.0)/100.0;
				return (returnNum);
			}
			return(-1.0); 
		}
		/* A call to "round2" rounds a double correctly to 2 decimal places 
		 * and returns a double
		 */
		
		public static double square (double operand) {
			double square = operand * operand;
			return square; 
		}		
		/* A call to "square" returns the square of the value passed. 
		 * The method accepts an integer and returns an integer.
		 */
		
		public static String vertex (double a, double b, double c) {
			double x = round2(-b/(2*a));
			double y = round2((square(b)/(4 * a) - (square(b))/(2 * a) + c));
			return "(" + x + ", " + y + ")";
		}
		
		public static double discriminant (double a, double b, double c) {
			double discriminant = ((b * b) - (4 * a * c));
			return discriminant; 
		}
		/* A call to "discriminant" provides the coefficients of a quadratic equation in standard form (a,b,c)
		 *  and returns the value of the discriminant. 
		 *  The method accepts three doubles and returns a double.
		 */

		public static double sqrt (double valueOne) {
			if (valueOne < 0) {
				throw new IllegalArgumentException("Cannot square root negatives"); }
			double answer = (valueOne / 2);
			while (!(absValue((answer * answer) - valueOne) <= .009)){
				answer = .5 * (answer + (valueOne /answer));
			}
			return (round2(answer));
		}
		/* A call to "sqrt" return an approximation of the square root of the value passed,
		 *  rounded to two decimal places. 
		 *  This method accepts a double and returns a double. 
		 */
		
		public static String quadForm (double valueOne, double valueTwo, double valueThree) {
			double discriminant = discriminant(valueOne, valueTwo, valueThree);
				if (discriminant < 0) {
					return ("none"); }
			double quadFormAddition = ((-1 * valueTwo) + (sqrt(discriminant))/(2 * valueOne));
			double quadFormSubtraction = ((-1 * valueTwo) - (sqrt(discriminant))/(2 * valueOne));
			quadFormAddition = round2(quadFormAddition);
			quadFormSubtraction = round2(quadFormSubtraction);
				if (quadFormAddition == quadFormSubtraction) {
					return (quadFormAddition + ""); }
				if (quadFormAddition < quadFormSubtraction) {
					return (quadFormAddition + " and " + quadFormSubtraction); }
				else {
					return (quadFormSubtraction + " and " + quadFormAddition); 
					}
		}
		/*A call to "quadForm" uses the coefficients of a quadratic equation in standard form and 
		 * uses the quadratic formula to approximate the real roots, if any.
		 * The method accepts three integers and returns a String. 
		 * To receive full credit, the method should call multiple methods that you've already written in for this library.
		 */
}