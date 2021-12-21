package Collections;

import java.util.ArrayList;
import java.util.List;

public class CopyArrayLIst {

	public static void main(String[] args) {
		//Create a arrayList <---- Object
		ArrayList<String> array=new ArrayList<String>();
		//Add the elements to the array
		array.add("Programming");
		array.add("Is");
		array.add("Fun");
		System.out.println("This is first arraylist : " + array);
		//To perform array list copy we need another array list
		//I am calling list from collections
		List<String> list = new ArrayList<String>();
		//adding elements in the list
		list.add("Sachin");
		list.add("Technical");
		list.add("Trainer");
		
		//Adding all the elements of list to arrayList  <==== Array list Copy!! <--ArrayExtendin
		//Java do have inbuilt add()  ==> addAll()
		array.addAll(list);
		System.out.println("Updated arrayLest Elements are: " + array);
		
	}
}
