/* 
 * Shao Ching Kao (Second Programmer is Reina)
 * APCS first period
 * Ms. Dreyer
 * Storage and testing area for Processing Numbers
 */

import java.util.*;
public class ProcessingNumbers {
	public static void main(String[] args) {
		Scanner console = new Scanner (System.in);
		System.out.println("How many numbers are you going to input?");
		int quantity = console.nextInt();
		System.out.println ("Please enter your integers: ");
		int max = console.nextInt ();
		int min = max;
		int evenSum = 0;
		int evenMax = 0;
		if (max % 2 == 0) {
			evenSum = max;
			evenMax = max; }
		for (int i = 1; i < quantity; i++) {
			int number = console.nextInt();
			if (number > max) {
				max = number; }
			if (number <min) {
				min = number; }
			if (number % 2 == 0) {
			evenSum += number; }
			if (number > evenMax) {
				evenMax = number;}
				
		}
	System.out.println ("maximum is " + max + " and minimum is " + min);
	System.out.println ("Sum of all even number is " + evenSum + " and maximum of the even number is " + evenMax);
	}
}	
