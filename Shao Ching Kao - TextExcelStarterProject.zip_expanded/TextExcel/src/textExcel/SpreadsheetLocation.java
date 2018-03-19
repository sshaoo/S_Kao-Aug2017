/*
 * Shao Ching Kao
 * Ms.Dreyer
 * 1st Period Computer Science
 * March 11th, 2018
 */
package textExcel;

// Update this file with your own code.

public class SpreadsheetLocation implements Location {
	
	private String cellName;
	private int row;
	private int column;
	
	public SpreadsheetLocation(String cellName) {
		this.cellName = cellName;
		String number = cellName.substring(1);
		char letter = cellName.toUpperCase().charAt(0);
    		row = Integer.parseInt(number) - 1;
    		column = Character.toUpperCase(letter) - 'A'; 
    }

    @Override
    public int getRow() {
        return row;
    }

    @Override
    public int getCol() {
        return column;
    }
}