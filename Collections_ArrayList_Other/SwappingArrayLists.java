package Collections_ArrayList_Other;

import java.util.ArrayList;
import java.util.Collections;

public class SwappingArrayLists {
	public static void main(String[] args) {
		//Create arrayList
		ArrayList<String> names = new ArrayList<String>();
		names.add("Sachin");
		names.add("Sourav");
		names.add("Rahul");
		names.add("Yuvraj");
		names.add("Laxman");
		names.add("Kaif");
		
		System.out.println("ArrayList before Swap: ");
		for(String temp:names) {
			System.out.println(temp);
		}
		//Swapping 2nd element(index 1) element with 5th element(index 4).
		//There is inbuilt method available as swap in Collections.
		Collections.swap(names, 2, 5);
		System.out.println("ArrayList after swap: ");
		for(String temp : names) {
			System.out.println(temp);
		}
		
		
		
		
		
		
	}
}
