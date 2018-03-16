/*
 * Shao Ching Kao
 * Ms.Dreyer
 * 1st Period Computer Science
 * March 11th, 2018
 */
package textExcel;

public class EmptyCell implements Cell {
	public String abbreviatedCellText() {
		return "          ";
	}
	public String fullCellText() {
		return "";
	}
}
