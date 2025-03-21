package DigitalOcean;

public class RemoveWhiteSpaces {

	public static void main(String[] args) {
		String str = "   jkbb nsbdka   kasbckjasbkajcb   ";
		System.out.println("Original String: "+str);
		String newStr = stringWithNoWhiteSpace(str);
		System.out.println("String without WhiteSpaces: "+newStr);

	}

	private static String stringWithNoWhiteSpace(String input) {
		StringBuilder output = new StringBuilder();
		
		char[] charArray = input.toCharArray();
		for (char c:charArray) {
			if (!Character.isWhitespace(c)) {
				output.append(c);
			}
		}
		return output.toString();
	}

}
