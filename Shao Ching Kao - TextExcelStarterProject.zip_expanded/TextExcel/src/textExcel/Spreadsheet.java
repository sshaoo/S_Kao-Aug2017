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
	
	public Spreadsheet() {
		for (int i = 0; i < getRows(); i++) {
			for (int j = 0; j < getCols(); j++) {
				arrayOfCells[i][j] = new EmptyCell();
			}
		}	
	}
		
	public String processCommand(String command) {
		String[] commandSplit = command.split(" ");
		if (commandSplit[0].length() == 0) {
			return "";
		}
		if (commandSplit.length == 1) {
			return getCell(new SpreadsheetLocation(command)).fullCellText();
		}
		else if (commandSplit[1].equals("=")) {
			Location newSpreadsheetOne = new SpreadsheetLocation(commandSplit[0]);
			arrayOfCells[newSpreadsheetOne.getRow()][newSpreadsheetOne.getCol()] = new TextCell(commandSplit[2]);
			return getGridText();
		}
		else if (commandSplit[0].toLowerCase().equals("clear")) {
			for (int i = 0; i < getRows(); i++) {
				for (int j = 0; j < getCols(); j++) {
					arrayOfCells[i][j] = new EmptyCell();
				}
			}
			return getGridText();
		}
		else if (commandSplit[0].toLowerCase().startsWith("clear ")) {
			Location newSpreadsheetTwo = new SpreadsheetLocation(commandSplit[commandSplit.length - 1]);
			arrayOfCells[newSpreadsheetTwo.getRow()][newSpreadsheetTwo.getCol()] = new EmptyCell();
			return getGridText();
		}
		return "";
	}

	public int getRows() {
		return 20;
	}

	public int getCols() {
		return 12;
	}
 
	public Cell getCell(Location loc) {
		return arrayOfCells[loc.getRow()][loc.getCol()];
	}

	public String getGridText() {
		String spreadsheet = "   ";
		for(int i = 0; i < getCols(); i++) {
			spreadsheet += ("|" + (char) (i + 'A') + "         ");
		}
		spreadsheet += "|\n";
		for(int i = 1; i <= getRows(); i++) {
			if (i < 10) {
				spreadsheet += i + "  ";
			}
			else {
				spreadsheet += i + " ";
			}
			for (int j = 0; j < getCols(); i++) {
				spreadsheet += "|" + arrayOfCells[i - 1][j].abbreviatedCellText();
			}
			spreadsheet += "|\n";
		}
		return spreadsheet;
	}
}
