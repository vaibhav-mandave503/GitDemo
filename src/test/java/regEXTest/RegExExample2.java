package regEXTest;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegExExample2 { //Pattern Searching

	public static void main(String[] args) {
		Pattern p = Pattern.compile("geeks");
		Matcher m = p.matcher("geeksforgeeks.org");
		
		while (m.find())
			System.out.println("Pattern found from "+ m.start() + " to "+ (m.end() - 1));
        // Pattern found from 0 to 4
		// Pattern found from 8 to 12
	}

}
