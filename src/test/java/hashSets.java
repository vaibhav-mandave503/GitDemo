import java.util.*;

import org.junit.Assert;

public class hashSets {

	public static void main(String[] args) {
		String a="abcabc";
		String b="cccaabb";
		char[] aChr = a.toCharArray();
		char[] bChr = b.toCharArray();
		
		HashSet<Character> hash1 = new HashSet<Character>();
		HashSet<Character> hash2 = new HashSet<Character>();
		
		for (Character ch:aChr)
		{
			hash1.add(ch);
		}
		
		for (Character ch:bChr)
		{
			hash2.add(ch);
		}
		System.out.println("Comparing two hashes");
		Assert.assertTrue(hash1.equals(hash2));

	}

}

