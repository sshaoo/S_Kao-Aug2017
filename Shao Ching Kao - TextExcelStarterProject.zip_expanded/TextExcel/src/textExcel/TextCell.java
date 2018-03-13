package textExcel;

public class TextCell implements Cell {
	
	private String input;
	
	public String abbreviatedCellText() {
		return null;
	}
	
	public String fullCellText() {
		return "\"" + input + "\"";
	}
}
