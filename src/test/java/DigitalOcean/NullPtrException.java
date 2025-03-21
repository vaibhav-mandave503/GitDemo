package DigitalOcean;

public class NullPtrException {

	public static void main(String[] args) {
		printString(null, 3);

	}

	private static void printString(String s, int count) {
		for (int i=0; i<count; i++) {
			System.out.println(s.toUpperCase());
		}
		
	}

}
