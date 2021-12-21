package Collections;

import java.util.ArrayList;

public class SearchandGetMethodtoValues {

	public static void main(String[] args) {
		//FirstValue //SecondValue// ...... //LastValue
		//Creating an arrayList
		ArrayList<Integer> arr_int = new ArrayList<Integer>();
		arr_int.add(1); //0
		arr_int.add(11); //1
		arr_int.add(22); //2
		arr_int.add(33); //3
		arr_int.add(99); //4
		arr_int.add(111);//5
		arr_int.add(88);//6
		arr_int.add(66);//7
		arr_int.add(77);//8
		//FirstIndexOF an element <---- Inbuilt method i.e., IndexOf
		//System.out.println("First element of arraylist: " + arr_int.get(0));
		System.out.println("Second element of arraylist: " + arr_int.get(1));
		//System.out.println("Third element of arraylist: " + arr_int.get(2));
		System.out.println("Fourth element of arraylist: " + arr_int.get(3));
		//System.out.println("Fifth element of arraylist: " + arr_int.get(4));
		System.out.println("*************************************************************");
		//System.out.println("Sixth element of arraylist: " + arr_int.get(5));
		System.out.println("Seventh element of arraylist: " + arr_int.get(6));
		//System.out.println("Eight element of arraylist: " + arr_int.get(7));
		System.out.println("Ninth element of arraylist: " + arr_int.get(8));
		
		//Note: 1. In order to find the index position of any element from the arrayList
		// We need to FOUCUS ON ELEMENT_VALUE....!!!!!
		//1. In order to find the element value of any index from the arrayList
		// We need to FOUCUS ON INDEX_POSITION....!!!!!
	}
}
