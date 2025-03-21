package DigitalOcean;

public class TryCatchDemo2 {

	public static void main(String[] args) {
		
		try {
			foo(10);
		} catch (IllegalArgumentException | NullPointerException e) {
			System.out.println(e.getMessage());
		}

	}

	public static void foo(int x) throws IllegalArgumentException, NullPointerException {
		System.out.println("x:"+x);
		String str = x; // Type mismatch: cannot convert from int to String
	}

}
