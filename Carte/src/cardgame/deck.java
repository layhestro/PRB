package cardgame;

import java.util.HashMap;
import java.util.Map;

public class deck {
	
	private String nameOfDeck;
	private Map<String, Card> deckOfCards;
	
	public deck(String name) {
		this.nameOfDeck = name;
		deckOfCards = new HashMap<>();
	}
	
	public void addCard(Card card) {
		deckOfCards.put(card.getnameOfCard(), card);
	}
	
	public void removeCard(String nameOfCard) {
		deckOfCards.remove(nameOfCard);
	}
}
