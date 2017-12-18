/* Shao Ching Kao
 * Ms.Dreyer's first period AP computer science
 * December 14, 2017
 * This is where the work for frac calc objects will be stored
 */

package fracCalc;
import java.util.*;

public class FracCalc {

    public static void main(String[] args) {
    		Scanner console = new Scanner(System.in);
		System.out.println("Please enter your equation.");
		String equation = console.nextLine();
		while (!equation.equals("quit")) {
			System.out.println(produceAnswer(equation));
			System.out.println("Type \"quit\" with no capital letters to end. Otherwise, enter your equation.");
			equation = console.nextLine();
			}
    }
    
    public static String produceAnswer (String userInput) {
    	
    		String[] inputSplit = userInput.split(" ");
        Fraction operandOne =  new Fraction(inputSplit[0]);
        String operator = inputSplit[1];
        Fraction operandTwo = new Fraction(inputSplit[2]);
        operandOne.toImproperFrac();
		operandTwo.toImproperFrac();
		Fraction answer = new Fraction();
		if (operator.equals("+")){
			answer = addition(operandOne, operandTwo);
		}
		else if (operator.equals("-")){
			answer = subtraction(operandOne, operandTwo);
		}
		else if (operator.equals("*")){
			answer = multiplication(operandOne, operandTwo);
		}
		else if (operator.equals("/")){
			answer = division(operandOne, operandTwo);
		}
		return answer.toString();
    }
    
    // adds two fractions into one if called upon
    public static Fraction addition(Fraction expressionOne, Fraction expressionTwo) {
		Fraction answer = new Fraction();
    		answer.setNum((expressionOne.getNum() * expressionTwo.getDen()) + (expressionTwo.getNum() * expressionOne.getDen()));
    		answer.setDen(expressionOne.getDen() * expressionTwo.getDen());
		return answer;
	}
    // subtracts two fractions into one if called upon
    public static Fraction subtraction(Fraction expressionOne, Fraction expressionTwo) {
		Fraction answer = new Fraction();
    		answer.setNum((expressionOne.getNum() * expressionTwo.getDen()) - (expressionTwo.getNum() * expressionOne.getDen()));
    		answer.setDen(expressionOne.getDen() * expressionTwo.getDen());
		return answer;
	}
	// multiplies two fraction into one if called upon
    public static Fraction multiplication(Fraction expressionOne, Fraction expressionTwo) {
		Fraction answer = new Fraction();
    		answer.setNum(expressionOne.getNum() * expressionTwo.getNum());
    		answer.setDen(expressionOne.getDen() * expressionTwo.getDen()) ;
		return answer;
	}
	// divides two fraction into one if called upon
		public static Fraction division(Fraction expressionOne, Fraction expressionTwo) {
			Fraction answer = new Fraction();
	    		answer.setNum(expressionOne.getNum() * expressionTwo.getDen());
	    		answer.setDen(expressionOne.getDen() * expressionTwo.getNum()) ;
			return answer;
	}
}
