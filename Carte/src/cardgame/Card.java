package cardgame;

public class Card {
	
	private static int number;
	private String nameOfCard;
	private String description;
	
	public Card(String nameOfCard) {
		this.number = number++;
		this.nameOfCard = nameOfCard;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getDescription() {
		return description;
	}
	
	public String getnameOfCard() {
		return nameOfCard;
	}
	
	public static int getNumber() {
		return number;
	}
	
}
