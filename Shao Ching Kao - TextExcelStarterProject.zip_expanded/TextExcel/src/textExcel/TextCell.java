package textExcel;

public class TextCell implements Cell {
	
	private String input;
	
	public String abbreviatedCellText() {
		if (input.length() < 10) {
			int numberOfSpaces = 10 - input.length();
			String spaces = null;
			for (int i = 0; i < numberOfSpaces; i++) {
				spaces += " ";
			}
			return input + spaces;
		}
	}
	
	public String fullCellText() {
		return "\"" + input + "\"";
	}
}