/* Shao Ching Kao
September 5, 2017
This is our home grown library that will contain various mathematical methods.
 */
public class Calculate {
	
	public static int square (int operand) {
		int square = operand * operand;
		return square; }		
	/* This method takes an integer and returns its square
	 */

	public static int cube (int numberCubed) {
		int cube = numberCubed * numberCubed * numberCubed;
		return cube; }			
	/* This method takes an integer and returns as a cubed version of number
	 */
	
	public static double average (double firstNumber, double secondNumber) {
		double average = (firstNumber + secondNumber)/2; 
			return average; }
	/* This method finds the average of two numbers
	 */
	
	public static double average (double firstNumber, double secondNumber, double thirdNumber) {
		double average = (firstNumber + secondNumber + thirdNumber)/3;
			return average; }
	/* This method finds the average of three numbers
	 */
	
	public static double toDegrees (double radians) {	
		double toDegrees = ((180/3.14159) * radians);
			return toDegrees; }
	/* This method changes the number form from radians to degrees
	 */
	
	public static double toRadians (double degrees) {
		double toRadians = ((3.14159/180) * degrees);
			return toRadians; }
	/* This method changes the number form from degrees to radians */
	
	public static double discriminant (double letterA, double letterB, double letterC) {
		double discriminant = 
	}
		
	}			
	