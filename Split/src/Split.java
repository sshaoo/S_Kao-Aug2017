/* 
 * Shao Ching Kao
 * Ms Dreyer's first period AP Computer Science
 * October 24th, 2017
 * Split class Assignment
 */

import java.util.Arrays;
public class Split {
	public static void main (String [] args) {
		System.out.println (breadSplit("applespineapplesbreadlettucetomatobaconmayohambreadcheese"));
		System.out.println (breadSplitSpace("apples pineapples bread lettuce tomato bacon mayo ham bread cheese"));
		
//String.split();
//It's a method that acts on a string, <StringName>.split(<String sp>);
//Where sp is the string where the string splits
//And it returns an array
// Example: "I like apples!".split(" "); 
//	it will split at spaces and return an array of ["I","like","apples!"]
// Example 2: "I really like really red apples"split("really")
//	it will split at the word "really" and return an array of ["I "," like "," red apples!"]	
//play around with String.split! what happens if you "I reallyreally like apples".split("really") ?

		String sentenceOne = "I like apple";
		String [] sentenceOneArray = sentenceOne.split(" ");
		System.out.println (Arrays.toString(sentenceOneArray)); 
		
		String sentenceTwo = "I really like really red apples";
		String [] sentenceTwoArray = sentenceTwo.split("really");
		System.out.println (Arrays.toString(sentenceTwoArray)); 
	}

//Your task:
/*Write a method that take in a string like "applespineapplesbreadlettustomatobaconmayohambreadcheese" describing a sandwich
* use String.split to split up the sandwich by the word "bread" and return what's in the middle of the sandwich and ignores what's on the outside
* What if it's a fancy sandwich with multiple pieces of bread?
*/

		public static String breadSplit (String sandwich) {
			String answer = "";
			String[] arraySandwich = sandwich.split ("bread");
			if (arraySandwich.length <= 2) {
				System.out.println("Not an edible sandwich."); 
			}
			else {
				for (int i = 1; i < arraySandwich.length-1; i++) {
					String contents = arraySandwich[i];
					answer += contents; 
				}
			}
			return answer;
		}
				

//Your task pt 2:
/*Write a method that take in a string like "apples pineapples bread lettus tomato bacon mayo ham bread cheese" describing a sandwich
* use String.split to split up the sandwich at the spaces, " ", and return what's in the middle of the sandwich and ignores what's on the outside
* Again, what if it's a fancy sandwich with multiple pieces of bread?
*/

		public static String breadSplitSpace (String sandwich) {
			String answer = "";
			String[] arraySandwichSpace = sandwich.split(" ");
			for (int i = 1; i < arraySandwichSpace.length; i++) {
				sandwich += arraySandwichSpace[i];
			}
			String[] arraySandwichBread = sandwich.split ("bread");
			if (arraySandwichBread.length <= 2) {
				System.out.println("Not an edible sandwich."); 
			}
			else {
				for (int i = 1; i < arraySandwichBread.length - 1; i++) {
					answer += arraySandwichBread[i];
				}
			}
			return answer;
		
		}
}
		