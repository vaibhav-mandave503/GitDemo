package regEXTest;

import java.io.*;
import java.util.regex.*;

public class RegExExample4 {

	public static void main(String[] args) { //Regex Character Classes
		System.out.println(Pattern.matches("[a-z]", "g")); // true
        System.out.println(Pattern.matches("[a-zA-Z]", "Gfg")); // false
        System.out.println(Pattern.matches("[a-zA-Z]{1,2}", "Gfg")); // false
        System.out.println(Pattern.matches("[a-zA-Z]{1,3}", "Gfg")); // true
        System.out.println(Pattern.matches("[a-zA-Z]{1,10}", "Gfg")); // true
        System.out.println(Pattern.matches("[a-zA-Z]+", "Gfg")); // true
	}

}