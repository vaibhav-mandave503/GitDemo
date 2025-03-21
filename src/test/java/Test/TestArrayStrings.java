package Test;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestArrayStrings {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		String[] cars1 = {"Volvo", "Kia" , "Nissan", "BMW", "Ford", "Mazda", "Volvo", "Kia" , "Nissan"};
		String[] cars2 = {"BMW", "Ford", "Mazda", "Nissan", "Kia", "BMW", "Ford", "Mazda", "Volvo"};
		
		System.out.println("Array Equality: "+cars1.equals(cars2));
		
		Set<String> set1 = new HashSet<String>();
		
		for (int i=0; i<cars1.length; i++) {
			set1.add(cars1[i]);
		}
		
		System.out.println("\nSet1 contains "+set1.size()+ " elements");
		
		System.out.println("Set1 Elements:");
		
        Iterator itr1 = set1.iterator();
        while (itr1.hasNext()) {
            System.out.println(itr1.next());
        }
        
		Set<String> set2 = new HashSet<String>();
		
		for (int i=0; i<cars2.length; i++) {
			set2.add(cars2[i]);
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
