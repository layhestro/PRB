package util;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
class TableauStringTests {
	
	String[] a = {"un", "deux", "trois"};
	String b = "zéro";
	String[] c = {"zéro", "un", "deux", "trois"};
	String[] d = {"zéro", "un", "trois"};
	
	@Test
	void ajouterElementTest() {
		assertArrayEquals(c, TableauString.ajouterElement(a, b));
	}
	
	@Test
	void supprimerElementTest() {
		assertArrayEquals(d, TableauString.supprimerElement(c, 2));
	}
	
	
}
