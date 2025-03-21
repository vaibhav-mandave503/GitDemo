package regEXTest;

import java.util.regex.Pattern;

public class RegExExample1 {

	public static void main(String[] args) {
        System.out.println(Pattern.matches("geeksforge*ks", "geeksforgeeks")); // true

        System.out.println(Pattern.matches("g*geeks*", "geeksfor")); // false
        //Pattern Class
        System.out.println(Pattern.matches("geeks.*", "geeksforgeeks")); // true
        
        System.out.println(Pattern.matches("geeks[0-9]+", "geeks12s")); // false
        
	}
	
}