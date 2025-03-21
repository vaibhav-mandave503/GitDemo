import java.util.*;
public class RemoveDuplicateWords {

	public static void main(String[] args) {
		String input = "Java is great and Java is fun and Java is powerful";
		
		String result = removeDuplicateWords(input);
        System.out.println("Original String: " + input);
        System.out.println("String after removing duplicates: " + result);

	}

	private static String removeDuplicateWords(String input) {
		String[] words = input.split("\\s+");
		Set<String> wordSet = new HashSet<String>();
		
		StringBuilder result = new StringBuilder();
		
		for (String word:words)
		{
			if(!wordSet.contains(word))
			{
				wordSet.add(word);
				result.append(word).append(" ");
			}
		}

		return result.toString().trim();
	}
}