package HashMap_Collections_linkedHashMap;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class ConvertSetToArray {
	public static void main(String[] args) {
		//Create hashset
		HashSet<String> hset = new HashSet<String>();
		hset.add("Item1");
		hset.add("Item2");
		hset.add("Item3");
		hset.add("Item4");
		//Displaying the hashset
		System.out.println("HashSet elements are: " + hset);
		
		//I am going perform a conversion array to hashset
		String[] array = new String[hset.size()];
		//Can I convert it to arrayList????
		List<String> list = new ArrayList<String>(hset);
		hset.toArray(array);
		
		//Displaying array elements 
		System.out.println("Array Elements are :");
		//Loop - for each 
		for(String temp : array) {
			System.out.println(temp);
		}

	}

}
