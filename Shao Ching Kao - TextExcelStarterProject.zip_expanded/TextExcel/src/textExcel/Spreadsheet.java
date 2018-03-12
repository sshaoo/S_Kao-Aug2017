/*
 * Shao Ching Kao
 * Ms.Dreyer
 * 1st Period Computer Science
 * March 11th, 2018
 */
package textExcel;

// Update this file with your own code.

public class Spreadsheet implements Grid {
	
		private Cell[][] arrayOfCells = new Cell[20][12];
		
	@Override
	public String processCommand(String command) {
		return "";
	}

	@Override
	public int getRows() {
		return 20;
	}

	@Override
	public int getCols() {
		return 12;
	}

	@Override
	public Cell getCell(Location loc) {
		return null;
	}

	@Override
	public String getGridText() {
		return null;
	}

}
