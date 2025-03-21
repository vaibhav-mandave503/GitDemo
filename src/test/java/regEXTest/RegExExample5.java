package regEXTest;

import java.io.*;
import java.util.regex.*;

public class RegExExample5 {

	public static void main(String[] args) {//Regex Metacharacters
        // Checking all the strings using regex
        System.out.println(Pattern.matches("[b-z]?", "a")); // false

        // Check if all the elements are in range a to z
        // or A to Z
        System.out.println(Pattern.matches("[a-zA-Z]+", "GfgTestCase")); // true

        // Check if elements is not in range a to z
        System.out.println(Pattern.matches("[^a-z]?", "g")); // false

        // Check if all the elements are either g,e,k or s
        System.out.println(Pattern.matches("[geks]*", "geeksgeeks")); // true

	}

}