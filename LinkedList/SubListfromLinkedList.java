package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class SubListfromLinkedList {
	public static void main(String[] args) {
		//Linked list and its sublist
		//Create an object for linked list
		LinkedList<String> grocessary = new LinkedList<String>();
		grocessary.add("Rice");
		grocessary.add("oil");
		grocessary.add("daal");
		grocessary.add("Soap");
		grocessary.add("Shampoo");
		grocessary.add("Salt");
		grocessary.add("Sugar");
		
		System.out.println(grocessary);
		//Loop ==> iteration process
		Iterator<String> iter = grocessary.iterator();
		while(iter.hasNext()) {
			System.out.println(iter.next());
		}
		//obtaining sublist from the linked list [grocessary]
		
		List<String> Anything = grocessary.subList(2, 5);
		System.out.println("This is a sublist of the original list" + Anything);
	}
}
