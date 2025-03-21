package Test;

import java.util.*;
import java.util.Map.Entry;

public class voya {

	public static void main(String[] args) {
		String str="welcome to voya india";
		
		HashMap<Character, Integer> charOccurHM = new HashMap<Character, Integer> ();
		
		char[] strChrArr = str.toCharArray();
		
		for (Character ch: strChrArr)
		{
			if (charOccurHM.containsKey(ch)) {
				charOccurHM.put(ch, charOccurHM.get(ch)+1);
			} else {
				charOccurHM.put(ch,1);
			}
		}
		System.out.println("\n\n");
		Set<Entry<Character, Integer>> entry = charOccurHM.entrySet();
		
		for(Entry<Character, Integer> entry2: charOccurHM.entrySet())
		{
			System.out.println(entry2.getKey()+"==>"+entry2.getValue());
		}
	}
}