package slam;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class CoordsTests {

	@Test
	void sontHorizontalesTest() {
		String aCoord = "A2";
		assertTrue(Coords.sontHorizontales(aCoord));
		
		String anotherCoord = "I9";
		assertTrue(Coords.sontHorizontales(anotherCoord));
	}
	
	@Test
	void neSontPasHorizontalesTest() {
		String aCoord = "2A";
		assertFalse(Coords.sontHorizontales(aCoord));
		
		String anotherCoord = "9I";
		assertFalse(Coords.sontHorizontales(anotherCoord));
	}
	
	@Test
	void indiceLigneTest() {
		String aCoord = "J2";
		String anotherCoord = "2A";
		assertEquals(9, Coords.indiceLigne(aCoord));
		assertNotEquals(8, Coords.indiceLigne(aCoord));
		
		assertEquals(0, Coords.indiceLigne(anotherCoord));
		assertNotEquals(1, Coords.indiceLigne(anotherCoord));
		
	}
	
	@Test
	void indiceColonneTest() {
		String aCoord = "J2";
		String anotherCoord = "8A";
		assertEquals(1, Coords.indiceColonne(aCoord));
		assertNotEquals(2, Coords.indiceColonne(aCoord));
		
		assertEquals(7, Coords.indiceColonne(anotherCoord));
		assertNotEquals(6, Coords.indiceColonne(anotherCoord));
	}

}
