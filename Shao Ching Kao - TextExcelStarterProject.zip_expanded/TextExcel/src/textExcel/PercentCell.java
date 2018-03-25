/*
 * Shao Ching Kao
 * Ms.Dreyer
 * 1st Period Computer Science
 * March 11th, 2018
 */
package textExcel;

public class PercentCell extends RealCell {

	public PercentCell(String input) {
		super(input);
	}

	public String abbreviatedCellText() {
		String[] answer = getInput().split("\\.");
		String spaces = "";
		for (int i = answer[0].length(); i < 9; i++) {
			spaces += " ";
		}
		return answer[0] + "%" + spaces;		
	}

	public String fullCellText() {
		return "" + getDoubleValue();
	}

	public double getDoubleValue() {
		String decimalAnswer = "" + getInput().substring(0, getInput().length() - 1);
		return Double.parseDouble(decimalAnswer) * .01;
	}
}
