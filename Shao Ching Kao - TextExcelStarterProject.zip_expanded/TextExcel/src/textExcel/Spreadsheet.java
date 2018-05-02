/*
 * Shao Ching Kao
 * Ms.Dreyer
 * 1st Period Computer Science
 * March 11th, 2018
 */
package textExcel;

public class Spreadsheet implements Grid {
	
	private Cell[][] arrayOfCells = new Cell[getRows()][getCols()]; // private field
	
	public Spreadsheet() {
		for (int i = 0; i < getRows(); i++) {
			for (int j = 0; j < getCols(); j++) {
				arrayOfCells[i][j] = new EmptyCell(); // prints out a new spreadsheet
			}
		}	
	}
		
	public String processCommand(String command) {
		String[] commandSplit = command.split(" ", 3); // splits up the command into 3 parts if the user included space
		if (commandSplit[0].length() == 0) {
			return ""; // returns nothing if user inputs nothing
		}
		else if (command.contains("=")) {
			SpreadsheetLocation newSpreadsheetOne = new SpreadsheetLocation(commandSplit[0]); // locates the location of the cell called for
			if (commandSplit[2].startsWith("\"")) {	// if user wants to input a text, then this tests for whether they have quotes
				arrayOfCells[newSpreadsheetOne.getRow()][newSpreadsheetOne.getCol()] = new TextCell(commandSplit[2]);
			}
			else if (commandSplit[2].endsWith("%")) { // if user wants to input a percent, then this tests for whether they have the percent sign
				arrayOfCells[newSpreadsheetOne.getRow()][newSpreadsheetOne.getCol()] = new PercentCell(commandSplit[2]);	
			}
			else if (commandSplit[2].startsWith("(")) { // if user wants to input a formula, then this tests for whether they have parenthesis 
				arrayOfCells[newSpreadsheetOne.getRow()][newSpreadsheetOne.getCol()] = new FormulaCell(commandSplit[2], arrayOfCells);
			}
			else { // if user wants to input a numerical value, then this is the go-to if every other test does not fit
				arrayOfCells[newSpreadsheetOne.getRow()][newSpreadsheetOne.getCol()] = new ValueCell(commandSplit[2]);
			}
			return getGridText();
		}
		else if (commandSplit[0].toLowerCase().equals("clear") && commandSplit.length == 1) { // tests if the user wants to clear the whole spreadsheet
			for (int i = 0; i < getRows(); i++) {
				for (int j = 0; j < getCols(); j++) {
					arrayOfCells[i][j] = new EmptyCell(); // creates an empty spreadsheet
				}
			}
			return getGridText();
		}
		else if (commandSplit.length == 2) { // tests for whether it calls to clear one cell only
			SpreadsheetLocation newSpreadsheetTwo = new SpreadsheetLocation(commandSplit[1]);
			arrayOfCells[newSpreadsheetTwo.getRow()][newSpreadsheetTwo.getCol()] = new EmptyCell();
			return getGridText();
		}
		else { // analyze and prints the cell value inside
			return getCell(new SpreadsheetLocation(command)).fullCellText();
		}
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
		for(char i = 'A'; i <= 'L'; i++) { // for the columns
			spreadsheet += ("|" + i + "         ");
		}
		spreadsheet += "|\n";
		for(int i = 1; i <= getRows(); i++) { // for the rows
			if (i < 10) { // for the single digit values
				spreadsheet += i + "  ";
			}
			else { // for the double digit values
				spreadsheet += i + " ";
			}
			for (int j = 0; j < getCols(); j++) {
				spreadsheet += "|" + arrayOfCells[i - 1][j].abbreviatedCellText();
			}
			spreadsheet += "|\n";
		}
		return spreadsheet;
	}
}