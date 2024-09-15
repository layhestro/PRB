package battle;

public class Fleet {
	
	public static int[][] addAShipToMyFleet(int[][] myFleet, int[] myShip) {
		
		if (myShip == null || myShip.length != 4) 
			return myFleet;
		
		int[][] myNewFleet = new int[myFleet.length+1][];
		int count;
		
		for (count = 0; count < myFleet.length; count++) {
			myNewFleet[count] = myFleet[count];
		}
		myNewFleet[count] = myShip;
		
		return myNewFleet;
	}
	
	public static boolean hitAShip(int[] myShip, int[] myShoot) {
		
		int shootIndiceLigne = myShoot[0];
		int shootIndiceRow = myShoot[1];
		
		int ligneShip = myShip[0];
		int rowShip = myShip[1];
		int lengthOfMyship = myShip[2];
		int orientationOfMyShip = myShip[3];

		if (orientationOfMyShip == 0) {
			if (ligneShip != shootIndiceLigne)
				return false;
			for (int i = 0; i < lengthOfMyship; i++) {
				if (shootIndiceRow == rowShip + i)
					return true;		
			}
		}
		else {
			if (rowShip != shootIndiceRow)
				return false;
			for (int i = 0; i < lengthOfMyship; i++) {
				if (shootIndiceLigne == rowShip + i)
					return true;
			}
		}
		
		return false;	
	}
	
	public static boolean hitAShip(int[][] myfleet, int[] myShoot) {		
		for (int[] ship : myfleet) {
			if(hitAShip(ship, myShoot))
				return true;
		}
		return false;
	}
	
}
