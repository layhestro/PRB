package battle;

import io.Console;

public class Grid {
	
	public static char[][] creerGrille(int taille, char car) {
		char[][] myGrid = new char[taille][taille];
		for (int i = 0; i < taille; i++) {
			for (int j = 0; j < taille; j++) {
				myGrid[i][j] = car;
			}
		}
		
		return myGrid;
	}
	
	public static String lirePosition() {
		 boolean error = false;
		 String position; 
		 do {
			if (error)
				error = false;
			position = Console.lireString();
			String regex = "^[a-zA-Z]\\d{1,2}$";
			if (!java.util.regex.Pattern.matches(regex, position)) {
				error = true;
				System.out.println("erreur saisie invalide, recommencer !");
			}
			if (error == false && (Integer.parseInt(position.substring(1)) < 1 || Integer.parseInt(position.substring(1)) > 26)) {
				System.out.println("numero de colone hors ensemble, recommencer !");
				error = true;
			}	
		} while (error);
		 
		return position;
	}
	
	public static int[] enCoord2D(String position) {
		int[] positionArray = new int [2];
		positionArray[0] = Character.getNumericValue(position.charAt(0) - 17);
		positionArray[1] = Integer.parseInt(position.substring(1)) - 1;
		
		return positionArray;
	}
	
	public static void afficher(char[][] grille) {
		int taille = grille.length;
		
	}
	
}
