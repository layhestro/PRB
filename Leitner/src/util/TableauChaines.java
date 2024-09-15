package util;

public class TableauChaines {
	public static String[] ajouterElement(String[] t, String element) {
		
		String[] buffer = new String[t.length + 1];
		int i;
		for (i = 0; i < t.length; i++) {
			buffer[i] = t[i];
		}
		buffer[i] = element;
		
		return buffer;
	}
	
	public static String[] supprimerElement(String[] t) {
		String[] buffer = new String[t.length - 1];
		for (int i = 1; i < t.length; i++) {
			buffer[i-1] = t[i];
		}
		return buffer;
	}
}
