package DigitalOcean;

import java.util.List;
import java.util.LinkedList;

public class OnlyOddNumbers {

	public static void main(String[] args) {
		List<Integer> intList = new LinkedList<Integer>();
		intList.add(23);
		intList.add(15);
		intList.add(73);
		intList.add(69);
		intList.add(19);
		intList.add(48);
		
		System.out.println("List Elements: "+intList);
		
		System.out.println("Only Odd Numbers Check: "+onlyOddNumbersCheck(intList));

	}

	private static boolean onlyOddNumbersCheck(List<Integer> intList) {
		System.out.println("List Odd Elements:");
		for (int i:intList) {
			if (i%2 !=0) {
				System.out.println(i);
			}
		}
		
		for (int i:intList) {
			if (i%2 == 0) {
				return false;
			}
		}
		return true;
		
	}

}
