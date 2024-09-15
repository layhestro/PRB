package millebornes;

import util.TableauString;

public class MilleBornes {
	
	public static String[] constituerJeuDeCartes(String[] cartes, int[] quantites) {
		String[] deck = new String[0];
		for (int i = 0; i < quantites.length; i++) {
			for (int j = 0; j < quantites[i]; j++) {
				deck = TableauString.ajouterElement(deck, cartes[i]);
			}
		}
		return deck;
	}
}
