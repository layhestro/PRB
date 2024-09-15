package bigInt;

public class BigInt {
	char signe;
	String number;

	public BigInt(char signe, String number) {
		this.signe = signe;
		this.number = number;
	}
	
	public String getBigInterger() {
		return Character.toString(signe).concat(number);
	}
	
	public String getNumber() {
		return number;
	}
	
	public char getSigne() {
		return signe;
	}
}
