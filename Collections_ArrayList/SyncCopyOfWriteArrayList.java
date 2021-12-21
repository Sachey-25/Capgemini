package Collections_ArrayList;

import java.util.Iterator;

import java.util.concurrent.CopyOnWriteArrayList;
public class SyncCopyOfWriteArrayList {
	public static void main(String[] args) {
		//List<String> sync_col = Collections.synchronizedList(new ArrayList<String>());		
		CopyOnWriteArrayList<String> array_sync = new CopyOnWriteArrayList<String>();		
		//Adding an elements to the synchronized ArrayList
		array_sync.add("Phone");
		array_sync.add("Mobile");
		array_sync.add("Laptop");		
		System.out.println("Iterating synchronized arrayList");
		synchronized(array_sync) {
			//We will use one more collection type : Iterator
			Iterator<String> iterator = array_sync.iterator();
			while(iterator.hasNext())
				System.out.println(iterator.next());  //This will read index by index...!!
		}
	}
}
