package LinkedList;

import java.util.LinkedList;

public class ObjectsInLinkedList {
	public static void main(String[] args) {
		//Creating an object for linkedlist
		LinkedList<String> linkedlist = new LinkedList<String>();
		linkedlist.add("item1");
		linkedlist.add("item4");
		linkedlist.add("item2");
		linkedlist.add("item6");
		linkedlist.add("item3");
		linkedlist.add("item5");		
		//Display linked list
		System.out.println("Elements of the linkedlist: "+ linkedlist);
		linkedlist.addFirst("First Item");
		linkedlist.addLast("Last Item");
		System.out.println("Elements of the linkedlist after first and last: "+ linkedlist);

		//How Get and set the values : Encapsulation 
		//[First Item, item1, item4, item2, item6, item3, item5, Last Item]
		Object firstval = linkedlist.get(0);
		System.out.println("FirstElements : " + firstval);
		linkedlist.set(0, "SACHIN - This is changed value at 0th pos");
		System.out.println("Linked list after all changes made" + linkedlist);
		linkedlist.clear();
		System.out.println("Surprize : " + linkedlist);
	}

}
