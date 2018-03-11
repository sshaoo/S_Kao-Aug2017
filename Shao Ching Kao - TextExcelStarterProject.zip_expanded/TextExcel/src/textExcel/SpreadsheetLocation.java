/*
 * Shao Ching Kao
 * Ms.Dreyer
 * 1st Period Computer Science
 * March 11th, 2018
 */
package textExcel;

//Update this file with your own code.

public class SpreadsheetLocation implements Location {
	
	private int row;
	private int column;
	
	public SpreadsheetLocation(String cellName) {
    		row = Integer.parseInt(cellName.substring(1)) - 1;
    		column = Character.toUpperCase(cellName.charAt(0)) - 'A';
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