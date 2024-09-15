package cardgame;

public class Attack extends Card {
	
	private int attackDmg;
	
	public Attack(String nameOfCard, int attackDmg) {
		super(nameOfCard);
		this.attackDmg = attackDmg; 
	}
	
}
