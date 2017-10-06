/* Shao Ching Kao
 * September 26th, 2017
 * This class contains a main method and handles interactions with the user. 
 * It calls the method QuadrDescriber with the appropriate arguments. 
 */

import java.util.*;
public class QuadraticClient {
	public static void main(String[] args) {
		Scanner userInput = new Scanner (System.in);
		
		// greets the users
		System.out.println ("Welcome to the Quadratic Describer");
		System.out.println ("Provide values for coefficients a, b and c \n");
		
		int a = 0;
		int b = 0;
		int c = 0;
		
		System.out.print(("a: "));
		double quantity = userInput.nextInt();
		
		// gives the equation of the quadratic
				System.out.println("Description of the graph of :");
				System.out.println("y = " + a + "x^2 + " + b + "x + " + c);
				System.out.println(" ");
		
		
	
		
		
		

	}

}
