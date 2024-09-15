package slam;

public class Coords {
	
	/**
	 * Savoir si un mot est horizontal.
	 * @param coords : une chaine au format "1 lettre 1 chiffre" ou "1 chiffre 1 lettre".
	 * @return un bool : true si la chaine commence par une lettre sinon return false.
	 */
	public static boolean sontHorizontales(String coords) {
		if (Character.isLetter(coords.charAt(0))) 
			return true;
		
		return false;
	}
	
	/**
	 * Converti la valeur alphabethique en l'indice de ligne voulu ([A,I] -> [0,9]).
	 * @param coords : une chaine au format "1 lettre 1 chiffre" ou "1 chiffre 1 lettre".
	 * @return un int : le numero de ligne.
	 */
	public static int indiceLigne(String coords) {
		int position = 0;
		if (!sontHorizontales(coords))
			position = 1;
		
		return Character.getNumericValue(coords.charAt(position)-17);
	}
	
	/**
	 * Converti en l'indice de colonne voulu (! colonne 1 -> indice 0).
	 * @param coords : une chaine au format "1 lettre 1 chiffre" ou "1 chiffre 1 lettre".
	 * @return un int : le numero de colonne.
	 */
	public static int indiceColonne(String coords) {
		int position = 0;
		if (sontHorizontales(coords))
			position = 1;
		
		return Character.getNumericValue(coords.charAt(position))-1;
	}
}
