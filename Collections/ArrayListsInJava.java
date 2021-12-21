package Collections;

import java.util.ArrayList;

public class ArrayListsInJava {

	public static void main(String[] args) {
		//We had created an array-list
		ArrayList<String> Names = new ArrayList<String>();
		//Add an elements to the array-list
		//In built method and i.e add(); //This will takes only one parameter <Int, String>
		Names.add("Sachin");//<========0
		Names.add("Java");//<==========1
		Names.add("Programming");//<===2
		Names.add("ArrayList");//<=====3 Arraylist to technical
		Names.add("Bangalore");//<=====4
		//Displaying the array elements.
		System.out.println("Array elements are: " + Names);
		// If you want to add any elements at any place of the position within the array..!
		Names.add(5,"OnePlus");
		System.out.println("New elements added and the array is: ");
		System.out.println(Names);
		//We can change the elements of arrays at any moment of time.
		Names.add(3, "Technical");
		System.out.println("Element is been changed at possiton no.3");
		System.out.println(Names);
		// In order to remove any element from the array
		Names.remove(4);
		System.out.println("List elements after removing 'ArrayList' : ");
		System.out.println(Names);
		System.out.println("Below element present at the 0,1,2,3,4th position in the array list");
		System.out.println(Names.get(0));
		System.out.println(Names.get(1));
		System.out.println(Names.get(2));
		System.out.println(Names.get(3));
		System.out.println(Names.get(4));
		
		//Loop : for loop :  foreach
		System.out.println("This is from advanced loop");
		for(int i=0; i<Names.size();i++)
			System.out.println(Names.get(i));
		System.out.println("This is from ForEachLooop");
		for(String object : Names)
			System.out.println(object);
	}
}
