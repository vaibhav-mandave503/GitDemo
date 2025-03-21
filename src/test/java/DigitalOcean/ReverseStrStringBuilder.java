package DigitalOcean;

public class ReverseStrStringBuilder {

	public static void main(String[] args) {
		String str = "123";
		StringBuilder sb = new StringBuilder(str);
		System.out.println("Original String: "+str);
		// Way 1
		sb.reverse();
		System.out.println("Reversed String: "+sb);
		// Way 2
		str = "123";
		
		System.out.println("Reversed String: "+reverse(str));
	}

	private static String reverse(String in) {
		if (in == null)
			throw new IllegalArgumentException("Null is not a valid input");
		
		StringBuilder out = new StringBuilder();
		
		char[] chars = in.toCharArray();
		
		for (int i=chars.length-1; i>=0; i--)
			out.append(chars[i]);

		return out.toString();
	}

}