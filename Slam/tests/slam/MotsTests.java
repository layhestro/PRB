package slam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MotsTests {
	String[] mots = {"UN", "DEUX", "TROIS", "QUATRE"};
	
	
	@Test
	void genererMotsAsterisquesTest() {
		String[] autreMots = {"**", "****", "*****", "******"};
		assertArrayEquals(autreMots, Mots.genererMotsAsterisques(mots));
	}
	
	@Test
	void revelerLettreTest() {
		String aString = "T***E**";
		String aString2 = "TA**EA*";
		String aString3 = "TABLEAU";
		char aChar = 'A';
		assertTrue(aString2.equals(Mots.revelerLettre(aString, aString3, aChar)));
	}
	
	@Test
	void tabRevelerLettreTest() {
		String[] wordStrings = {"UN", "DEU*", "T*OIS", "*UAT*E"};
		String[] wordStrings2 = {"UN", "DEU*", "TROIS", "*UATRE"};
		char aChar = 'R';
		assertArrayEquals(wordStrings2, Mots.revelerLettre(wordStrings, mots, aChar));
	}
	
	@Test 
	void motsCompletsTest() {
		String[] wordStrings = {"UN", "DEU*", "T*OIS", "*UAT*E"};
		assertFalse(Mots.motsComplets(wordStrings));
		assertTrue(Mots.motsComplets(mots));
	}

}
