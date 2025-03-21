package regEXTest;

import java.io.*;
import java.util.regex.*;

public class RegExExample6 {

	public static void main(String[] args) { //Regex Finder
        // Check if all elements are numbers
        System.out.println(Pattern.matches("\\d+", "1234")); // true

        // Check if all elements are non-numbers
        System.out.println(Pattern.matches("\\D+", "1234")); // false

        // Check if all the elements are non-numbers
        System.out.println(Pattern.matches("\\D+", "Gfg")); // true

        // Check if all the elements are non-spaces
        System.out.println(Pattern.matches("\\S+", "gfg")); // true

	}

}