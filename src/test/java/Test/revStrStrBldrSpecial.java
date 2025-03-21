package Test;

import java.util.regex.Pattern;
import java.util.regex.Matcher;
//import org.hamcrest.Matcher;

public class revStrStrBldrSpecial {

	public static void main(String[] args) {
		String str = "@a@utom!at$ion@";
		// \W+ matches 1+ of any non-word characters
		Matcher m = Pattern.compile("\\W+").matcher(str);
		StringBuilder sb = new StringBuilder();
		int start=0;
		// loop through the matches of \W+
		while (m.find()) {
		   // append reverse of substring before current match
		   // and then the match itself is appended in buffer
		   sb
		   .append(new StringBuilder(str.substring(start, m.start())).reverse())
		   .append(m.group());
		   start = m.end();
		}
		// append remaining part after last match in buffer
		sb.append(new StringBuilder(str.substring(start)).reverse());
		// print the results
		System.out.println(sb);

	}

}