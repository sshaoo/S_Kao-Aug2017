/* Shao Ching Kao
 * Ms. Dreyer's first period APCS
 * October 31st, 2017
 * This is the code for ArrayLab3
 */
public class ArrayLab3 {

	public static void main(String[] args) {
		
		//test numbers
		int[] a1 = {5, 10, 15, 20, 25, 30, 35, 40};
		int[] a2 = {7, 14, 21, 28, 35, 42, 49, 56};
		int[] sumArr = sum (a1, a2);
		int appendNum = 200;
	}
	public static int[] sum(int[] arr1, int[] arr2) {
		int[] sum = new int [arr1.length];
		for (int i = 0; i < arr1.length; i++) {
			sum [i] = arr1[i] + arr2[i];
		}
		return sum;
	}
	/* 
	 * Write a method sum that accepts two arrays of integers arr1 and arr2 and returns an array of integers, 
	 * in which every element is the sum of the elements at that index for the arrays arr1 and arr2. 
	 * You can assume arrays arr1 and arr2 have at least one element each and are the same length.
	 */
	
	public static int[] append(int[] arr, int num) {
		int [] append = new int[arr.length + 1];
		for (int i = 0; i < arr.length; i++) {
			append [i] = arr [i];
		}
		append [arr.length + 1] = num;
		return append;
	}
}
