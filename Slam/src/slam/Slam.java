package slam;

import java.util.regex.Pattern;
import io.Console;

public class Slam {
	public static void main(String[] args) {
		// 1er exemple -----------------------
		//String[] mots = {"UN", "DEUX", "TROIS", "QUATRE"};
		//String[] coords = {"3F", "F1", "D2", "2A"};
		
		String[] mots2 =   {"PETILLANT", "POMPISTE", "ECRIRE", "PANNEAU", "TRANCHER", "LIBELLER", "BREVE", "HALLE",
							"AMEUTE",    "TRESOR",   "LITHO"};
		String[] coords2 = {"A1",		 "1A", 		 "H1", 	   "D1",	  "3A"      , "5A",       "C5",	   "F3",
							"7A",        "9A",       "E5"};
		
		Grille.afficherGrille(mots2, coords2);
		System.out.println();
		
		String[] motAste = Mots.genererMotsAsterisques(mots2);
		Grille.afficherGrille(motAste, coords2);
		
		char lettre;
		boolean error = false;
		do {
			if (error) {
				error = false;
				System.out.println("! Erreur a la saisie !");
			}
			System.out.println("Lettre a reveler : ");
			
			lettre = Console.lireChar();
			if (!Pattern.matches("^[A-Z]$", Character.toString(lettre))) 
				error = true;
			else 
				motAste = Mots.revelerLettre(motAste, mots2, lettre);
			
			Grille.afficherGrille(motAste, coords2);
		} while (!Mots.motsComplets(motAste));
	}
}
