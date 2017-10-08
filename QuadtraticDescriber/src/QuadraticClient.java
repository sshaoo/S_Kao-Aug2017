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
		do {
		// accepts values 
		System.out.print("a: ");
		double a = userInput.nextDouble();
		System.out.print("b: ");
		double b = userInput.nextDouble();
		System.out.print("c: ");
		double c = userInput.nextDouble();
		
		// goes through the process of finding the quadratic 
		String process = Quadratic.quadrDescriber(a, b, c);
		System.out.println(process);
		System.out.println ("Do you want to keep going? (Type \"quit\" to end)"); }
		while (!(userInput.next().charAt(0) == "q"));
			
		}
		
		
		
		
	
		
		
		

	}

}
