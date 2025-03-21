package DigitalOcean;

public class CharArrToStrUsingValueOf {

	public static void main(String[] args) {
        // Character array
        char[] ch = { 'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd' };  
        String s = String.valueOf(ch, 0, 5);      // Convert first 5 characters to string
        System.out.println("" + s); 

	}

}