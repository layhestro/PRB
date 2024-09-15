package slam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class GrillTests {
	
	String[] mots = {"UN", "DEUX", "TROIS", "QUATRE"};
	String[] coords = {"3F", "F1", "D2", "2A"};
	char[][] grille = 
	   {
		{'\0', '*' , '\0', '\0', '\0', '\0'},
		{'\0', 'U' , '\0', '\0', '\0', '\0'},
		{'\0', 'A' , '\0', '\0', '\0', '\0'},
		{'\0', 'T' , '*' , 'O' , 'I' , 'S' },
		{'\0', '*' , '\0', '\0', '\0', '\0'},
		{'D' , 'E' , 'U' , '*' , '\0', '\0'},
		{'\0', '\0', 'N' , '\0', '\0', '\0'}
	};
	
	@Test
	void largeurGrilleTest() {
		assertEquals(6, Grille.largeurGrille(mots, coords));
		assertNotEquals(8, Grille.largeurGrille(mots, coords));
	}
	
	@Test
	void hauteurGrilleTest() {
		assertEquals(7, Grille.hauteurGrille(mots, coords));
		assertNotEquals(2, Grille.largeurGrille(mots, coords));
	}
	
	@Test
	void enGrilleDeCaracteresTest() {
		String[] mots1 = {"UN", "DEU*", "T*OIS", "*UAT*E"};
		assertArrayEquals(grille, Grille.enGrilleDeCaracteres(mots1, coords));
		
		String[] mots2 = {"UN", "*EU*", "**OIS", "*UA**E"};
		char[][] grille2 = 
			   {
				{'\0', '*' , '\0', '\0', '\0', '\0'},
				{'\0', 'U' , '\0', '\0', '\0', '\0'},
				{'\0', 'A' , '\0', '\0', '\0', '\0'},
				{'\0', '*' , '*' , 'O' , 'I' , 'S' },
				{'\0', '*' , '\0', '\0', '\0', '\0'},
				{'*' , 'E' , 'U' , '*' , '\0', '\0'},
				{'\0', '\0', 'N' , '\0', '\0', '\0'}
			};
		assertArrayEquals(grille2, Grille.enGrilleDeCaracteres(mots2, coords));
	}
	


}
