package Test;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class TestArrays {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		int[] array1 = {13,16,75,35,32,16,32,35};
		int[] array2 = {13,16,75,35,32,13,75};
		
		System.out.println("Array Equality: "+array1.equals(array2));
//		List arrL1 = Arrays.asList(array1);
		
		Set<Integer> set1 = new HashSet<Integer>();
//		set1.addAll(arrL1);
		
		for (int i=0; i<array1.length; i++) {
			set1.add(array1[i]);
		}
		
		System.out.println("\nSet1 contains "+set1.size()+ " elements");
		
		System.out.println("Set1 Elements:");
		
        Iterator itr1 = set1.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }

		Set<Integer> set2 = new HashSet<Integer>();
		
		for (int i=0; i<array2.length; i++) {
			set2.add(array2[i]);
		}
		
		System.out.println("\nSet2 contains "+set2.size()+ " elements");
		
		System.out.println("Set2 Elements:");
		
        Iterator itr2 = set2.iterator();
        while (itr2.hasNext()) {
            System.out.println(itr2.next());
        }
        
		System.out.println("\nHashSet Equality: "+set1.equals(set2));
	}
	
}