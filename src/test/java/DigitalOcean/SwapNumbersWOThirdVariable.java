package DigitalOcean;

public class SwapNumbersWOThirdVariable {

	public static void main(String[] args) {
		int a = 12;
		int b = 25;
		
		System.out.println("a is "+a+" b is "+b);
		
		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("After swapping a is "+a+" b is "+b);
	}

}
