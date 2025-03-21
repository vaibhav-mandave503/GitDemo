package DigitalOcean;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ReverseLinkedList {

	public static void main(String[] args) {
		List<Integer> l1 = new LinkedList<>();
		
		l1.add(71);
		l1.add(68);
		l1.add(51);
		l1.add(35);
		l1.add(29);
		l1.add(13);
		
		System.out.println("Linked List Size :"+l1.size());
		System.out.println("Linked List contains:"+l1);
		
		System.out.println("Print List using forEach Loop: ");
		l1.forEach(System.out::print);
		
		System.out.println("\nLinked List elements using Iterator: ");
		Iterator<Integer> it = l1.iterator();

		while (it.hasNext()) {
			System.out.println(it.next());
		}
		
		System.out.println("\nReversed Linked List contains:"+revLinkedList(l1));

	}

	private static List<Integer> revLinkedList(List<Integer> l1) {
		List<Integer> rl1 = new LinkedList<>();
		
		ListIterator li = l1.listIterator();
		while (li.hasNext()) {
			li.next();
		}

		while (li.hasPrevious()) {
			rl1.add((Integer) li.previous());
		}
		System.out.println("Reversed Linked List Size :"+rl1.size());
		return rl1;
	}

}