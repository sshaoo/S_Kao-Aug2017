/*
 * Shao Ching Kao
 * Ms.Dreyer
 * 1st Period Computer Science
 * March 11th, 2018
 */
package textExcel;

public class TextCell implements Cell {
	
	private String input;
	
	public TextCell (String text) {
		input = text.substring(1, text.length() - 1);
	}
	
	public String abbreviatedCellText() {
		if (input.length() > 10) {
			return input.substring(0, 10);
		}
		else {
			String answer = input;
			for(int i = 0; i < (10 - input.length()); i++) {
				answer += " ";
			}
			return answer;
		}
	}
	
	public String fullCellText() {
		return "\"" + input + "\"";
	}
}