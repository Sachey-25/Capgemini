package HashMap_Collections_linkedHashMap;

import java.util.HashSet;
import java.util.Iterator;

public class JavaHashSetCollections {
	public static void main(String[] args) {
		//Creating an object for the Hash set
		// as similar as arrayList
		HashSet <String> hset = new HashSet<String>();
		//Adding elements to Set
		hset.add("iPhone");
		hset.add("OnePlus");
		hset.add("Nokia");
		hset.add("MI");
		hset.add("Redmi");
		hset.add("Samsung");
		hset.add("Moto");
		hset.add(null);
		//Displaying HashSet elements
		System.out.println("Elements of HashSet" + hset);
		//In order to delete the set 
		System.out.println("Before clear() elements of set of is: ");
		System.out.println(hset);
		hset.clear();
		System.out.println("After clear() elements of set of is: ");
		System.out.println(hset);
		
		//Iterate over set elements
		Iterator<String> it = hset.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Iterate over set elements without Iterator
		//For each loop
		for(String object : hset) {
			System.out.println("Elements of sets are : " + object);
		}	
		
		//Set methods
		/* boolean add()
		 * void clear()
		 * Object clone()
		 * boolean contains()
		 * boolean isEmpty()
		 * int size()
		 * boolean(object o)
		 */
	}
}