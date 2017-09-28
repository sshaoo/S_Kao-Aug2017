/* Shao Ching Kao
 * September 5, 2017
 * This is the runner class for my Calculate Library methods
 */
public class DoMath {
	public static void main(String[] args) {
		System.out.println (Calculate.square(2));
		System.out.println (Calculate.cube(2));
		System.out.println (Calculate.average(2,4));
		System.out.println (Calculate.average(2, 4, 6));
		System.out.println (Calculate.toDegrees(1.57));
		System.out.println (Calculate.toRadians(90));
		System.out.println (Calculate.discriminant(1, 2, -3));
		System.out.println (Calculate.toImproperFrac(1, 1, 2));
		System.out.println (Calculate.toMixedNum(3, 2));
		System.out.println (Calculate.foil(1, -1, 1, 3, "x"));
		System.out.println (Calculate.isDivisibleBy(6, 2));
		System.out.println (Calculate.absValue(-1));
		System.out.println (Calculate.max(1, 2));
		System.out.println (Calculate.max(1, 2, 3));
		System.out.println (Calculate.min(1, 2));
		System.out.println (Calculate.round2(3.1415));
		System.out.println (Calculate.exponent(2, 2));
		System.out.println (Calculate.factorial(3));
		System.out.println (Calculate.isPrime(13));
		System.out.println (Calculate.gcf(42, 48));
		System.out.println (Calculate.sqrt(4));
		System.out.println (Calculate.quadForm(1, 2, -3));
	}
}
