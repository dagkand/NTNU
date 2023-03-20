package oving5;

import java.util.*;

public class CardHand implements CardContainer{
	
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

	public Iterator<Card> iterator() {
		return cards.iterator();
	}

	@Override
	public ArrayList<Card> cardList() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'cardList'");
	}
}