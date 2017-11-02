/* 
 * Shao Ching Kao
 * Ms. Dreyer's first period AP Computer Science
 * October 30th, 2017
 * This is the class for the mini-lab for arrays
 */

import java.util.Arrays;

public class LotsOfCopies {
	public static void main (String[] args) {
		
		//question 1
		int num = 7;
		String strMain = "APCS is not fun";
		int[] arrMain = {1, 2, 3, 4, 5}; 
		changeMe(num, strMain, arrMain);
		System.out.println (num); //does not change
		System.out.println (strMain); //does not change
		System.out.println (Arrays.toString(arrMain)); //does change
		
		//question 2
		int a = 2;
		int b = a;
		a = 3;
		System.out.println (a); 
		System.out.println (b);
		String c = "first period APCS is better than second period";
		String d = c;
		c = "This is boring";
		System.out.println (c);
		System.out.println (d);
		int[] e = {0, 1, 2};
		int[] f = e;
		e[1] = 10;
		e[2] = 20;
		System.out.println(Arrays.toString(f));
		System.out.println(Arrays.toString(e)); 
	}
	//part of question 1
	public static void changeMe (int x, String str, int[] arr) {
		x += 9;
		str = "APCS is fun";
		for (int i = 0; i < arr.length; i++) {
		arr [i]++;	
		}
	}
}

