package oving4;

public class Card {
    	
	private char color;
	private int value;
	
	public Card(char color, int value){
		if(checkCard(color, value)){
			this.color = color;
			this.value = value;
		}
		else{
			throw new IllegalArgumentException("Color must be S, H, D, or C. Card value is between 1 and 13.");
		}
	}
	
	private boolean checkCard(char color, int value){
		return (color == 'S' || color == 'H' || color == 'D' || color == 'C') && (value > 0 && value < 14);
	}
	
	public char getSuit(){
		return this.color;
	}

	public int getFace(){
		return this.value;
	}
	
	public String toString(){
		String type = Character.toString(this.getSuit());
		String number = Integer.toString(this.getFace());
		return (type + number);
	}
}
