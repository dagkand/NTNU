package oving4;

import java.util.ArrayList;

public class CardHand {
	
	private ArrayList<Card> cards = new ArrayList<Card>();
	private int cardCount;
	
	public CardHand(){
	}
	
	public int getCardCount(){
		return this.cardCount;
	}
	

	public Card getCard(int n){
		if(n > this.getCardCount()){
			throw new IllegalArgumentException("Not enough cards in the deck");
		}
		return this.cards.get(n);
	}
	
	public void addCard(Card card){
		this.cards.add(card);
		this.cardCount ++;
	}
	
	public Card play(int n){
		if(n > this.getCardCount()){
			throw new IllegalArgumentException("Not enough cards in the deck");
		}
		Card temp = this.cards.get(n);
		this.cards.remove(n);
		this.cardCount --;
		return temp;
	}
}