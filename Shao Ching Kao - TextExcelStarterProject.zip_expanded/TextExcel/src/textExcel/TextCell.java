package textExcel;

public class TextCell implements Cell {
	
	private String input;
	
	public TextCell (String text) {
		this.input = input.substring(1, input.length() - 1);
	}
	
	public String abbreviatedCellText() {
		if (input.length() > 10) {
			return input.substring(0, 10);
		}
		String spaces = "";
		for(int i = 0; i < (10 - input.length()); i++) {
			input += " ";
		}
		return input ;
	}

	public String fullCellText() {
		return "\"" + input + "\"";
	}
}