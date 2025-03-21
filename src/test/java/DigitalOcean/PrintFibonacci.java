package DigitalOcean;

public class PrintFibonacci {

	public static void main(String[] args) {
		printFibonacciSequence(10);

	}

	private static void printFibonacciSequence(int count) {
		int a = 0;
		int b = 1;
		int c = 1;
		
		for (int i = 1; i <= count; i++) {
			System.out.println(a + ",");
			a = b;
			b = c;
			c = a + b;
		}
		
	}

}
