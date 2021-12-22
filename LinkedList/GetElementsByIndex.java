package LinkedList;

import java.util.LinkedList;

public class GetElementsByIndex {
	public static void main(String[] args) {
		//Create an object for linked list
		LinkedList<String> linkedlist = new LinkedList<String>();
		//Populating linked list with string values
		linkedlist.add("AA");
		linkedlist.add("BB");
		linkedlist.add("CC");
		linkedlist.add("DD");
		linkedlist.addLast("EE");
		
		//I would to know the index position of the elements
		System.out.println("Linkedlist Elements: ");
		//get(index)
		for(int i=0; i<linkedlist.size();i++) {
			System.out.println("Elements at index "+ i + ": is :" + linkedlist.get(i));
		}
		//Search the first Occurence of element
		int firstIndex = linkedlist.indexOf("AA");
		System.out.println("First Occurance: "+ firstIndex);
	}

}
