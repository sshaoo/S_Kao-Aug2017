/* 
 * Shao Ching Kao
 * Ms. Dreyer's first period AP Computer Science
 * October 30th, 2017
 * This is the class for the mini-lab for arrays
 */

import java.util.Arrays;

public class LotsOfCopies {
	public static void main (String[] args) {
		int num = 7;
		String strMain = "APCS";
		int[] arrMain = {1, 2, 3, 4, 5}; 
		changeMe (num, strMain, arrMain);
		System.out.println (num);
		System.out.println (strMain);
		System.out.println (arrMain);
		System.out.println (Arrays.toString(arrMain));
		
	}
	public static void changeMe (int x, String str, int[] arr) {
		x += 9;
		str = "APCS is fun :(";
		arr [2] = 7;	
	}
}
