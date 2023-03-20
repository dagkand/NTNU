package oving4;

import java.util.ArrayList;

public class CardDeck {

	private ArrayList<Card> cards = new ArrayList<Card>();
	private int cardCount;
	
	public CardDeck(int n){
		for(int i = 0; i < n; i++){
			this.cards.add(new Card('S', i+1));
			this.cardCount ++;
		}
		for(int i = 0; i < n; i++){
			this.cards.add(new Card('H', i+1));
			this.cardCount ++;
		}
		for(int i = 0; i < n; i++){
			this.cards.add(new Card('D', i+1));
			this.cardCount ++;
		}
		for(int i = 0; i < n; i++){
			this.cards.add(new Card('C', i+1));
			this.cardCount ++;
		}
	}
	
	public int getCardCount(){
		return this.cardCount;
	}

	public Card getCard(int n){
		if(n > this.getCardCount()){
			throw new IllegalArgumentException("You do not have that many cards!");
		}
		return this.cards.get(n);
	}
	
	public void deal(CardHand hand, int n){
		for(int i = 0; i < n; i++){
			Card card = this.getCard(this.cards.size()-1);
			this.cards.remove(card);
			this.cardCount --;
			hand.addCard(card);
		}
	}
	
	public void shufflePerfectly(){
		int midten = this.getCardCount()/2;
		for(int i = 0; i < midten; i++){
			this.cards.add(this.getCard(0));
			this.cards.remove(0);
			this.cards.add(this.getCard(midten-(i+1)));
			this.cards.remove(midten-(i+1));
		}
	}
}