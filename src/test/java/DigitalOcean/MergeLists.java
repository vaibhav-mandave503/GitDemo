package DigitalOcean;

import java.util.List;
import java.util.LinkedList;
public class MergeLists {

	public static void main(String[] args) {
		List<Integer> list1 = new LinkedList<Integer>();
		List<Integer> list2 = new LinkedList<Integer>();
		List<Integer> listMerged = new LinkedList<Integer>();
		
		list1.add(19);
		list1.add(41);
		list1.add(94);
		list1.add(38);
		
		list2.add(56);
		list2.add(84);
		list2.add(73);
		
		listMerged.addAll(list1);
		listMerged.addAll(list2);
		
		System.out.println("MergedList Elements: "+listMerged);

	}

}
