package LinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListRepresentation {
	public static void main(String[] args) {
		
		//Creating a linked list
		LinkedList<String> list = new LinkedList<String>();
		list.add("Bangalore"); //Position free however it will adds the elements
		list.add("Mumbai");// at the end of the element
		list.add("Hydrabad");
		list.add("Chennai");
		System.out.println("Elements of the list is : " + list);
		//I want to add some more elements to the linked list
		//1st position
		list.addFirst("Delhi");
		//last position
		list.addLast("Trivenduram");
		//2nd position
		list.add(2, "Bidar");
		System.out.println("Linked list after adding few more elements: ");
		//Iterating LinkedList
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}				
	}
}
