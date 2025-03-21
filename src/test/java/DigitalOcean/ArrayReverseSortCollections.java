package DigitalOcean;

import java.util.Arrays;
import java.util.Collections;

public class ArrayReverseSortCollections {

	public static void main(String[] args) {
		 Integer[] a = { 2, -1, 3, 4};

	        // Sort the array in descending order using
	        // reverseOrder() method of Collections class
		 	System.out.println("Original Integer Array: "+Arrays.toString(a));
		 	
	        Arrays.sort(a, Collections.reverseOrder());
	        System.out.println("Integer Array Reverse Sorted: "+Arrays.toString(a));

	        String b[] = { "practice.geeksforgeeks.org",
                    "www.geeksforgeeks.org",
                    "code.geeksforgeeks.org" };

		 	System.out.println("Original String Array: "+Arrays.toString(b));
	        // Sorts array in descending order
	        Arrays.sort(b, Collections.reverseOrder());

	        System.out.println("String Array Reverse Sorted: "+Arrays.toString(b));
	        
	}

}