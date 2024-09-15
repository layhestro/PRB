package slam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class SlamTests {
	
	String[] mots = {"UN", "DEUX", "TROIS", "QUATRE"};
	String[] coords = {"3F", "F1", "D2", "2A"};
	String nMot = "AROI";
	String nPos = "D1";
	
	
	@Test
	void test() {
		Grille.afficherGrille(mots, coords);
		assertTrue(Slam.estCompatible(mots, coords, nMot, nPos));
	}

}
