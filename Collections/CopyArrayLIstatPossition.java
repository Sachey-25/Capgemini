package Collections;

import java.util.ArrayList;

public class CopyArrayLIstatPossition {

	public static void main(String[] args) {
		//addAll(index, collection)
		ArrayList<String> array = new ArrayList<String>();
		array.add("A"); //0
		array.add("B"); //1
		array.add("C"); //2
		array.add("D"); //3
		System.out.println("ArrayList before addAll: " + array);
		
		//ArrayList2
		ArrayList<String> arr = new ArrayList<String>();
		arr.add("E"); //4
		arr.add("F");
		arr.add("G");
		arr.add("H");
		System.out.println("ArrayList2 before addAll: "+ arr);
		//Adding the arraylist1 to arraylist2 at position
		System.out.println("ArrayList after adding arraylist2 at 4th position");
		array.addAll(4,arr); // ABCDEFGH
		System.out.println(array);
		//Adding the  elements arraylist2 to array list 1
		System.out.println("ArrayList after adding arraylist1 at 4th position");
		arr.addAll(0, array); //EFGHABCD , ABCDEFGH
		System.out.println(arr);
	}
	}
