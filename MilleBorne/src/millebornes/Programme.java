package millebornes;

import util.TableauString;

public class Programme {
	public static void main(String[] args) {
		String[] c = {"zéro", "un", "deux", "trois","quatre", "cinq",
				"six", "sept", "huit", "neuf"};
		
		for (String string : c) {
			System.out.println(string);
		}
		TableauString.melanger(c);
		for (String string : c) {
			System.out.println(string);
		}
	}
}
