package DigitalOcean;

public class StringImmutableDemo {

	public static void main(String[] args) {
		String s1 = "Java";
		String s2 = s1;
		System.out.println(s1 == s2);
		
		s1 = "Python"; 
		
		System.out.println(s1 == s2);
		
		System.out.println("s1:"+s1);
		System.out.println("s2:"+s2); 

	}

}
