package DigitalOcean;

public class FactorialRecursive {

	public static void main(String[] args) {
		int number = 6;
		System.out.println("Factorial of "+number+" is "+findFactorial(number));

	}

	private static long findFactorial(int number) {
		if (number ==1) {
			return 1;
		} else {
			return (number * findFactorial(number-1));
		}

	}

}