/*
 * Shao Ching Kao
 * Ms.Dreyer
 * 1st Period Computer Science
 * March 11th, 2018
 */
package textExcel;

public class ValueCell extends RealCell {
	
	public ValueCell(String input) {
		super(input);
	}
	
	public String abbreviatedCellText() {
		String answer = "" + getDoubleValue();
		if (answer.length() > 10) { // tests if the answer 
			return answer.substring(0, 10);
		}
		else {
			for(int i = answer.length(); i < 10; i++) {
				answer += " ";
			}
			return answer;
		}
	}

	public String fullCellText() {
		return getInput();
	}

	public double getDoubleValue() {
		return Double.parseDouble(getInput());
	}
}