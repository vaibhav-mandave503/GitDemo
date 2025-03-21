  package DigitalOcean;

public class PrimeNumberCheck {

	public static void main(String[] args) {
		System.out.println(isPrime(19)); //true
		System.out.println(isPrime(49)); //false
	}

	private static boolean isPrime(int input) {
		if (input == 0 | input == 1) {
			return false;
		}
		if (input == 2) {
			return true;
		}
		
		for (int i=2; i<=input/2; i++) {
			if (input%i == 0)
				return false;
		}

		return true;
	}

}
