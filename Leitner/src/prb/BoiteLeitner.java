package prb;

import io.Console;
import util.TableauChaines;

public class BoiteLeitner {
	
	public static final char SEP = ';';
	static void ajouterCarte(String[][] boite, int numeroNiveau, String carte) {
		boite[numeroNiveau-1] = TableauChaines.ajouterElement(boite[numeroNiveau-1], carte);
	}
	
	public static void ajouterCarte(String[][] boite,  String question, String reponse) {
		boite[0] = TableauChaines.ajouterElement(boite[0], question.concat(Character.toString(SEP)).concat(reponse));
	}
	
	static String extraireQuestion(String carte) {
		return carte.substring(0, carte.indexOf(SEP));
	}
	
	static String extraireReponse(String carte) {
		return carte.substring(carte.indexOf(SEP));
	}
	
	public static void reviser(String[][] boite, int numeroNiveau) {
		
	}
	
}
