/* Shao Ching Kao
 * Ms.Dreyer's first period AP computer science
 * December 14, 2017
 * This is where the work for frac calc objects will be stored
 */

package fracCalc;
import java.util.*;

public class FracCalc {

    public static void main(String[] args) {
    	Scanner console = new Scanner (System.in);
		System.out.println("Please enter your equation.");
		String equation = console.nextLine();
		while (!equation.equals("quit")) {
			System.out.println(produceAnswer(equation));
			System.out.println("Type \"quit\" with no capital letters to end. Otherwise, enter your equation.");
			equation = console.nextLine();
			}
    }
    
    public static String produceAnswer(String input) { 
        String[] inputSplit = input.split(" ");
        String operator = inputSplit[1];
        Fraction operandOne = new Fraction (inputSplit[0]);
        Fraction operandTwo = new Fraction (inputSplit[2]);
        operandOne.toImproperFrac();
		operandTwo.toImproperFrac();
		Fraction answer = new Fraction();
        		if (operator.equals("+")){
        			finalAnswer = addition(operandOne, operandTwo);
        		}
        		else if (operator.equals("-")){
        			finalAnswer = subtraction(operandOne, operandTwo);
        		}
        		else if (operator.equals("*")){
        			finalAnswer = multiplication(operandOne, operandTwo);
        		}
        		else {
        			finalAnswer = division(operandOne, operandTwo);
        		}
        		return finalAnswer.toString();
    }
    
    public static Fraction addition(operandOne, operandTwo) {
    		answer.setNum((operandOne.getNum() * operandTwo.getDen()) + (operandOne.getDen() * operandTwo.getNum()));
		answer.setDen(operandOne.getDen() * operandTwo.getDen());
		return answer;
		}
		
	public static Fraction subtraction(operandOne, operandTwo) {
		answer.setNum((operandOne.getNum() * operandTwo.getDen()) - (operandOne.getDen() * operandTwo.getNum()));
		answer.setDen(operandOne.getDen() * operandTwo.getDen());
		return answer;
	}			
	
	public static Fraction multiplication(operandOne, operandTwo) {
		answer.setNum(operandOne.getNum() * operandTwo.getNum());
		answer.setDen(operandOne.getDen() * operandTwo.getDen());
		return answer;
	}
	
	public static Fraction division(operandOne, OperandTwo) {
		answer.setNum(operandOne.getNum() * operandTwo.getNum());
		answer.setDen(operandOne.getDen() * operandTwo.getDen());
		return answer;
	}	
}
