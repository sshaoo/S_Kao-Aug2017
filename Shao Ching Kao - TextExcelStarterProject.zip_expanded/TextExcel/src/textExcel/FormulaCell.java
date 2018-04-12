/*
 * Shao Ching Kao
 * Ms.Dreyer
 * 1st Period Computer Science
 * March 11th, 2018
 */
package textExcel;

public class FormulaCell extends RealCell {
	
 	public FormulaCell(String input) {
		super(input);
		
	}

	public String abbreviatedCellText() {
		String answer = "" + getDoubleValue();
		if (answer.length() > 10) {
			return answer.substring(0, 10);
		}
		else {
			for (int i = answer.length(); i < 10; i++) {
				answer += " ";
			}
			return answer;
		}
	}

	public String fullCellText() {
		return getInput();
	}

	public double getDoubleValue() {
		String inputSplit[] = getInput().substring(getInput().indexOf("(") + 2, getInput().indexOf(")") - 1).split(" ");
		double answer = Double.parseDouble(inputSplit[0]);
		for (int i = 1; i < inputSplit.length; i += 2) {
			if (inputSplit[i].equals("+")) {					
				answer += Double.parseDouble(inputSplit[i + 1]);
			}
			else if (inputSplit[i].equals("-")) {
				answer -= Double.parseDouble(inputSplit[i + 1]);
			}
			else if (inputSplit[i].equals("*")) {
				answer *= Double.parseDouble(inputSplit[i + 1]);
			}
			else if (inputSplit[i].equals("/")) {
				answer /= Double.parseDouble(inputSplit[i + 1]);
			}
		}
		return answer;
	}
}