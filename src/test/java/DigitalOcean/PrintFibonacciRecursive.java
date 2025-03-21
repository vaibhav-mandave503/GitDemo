package DigitalOcean;

public class PrintFibonacciRecursive {

	public static void main(String[] args) {
		int sequenceLength = 10;
		System.out.println("A fibonacci sequence of "+sequenceLength+" is:");
		
		for (int i=0; i < sequenceLength; i++) {
			System.out.println(fibonacci(i)+ "");
		}

	}

	private static int fibonacci(int count) {
		if (count <= 1)
			return count;
		return fibonacci(count-1)+fibonacci(count-2);
	}

}
