package battle;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
import java.util.Arrays;

class GridTests {
	
	char[][] aGrid = {{' ', ' ', ' '}, {' ', ' ', ' '}, {' ', ' ', ' '}};
	
	@Test
	void creerGrilleTest() {
		char aChar = ' ';
		assertTrue(Arrays.deepEquals(aGrid, Grid.creerGrille(3, aChar)));
	}
	
	@Test
	void lirePositionTest() {
		String p1 = "A1";
		//assertEquals(p1, Grid.lirePosition());
	}
	
	
	@Test
	void enCoord2DTest() {
		int[] p1 = {3, 1};
		int[] p2 = {0, 0};
		
		assertArrayEquals(p1, Grid.enCoord2D("D2"));
		assertArrayEquals(p2, Grid.enCoord2D("A1"));
	}

}
