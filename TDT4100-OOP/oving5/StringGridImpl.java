package oving5;

import java.util.*;

public class StringGridImpl implements StringGrid {

	private String[][] grid;
	private int rows;
	private int columnCount;
	
	public StringGridImpl(int rows, int columnCount){
		this.rows = rows;
		this.columnCount = columnCount;
		this.grid = new String[rows+1][columnCount+1];
	}
	
	public int getRowCount() {
		return this.rows;
	}

	public int getColumnCount() {
		return this.columnCount;
	}

	public String getElement(int row, int column) {
		return this.grid[row][column];
	}

	public void setElement(int row, int column, String element) {
		this.grid[row][column] = element;
	}
	
	public Iterator<String> iterator() {
		ArrayList<String> value = new ArrayList<String>();
		for(int n = 0; n <= this.rows; n++){
			for(int m = 0; m <= this.columnCount; m++){
				if(this.grid[n][m] != null){
					value.add(this.grid[n][m]);					
				}
			}
		}
		return value.iterator();
	}
}