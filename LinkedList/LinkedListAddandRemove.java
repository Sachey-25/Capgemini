package LinkedList;

import java.util.LinkedList;

public class LinkedListAddandRemove {
	public static void main(String[] args) {
		//Create an object to have linkedList
		LinkedList<String> cities = new LinkedList<String>();
		cities.add("Pune");
		cities.add("Jaipur");
		cities.add("Goa");
		cities.add("Ladak");
		cities.add("munnar");
		cities.add("Kashmir");
		System.out.println("Elements of the linked list before remove : " + cities);
		//Removing the elements from the linked list
		//as same as remove(0);
		cities.remove(); //remove method will removes first element every time
	//	[Jaipur, Goa, Ladak, munnar, Kashmir]
		System.out.println("Elements of the linked list after remove : " + cities);
		cities.remove(); //[Goa, Ladak, munnar, Kashmir]
		System.out.println("Elements of the linked list after remove : " + cities);
		cities.remove(3); //[Goa,Ladak, munnar]
		System.out.println("Elements of the linked list after remove at 3rd pos" + cities);
		cities.removeFirst();
		System.out.println("Elements of the linked list removefirst method : " + cities);
		cities.removeLast();
		System.out.println("Elements of the linked list removelast method : " + cities);
}
}