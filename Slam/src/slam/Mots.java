package slam;

public class Mots {
	/**
	 * Cree un tableau de String avec des * a la place de chaque lettre de chaque mot du tableau source.
	 * @param mots : un tableau de chaine qui contient les mots.
	 * @return La reference de mon nouveau tableau de String
	 */
	public static String[] genererMotsAsterisques(String[] mots) {
		String[] motCache = new String[mots.length];
		String toFillString = "*";
		for (int i = 0; i < mots.length; i++) {
			motCache[i] = toFillString.repeat(mots[i].length());
		}
		
		return motCache;
	}
	
	/**
	 * Cree un String on une * a ete remplace par la lettre
	 * @param motJoueur : String avec les lettres a reveler
	 * @param motSolution : String du mot complet
	 * @param lettre : lettre a reveler
	 * @return reference d'un String avec * remplace par la lettre si possible
	 */
	public static String revelerLettre(String motJoueur,String motSolution, char lettre) {
		char[] motReveler = new char[motJoueur.length()];
		for (int i = 0; i < motJoueur.length(); i++) {
			if (motSolution.charAt(i) == lettre)
				motReveler[i] = lettre;
			else
				motReveler[i] = motJoueur.charAt(i);
		}
		
		return String.valueOf(motReveler);
	}
	
	/**
	 * reference d'un tableau String avec * remplacee par la lettre si possible
	 * @param motsJoueur : un tableau de string avec les lettres a reveler
	 * @param motsSolution : un tableau de string des mots complets
	 * @param lettre : lettre a reveler
	 * @return reference d'un tableau String avec * remplace par la lettre si possible
	 */
	public static String[] revelerLettre(String[] motsJoueur, String[] motsSolution, char lettre) {
		String[] tabMotReveler = new String[motsJoueur.length];
		for (int i = 0; i < motsJoueur.length; i++) {
			tabMotReveler[i] = revelerLettre(motsJoueur[i], motsSolution[i], lettre);
		}

		return tabMotReveler;
	}
	
	/**
	 * true si le tableau n'a pas * sinon false
	 * @param motsJoueur : un tableau de chaine qui contient les mots.
	 * @return true si le tableau n'a pas * sinon false
	 */
	public static boolean motsComplets(String[] motsJoueur) {
		
		for (int i = 0; i < motsJoueur.length; i++) {
			if (motsJoueur[i].indexOf("*") != -1)
				return false;
		}
		return true;
	}
}
