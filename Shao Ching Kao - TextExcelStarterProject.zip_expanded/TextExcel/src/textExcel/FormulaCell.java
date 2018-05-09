/*
 * Shao Ching Kao
 * Ms.Dreyer
 * 1st Period Computer Science
 * March 11th, 2018
 */
package textExcel;

public class FormulaCell extends RealCell {
	
	private String input;
	private Cell[][] spreadsheet;
	
	public FormulaCell(String value, Cell[][] spreadsheet) {
		super(value);
		this.input = super.getInput();
		this.spreadsheet = spreadsheet;
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
		String inputSplit[] = getInput().substring(2, this.getInput().length() - 2).split(" ");
		double sum = 0.0;
		if (inputSplit[0].toUpperCase().equals("SUM") || inputSplit[0].toUpperCase().equals("AVG")) {
			String[] separatedInput = inputSplit[1].split("-");	
			int total = 0;
			for (char col = separatedInput[0].toLowerCase().charAt(0); col <= separatedInput[1].toLowerCase().charAt(0); col++) {
				for (int row = Integer.parseInt(separatedInput[0].substring(1)); row <= Integer.parseInt(separatedInput[1].substring(1)); row++) {
					String cell = "" + col + row;
					SpreadsheetLocation firstLocation = new SpreadsheetLocation (cell);
					sum += Double.parseDouble(spreadsheet[firstLocation.getRow()][firstLocation.getCol()].abbreviatedCellText());
					total++;
				}
			}
			if (inputSplit[0].toUpperCase().equals("AVG")) {
				return sum / total;
			}
			else if (inputSplit[0].toUpperCase().equals("SUM")) {
				return sum;
			}
		}
		if (inputSplit[0].charAt(0) >= 'A') {
			SpreadsheetLocation secondLocation = new SpreadsheetLocation(inputSplit[0]);
			sum = Double.parseDouble(spreadsheet[secondLocation.getRow()][secondLocation.getCol()].abbreviatedCellText());
		}
		else {
			sum = Double.parseDouble(inputSplit[0]);
		}
		for (int i = 1; i < inputSplit.length; i++) {
			double nextNum;
			if (inputSplit[i + 1].charAt(0) >= 'A') {
				SpreadsheetLocation thirdLocation = new SpreadsheetLocation(inputSplit[i + 1]);
				nextNum = Double.parseDouble(spreadsheet[thirdLocation.getRow()][thirdLocation.getCol()].abbreviatedCellText());
			}
			else {
				nextNum = Double.parseDouble(inputSplit[i + 1]);
			}
			if (inputSplit[i].equals("+")) {					
				sum += nextNum;
			}
			else if (inputSplit[i].equals("-")) {
				sum -= nextNum;
			}
			else if (inputSplit[i].equals("*")) {
				sum *= nextNum;		
			}
			else if (inputSplit[i].equals("/")) {
				sum /= nextNum;
			}	
			i++;
		}
		return sum;
	}
}