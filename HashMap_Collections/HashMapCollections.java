package HashMap_Collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
public class HashMapCollections {
	public static void main(String[] args) {
		//Creating an object to make HashMap
		HashMap<Integer,String> hmap = new HashMap<Integer,String>();
		//In order to add the elements to the hmap
		//put <----- add() <----- add()
		// I need to poke hashmapkey in order to get hashmap-value
		hmap.put(10, "TT");
		hmap.put(1, "KK");
		hmap.put(4, "AA");
		hmap.put(3, "CC");
		hmap.put(2, "VV");
		hmap.put(7, "JJ");
		// Iterator---// Get and set method
		/*Set value=hmap.entrySet();
		Iterator iterator = value.iterator();
		while(iterator.hasNext()) {
			Map.Entry Mentry = (Map.Entry)iterator.next();
			System.out.println("Key is: "+ Mentry.getKey()+ " & Value is : ");
			System.out.println(Mentry.getValue());
			}*/
		System.out.println("Value index 10 of HashMap : " + hmap.get(10));
		System.out.println("Value index 1 of HashMap : " + hmap.get(1));
		//Remove
		System.out.println("Removing the elements from HashMap : " + hmap.remove(10));
		System.out.println("HashHap elements after removing the index 10: " + hmap);
		hmap.clear();
		System.out.println("Clearing the HashMap : " + hmap);
		//Create Hmap 
		HashMap<Integer, String> hmapsh=new HashMap<Integer, String>();
		// We need to add the elements to hmapsh
		hmapsh.put(5,"Sachin");
		hmapsh.put(3, "Sourav");
		hmapsh.put(4, "Virendra");
		hmapsh.put(2, "Zaheer");
		hmapsh.put(1, "Ashish");
		hmapsh.put(1, "Sachin");
		System.out.println("Before sorting.....!" + hmap);
		
		Set setmethod = hmapsh.entrySet();
		Iterator iter = setmethod.iterator();
		while(iter.hasNext()){
			//Object to differentiate the keys and values
			Map.Entry me = (Map.Entry)iter.next();
			System.out.println(me.getKey());
			System.out.println(me.getValue());			
		}		
		System.out.println("After sorting the HashMap:");
		
		Map<Integer, String> map = new TreeMap<Integer, String>(hmapsh);	
		Set setmet = map.entrySet();
		Iterator it = setmet.iterator();
		while(it.hasNext()){
			//Object to differentiate the keys and values
			Map.Entry sort = (Map.Entry)it.next();
			System.out.println(sort.getKey());
			System.out.println(sort.getValue());			
		}		
	}
}
