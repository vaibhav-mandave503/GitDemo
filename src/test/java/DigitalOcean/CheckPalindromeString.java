package DigitalOcean;

public class CheckPalindromeString {

	public static void main(String[] args) {
		String str1 = "agcshvsjbsjk"; //abccba
		System.out.println("Is String "+str1+" Palindrome ? : "+checkPalindrome(str1));

	}

	private static boolean checkPalindrome(String str1) {
		boolean result = true;
		int len = str1.length();
		
		for (int i=0; i<len/2; i++) {
			if (str1.charAt(i) != str1.charAt(len-i-1)) {
				return false;
			}
		}
		return result;
	}

}
