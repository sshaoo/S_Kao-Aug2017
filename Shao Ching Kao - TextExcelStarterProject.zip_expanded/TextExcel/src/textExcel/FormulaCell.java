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
		return null;
	}

	public String fullCellText() {
		return getInput();
	}

	public double getDoubleValue() {
		String inputSplit[] = getInput().split(" ");
		double answer = Double.parseDouble(inputSplit[0]);
		for (int i = 0; i < inputSplit.length; i++) {
			if (inputSplit[i] == "+") {
				answer += Double.parseDouble(inputSplit[i + 1]);
			}
			else if (inputSplit[i] == "-") {
				answer -= Double.parseDouble(inputSplit[i + 1]);
			}
			else if (inputSplit[i] == "*") {
				answer *= Double.parseDouble(inputSplit[i + 1]);
			}
			else if (inputSplit[i] == "/") {
				answer /= Double.parseDouble(inputSplit[i + 1]);
			}
			return answer;
		}
	}
}