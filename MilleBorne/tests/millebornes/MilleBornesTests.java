package millebornes;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class MilleBornesTests {
	
	String[] cartes = {"Joker", "As", "Roi"};
	int[] quantites = {2,  0,  4};
	String[] resultat = {"Joker", "Joker", "Roi", "Roi", "Roi", "Roi"};
	
	@Test
	void test() {
		assertEquals(resultat, MilleBornes.constituerJeuDeCartes(cartes, quantites));
	}

}
