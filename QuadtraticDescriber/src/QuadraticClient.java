/* Shao Ching Kao
 * September 26th, 2017
 * This class contains a main method and handles interactions with the user. 
 * It calls the method QuadrDescriber with the appropriate arguments. 
 */

import java.util.*;
public class QuadraticClient {
	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
		
		// greets the users
		System.out.println ("Welcome to the Quadratic Describer");
		System.out.println ("Provide values for coefficients a, b, and c \n");
		boolean done = false;
		while (!done == true) {
			
			// accepts values 
			System.out.print("a: ");
			double a = console.nextDouble();
			System.out.print("b: ");
			double b = console.nextDouble();
			System.out.print("c: ");
			double c = console.nextDouble();
			System.out.println(" ");
		
			// goes through the process of finding the quadratic 
			String process = Quadratic.quadrDescriber(a, b, c);
			System.out.println(process);
			
			// asks the user if they want to still use the method
			System.out.println ("Do you want to keep going? (Type \"quit\" to end)");
			if (console.next().charAt(0) == 'q') {
			done = true; }
		}
	}
}
