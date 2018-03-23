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
		Integer.parseInt(input);
	}
	
	public String abbreviatedCellText() {
		return null;
	}

	public String fullCellText() {
		return null;
	}

	public double getDoubleValue() {
		return 0;
	}
}
