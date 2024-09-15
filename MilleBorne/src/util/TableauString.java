package util;

public class TableauString {
	
	public static String[] ajouterElement(String[] t, String element) {
		
		String[] newTab = new String[t.length+1];
		for (int i = 1; i < newTab.length; i++) {
			newTab[i] = t[i-1];
		}
		newTab[0] = element;

		return newTab;
	}
	
	public static String[] supprimerElement(String[] t, int position) {
		
		String[] newTab = new String[t.length-1];
		int j = 0;
		for (int i = 0; i < newTab.length; i++) {
			if (i == position)
				j++;
			newTab[i] = t[j];
			j++;
		}

		return newTab;
	}
	
	public static void permuter(String[] t, int i, int j) {
		String buffer = t[i];
		t[i] = t[j];
		t[j] = buffer;
	}
	
	public static void melanger(String[] t) {
		for (int i = 0; i < t.length; i++) {
			int random = (int) Math.rint(Math.random()* (t.length-1));
			System.out.println(random);
			permuter(t, i, random);
		}
	}
}
