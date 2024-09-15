package util;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TableauChainesTests {
	String[] buffer1 = {"un", "deux", "trois"};
	String buffer2 = "quatre";
	String[] buffer3 = {"un", "deux", "trois", "quatre"};
	String[] buffer4 = {"deux", "trois"};
	
	@Test
	void ajouterTest() {
		assertArrayEquals(buffer3, TableauChaines.ajouterElement(buffer1, buffer2));
	}
	
	@Test
	void supprimerTest() {
		assertArrayEquals(buffer4, TableauChaines.supprimerElement(buffer1));
	}
	

}
