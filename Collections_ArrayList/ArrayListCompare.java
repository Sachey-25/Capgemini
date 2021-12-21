package Collections_ArrayList;

import java.util.ArrayList;

public class ArrayListCompare {
	public static void main(String[] args) {
		//Can I create multiple arrayList..????
		//Create first arrayList
		ArrayList<String> array_one = new ArrayList<String>();
		array_one.add("Hii");
		array_one.add("Good");
		array_one.add("After");
		array_one.add("Noon");
		array_one.add("Time for lunch");
		
		//Another arrayList
		ArrayList<String> array_two = new ArrayList<String>();
		array_two.add("Hiiii");
		array_two.add("GoodAfter");
		array_two.add("AfterNoon");
		array_two.add("NoonAfer");
		array_two.add("Time for lunch");
		
		//Comparing the comparison output in arrayList<String>
		ArrayList<String> array_comp = new ArrayList<String>();
		//loop
		for(String temp : array_one) {
			//compare >> true || false;
			array_comp.add(array_two.contains(temp)? "1":"0");
			//Note: The contains method which will be true if a single value is equal
		System.out.println(array_comp);
		}
	}
}
