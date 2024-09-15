package battle;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


class FleetTests {
	
	int[][] aFleet = {{5, 9, 3, 1}, {3, 1, 4, 0}};
	
	@Test
	void testAddAShip() {
		int[] aShip = {1, 6, 5, 1};
		int[][] biggerFleet = {{5, 9, 3, 1}, {3, 1, 4, 0}, {1, 6, 5, 1}};
		assertArrayEquals(biggerFleet, Fleet.addAShipToMyFleet(aFleet, aShip));
	}
	
	@Test
	void testAddAWrongShip() {
		int[] notAShip1 = {1, 6, 5};
		int[] notAShip2 = {10, 5, 1, 6, 5};
		assertArrayEquals(aFleet, Fleet.addAShipToMyFleet(aFleet, notAShip1));
		assertArrayEquals(aFleet, Fleet.addAShipToMyFleet(aFleet, notAShip2));
	}
	
	@Test
	void testAddANullShip() {
		int[] notAShip1 = null;
		assertArrayEquals(aFleet, Fleet.addAShipToMyFleet(aFleet, notAShip1));
	}
	
	@Test
	void testHitAShip() {
		int[] aShoot = {3, 2};
		int[] aShip = aFleet[1];
		assertTrue(Fleet.hitAShip(aShip, aShoot));
		assertTrue(Fleet.hitAShip(aFleet, aShoot));
	}
	
	@Test
	void testDoesNotHitAShip() {
		int[] aShoot = {4, 1};
		int[] aShip = aFleet[1];
		assertFalse(Fleet.hitAShip(aShip, aShoot));
		assertFalse(Fleet.hitAShip(aFleet, aShoot));
	}
	
	
}
