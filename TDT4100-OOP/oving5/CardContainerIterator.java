package oving5;

import java.util.Iterator;

public class CardContainerIterator implements Iterator<Card>{
	
	private Iterator<Card> iterator;
	
	public CardContainerIterator(CardContainer iterator){
		this.iterator = iterator.cardList().iterator();
	}

	@Override
	public boolean hasNext() {
		return iterator.hasNext();
	}

	@Override
	public Card next() {
		return iterator.next();
	}
}