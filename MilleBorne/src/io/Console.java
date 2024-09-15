package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Cette classe propose diff�rents fonctions permettant de r�aliser
 * l'acquisition d'une donn�e au format appropri�.
 *
 * @author Arnaud Comblin
 * @version 1.2
 */
public class Console {

	private static BufferedReader lecteur = new BufferedReader(new InputStreamReader(System.in));

	private static LinkedBlockingQueue<String> saisies = new LinkedBlockingQueue<String>();
	
	public static int compteurSaisiesSimulees = 0;

	/**
	 * R�cup�re la saisie de l'utilisateur au format String.
	 * 
	 * @return une cha�ne de caract�re.
	 * @since 1.0
	 */
	public static String lireString() {
		String resultat = null;
		try {
			if (saisies.isEmpty()) {
				resultat = lecteur.readLine();
			} else {
				resultat = saisies.remove();
				System.out.println(resultat);
				compteurSaisiesSimulees++;
			}
		} catch (IOException e) {
			System.err.println("Erreur dans Console.lireString");
		}
		return resultat;
	}

	/**
	 * R�cup�re la saisie de l'utilisateur au format char.
	 * 
	 * @return le premier caract�re de la saisie si elle en contient au moins un,
	 *         '\0' dans le cas contraire.
	 * @since 1.1
	 */
	public static char lireChar() {
		char resultat = '\0';
		try {
			resultat = lireString().charAt(0);
		} catch (StringIndexOutOfBoundsException e) {
			System.err.println("Erreur dans Console.lireChar");
		}
		return resultat;
	}

	/**
	 * R�cup�re la saisie de l'utilisateur au format int.
	 * 
	 * @return un entier si la valeur saisie repr�sente un entier compris entre
	 *         -2^31 et 2^31-1, 0 dans le cas contraire.
	 * @since 1.0
	 */
	public static int lireInt() {
		int resultat = 0;
		try {
			resultat = Integer.parseInt(lireString());
		} catch (NumberFormatException e) {
			System.err.println("Erreur dans Console.lireInt");
		}
		return resultat;
	}

	/**
	 * R�cup�re la saisie de l'utilisateur au format long.
	 * 
	 * @return un entier si la valeur saisie repr�sente un entier compris entre
	 *         -2^63 et 2^63-1, 0 dans le cas contraire.
	 * @since 1.0
	 */
	public static long lireLong() {
		long resultat = 0l;
		try {
			resultat = Long.parseLong(lireString());
		} catch (NumberFormatException e) {
			System.err.println("Erreur dans Console.lireLong");
		}
		return resultat;
	}

	/**
	 * R�cup�re la saisie de l'utilisateur au format float.
	 * 
	 * @return un r�el si la valeur saisie repr�sente une valeur num�rique, 0 dans
	 *         le cas contraire.
	 * @since 1.0
	 */
	public static float lireFloat() {
		float resultat = 0f;
		try {
			resultat = Float.parseFloat(lireString());
		} catch (NumberFormatException e) {
			System.err.println("Erreur dans Console.lireFloat");
		}
		return resultat;
	}

	/**
	 * R�cup�re la saisie de l'utilisateur au format double.
	 * 
	 * @return un r�el si la valeur saisie repr�sente une valeur num�rique, 0 dans
	 *         le cas contraire.
	 * @since 1.0
	 */
	public static double lireDouble() {
		double resultat = 0.;
		try {
			resultat = Double.parseDouble(lireString());
		} catch (NumberFormatException e) {
			System.err.println("Erreur dans Console.lireDouble");
		}
		return resultat;
	}

	/**
	 * Ajoute les cha�nes de caract�res � consid�rer comme les prochaines saisies de
	 * l'utilisateur. Lorsqu'une fonction de lecture de la classe Console est
	 * ex�cut�e, elle consomme en priorit� ces cha�nes de caract�res, et ce, par
	 * ordre d'ajout (FIFO).
	 * 
	 * @param saisies
	 *            les cha�nes de caract�res se substituant aux saisies de
	 *            l'utilisateur.
	 * @throws IllegalArgumentException
	 *             - si une r�f�rence null est fournie en tant que saisie.
	 * @since 1.2
	 */
	public static void simulerSaisies(String... saisies) {
		for (String saisie : saisies) {
			try {
				Console.saisies.add(saisie);
			} catch (NullPointerException e) {
				throw new IllegalArgumentException("Seule une cha�ne de caract�res est admise en tant que saisie, pas la r�f�rence null !");
			}
		}
	}

	/**
	 * Supprime toutes les cha�nes de caract�res se substituant aux saisies de
	 * l'utilisateur.
	 * 
	 * @since 1.2
	 */
	public static void nettoyerSaisies() {
		saisies.clear();
		compteurSaisiesSimulees = 0;
	}

}
