package util;

import io.Console;

public class Lecture {
	
	public static int lireEntierDansIntervalle(String message, int min, int max) {
		int level = 0;
		boolean error = false;
		do {
			if (error)
				System.out.println("erreur à l'encodage, veuillez recommencer");
			System.out.printf(message);
			level = Console.lireInt();
			if (level < min || level > max)
				error = true;
			else
				if (error)
					error = false;
		} while (error);
			
		return level;
	}
	
	public static String lireChaineNonVide(String message) {
		String buffer;
		boolean error = false;
		do {
			if (error)
				System.out.println("erreur à l'encodage, veuillez recommencer");
			System.out.printf(message);
			buffer = Console.lireString();
			if (buffer.isBlank())
				error = true;
			else {
				buffer = buffer.trim();
				if (error)
					error = false;
			}
		} while (error);
		
		return buffer;
	}
	
}
