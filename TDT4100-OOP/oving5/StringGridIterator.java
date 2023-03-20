package oving5;

import java.util.*;

public class StringGridIterator implements Iterator<String> {

	private StringGrid grid;
	private int row;
	private int column;
	private boolean rowMajor;
	
    public StringGridIterator(StringGrid grid, boolean rowMajor){
		this.grid = grid;
		this.rowMajor = rowMajor;
		this.row = 0;
		this.column = 0;
	}

	public boolean hasNext() {
		if(rowMajor){
			if(this.row == this.grid.getRowCount()-1 && this.column == this.grid.getColumnCount()){
                return false;}
			else{ 
                return true;}			
		}
		else{
			if(this.row == this.grid.getRowCount() && this.column == this.grid.getColumnCount()-1){
                return false;}
			else{ 
                return true;}			
		}
	}

	public String next() {
		if(!rowMajor){
			if(this.row != this.grid.getRowCount()){
				row ++;
				return grid.getElement(row-1, column);
			}
			else{
				row = 1;
				column ++;
				return grid.getElement(row-1, column);
			}
		}
		else{
			if(this.column != this.grid.getColumnCount()){
				column ++;
				return grid.getElement(row, column-1);
			}
			else{
				column = 1;
				row ++;
				return grid.getElement(row, column-1);
			}			
		}
	}
	
	public void remove(){
		throw new UnsupportedOperationException("Insufficent");
	}
}