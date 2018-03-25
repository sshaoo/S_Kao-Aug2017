/*
 * Shao Ching Kao
 * Ms.Dreyer
 * 1st Period Computer Science
 * March 11th, 2018
 */
package textExcel;

public abstract class RealCell implements Cell {

	private String input;
	
	public RealCell(String input) {
		this.input = input;
	}

	public String getInput() {
		return input;
	}
	public abstract double getDoubleValue();
}
