/*
 * Shao Ching Kao
 * Ms.Dreyer
 * 1st Period Computer Science
 * March 11th, 2018
 */
package textExcel;

public class FormulaCell extends RealCell {
	
	Cell[][] values;
	
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
		if (inputSplit[0].equals("SUM") || inputSplit[0].equals("AVG")) {
			String[] separatedInput = inputSplit[1].split("-");
			double sum = 0.0;
			int total = 0;
			for (char col = separatedInput[0].charAt(0); col <= separatedInput[1].charAt(0); col++) {
				for (int row = Integer.parseInt(separatedInput[0].substring(1)); row <= Integer.parseInt(separatedInput[1].substring(1)); row++) {
					sum += accessToValue("" + col + row);
					total++;
				}
			}
			if (inputSplit[0].contains("SUM")) {
				return sum;
			}
			else {
				return sum / total;
			}
		}
		else {
			double answer = Double.parseDouble(inputSplit[0]);
			for (int i = 1; i < inputSplit.length; i += 2) {
				if (inputSplit[i].equals("+")) {					
					answer += accessToValue(inputSplit[i + 1]);
				}
				else if (inputSplit[i].equals("-")) {
					answer -= accessToValue(inputSplit[i + 1]);
				}
				else if (inputSplit[i].equals("*")) {
					answer *= accessToValue(inputSplit[i + 1]);
				}
				else if (inputSplit[i].equals("/")) {
					answer /= accessToValue(inputSplit[i + 1]);
				}
			}
			return answer;
		}
	}
	
	public double accessToValue (String cellIdentifier) {
		if (Character.isAlphabetic(cellIdentifier.charAt(0))) {
			SpreadsheetLocation locationOne = new SpreadsheetLocation(cellIdentifier);
			String value = values[locationOne.getRow()][locationOne.getCol()].abbreviatedCellText().trim();
				return Double.parseDouble(value);
		}
		else {
			return Double.parseDouble(cellIdentifier);
		}
	}
}