package Collections;

import java.util.ArrayList;

public class SearchAndGetMethodsOfArray {

	public static void main(String[] args) {
		//FirstIndex //SecondIndex// ...... //LastIndex
		//Creating an arrayList
		ArrayList<Integer> arr_int = new ArrayList<Integer>();
		arr_int.add(1); //0
		arr_int.add(11);//1
		arr_int.add(22);//2
		arr_int.add(33);//3
		arr_int.add(99);//4
		arr_int.add(111);//5
		arr_int.add(88);//6
		arr_int.add(66);//7
		arr_int.add(88);// 8 If there same values are present in an arrayList
		arr_int.add(66);// 9 We will call them as duplicate values
		//FirstIndexOF an element <---- Inbuilt method i.e., IndexOf
		System.out.println("Index of the element 1: " + arr_int.lastIndexOf(1));
		System.out.println("Index of the element 11: " + arr_int.lastIndexOf(11));
		System.out.println("Index of the element 22: " + arr_int.lastIndexOf(22));
		System.out.println("Index of the element 33: " + arr_int.lastIndexOf(33));
		System.out.println("Index of the element 99: " + arr_int.lastIndexOf(99));
		System.out.println("*************************************************************");
		System.out.println("Index of the element 111: " + arr_int.lastIndexOf(111));
		System.out.println("Index of the element 88: " + arr_int.lastIndexOf(88));
		System.out.println("Index of the element 66: " + arr_int.lastIndexOf(66));
		System.out.println("Index of the element 88: " + arr_int.lastIndexOf(88));
		System.out.println("Index of the element 66: " + arr_int.lastIndexOf(66));
	}

}
