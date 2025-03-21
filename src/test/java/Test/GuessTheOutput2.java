package Test;

import java.io.IOException;

public class GuessTheOutput2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String str = null;
//		String str1="abc";
//
//		System.out.println(str1.equals("abc") | str.equals(null)); // null pointer exception
//		System.out.println("?");
		//////////////////////////////////////////////////////////////////////////////////////
		String x = "abc";
		String y = "abc";

		x.concat(y);

		System.out.print(x); //abc
		//////////////////////////////////////////////////////////////////////////////////////
   		int p = 10 * 10 - 10;
   		
   		System.out.println(p); //90
		//////////////////////////////////////////////////////////////////////////////////////
//   		try {
//   			throw new IOException("Hello");
//   		} catch(IOException | Exception e) { //The exception IOException is already caught by the alternative Exception
//   			System.out.println(e.getMessage());
//   			System.out.println("Exception Caught and error message printed");
//   			Hello
//   			Exception Caught and error message printed
   			}
		//////////////////////////////////////////////////////////////////////////////////////
		String s1 = "abc";
		String s2 = "abc";
		String s3 = new String("abc");

//		System.out.println("s1 == s2 ? " +(s1 == s2)); //true
//		System.out.println("s1 == s3 ? " +(s1 == s3)); //false
//		System.out.println("s1 equals s3 ? " +(s1.equals(s3))); //true
		//////////////////////////////////////////////////////////////////////////////////////
		String s11 = new String("abc");
		String s12 = new String("abc");
//		System.out.println(s11==s12); // false
		
		String s21 = "abc";
		StringBuffer s22 = new StringBuffer(s21);
//		System.out.println(s21.equals(s22)); // false
		//////////////////////////////////////////////////////////////////////////////////////
		
		
		
		
}
