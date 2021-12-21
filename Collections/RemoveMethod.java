package Collections;

import java.util.ArrayList;
public class RemoveMethod {
	public static void main(String[] args) {
		//We need create an arrayList
		ArrayList<String> elements = new ArrayList<String>();
		//adding an elements to the arrayList
		elements.add("AB");//0
		elements.add("CD");//1
		elements.add("EF");//2
		elements.add("GH");//3
		elements.add("IJ");//4
		elements.add("KL");//5
		System.out.println(elements);
		System.out.println("********************************************");
		System.out.println("ArrayList before remove: ");
		for(String var:elements) {
			System.out.println(var);
		}
		//Removing the elements
		//Removing the element at position 0
		elements.remove("AB");
		System.out.println("FirstElement is been removed..!!!");
		System.out.println(elements);
		//Removing the element at position 3
		elements.remove(3);
		System.out.println("ThirdElement is been removed..!!!");
		System.out.println(elements);
		//Removing the element at position 5
		elements.remove(4);
		System.out.println("FourthElement is been removed..!!!");
		System.out.println(elements);
		System.out.println("ArrayList after remove: ");
		
	}
}
