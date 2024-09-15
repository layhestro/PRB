package slam;

public class Grille {
	
	/**
	 * Prend en compte la position de depart de chaque mot et la longueur de chaque mot
	 * pour connaitre la largeur maximum que la grille doit prendre.
	 * @param mots : un tableau de String qui contient les mots a placer.
	 * @param coords : un tableau de String qui contient les positions de la 1ere lettre.
	 * de chaque mot et l'orientation des mots. 
	 * @return un int : la largeur adapte au plus long mot de la grille.
	 */
	public static int largeurGrille(String[] mots, String[] coords) {
		int maximum = 1;
		int pointDeDepart = 0;
		int longeurDuMot = 0;
		String coordAConsidere;
		
		for (int i = 0; i < mots.length; i++) {
			coordAConsidere = coords[i];
			pointDeDepart = Coords.indiceColonne(coordAConsidere);
			
			if (!Coords.sontHorizontales(coords[i])) {
				if (pointDeDepart > maximum)
					maximum = pointDeDepart;
			}
			else {
				longeurDuMot = mots[i].length();
				if ((pointDeDepart + longeurDuMot) > maximum)
					maximum = pointDeDepart + longeurDuMot;
			}	
		}
		
		return maximum;
	}
	
	/**
	 * Prend en compte la position de depart de chaque mot et la longueur de chaque mot
	 * pour connaitre la hauteur maximum que la grille doit prendre.
	 * @param mots : un tableau de string qui contient les mots a placer.
	 * @param coords : un tableau de string qui contient les positions de la 1ere lettre 
	 * de chaque mot et l'orientation des mots. 
	 * @return un int : la hauteur adapte au plus long mot de la grille.
	 */
	public static int hauteurGrille(String[] mots, String[] coords) {
		int maximum = 1;
		int pointDeDepart = 0;
		int longeurDuMot = 0;
		String coordAConsidere;
		
		for (int i = 0; i < mots.length; i++) {
			coordAConsidere = coords[i];
			pointDeDepart = Coords.indiceLigne(coordAConsidere);
			
			if (Coords.sontHorizontales(coordAConsidere)) {
				if (pointDeDepart > maximum)
					maximum = pointDeDepart;
			}
			else {
				longeurDuMot = mots[i].length();
				if ((pointDeDepart + longeurDuMot) > maximum)
					maximum = pointDeDepart + longeurDuMot;
			}	
		}
		
		return maximum;
	}
	
	/**
	 * Cree un tableau de char a 2 dimensions qui contient les mots donnes en argument
	 * et places aux endroits donnes en argument.
	 * @param mots : un tableau de string qui contient les mots a placer.
	 * @param coords : un tableau de string qui contient les positions de la 1ere lettre 
	 * de chaque mot et l'orientation des mots. 
	 * @return un tableau de char a 2 dimension qui contient les mots donnes en argument
	 * et places aux endroits donnes en argument.
	 */
	public static char[][] enGrilleDeCaracteres(String[] mots,String[] coords) {
		int hauteur = hauteurGrille(mots, coords);
		int largeur = largeurGrille(mots, coords);
		char[][] grilleComplete = new char[hauteur][largeur];

		for (int i = 0; i < hauteur; i++) {
			for (int j = 0; j < largeur; j++) {
				grilleComplete[i][j] = '\0';
			}
		}
		
		for (int i = 0; i < mots.length; i++) {
			if (Coords.sontHorizontales(coords[i])) {
				for (int j = 0; j < mots[i].length(); j++) {
					grilleComplete[Coords.indiceLigne(coords[i])][Coords.indiceColonne(coords[i])+j] = mots[i].charAt(j);
				}
			}
			else {
				for (int j = 0; j < mots[i].length(); j++) {
					grilleComplete[Coords.indiceLigne(coords[i])+j][Coords.indiceColonne(coords[i])] = mots[i].charAt(j);
				}
			}
		}

		return grilleComplete;
	}
	
	/**
	 * Affiche ma grille avec des separateurs et les en-tetes de ligne et de colonne.
	 * @param grille : un tableau de char a 2 dimensions qui contient les mots donnes en argument.
	 * et places aux endroits donnes en argument.
	 */
	private static void afficherGrille(char[][] grille) {
		int hauteur = grille.length;
		int largeur = grille[0].length;
		
		String enteteColonne = "123456789";
		String sepLigne =   "  +-";
		String enteteLigne = "ABCDEFGH";
		String sepColonne = " | ";
		
		System.out.printf("    ");
		for (int i = 0; i < largeur; i++) {
			System.out.printf("%c ",enteteColonne.charAt(i));
		}
		System.out.println();
		System.out.print(sepLigne);
		for (int i = 0; i < largeur*2; i++) {
			System.out.printf("-");
		}
		System.out.println();
		
		for (int i = 0; i < hauteur; i++) {
			System.out.printf("%c",enteteLigne.charAt(i));
			System.out.print(sepColonne);
			for (int j = 0; j < largeur; j++) {
				System.out.printf("%c ", grille[i][j]);
			}
			System.out.println();
		}
	}
	
	/**
	 * Affiche ma grille avec des separateurs et les en-tetes de ligne et de colonne.
	 * @param mots : un tableau de chaine qui contient les mots a placer.
	 * @param coords : un tableau de string qui contient les positions de la 1ere lettre 
	 * de chaque mot et l'orientation des mots.
	 */
	public static void afficherGrille(String[] mots, String[] coords) {
		afficherGrille(enGrilleDeCaracteres(mots, coords));
	}
	
	
	
}
