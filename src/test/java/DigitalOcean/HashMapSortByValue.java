package DigitalOcean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.LinkedList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapSortByValue {
	@SuppressWarnings("null")
	public static void main(String[] args) {
		Map<String, Integer> scores = new LinkedHashMap<String, Integer>();
		scores.put("Computer", 96);
		scores.put("Marathi",91);
		scores.put("Maths", 93);
		scores.put("SST", 84);
		scores.put("English", 89);
		scores.put("Science", 92);
		
		System.out.println("Original HashMap: \n"+scores);
		
		Map<String, Integer> sortedScores = new LinkedHashMap<String, Integer>();
		sortedScores = sortHashMapByValue(scores);
		System.out.println("Sorted HashMap: \n"+sortedScores);

	}

	private static Map<String, Integer> sortHashMapByValue(Map<String, Integer> scores) {
		Map<String, Integer> sortedScoresByValue = new LinkedHashMap<String, Integer>();
		
		//Get the entryset
		Set<Entry<String, Integer>> entrySet= scores.entrySet();
		System.out.println("EntrySet: \n"+entrySet);
		
		//Create List as Set is unordered
		List<Entry<String, Integer>> entryList = new LinkedList<>(entrySet);
		System.out.println("entryList: \n"+entryList);
		
		System.out.println("Print entryList using forEach Loop: ");
		entryList.forEach(System.out::print);
		
		//Sort List By Value
		entryList.sort((x,y)-> x.getValue().compareTo(y.getValue()));
		System.out.println("\n\nSorted entryList: \n"+entryList);
		
		//Put entryList Values into LinkedHashMap
		for (Entry<String, Integer> ntry:entryList) {
			sortedScoresByValue.put(ntry.getKey(), ntry.getValue());
		}
		
		return sortedScoresByValue;
		//Populate New HashMap
		// BLOCK 1 START
//		for (Entry<String, Integer> e: entryList) {
//			sortedScoresByValue.put(e.getKey(), e.getValue());
//		}
		// BLOCK 1 END
		
		// BLOCK 2 START
//		Iterator<Entry<String, Integer>> lItr = entryList.iterator();
//		while (lItr.hasNext()) {
//			sortedScoresByValue.put(((Entry<String, Integer>) lItr).getKey(), ((Entry<String, Integer>) lItr).getValue());
//		}
//		Exception in thread "main" java.lang.ClassCastException: class java.util.ArrayList$Itr cannot be cast to class java.util.Map$Entry (java.util.ArrayList$Itr and java.util.Map$Entry are in module java.base of loader 'bootstrap')
//		at DigitalOcean.HashMapSortByValue.sortHashMapByValue(HashMapSortByValue.java:54)
//		at DigitalOcean.HashMapSortByValue.main(HashMapSortByValue.java:27)
		// BLOCK 2 END
	}

}
