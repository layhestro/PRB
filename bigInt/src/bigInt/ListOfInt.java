package bigInt;

import java.util.ArrayList;
import java.util.List;

public class ListOfInt {
	private List<BigInt> myList;
	
	public ListOfInt() {
		myList = new ArrayList<>();
	}
	
	public void addInt(BigInt toAdd) {
		myList.add(toAdd);
	}
	
	public void removeLastInt() {
		myList.remove(myList.size());
	}
	
	
}
